package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		int cont = 0, cod, num_vei, num_acid;
		int maior = 0, cid_maior = 0, menor = 0, cid_menor = 0;
		int media_vei, soma_vei, media_acid;
		int soma_acid, cont_acid;
		Scanner dado;
		
		
		soma_vei = 0;
		soma_acid = 0;
		cont_acid = 0;
		
		for(cont=1; cont<=5; cont = cont +1) 
		{
			System.out.println("Insira o código da cidade: ");
			dado = new Scanner(System.in);
			cod = dado.nextInt();
			
			System.out.println("Insira o número de veículos da cidade: ");
			dado = new Scanner(System.in);
			num_vei = dado.nextInt();
			
			System.out.println("Insira o número de acidentes da cidade: ");
			dado = new Scanner(System.in);
			num_acid = dado.nextInt();
			
			if (cont == 1) {
				maior = num_acid;
				cid_maior = cod;
				menor = num_acid;
				cid_menor = cod;
				
			}
			else {
				if (num_acid > maior) {
					maior = num_acid;
					cid_maior = cod;
				}
				else if (num_acid < menor) {
					menor = num_acid;
					cid_menor = cod;
				}
			}
			
			soma_vei = soma_vei + num_vei;
			if (num_vei < 2000) {
				soma_acid = soma_acid + num_acid;
				cont_acid = cont_acid + 1;
			}
		}
		System.out.println("O maior número de acidentes é: " + maior + " da cidade: " + cid_maior);
		System.out.println("O menor número de acidentes é: " + menor + " da cidade: " + cid_menor);
		media_vei = soma_vei/5;
		System.out.println("A média de veículos é: " + media_vei);
		
		if(cont_acid == 0) {
			System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos.");
			
		}
		else {
			media_acid = soma_acid/cont_acid;
			System.out.println("A média de acidentes é: " + media_acid);
		}
		
		
		
	}

}