package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program_List {

	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		// Adicionar elementos na lista pela as posições
		list.add(2,"Marco");
		
	
		//imprimindo o tamanho da minha lista
		System.out.println(list.size());
		
		for(String c : list) {
			System.out.println(c);
		}
		
		System.out.println("--------------------------");
		//Remove elementos da lista
		list.remove("Anna");
		//Remove elementos por meio de posição
		list.remove(1);
		//Remove elementos da lista por meio de predicado
		list.removeIf(c -> c.charAt(0) == 'M');
		
		for(String c : list) {
			System.out.println(c);
		}
		
		//Encontra posição do elemento na lista 
		System.out.println("Index of bob: "+list.indexOf("Bob"));
		System.out.println();
		//Pegando os elementos da lista somente com a letra A inicial 
		List<String> result = list.stream().filter(c -> c.charAt(0) == 'B').collect(Collectors.toList());
		for(String c : result) {
			System.out.println(c);
		}
		sc.close();
	}
}
