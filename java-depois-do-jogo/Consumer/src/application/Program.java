package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {
		
Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		list.forEach(Product::staticPriceUpdate);
		
		list.forEach(System.out::println);
		/*
		 * Aqui vc pode usar sempre assim: 
		 * - primeiro a classe (Product) + :: + o metodo.
		 * 
		 * Isso funciona para o caso do print. 
		 * System.out (classe) + :: + println (o metodo).
		 */
		
		/*
		 * Nesse forEach ele vai executar um "CONSUMER" e com isso vai, 
		 * nesse caso, mudar em 10% o valor de cada preco.
		 * 
		 */

	}

}
