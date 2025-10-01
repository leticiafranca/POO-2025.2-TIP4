package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		int seg;
		Scanner dado;
		
		System.out.println("Insira os segundos:");
		dado = new Scanner(System.in);
		seg = dado.nextInt();
		
		transformacao(seg);	
	}
	
	public static void transformacao(int segundos) {
		
		int h, m, s, r;
		
		h = segundos/3600;
		r = segundos%3600;
		m = r/60;
		s = r%60;
		
		System.out.println(h + "horas, " + m + " minutos, " + s + " segundos");
	}
}