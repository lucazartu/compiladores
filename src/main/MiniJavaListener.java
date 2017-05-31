// Generated from MiniJava.g4 by ANTLR 4.4

    package main;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVardeclaration(@NotNull MiniJavaParser.VardeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVardeclaration(@NotNull MiniJavaParser.VardeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainclass}.
	 * @param ctx the parse tree
	 */
	void enterMainclass(@NotNull MiniJavaParser.MainclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainclass}.
	 * @param ctx the parse tree
	 */
	void exitMainclass(@NotNull MiniJavaParser.MainclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassdeclaration(@NotNull MiniJavaParser.ClassdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassdeclaration(@NotNull MiniJavaParser.ClassdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull MiniJavaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull MiniJavaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull MiniJavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull MiniJavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull MiniJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull MiniJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methoddeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethoddeclaration(@NotNull MiniJavaParser.MethoddeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methoddeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethoddeclaration(@NotNull MiniJavaParser.MethoddeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MiniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull MiniJavaParser.TypeContext ctx);
}