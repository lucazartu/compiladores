package main;

import java.util.List;

import ast.And;
import ast.ArrayAssign;
import ast.ArrayLength;
import ast.ArrayLookup;
import ast.Assign;
import ast.Block;
import ast.BooleanType;
import ast.Call;
import ast.ClassDecl;
import ast.ClassDeclExtends;
import ast.ClassDeclList;
import ast.ClassDeclSimple;
import ast.Exp;
import ast.ExpList;
import ast.False;
import ast.Formal;
import ast.FormalList;
import ast.Identifier;
import ast.IdentifierExp;
import ast.IdentifierType;
import ast.If;
import ast.IntArrayType;
import ast.IntegerLiteral;
import ast.IntegerType;
import ast.LessThan;
import ast.MainClass;
import ast.MethodDecl;
import ast.MethodDeclList;
import ast.Minus;
import ast.NewArray;
import ast.NewObject;
import ast.Not;
import ast.Plus;
import ast.Print;
import ast.Program;
import ast.Statement;
import ast.StatementList;
import ast.This;
import ast.Times;
import ast.True;
import ast.Type;
import ast.VarDecl;
import ast.VarDeclList;
import ast.While;
import main.MiniJavaParser.ClassdeclarationContext;
import main.MiniJavaParser.ExpressionContext;
import main.MiniJavaParser.GoalContext;
import main.MiniJavaParser.IdentifierContext;
import main.MiniJavaParser.MainclassContext;
import main.MiniJavaParser.MethoddeclarationContext;
import main.MiniJavaParser.StatementContext;
import main.MiniJavaParser.TypeContext;
import main.MiniJavaParser.VardeclarationContext;

public class Converter {
	public VarDecl visitVardeclaration(VardeclarationContext ctx) {
		Type type = visitType(ctx.type());
		Identifier identifier = visitIdentifier(ctx.identifier());
		return new VarDecl(type, identifier);
	}
	
	public VarDeclList visitVardeclarationList(List<VardeclarationContext> ctx) {
		VarDeclList varDeclList = new VarDeclList();
		for (VardeclarationContext vardeclarationContext: ctx){
			varDeclList.addElement(visitVardeclaration(vardeclarationContext));
		}
		return varDeclList;
	}

	public MainClass visitMainclass(MainclassContext ctx) {
		Statement statement = visitStatement(ctx.statement());
		Identifier identifier1 = visitIdentifier(ctx.identifier(0));
		Identifier identifier2 = visitIdentifier(ctx.identifier(1));
		return new MainClass(identifier1, identifier2, statement);
	}

	public ClassDecl visitClassdeclaration(ClassdeclarationContext ctx) {
		Identifier identifier1 = visitIdentifier(ctx.identifier(0));
		VarDeclList varDeclList = visitVardeclarationList(ctx.vardeclaration());
		MethodDeclList methodDeclList = visitMethoddeclarationList(ctx.methoddeclaration());
		ClassDecl classDecl = null;
		if (ctx.EXTENDS() == null){
			classDecl = new ClassDeclSimple(identifier1, varDeclList, methodDeclList);
		} else {
			Identifier identifier2 = visitIdentifier(ctx.identifier(1));
			classDecl = new ClassDeclExtends(identifier1, identifier2, varDeclList, methodDeclList);
		}
		return classDecl;
	}
	
	public ClassDeclList visitClassdeclarationList(List<ClassdeclarationContext> ctx) {
		ClassDeclList classDeclList = new ClassDeclList();
		for (ClassdeclarationContext classdeclarationContext : ctx ){
			classDeclList.addElement(visitClassdeclaration(classdeclarationContext));
		}
		return classDeclList;
	}

	public Identifier visitIdentifier(IdentifierContext ctx) {
		return new Identifier(ctx.IDENTIFIER().getText());
	}

	public Program visitGoal(GoalContext ctx) {
		MainClass mainClass = visitMainclass(ctx.mainclass());
		ClassDeclList classDeclList = visitClassdeclarationList(ctx.classdeclaration());
		return new Program(mainClass, classDeclList);
	}

	public Exp visitExpression(ExpressionContext ctx) {
		Exp  exp = null;
		if (ctx.TRUE() != null){
			exp = new True();
		} else if (ctx.FALSE() != null){
			exp = new False();
		} else if (ctx.THIS() != null) {
			exp = new This();
		} else if (ctx.AND() != null){
			exp = new And(visitExpression(ctx.expression(0)), visitExpression(ctx.expression(1)));
		} else if (ctx.LESSTHAN() != null){
			exp = new LessThan(visitExpression(ctx.expression(0)), visitExpression(ctx.expression(1)));
		} else if (ctx.PLUS() != null){
			exp = new Plus(visitExpression(ctx.expression(0)), visitExpression(ctx.expression(1)));
		} else if (ctx.MINUS() != null){
			exp = new Minus(visitExpression(ctx.expression(0)), visitExpression(ctx.expression(1)));
		} else if (ctx.TIMES() != null){
			exp = new Times(visitExpression(ctx.expression(0)), visitExpression(ctx.expression(1)));
		} else if (ctx.getChild(1) != null && ctx.getChild(1).getText().equals("[")){
			exp = new ArrayLookup(visitExpression(ctx.expression(0)), visitExpression(ctx.expression(1)));
		} else if (ctx.NOT() != null){
			exp = new Not(visitExpression(ctx.expression(0)));
		} else if (ctx.INT() != null){
			exp = new NewArray(visitExpression(ctx.expression(0)));
		} else if (ctx.getChild(2) != null && ctx.getChild(2).getText().equals("(")){
			exp = new NewObject(visitIdentifier(ctx.identifier()));
		} else if (ctx.LENGTH() != null){
			exp = new ArrayLength(visitExpression(ctx.expression(0)));
		} else if (ctx.getChild(3) != null && ctx.getChild(3).getText().equals("(")){
			Exp exp1 = visitExpression(ctx.expression(0));
			Identifier identifier = visitIdentifier(ctx.identifier());
			ExpList expList = new ExpList();
			for (int i = 1; i < ctx.expression().size();i++){
				expList.addElement(visitExpression(ctx.expression(i)));
			}
			exp = new Call(exp1, identifier, expList);
		} else if (ctx.INTEGER_LITERAL() != null){
			exp = new IntegerLiteral(Integer.parseInt(ctx.INTEGER_LITERAL().getText()));
		} else if (ctx.getChild(0) != null && ctx.getChild(0).getText().equals("(")){
			exp = visitExpression(ctx.expression(0));
		} else {
			exp = new IdentifierExp(ctx.identifier().getText());
		} 
		return exp;
	}
	
	public ExpList visitExpressionList(List<ExpressionContext> ctx) {
		ExpList expList = new ExpList();
		for (ExpressionContext expressionContext : ctx) {
			expList.addElement(visitExpression(expressionContext));
		}
		return expList;
	}

	public MethodDecl visitMethoddeclaration(MethoddeclarationContext ctx) {
		Type type = visitType(ctx.type(0));
		Identifier identifier =  visitIdentifier(ctx.identifier(0));
		VarDeclList varDeclList = visitVardeclarationList(ctx.vardeclaration());
		StatementList statementList = visitStatementList(ctx.statement());
		Exp exp = visitExpression(ctx.expression());
		FormalList formalList = new FormalList();
		for (int i = 1; i < ctx.type().size();i++){
			formalList.addElement(new Formal(visitType(ctx.type(i)), visitIdentifier(ctx.identifier(i))));
		}
		return new MethodDecl(type, identifier, formalList, varDeclList, statementList, exp);
	}
	
	public MethodDeclList visitMethoddeclarationList(List<MethoddeclarationContext> ctx) {
		MethodDeclList methodDeclList = new MethodDeclList();
		for (MethoddeclarationContext methoddeclarationContext : ctx){
			methodDeclList.addElement(visitMethoddeclaration(methoddeclarationContext));
		}
		return methodDeclList;
	}

	public Statement visitStatement(StatementContext ctx) {
		Statement statement = null;
		if (ctx.PRINT() != null){
			statement = new Print(visitExpression(ctx.expression(0)));
		} else if (ctx.WHILE() != null) {
			statement = new While(visitExpression(ctx.expression(0)), visitStatement(ctx.statement(0)));
		} else if (ctx.IF() != null) {
			statement = new If(visitExpression(ctx.expression(0)), visitStatement(ctx.statement(0)), visitStatement(ctx.statement(1)));
		} else if (ctx.ABRECHAVES() != null){
			statement = new Block(visitStatementList(ctx.statement()));
		} else if (ctx.getChild(1) != null && ctx.getChild(1).getText().equals("=")){
			statement = new Assign(visitIdentifier(ctx.identifier()),visitExpression(ctx.expression(0)));
		} else if (ctx.getChild(1) != null && ctx.getChild(1).getText().equals("[")){
			statement = new ArrayAssign(visitIdentifier(ctx.identifier()),visitExpression(ctx.expression(0)),visitExpression(ctx.expression(1)));
		}
		return statement;
	}
	
	public StatementList visitStatementList(List<StatementContext> ctx) {
		StatementList statementList = new StatementList();
		for (StatementContext statementContext : ctx){
			statementList.addElement(visitStatement(statementContext));
		}
		return statementList;
	}

	public Type visitType(TypeContext ctx) {
		Type type = null;
		if (ctx.INTARRAYTYPE() != null){
			type = new IntArrayType();
		} else if (ctx.BOOLEAN() != null) {
			type = new BooleanType();
		} else if (ctx.INT() != null){
			type = new IntegerType(); 
		} else {
			type = new IdentifierType(ctx.identifier().IDENTIFIER().getText());
		}
		return type;
	}
	
}