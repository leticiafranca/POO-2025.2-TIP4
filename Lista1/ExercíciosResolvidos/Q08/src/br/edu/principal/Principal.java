package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String [] args) {
		
		double juros;
		double deposito;
		double rendimento;
		double total;
		Scanner dado1;
		Scanner dado2;
		
		System.out.println("Insira o valor do depósito realizado: ");
		dado1 = new Scanner(System.in);
		deposito = dado1.nextDouble();
		
		System.out.println("Insira a taxa de juros em porcentagem: ");
		dado2 = new Scanner(System.in);
		juros = dado2.nextDouble();
		
		rendimento = deposito * juros/100;
		total = deposito + rendimento;
		
		System.out.println("O rendimento é de " + rendimento + " reais.");
		System.out.println("O valor total é: " + total);
		
		
		
		
	}

}