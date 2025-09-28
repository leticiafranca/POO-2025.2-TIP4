package br.edu.util;
import java.util.Scanner;

public class CalcFatorial {
	static Scanner sc = new Scanner (System.in);
	
	public static int recebeNum() {
		System.out.println("Digite um número que seja inteiro e positivo: ");
		int num = sc.nextInt();
		return num;
	}
	
	public static int CalculandoFat(int num) {
		int n = num;
		int fatorial = 1;
		
		for (int i = fatorial; i <= n; i++) {
			fatorial = fatorial * i;
		}
		return fatorial;
	}
}
