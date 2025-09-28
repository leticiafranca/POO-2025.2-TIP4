package br.edu.util;
import java.util.Scanner;

public class CalculoVolume {
	static Scanner sc = new Scanner (System.in);
	
	public static double recebendoRaio() {
		System.out.println("Digite o valor do raio da esfera: ");
		double raio = sc.nextDouble();
		return raio;
	}
	
	public static double CalculandoVolume(double raio) {
		double r = raio;
		double calc = (4.0/3.0) * Math.PI * Math.pow(r, 3);
		return calc;
	}
}
