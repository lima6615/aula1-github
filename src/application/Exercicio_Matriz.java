package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int linhas = sc.nextInt();
		int colunas = sc.nextInt();

		int[][] mat = new int[linhas][colunas];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[linhas][colunas] = sc.nextInt();
			}
		}

		System.out.print("Digite um numero da minha matriz: ");
		int n = sc.nextInt();
		
		for(int i=0;i< mat.length;i++) {
			for(int j=0;j < mat.length;j++) {
				
			}
		}
		
		sc.close();
	}
}
