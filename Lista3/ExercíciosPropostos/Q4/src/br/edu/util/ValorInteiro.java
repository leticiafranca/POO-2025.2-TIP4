package br.edu.util;

import java.util.Scanner;

public class ValorInteiro {
	static Scanner sc = new Scanner (System.in);
	public static int recebeNum() {
		System.out.println("Digite um número inteiro: ");
		int num = sc.nextInt();
		return num;
	}
	
	public static void verificandoNum(int num) {
        if (num > 0) {
            System.out.println("O número digitado é POSITIVO!");
        } else if (num == 0) {
            System.out.println("O número digitado é ZERO, portanto, ele é neutro.");
        } else {
            System.out.println("O número digitado é NEGATIVO.");
        }
    }

}
