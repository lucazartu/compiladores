package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import ast.Program;
import visitor.BuildSymbolTableVisitor;
import visitor.PrettyPrintVisitor;
import visitor.TypeCheckVisitor;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream stream = new FileInputStream("input.txt");
		ANTLRInputStream input = new ANTLRInputStream(stream);
		MiniJavaLexer lexer = new MiniJavaLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		MiniJavaParser parser = new MiniJavaParser(token);

		Program prog = new Converter().visitGoal(parser.goal());
		prog.accept(new PrettyPrintVisitor());
		
		BuildSymbolTableVisitor buildSymbolTableVisitor = new BuildSymbolTableVisitor();
		prog.accept(buildSymbolTableVisitor);
		TypeCheckVisitor typeCheckVisitor = new TypeCheckVisitor(buildSymbolTableVisitor.getSymbolTable());
		prog.accept(typeCheckVisitor);
	}

}
