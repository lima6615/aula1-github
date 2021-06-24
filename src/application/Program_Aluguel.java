package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program_Aluguel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluguel[] vect = new Aluguel[10];

		System.out.print("Digite a quantidade de alugueis ? ");
		int n = sc.nextInt();

		for (int i = 1; i <=n; i++) {

			System.out.println("Quarto #" +i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Numero do Quarto: ");
			int numeroQuarto = sc.nextInt();
			System.out.println();

			vect[i] = new Aluguel(name, email, numeroQuarto);
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if(vect[i]!= null) {
				System.out.println(i +":"+ vect[i]);
			}
		}

		sc.close();
	}
}