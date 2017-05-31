package visitor;

import symboltable.Method;
import symboltable.SymbolTable;
import symboltable.Variable;

import java.util.Enumeration;

import ast.And;
import ast.ArrayAssign;
import ast.ArrayLength;
import ast.ArrayLookup;
import ast.Assign;
import ast.Block;
import ast.BooleanType;
import ast.Call;
import ast.ClassDeclExtends;
import ast.ClassDeclSimple;
import ast.False;
import ast.Formal;
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
import ast.Minus;
import ast.NewArray;
import ast.NewObject;
import ast.Not;
import ast.Plus;
import ast.Print;
import ast.Program;
import ast.This;
import ast.Times;
import ast.True;
import ast.Type;
import ast.VarDecl;
import ast.While;

public class TypeCheckVisitor implements TypeVisitor {

	private SymbolTable symbolTable;
	private symboltable.Class classe;
	private Method metodo;

	public TypeCheckVisitor(SymbolTable st) {
		symbolTable = st;
	}

	// MainClass m;
	// ClassDeclList cl;
	public Type visit(Program n) {
		n.m.accept(this);
		for (int i = 0; i < n.cl.size(); i++) {
			n.cl.elementAt(i).accept(this);
		}
		return null;
	}

	// Identifier i1,i2;
	// Statement s;
	public Type visit(MainClass n) {
		n.i1.accept(this);
		this.classe = this.symbolTable.getClass(n.i1.s);
		this.metodo = this.symbolTable.getMethod("main", this.classe.getId());
		n.i2.accept(this);
		n.s.accept(this);
		this.metodo = null;
		this.classe = null;
		return null;
	}

	// Identifier i;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclSimple n) {
		n.i.accept(this);
		this.classe = this.symbolTable.getClass(n.i.s);
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		this.classe = null;
		return null;
	}

	// Identifier i;
	// Identifier j;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclExtends n) {
		n.i.accept(this);
		n.j.accept(this);
		this.classe = this.symbolTable.getClass(n.i.s);
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		this.classe = null;
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(VarDecl n) {
		n.t.accept(this);
		n.i.accept(this);
		return null;
	}

	// Type t;
	// Identifier i;
	// FormalList fl;
	// VarDeclList vl;
	// StatementList sl;
	// Exp e;
	public Type visit(MethodDecl n) {
		n.t.accept(this);
		this.metodo = this.symbolTable.getMethod(n.i.s, this.classe.getId());
		Type type = this.symbolTable.getMethodType(n.i.s, this.classe.getId());
		for (int i = 0; i < n.fl.size(); i++) {
			n.fl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		if (!this.symbolTable.compareTypes(n.e.accept(this), type)) {
			System.out.println("O Retorno do metodo " + n.i.s + " da classe " + this.classe.getId() + " é diferente do declarado");
			System.exit(0);
		}
		this.metodo = null;
		return type;
	}

	// Type t;
	// Identifier i;
	public Type visit(Formal n) {
		n.t.accept(this);
		n.i.accept(this);
		return null;
	}

	public Type visit(IntArrayType n) {
		return n;
	}

	public Type visit(BooleanType n) {
		return n;
	}

	public Type visit(IntegerType n) {
		return n;
	}

	// String s;
	public Type visit(IdentifierType n) {
		return null;
	}

	// StatementList sl;
	public Type visit(Block n) {
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		return null;
	}

	// Exp e;
	// Statement s1,s2;
	public Type visit(If n) {
		if (!this.symbolTable.compareTypes(n.e.accept(this), new BooleanType())) {
			System.out.println("A expressão de comparação no método (if)" + this.metodo.getId() + " da classe "
					+ this.classe.getId() + " não é boleana");
			System.exit(0);
		}
		n.s1.accept(this);
		n.s2.accept(this);
		return null;
	}

	// Exp e;
	// Statement s;
	public Type visit(While n) {
		if (!this.symbolTable.compareTypes(n.e.accept(this), new BooleanType())) {
			System.out.println("A condição no while do método " + this.metodo.getId() + " da classe "
					+ this.classe.getId() + " não é boleana");
			System.exit(0);
		}
		n.s.accept(this);
		return null;
	}

	// Exp e;
	public Type visit(Print n) {
		n.e.accept(this);
		return null;
	}

	// Identifier i;
	// Exp e;
	public Type visit(Assign n) {
		Type type = n.i.accept(this);
		if (!this.symbolTable.compareTypes(type,n.e.accept(this))) {
			System.out.println("A atribuição na variável" + n.i.s + "dentro do método "
					+ this.metodo.getId() + "da classe "+ this.classe.getId() + " não está correta, erro de tipos");
			System.exit(0);
		}
		return null;
	}

	// Identifier i;
	// Exp e1,e2;
	public Type visit(ArrayAssign n) {
		if (!this.symbolTable.compareTypes(n.i.accept(this), new IntArrayType())) {
			System.out.println("A variavel dentro do método " + this.metodo.getId()
					+ " da classe " + this.classe.getId() + " não é um array");
			System.exit(0);
		}
		if (!this.symbolTable.compareTypes(n.e1.accept(this),new IntegerType())) {
			System.out.println("Na atribuição da variavel " + n.i.s + "dentro do método " + this.metodo.getId()
				 + " da classe" + this.classe.getId() + ", o índece do array não é um inteiro ");
			System.exit(0);
		}
		if (!this.symbolTable.compareTypes(new IntegerType(),n.e2.accept(this))) {
			System.out.println("A atribuição ao índice do array " + n.i.s + "dentro do método " + this.metodo.getId() 
			+ " da classe " + this.classe.getId()
			+ " esta incorreta, erro de tipos");
					
					
			System.exit(0);
		}
		return null;
	}

	// Exp e1,e2;
	public Type visit(And n) {
		Type type = n.e1.accept(this);
		if (!this.symbolTable.compareTypes(type,n.e2.accept(this))) {
			System.out.println("Os tipos das expressões envolvidas na comparação não são iguais "
					+ "dentro da classe " + this.classe.getId());
			System.exit(0);
		}
		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(LessThan n) {
		Type type = n.e1.accept(this);
		if (!this.symbolTable.compareTypes(type,n.e2.accept(this))) {
			System.out.println("Os tipos das expressões envolvidas na comparação não são iguais "
					+ "dentro da classe " + this.classe.getId());
			System.exit(0);
		}
		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(Plus n) {
		Type type = n.e1.accept(this);
		if (!this.symbolTable.compareTypes(type,n.e2.accept(this))) {
			System.out.println("Os tipos das expressões envolvidas na adição não são iguais "
					+ "dentro da classe " + this.classe.getId());
			System.exit(0);
		}
		if (!this.symbolTable.compareTypes(type, new IntegerType())) {
			System.out.println("As expressões dentro da classe "
					+ this.classe.getId() + "não são inteiros" );
			System.exit(0);
		}
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Minus n) {
		Type type = n.e1.accept(this);
		if (!this.symbolTable.compareTypes(type,n.e2.accept(this))) {
			System.out.println("Os tipos das expressões envolvidas na subtração não são iguais "
					+ "dentro da classe " + this.classe.getId());
			System.exit(0);
		}
		if (!this.symbolTable.compareTypes(type, new IntegerType())) {
			System.out.println("As expressões dentro da classe "
					+ this.classe.getId() + " não são inteiros");
			System.exit(0);
		}
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Times n) {
		Type type = n.e1.accept(this);
		if (!this.symbolTable.compareTypes(type,n.e2.accept(this))) {
			System.out.println("Os tipos das expressões envolvidas na multiplicação não são iguais "
					+ "dentro da classe " + this.classe.getId());
			System.exit(0);
		}
		if (!this.symbolTable.compareTypes(type, new IntegerType())) {
			System.out.println("As expressões dentro da classe "
					+ this.classe.getId() + " não são inteiros");
			System.exit(0);
		}
		return type;
	}

	// Exp e1,e2;
	public Type visit(ArrayLookup n) {
		if (!this.symbolTable.compareTypes(n.e1.accept(this), new IntArrayType())) {
			System.out.println("A expressão dentro da classe "
					+ this.classe.getId() + " não é um array");
			System.exit(0);
		}
		if (!this.symbolTable.compareTypes(n.e2.accept(this), new IntegerType())) {
			System.out.println("O índece do array dentro da classe"
					+ this.classe.getId()+" não é um inteiro");
			System.exit(0);
		}
		return new IntegerType();
	}

	// Exp e;
	public Type visit(ArrayLength n) {
		if (!this.symbolTable.compareTypes(n.e.accept(this), new IntArrayType())) {
			System.out.println("A expressão dentro da classe "
					+ this.classe.getId() + " não é um array");
			System.exit(0);
		}
		return new IntegerType();
	}

	// Exp e;
	// Identifier i;
	// ExpList el;
	public Type visit(Call n) {
		symboltable.Class cAux = this.classe;
		IdentifierType identifierType = null;
		try {
			identifierType = (IdentifierType) n.e.accept(this);
		} catch (ClassCastException e) {
			System.out.println("A expressão dentro da classe"
					 + this.classe.getId() + " não é uma classe");
			System.exit(0);
		}
		this.classe = this.symbolTable.getClass(identifierType.s);
		Type type = this.symbolTable.getMethodType(n.i.s, this.classe.getId());
		Method method = this.symbolTable.getMethod(n.i.s, this.classe.getId());
		Enumeration<Variable> variaveis = method.getParams();
		for (int i = 0; i < n.el.size(); i++) {
			Type elementType = n.el.elementAt(i).accept(this);
			if (!variaveis.hasMoreElements()) {
				System.out.println("A chamada ao método " + n.i.s 
						+ " dentro da classe " + this.classe.getId()+ " está com a quantidade de paramentros errada");
				System.exit(0);
				break;
			}
			if (!this.symbolTable.compareTypes(variaveis.nextElement().type(),elementType)){
				System.out.println("A chamada ao método " + n.i.s 
						+ " dentro da classe " + this.classe.getId() + " está com os parametros errados");
				System.exit(0);
			}
		}
		if (variaveis.hasMoreElements()) {
			System.out.println("A chamada ao método " + n.i.s 
					+ " dentro da classe " + this.classe.getId()+ " está com a quantidade de paramentros errada");
			System.exit(0);
		}
		this.classe = cAux;
		return type;
	}

	// int i;
	public Type visit(IntegerLiteral n) {
		return new IntegerType();
	}

	public Type visit(True n) {
		return new BooleanType();
	}

	public Type visit(False n) {
		return new BooleanType();
	}

	// String s;
	public Type visit(IdentifierExp n) {
		if (this.classe != null)
			return this.symbolTable.getVarType(this.metodo, this.classe, n.s);
		return null;
	}

	public Type visit(This n) {
		return new IdentifierType(this.classe.getId());
	}

	// Exp e;
	public Type visit(NewArray n) {
		n.e.accept(this);
		return new IntArrayType();
	}

	// Identifier i;
	public Type visit(NewObject n) {
		return new IdentifierType(n.i.s);
	}

	// Exp e;
	public Type visit(Not n) {
		n.e.accept(this);
		return new BooleanType();
	}

	// String s;
	public Type visit(Identifier n) {
		if (this.classe != null) return this.symbolTable.getVarType(this.metodo, this.classe, n.s);
		return null;
	}
}
