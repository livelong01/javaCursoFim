package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList( 3, 4, 5, 10, 7);

		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		/*
		 * Aqui ele pegou a lista , transformou ela em stram e com o map
		 * multiplicou todos os objetos da stream em 10 vezes.
		 */
		System.out.println(Arrays.toString(st1.toArray()));
		/*
		 * Antes de printar, vc precisa transformar st1 (stream) em array, 
		 * pq a funcao toString, transforma array em texto.
		 */
		
		int sum = list.stream().reduce(0, (x,y) -> x + y);
		/*
		 * O 0(zero) é o elemento neutro da soma e por isso ele fica na frente
		 * e dps se faz a formula que sera usada na soma.
		 */
		int mult = list.stream().reduce(1, (x, y) -> x *y);
		/*
		 * NEsse caso o elemento neutro da multiplicacao
		 * é o 1, e por isso ele é quem vai na frente.
		 */
		
		System.out.println("Sum = " + sum);
		System.out.println("Mult = " + mult);
		
		List<Integer> newList = list.stream()
				.filter(x -> x%2 ==0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));
		
		/*
		 * filter é intermediario e ele filtrou todos os elementos pares
		 * o map tmb é intermediario e ele multiplicou todos os elementos restantes por 10,
		 * e por fil o collect que é final, transformou a stream em lista.
		 */
	}

}
