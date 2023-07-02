package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		//Set<String> set = new HashSet<>();
		
		/*
		 * O hasSet é a forma mais rapida, porem ele nao mantem
		 * a ordem. Tanto é que se eu mudar a ordem abaixo dps
		 * de ter executado uma vez o programa, ele ira alterar
		 * a ordem de aparecicao no print abaixo. 
		 * Resumo: se a ordem nao importa, ele é o mais indicado.
		 */
		
		//Set<String> set = new TreeSet<>();
		/*
		 * O treeSet é mais lento, mas ele ordena por ordem alfabetica
		 * sempre dando prioridade as letras maiusculas.
		 */
		
		Set<String> set = new LinkedHashSet<>();
		
		/*
		 * Nesse ultimo caso, a velocidade é intermediaria e
		 * ele mantem a ordem dos String de acordo com a ordem
		 * que eles foram inseridos (nao alfabetica).
		 */
		
		set.add("Ar-condicionado");
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		
		
		
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}

	}

}
