package br.edu.principal;
import java.util.Scanner;

public class Principal {
	

	public static void main(String[] args) {
		
		double preco_antigo, preco_atual, acrescimo;
		Scanner dado;
		
		System.out.println("Insira o preço antigo do produto: ");
		dado = new Scanner(System.in);
		preco_antigo = dado.nextDouble();
		
		System.out.println("Insira o preço novo do produto: ");
		dado = new Scanner(System.in);
		preco_atual = dado.nextDouble();
		
		acrescimo = calculo_reajuste(preco_antigo, preco_atual);
		System.out.println("O acrescimo foi de " + acrescimo + " porcento");
			
	}
	
	public static double calculo_reajuste(double pa, double pn) {
		double result;
		result = ((100 * pn)-(100*pa))/pa;
		return result;
	}

}