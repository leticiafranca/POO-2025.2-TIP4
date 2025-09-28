package br.edu.principal;
import br.edu.util.*;
public class Principal {

	public static void main(String[] args) {
	
		int n1 = DivisaoNum.recebeNum1();
		int n2 = DivisaoNum.recebeNum2();
		int resultado = DivisaoNum.verificandoDiv(n1, n2);
		
		if (resultado == 0) {
			System.out.println(n1 + " é divisível por " + n2);
		}
		else if(resultado == -1) {
			System.out.println("Não é possível fazer a divisão.");
		}
		else {
			System.out.println("O próximo divisor é: " + resultado);
		}

	}

}
