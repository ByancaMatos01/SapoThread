package View;

import Controller.CorridaSapo;

public class Main {
	final static int num_sapos=5;
	final static int distancia=250;
	private static CorridaSapo corridaSapo;
	

	public static void main(String[] args) {
		
		System.out.println("E foi dada a largarda para a corrida mais emocionante ");
		for(int i=1; i<=num_sapos; i++) { 
			 corridaSapo = new CorridaSapo("sapo "+ i, distancia);
			 corridaSapo.start();
			 
			
		}

	}

}
