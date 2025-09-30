package br.edu.principal;

import java.util.Scanner;
import br.edu.util.*;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        double nota1, nota2, nota3, media;
	        char letra;
	     
	        System.out.print("Digite a primeira nota: ");
	        nota1 = sc.nextDouble();

	        System.out.print("Digite a segunda nota: ");
	        nota2 = sc.nextDouble();

	        System.out.print("Digite a terceira nota: ");
	        nota3 = sc.nextDouble();
	       
	        do {
	            System.out.print("Digite a letra 'A' para aritmética, 'P' para ponderada: ");
	            letra = sc.next().charAt(0);
	        } while (letra != 'A' && letra != 'a' && letra != 'P' && letra != 'p');
	        
	        media = calcula_media.calculandoMedia(nota1, nota2, nota3, letra);
	        
	        if (letra == 'A' || letra != 'P') {
	            System.out.println("A média aritmética é: " + media);
	        } else {
	            System.out.println("A média ponderada é: " + media);
	        

	        }
	}
}
