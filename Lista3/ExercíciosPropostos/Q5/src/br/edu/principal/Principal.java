package br.edu.principal;
import br.edu.util.*;

public class Principal {

	public static void main(String[] args) {
		int n = CalcFatorial.recebeNum();
		int fatorial = CalcFatorial.CalculandoFat(n);
		
		System.out.println(n + "!= " + fatorial);

	}

}
