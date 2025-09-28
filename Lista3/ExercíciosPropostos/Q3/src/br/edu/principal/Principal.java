package br.edu.principal;
import br.edu.util.*;

public class Principal {
	public static void main(String[] args) {
		double r = CalculoVolume.recebendoRaio();
		double resultado = CalculoVolume.CalculandoVolume(r);
		
		System.out.printf("O volume da esfera é igual a %.2f%n", resultado);
		
	}

}
