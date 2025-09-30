package br.edu.principal;

import java.util.Scanner;
import br.edu.util.*;

public class Principal {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int num;
	        
	        do {
	            System.out.print("Digite um número entre 1 e 9: ");
	            num = sc.nextInt();
	        } while (num < 1 || num > 9);
	        
	        multiplicador.multiplicacao(num);
	    }    
	}
