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
		
		Comparator<Product> comp = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().compareToIgnoreCase(p2.getName());
			}
			
		};
		
		/*
		 * Nesse caso, ele criou um compareTO ANONIMO DENTRO DA CLASSE principal
		 * NAO PRECISA mais de uma classe separada (myCOmparator) para fazer
		 * esse serviço. Essa faz direto. Entretanto, essa declaracao
		 * dentro da classe e do tamanho que é, nao fica bonito e nem é
		 * recomendado.
		 */
		
		list.sort(comp);
		
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
