package parser;

// Generated from Lang.g4 by ANTLR 4.4

	import datastructures.Symbol;
	import datastructures.Variable;
	import datastructures.SymbolTable;
	import exceptions.SemanticException;
	import ast.Program;
	import ast.AbstractCommand;
	import ast.CommandLeitura;
	import ast.CommandEscrita;
	import ast.CommandAtribuicao;
	import ast.CommandDecisao;
	import java.util.ArrayList;
	import java.util.Stack;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(@NotNull LangParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(@NotNull LangParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(@NotNull LangParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(@NotNull LangParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull LangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull LangParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull LangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull LangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdescrita(@NotNull LangParser.CmdescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdescrita(@NotNull LangParser.CmdescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(@NotNull LangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(@NotNull LangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void enterCmdselecao(@NotNull LangParser.CmdselecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void exitCmdselecao(@NotNull LangParser.CmdselecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull LangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull LangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(@NotNull LangParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(@NotNull LangParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull LangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull LangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravar(@NotNull LangParser.DeclaravarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravar(@NotNull LangParser.DeclaravarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(@NotNull LangParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(@NotNull LangParser.CmdleituraContext ctx);
}