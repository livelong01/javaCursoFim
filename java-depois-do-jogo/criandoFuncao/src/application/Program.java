package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import model.services.ProductService;

public class Program {

	public static void main(String[] args) {
		

		
		Locale.setDefault(Locale.US);		
		List<Product> list = new ArrayList<>();

				list.add(new Product("Tv", 900.00));
				list.add(new Product("Mouse", 50.00));
				list.add(new Product("Tablet", 350.50));
				list.add(new Product("HD Case", 80.90));

		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);
		
		/*
		 * No primeiro caso, o predicado, ficava na funcao IF dentro da classe ProductService, 
		 * porem com essa modificacao, se coloca o PREDICATED como parametro da funcao FilteredSUM, 
		 * fazendo assim poder ser feito a alteracao do predicated direto no codigo, sem ter a necessidade
		 * de modificar a classe ProductService. O que é OTIMO para manutencao.
		 */
		
		System.out.println("Sum = " + String.format("%.2f", sum));
	}

}
