package view;

import controller.hashCont;

public class Principal {
	public static void main(String[] args) {
		int[] vetor = { 114, 28, 235, 47, 31, 90, 56, 2, 100, 0 };
		hashCont hCont = new hashCont();
		
		try {
			hCont.tabelaHash(vetor);
			hCont.listNumeros();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
}
