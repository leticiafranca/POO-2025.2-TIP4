package br.edu.principal;

import java.util.Scanner;
import br.edu.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int num;
        double s;

        System.out.print("Digite um valor inteiro e positivo N: ");
        num = sc.nextInt();

        s = sequenciacao.sequencia(num);

        System.out.println("O valor de S é: " + s);
       
    	}
	}


