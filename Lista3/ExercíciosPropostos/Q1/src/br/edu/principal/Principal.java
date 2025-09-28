package br.edu.principal;
import br.edu.util.*;

public class Principal {

	public static void main(String[] args) {
		int n = RecebendoNumI.recebeNum();
		int soma = RecebendoNumI.somandoNum(n);
		
		System.out.println("A soma dos números 1 a " + n + " é igual a: " + soma);
	}

}
