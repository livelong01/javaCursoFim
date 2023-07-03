package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program2 {

	public static void main(String[] args) {
		
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		/*
		 * addAll serve pra unir os conjuntos, tudo que tiver em um vai ter no outro
		 * nao adc duas vezes o mesmo elemento.
		 */
		
		
		//intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		/*
		 * Nesse caso, tudo que tiverem em comum sera mantido.
		 */
		
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
		
		/*
		 * Remove todos que apenas um possui é mantido.
		 */

	}

}
