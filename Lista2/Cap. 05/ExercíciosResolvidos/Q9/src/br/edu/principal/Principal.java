package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		int cont, ta = 0, te = 0, tr = 0;
		double n1, n2, media, media_classe, total_classe;
		Scanner dado;
		
		total_classe = 0;
		
		for (cont=1; cont<=6; cont++) {
			
			System.out.println("Insira nota 1: ");
			dado = new Scanner(System.in);
			n1 = dado.nextDouble();
			
			System.out.println("Insira nota 2: ");
			dado = new Scanner(System.in);
			n2 = dado.nextDouble();
			
			media = (n1 + n2)/2;
			System.out.println("A média do aluno é: " + media);
			
			if (media <= 3) {
				tr++;
				System.out.println("Reprovado");
			}
			else if ((media > 3) && (media<7)) {
				te++;
				System.out.println("Exame");
			}
			else if (media>=7) {
				ta++;
				System.out.println("Aprovado");
			}
			
			total_classe = total_classe + media;
			
		}
		
		System.out.println("A quantidade de alunos em recuperação é: " + tr);
		System.out.println("A quantidade de alunos em exame é: " + te);
		System.out.println("A quantidade de alunos aprovados é: " + ta);
		
		media_classe = total_classe/6;
		
		System.out.println("A média da classe é: " + media_classe);
	}

}