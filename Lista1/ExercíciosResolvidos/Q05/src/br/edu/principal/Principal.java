package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double sal, perc, aumento, novoSal, numerico;
		System.out.println ("Digite o salário: ");
		
		sal = sc.nextDouble();
		System.out.println("Percentual de aumento: ");
		
		perc = sc.nextDouble();
		aumento = sal * perc/100;
		novoSal = sal + aumento;
		System.out.println ("O valor do aumento é: " + aumento);
		
		System.out.println ("O novo Salario é: " + novoSal);

	}

}
