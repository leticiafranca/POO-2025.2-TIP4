package br.edu.util;

public class sequenciacao {
	
	 public static double sequencia(int n) {
	        double seq = 1.0; 
	        for (int a = 1; a <= n; a++) {
	            long f = 1; 
	            for (int b = 1; b <= a; b++) {
	                f *= b;
	            }
	            seq += 1.0 / f;
	        }
	        return seq;
	    }
	}
