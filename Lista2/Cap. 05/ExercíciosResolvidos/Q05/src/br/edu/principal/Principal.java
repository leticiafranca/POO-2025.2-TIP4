package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int qntdPrimos = 0;
		
		System.out.println("DIGITE DEZ NÚMEROS");
		for (int cont = 1; cont <= 10; cont++) {
			System.out.println(cont + "° número: ");
			int num = sc.nextInt();
			
			int divisores = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) { 
                qntdPrimos++;
            }
		}
		System.out.println("Há " + qntdPrimos + " números primos.");

	}

}
