package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Vect_Product;

public class Program_Vect {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();

		Vect_Product[] vect = new Vect_Product[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Price: ");
			double price = sc.nextDouble();

			vect[i] = new Vect_Product(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double media = sum /vect.length ;
		System.out.println();
		System.out.printf("Average price: %.2f", media);
		sc.close();
	}

}
