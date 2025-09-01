package br.edu.principal;
import java.util.Scanner;


public class Principal {
	
	public static void main(String [] args) {
			
			double sal;
			double imp;
			double salreceber;
			Scanner dado;
			
			System.out.println("Insira o valor do salário: ");
			dado = new Scanner(System.in);
			sal = dado.nextDouble();
			imp = sal * 10/100;
			
			salreceber = sal + 50 - imp;
			
			System.out.println("O salário a ser recebido é: " + salreceber);
			
			
		}

}