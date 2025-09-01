package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String [] args) {
		
		float base;
		float altura;
		float area;
		Scanner dado1;
		Scanner dado2;
		
		System.out.println("Qual é a medida da base do triângulo em cm? ");
		dado1 = new Scanner(System.in);
		base = dado1.nextFloat();
		
		System.out.println("Qual é a medida da altura do triângulo em cm? ");
		dado2 = new Scanner(System.in);
		altura = dado2.nextFloat();
		
		area = (base * altura)/2;
		
		System.out.println("A área do seu triângulo é de " + area + "cm².");
	}

}