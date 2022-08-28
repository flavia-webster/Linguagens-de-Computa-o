package entidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Analise {

	public static void criarAnalise() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos você deseja para sua tabela:");
		int tk = sc.nextInt();
		
		List<Token> listaTokens = new ArrayList<>();
		
		for(int i = 0; i < tk; i++) {
			System.out.println("Token: ");
			sc.nextLine();
			String nameToken = sc.nextLine();
			System.out.println("Lexema: ");
			String nameLexema = sc.nextLine();
			System.out.println("Id: ");
			int NumID = sc.nextInt();
			
			Token token = new Token(nameToken, nameLexema, NumID);
			listaTokens.add(i, token);
		}
		
		System.out.println("Informe corretamente a String de entrada, separando por ESPAÇOS:");
		sc.nextLine();
		String strEnter = sc.nextLine();
		
		String[] resultado = strEnter.split(" ");
		System.out.print(resultado[0]);
		/*
		for(int i = 0; i < resultado.size(); i++) {
			if(resultado[i].equals(listaTokens.getToken())) {
			System.out.println();
			}
		}
		*/
		sc.close();
	}
}
