package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		/*
		 * Na funcao Function quando se vai transformar os nomes
		 * dos produtos para letra maiuscula, precisa-se fazer um "macete"
		 * onde se vai converter a lista para "stream", aplicar a funcao
		 * UpperCase e depois voltar a converter para lista. 
		 * EM outras palavras...
		 * usando o ".stram()" na lista, converte ela pra stream e no final usando
		 * ".collect(Collectors.toList())" na stream se converte para lista novamente.
		 */
		
		/*
		 * Alem disso, temos que chamar a funcao map ( com m minusculo , nao confundir
		 * com a estrutura Map), que aplica uma funcao em todos os elementos da stream/lista.
		 * 
		 */
		
		/*
		 * No exercicio abaixo: 
		 * "list.stream().map(new UpperCaseName())" aqui há a conversao
		 * da lista para stream e dps com o map se aplica  a funcao upperCase.
		 * ".collect(Collectors.toList())" esse final ha a conversao de stream 
		 * para list novamente. Esse é o processo.
		 * 
		 */
		

		
		List <String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);

	}

}
