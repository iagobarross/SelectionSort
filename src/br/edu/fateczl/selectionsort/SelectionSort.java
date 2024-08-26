package br.edu.fateczl.selectionsort;

public class SelectionSort {

	public SelectionSort() {
		super();
	}

	public int[] Selection(int[] vetor) {
		int aux;
		int menor;
		int tamanho = vetor.length;

		for (int i = 0; i < tamanho - 1; i++) {
			menor = i;
			for (int j = (i + 1); j < tamanho; j++) {
				if (vetor[j] < vetor[menor]) {
					menor = j;
				}
			}

			aux = vetor[menor];
			vetor[menor] = vetor[i];
			vetor[i] = aux;
		}

		return vetor;
	}
}
