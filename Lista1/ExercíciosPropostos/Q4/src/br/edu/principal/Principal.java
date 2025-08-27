package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double baseMaior = 15;
		double baseMenor = 10;
		double altura = 20;
		double area = ((baseMaior + baseMenor) * altura) / 2;
		
		System.out.println("Base maior: " + baseMaior + " m.");
		System.out.println("Base menor: " + baseMenor + " m.");
		System.out.println("Altura: " + altura + " m.");
		System.out.println("A área do trapézio é: " + area + " m².");

	}

}
