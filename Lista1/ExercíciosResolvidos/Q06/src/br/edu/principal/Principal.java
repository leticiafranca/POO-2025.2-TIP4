package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
			
			float salario;
			Scanner dado;
			double gratificacao;
			double imposto;
			double salariorecb;
			
			System.out.println("Insira o valor do salário do funcionário: ");
	
			dado = new Scanner(System.in);
			salario = dado.nextFloat();
			
			gratificacao = (0.05 * salario);
			imposto = (0.07 * salario);
			
			salariorecb = salario + gratificacao - imposto;
			
			System.out.println("O salário a ser recebido é: " + "R$" + salariorecb);
			
		
		
		
	}

}
