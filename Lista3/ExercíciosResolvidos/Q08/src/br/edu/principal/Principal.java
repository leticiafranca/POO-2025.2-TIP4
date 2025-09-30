package br.edu.principal;

import java.util.Scanner;
import br.edu.util.*;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int hora_i, min_i, hora_f, min_f, minutos;

	        System.out.print("Digite a hora de início: ");
	        hora_i = sc.nextInt();
	        System.out.print("Digite os minutos de início: ");
	        min_i = sc.nextInt();

	        System.out.print("Digite a hora de término: ");
	        hora_f = sc.nextInt();
	        System.out.print("Digite os minutos de término: ");
	        min_f = sc.nextInt();
	        
	        minutos = calculo.calculadora(hora_i, min_i, hora_f, min_f);

	        System.out.println("O jogo durou " + minutos + " minutos.");
	        
	    }

	}

