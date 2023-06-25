package services;

import java.util.List;

public class CalculationService {

	/*
	 * Ao tentar usar o tipo T para fazer a funcao comparable
	 * dá um erro dizendo que o tipo T n tem essa funcao, 
	 * por isso se usa o "extends Comparable<T>. 
	 * Transformando assim o tipo T em algum tipo que tenha
	 * dentro de si a funcao Comparable. 
	 */
	public static <T extends Comparable<T>> T max (List<T> list) {
		
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
			}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				/*
				 * Na funcao "compareTo" se o ITEM for maior que o MAX
				 * entao aparece um numero aleatorio POSITIVO. E por isso
				 * esse if funciona bem.
				 */
				max = item;
			}
		}
		return max;
	}
	
}
