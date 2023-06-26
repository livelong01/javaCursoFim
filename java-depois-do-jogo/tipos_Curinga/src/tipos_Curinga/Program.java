package tipos_Curinga;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	

		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	
		
		/*
		 * Ele criou um metodo que le quaqluer tipo de lista, 
		 * ou seja, pode ser String, integer, double... 
		 * Esse metodo abaixo "printList" vai funcionar com todas
		 * por causa do tipo curinga "?". "List<?>"
		 * Isso pode ajudar no reuso de metodos, sem precisar
		 * especificar o tipo cada vez q for utilizar um tipo 
		 * diferente.
		 */
	
	}
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}

	}

}
