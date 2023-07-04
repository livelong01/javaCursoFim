package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramProfessor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			a.add(number);
		}

		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			b.add(number);
		}

		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			c.add(number);
		}
		
		/*
		 * A diferença esta no final, no qual ao inves de adc tudo no
		 * mesmo local. Ele adc em conjuntos set diferentes, no fim fez
		 * uma add dos conjuntos em apenas um, eliminando as repeticoes
		 * e por fim mostrando o tamanho do conjunto "total".
		 */
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);

		System.out.println("Total students: " + total.size());

		sc.close();
	}
}
