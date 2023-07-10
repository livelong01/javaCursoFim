package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product ("TV", 900.00));
		list.add(new Product ("Notebook", 1200.00));
		list.add(new Product ("Tablet", 450.00));
		
		Comparator<Product> comp = (p1, p2) ->{
			return p1.getName().compareToIgnoreCase(p2.getName());
		};
		
		/*
		 * Nesse caso, o comparator foi feito atraves de uma ARROW FUNCTION
		 * por causa da setinha "->". Ela vc apenas precisa determinar
		 * os parametros (p1 e p2), fazer a seta, e entre chaves
		 * descrever a funcao "1.getName().compareToIgnoreCase..."
		 */
		
		list.sort(comp);
		
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
