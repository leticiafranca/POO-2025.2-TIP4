package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Digite o salário: ");
		
		double sal = sc.nextDouble();
		
		double novoSalario = sal + sal * 25/100;
		System.out.println ("O novo Salario é:" + novoSalario);

	}

}
