package services;

import java.util.List;

public class CalculationService {

	public static Integer max (List<Integer> list) {
		
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
			}
		Integer max = list.get(0);
		for (Integer item : list) {
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
