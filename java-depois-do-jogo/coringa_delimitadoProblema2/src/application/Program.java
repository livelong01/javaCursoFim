package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
		
		

	}
	
	/*
	 * Na funcao copy, o tipo da lista de origem "source", usamos "? extends Number", ou seja
	 * lista de qualquer tipo que extends number.
	 * Ja a lista de destino, é uma lista mais generica, que de numeros, entao nesse caso
	 * o destiny "? super Number", ou seja, uma lista que pode ser de qualquer tipo
	 * de super tipo de number. (MAIS GENERICA E ABRANGENTE).
	 */
	
	public static void copy (List<? extends Number> source, List<? super Number> destiny ) {
		for (Number number : source) {
			destiny.add(number);
			
			/*
			 * O primeiro tipo, usando extends. É um tipo usado com covariancia, 
			 * graças a isso conseguimos acessar a lista. O segundo tipo usando o SUPER, é um caso de
			 * contravariancia e por isso podemos add coisas a lista "destiny.add(number). 
			 * 
			 */
		}
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
