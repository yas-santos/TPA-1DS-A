package avaliacaoExercicio;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int anoAtual, opcao, anoNasc, idade; 
		
		do {
			System.out.println("Digite o ano atual :");
			anoAtual = ler.nextInt();
			
			System.out.println("Digite o ano de nascimento :");
			anoNasc = ler.nextInt();
			
			idade = anoAtual - anoNasc; 
			System.out.println("Sua idade é " +idade);
			
		    System.out.print("Deseja continuar? 1 – continuar / 0 – sair: ");
		    opcao = ler.nextInt();
		    
		} while (opcao != 0);
		 System.out.println("Programa encerrado!!");
		 ler.close();
			
	}

}
