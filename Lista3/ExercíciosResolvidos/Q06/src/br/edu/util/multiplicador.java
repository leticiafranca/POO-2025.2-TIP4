package br.edu.util;

public class multiplicador {

		public static void multiplicacao(int num) {
			
			 for (int i = 1; i <= num; i++) {
				 
		         for (int j = 1; j <= i; j++) {
		        	 
		        	 System.out.println(i * j); 
		        	 
		        	 if (j < i) {
		        		 
		        		 System.out.println ("");
		        	 }
		        }
		         
		         System.out.println();
		   }
	 
		}

	}
