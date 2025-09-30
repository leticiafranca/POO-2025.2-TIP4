package br.edu.util;

public class calcula_media {
		
		public static double calculandoMedia(double n1, double n2, double n3, char l) {
	        double media = 0;
	        
	        if (l == 'A' || l == 'a') {
	            media = (n1 + n2 + n3) / 3.0;
	            } 
	        
	        else if (l == 'P' || l == 'p'){
	            media = (n1 * 5 + n2 * 3 + n3 * 2) / (5.0 + 3.0 + 2.0);
	        }
	        	
	        	return media;
	    }
	}
