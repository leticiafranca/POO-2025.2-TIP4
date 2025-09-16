package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int somaPar = 0;
        int somaPrimo = 0;

        System.out.println("DIGITE DEZ NÚMEROS");
        for (int cont = 1; cont <= 10; cont++) {
            System.out.print(cont + "° número: ");
            int num = sc.nextInt();

            
            if (num % 2 == 0) {
                somaPar = somaPar + num;
            }

            int divisores = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisores++;
                }
            }
            
            if (divisores == 2) {
                somaPrimo = somaPrimo + num;
            }
        }

        System.out.println("A soma dos números PARES é: " + somaPar);
        System.out.println("A soma dos números PRIMOS é: " + somaPrimo);
    }

}

