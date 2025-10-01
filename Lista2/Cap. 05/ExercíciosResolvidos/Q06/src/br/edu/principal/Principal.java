package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		int cont, codigo, nht, valor;
		int sal_min, sal_inicial, aux, sal_final;
		String turno, categoria;
		Scanner dado;
		
		sal_min = 450;
		
		for (cont = 1; cont<=10; cont++) {
			System.out.println("Qual é o código do funcionário? ");
			dado = new Scanner(System.in);
			codigo = dado.nextInt();
			
			System.out.println("Qual é o turno do funcionário? Insira em letras maiúsculas: ");
			dado = new Scanner(System.in);
			turno = dado.next();
			
			System.out.println("Quantas horas trabalhadas? ");
			dado = new Scanner(System.in);
			nht = dado.nextInt();
			
			System.out.println("Qual é a categoria do funcionário? ");
			dado = new Scanner(System.in);
			categoria = dado.next();
			
			System.out.println(turno);
			
			while ((!"M".equals(turno)) && (!"V".equals(turno)) && (!"M".equals(turno))) {
				System.out.println("INFORMAÇÃO INVÁLIDA. Qual é o turno do funcionário? Insira em letras MAIÚSCULAS: ");
				dado = new Scanner(System.in);
				turno = dado.next();
			}
			
			while ((!"G".equals(categoria)) && (!"O".equals(categoria))) {
				System.out.println("INFORMAÇÃO INVÁLIDA. Qual é categoria do funcionário? Insira em letras MAIÚSCULAS: ");
				dado = new Scanner(System.in);
				categoria = dado.next();
			}
			if (categoria == "G") {
				
				if (turno == "N"){	
					valor = sal_min * 18/100;
				}
				else {
					valor = sal_min * 15/100;
				}
			}
			else {
				if (turno == "N") {
					valor = sal_min * 13/100;
				}
				else {
					valor = sal_min * 10/100;
				}
			sal_inicial = nht * valor;
			
			if (sal_inicial <= 300) {
				aux = sal_inicial * 20/100;
			}
			else {
				if(sal_inicial < 600) {
					aux = sal_inicial * 15/100;
				}
				else {
					aux = sal_inicial * 5/100;
				}
			sal_final = sal_inicial + aux;
			System.out.println("O código do funcionário é: " + codigo + ", a quantidade de horas trabalhadas é: " + nht + ", o valor da hora trabalhada é: " + valor + ", o valor inicial do salário é de: " + sal_inicial + ", o valor do auxilio alimentação é: " + aux + ", e o valor do salário final é de: " + sal_final );
			}

			}
			
			
			
			
		}
		
	}

}
