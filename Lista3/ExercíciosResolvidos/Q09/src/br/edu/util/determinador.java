package br.edu.util;

import java.util.Scanner;

public class determinador {
	
	public static void maior_menor() {
		int num, maior = 0, menor = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite o " + i + "º número: ");
			num = sc.nextInt();

			if (i == 1) {       
				maior = num;
				menor = num;
         } 	else {
             	if (num > maior) {
                 maior = num;
             }
             	if (num < menor) {
                 menor = num;
             }
         }
     }

		System.out.println("O maior número digitado foi: " + maior);
		System.out.println("O menor número digitado foi: " + menor);
    
 	}
}
 
