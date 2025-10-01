package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		int i;
		int ano_atual;
		double salarionum;
		double novosal;
		double percentual;
		Scanner scaneardado;
		
		salarionum = 1000;
		percentual = 1.5/100;
		novosal = salarionum + (percentual * salarionum);
		System.out.println("Qual é o ano atual?");
		scaneardado = new Scanner(System.in);
		ano_atual = scaneardado.nextInt();
		
		for (i=2007; i<=ano_atual;i = i+1)
		{
			percentual = 2*percentual;
			novosal = novosal + percentual * novosal;
		}
			
		System.out.println("O novo salário do funcionário no ano de " + ano_atual + " é de: " + novosal);
		
		
	}

}
