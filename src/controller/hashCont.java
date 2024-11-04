package controller;
import br.edu.fateczl.*;

public class hashCont {
	
	Lista[] lista;
	
	public hashCont() {
		lista = new Lista[2];
		inicializaLista();
	}

	private void inicializaLista() {
		int tamanho = lista.length;
		for(int i = 0; i < tamanho; i++) {
			lista[i] = new Lista();
		}
	}
	
	private int hashCode(int numero) {
		return numero % 2;
	}
	
	private void addNumero(int numero) throws Exception {
		int posicao = hashCode(numero);
		lista[posicao].addLast(numero);
	}
	
	public void tabelaHash(int [] vetor) throws Exception {
		for(int num : vetor) {
			addNumero(num);
		}
	}
	
	public void listNumeros() throws Exception {
		int tamanho = lista.length;
		for(int i = 0; i < tamanho; i++) {
			System.out.print("\nResto " + i + ": ");
			int tamanhoLista = lista[i].size();
			for(int j = 0; j < tamanhoLista; j++) {
				System.out.print(lista[i].get(j) + " ");
			}
		}
	}
	
	
}
