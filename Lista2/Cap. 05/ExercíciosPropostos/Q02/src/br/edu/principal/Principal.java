package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		
		for (int num = 1; num <= 10; num++) {
			System.out.println("\nTABUADA DO NÚMERO " + num);
			for (int i = 1; i <= 10; i++) {
				int multi = num * i;
				System.out.println(num + " x " + i + " = " + multi);
			}
			
		}

	}

}
