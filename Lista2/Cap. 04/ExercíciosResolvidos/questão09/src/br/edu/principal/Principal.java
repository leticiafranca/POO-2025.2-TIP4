package br.edu.principal;

import java.util.Calendar;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia, mes, ano, hora, minuto;
		
		Calendar calendario = Calendar.getInstance();
		dia = calendario.get(Calendar.DAY_OF_MONTH);
		mes = calendario.get(Calendar.MONTH);
		ano = calendario.get(Calendar.YEAR);
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minuto = calendario.get(Calendar.MINUTE);
        
        if (mes == 1) {
        System.out.println(dia + "/" + "Janeiro" + "/" + ano + " – " + hora + ":" + minuto);
        	}
        if (mes == 2) {
            System.out.println(dia + "/" + "Fevereiro" + "/" + ano + " – " + hora + ":" + minuto);
           }
        if (mes == 3) {
            System.out.println(dia + "/" + "Março" + "/" + ano + " – " + hora + ":" + minuto);
           }
        if (mes == 4) {
            System.out.println(dia + "/" + "Abril" + "/" + ano + " – " + hora + ":" + minuto);
           }
        if (mes == 5) {
            System.out.println(dia + "/" + "Maio" + "/" + ano + " – " + hora + ":" + minuto);
           }
        if (mes == 6) {
            System.out.println(dia + "/" + "Junho" + "/" + ano + " – " + hora + ":" + minuto);
           }
        if (mes == 7) {
            System.out.println(dia + "/" + "Julho" + "/" + ano + " – " + hora + ":" + minuto);
           }
        if (mes == 8) {
            System.out.println(dia + "/" + "Agosto" + "/" + ano + " – " + hora + ":" + minuto);
           }
        if (mes == 9) {
            System.out.println(dia + "/" + "Setembro" + "/" + ano + " – " + hora + ":" + minuto);
           }
        if (mes == 10) {
            System.out.println(dia + "/" + "Outubro " + "/" + ano + " – " + hora + ":" + minuto);
           }
        if (mes == 11) {
            System.out.println(dia + "/" + "Novembro" + "/" + ano + " – " + hora + ":" + minuto);
           }
        if (mes == 12) {
            System.out.println(dia + "/" + "Dezembro" + "/" + ano + " – " + hora + ":" + minuto);
           }
	 }
}

		 
