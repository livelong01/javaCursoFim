package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.ProductPredicate;



public class Porgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		list.removeIf(Product :: staticProductPredicate);
		
		/*
		 * Voce pode instanciar o static metodo que esta direto na classe
		 * product, porem tem aquele problema de se precisar terá
		 * que fazer alteracoes diretamente no product e isso nao
		 * é bem visto e a manutencao é mais dificil.
		 */
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
