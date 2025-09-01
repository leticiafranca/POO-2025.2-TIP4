package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String [] args) {
		
		double raio;
		double area;
		Scanner dado;
		
		System.out.println("Insira o raio do círculo em cm: ");
		dado = new Scanner(System.in);
		raio = dado.nextDouble();
		
		area = 3.1415 * (Math.pow(raio, 2));
		
		System.out.println("A área do círculo é de " + area + "cm².");
		
		
	}

}