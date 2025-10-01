package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		int i, num_termos, num1, num2, num3;
		Scanner dado;
		
		System.out.println("Qual é o número de termos da série?");
		dado = new Scanner(System.in);
		num_termos = dado.nextInt();
		
		num1 = 2;
		num2 = 7;
		num3 = 3;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		i = 4;
		
		while (i != num_termos) {
			num1 = num1 * 2;
			System.out.println(num1);
			
			i++;
			if (i != num_termos) {
				num2 = num2 * 3;
				System.out.println(num2);
				i++;
				
				if (i != num_termos) {
					num3 = num3 *4;
					System.out.println(num3);
					i++;
				}
			}
		}
		
		
	}

}