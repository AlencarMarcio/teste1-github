package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetor = new int[3];
		int aux = 0;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = scan.nextInt();
		}
		for (int i = 1; i <= 2; i++) {
			for (int j = 0; j < i; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;

				}

			}
		}

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
		}

		scan.close();
	}
}