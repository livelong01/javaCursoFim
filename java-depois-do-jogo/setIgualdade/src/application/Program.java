package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Set<Product> set = new HashSet<>();
		
		/*
		 * COmo foi usada a classe Product e ela nao tem a 
		 * implmentacao do hashcode, ele vai usar a referencia
		 * de ponteiros e dai é certo dar false na resposta.
		 * Pois os dois produtos sao instancias diferentes, 
		 * ou seja,  nao apontam para mesma referencia.
		 */
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));

	}

}
