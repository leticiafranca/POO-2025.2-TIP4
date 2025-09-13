package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		 int pessoaMais50 = 0;
	        
	     int pessoaEntre10e20 = 0;
	     double somaAltura10e20 = 0.0;
	        
	     int pessoaMenos40kg = 0;
		
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Pessoa " + i);
			
			System.out.println("Digite sua idade: ");
			int idade = sc.nextInt();
			
			System.out.println("Digite sua altura em metros: ");
			double altura = sc.nextDouble();
			
			System.out.println("Digite seu peso em kg: ");
			double peso = sc.nextDouble();
			
			if (idade > 50) {
				pessoaMais50++;
			}
			
			if(idade >= 10 && idade <= 20) {
				somaAltura10e20 = somaAltura10e20 + altura;
				pessoaEntre10e20++;
			}
			
			if(peso < 40) {
				pessoaMenos40kg++;
			}
		}
		
		double mediaAltura = 0.0;
		
        if (pessoaEntre10e20 > 0) {
            mediaAltura = somaAltura10e20 / pessoaEntre10e20;
        }
        
        double porcentagemMenos40kg = (pessoaMenos40kg / 5.0) * 100.0;
        
        System.out.println("Quantidade de pessoas com a idade superior a 50 é: " + pessoaMais50);
        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos é: " + mediaAltura);
        System.out.println("Porcentagem de pessoas com peso inferior a 40 kg entre todas as pessoas analisadas é: " + porcentagemMenos40kg);
        
        
	}

}
