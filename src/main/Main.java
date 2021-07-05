package main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import exceptions.SemanticException;
import parser.LangLexer;
import parser.LangParser;

public class Main {
	public static void main(String[] args) {
		try {
			LangLexer lexer;
			LangParser parser;
			// le o arquivo
			lexer = new LangLexer(CharStreams.fromFileName("entrada.h"));
			
			//cria o fluxo de tokens
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			// crio o parser
			parser = new LangParser(tokenStream);
			
			System.out.println();
			System.out.println();
			
			parser.prog();
			
			
			System.out.println("Compilado!");
			
			parser.generateCode();
			
		}
		catch(SemanticException ex) {
			System.err.println("Erro Semantico - " + ex.getMessage());
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.err.println("Erro " + ex.getMessage());
		}
		
	}

}
