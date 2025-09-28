package br.edu.util;
import java.util.Scanner;

public class DivisaoNum {
	static Scanner sc = new Scanner (System.in);
	
	public static int recebeNum1() {
		System.out.println("Digite um número: ");
		int num1 = sc.nextInt();
		return num1;
	}
	
	public static int recebeNum2() {
		System.out.println("Digite outro número: ");
		int num2 = sc.nextInt();
		return num2;
	}
	
	public static int verificandoDiv(int num1, int num2) {
	    if (num1 % num2 == 0) {
	        return 0;
	    } 
	    else {
	        for (int i = num2 + 1; i <= num1; i++) {
	            if (num1 % i == 0) {
	                return i;
	            }
	        }
	    }
	    return -1;
	}
}