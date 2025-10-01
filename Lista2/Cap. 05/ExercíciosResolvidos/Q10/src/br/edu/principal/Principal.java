package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		int cont_time, cont_jog, idade, qtde;
		double peso, alt, media_idade = 0, media_altura = 0, porc, tot80;
		Scanner dado;
		
		qtde = 0;
		tot80 = 0;
		
		for (cont_time = 1; cont_time <= 5; cont_time++) {
			
			media_idade = 0;
			
			for (cont_jog = 1; cont_jog <= 11; cont_jog++) {
				
				System.out.println("Insira a idade do jogador: ");
				dado = new Scanner(System.in);
				idade = dado.nextInt();
				
				System.out.println("Insira o peso do jogador: ");
				dado = new Scanner(System.in);
				peso = dado.nextDouble();
				
				System.out.println("Insira a altura do jogador: ");
				dado = new Scanner(System.in);
				alt = dado.nextDouble();
				
				media_idade = media_idade + idade;
				media_altura = media_altura + alt;
				
				if (idade < 18) {
					qtde = qtde+1;
				}
					
				if (peso > 80) {
					tot80 = tot80+1;
				}
		
			}
			System.out.println("A média de idade do time é: " + media_idade/11);
			
		}
		System.out.println("A quantidade de jogadores com idade menor de 18 anos é: " + qtde);
		media_altura = media_altura/55;
		System.out.println("A média de altura dos jogadores é: " + media_altura);
		porc = tot80 * 100/55;
		System.out.println("A porcentagem de jogadores com mais de 80kg é: " + porc);
		
	}

}