package application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Date {

	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
	//	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
	   
		System.out.println("Digita uma data: ");
		String  n = sc.nextLine();
		System.out.println(n);
		sc.close();
	}
}
