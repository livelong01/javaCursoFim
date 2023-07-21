package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(3, 4, 5 , 10, 7);
		
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		/*
		 * list.stream é criar uma stream a partir da lista.
		 * como se fosse uma conversao.
		 */
		
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		
		System.out.println(Arrays.toString(st2.toArray()));
		
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x+2);
		/*
		 * essa funcao acima é infinita 
		 * Stream.iterate(0, x -> x+2)
		 * entao vc precisa fechar o circuito, por isso se usa
		 * o short limit.
		 */
		
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
	
		Stream<Long> st4 = Stream.iterate(new Long[] {0L,1L} ,p -> new Long[] {p[1], p[0] + p[1]}).map(p-> p[0]);
 
		/*
		 * seq de fibonaci
		 */
		
		System.out.println(Arrays.toString(st4.limit(20).toArray()));
	}

}
