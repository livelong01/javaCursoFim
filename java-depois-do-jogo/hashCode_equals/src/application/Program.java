package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		

		/*String a = "Maria";
		String b = "Alex";
		
		/*
		 * O equals, pergunta se a =b. Nesse caso ,
		 * nao é e por isso sera lançado um
		 * false. 
		 *
		*System.out.println(a.equals(b));
		
		/*
		 * O hascode é um codigo gerado, 
		 * essa funcao produz um numero inteiro, 
		 * se o conteudo do dado for igual, ele gera o medmo
		 * codigo e por isso identifica que é igual.
		 *
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
*/
		
		Client c1 = new Client ("Maria", "maria@gmail.com");
		Client c2 = new Client ("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		
		/*
		 * O ultimo deu falso, "==", pq ele ve por referencia,
		 * e como um ta alocado no c1 e outro no c2, ele entende
		 * como se fossem coisas diferentes apesar do conteudo
		 * ser o mesmo.
		 */
		System.out.println(c1 == c2);
		
		/*
		 * para corrigir isso, podemos igualar os dois como abaixo.
		 */
		
		c1 = c2;
		System.out.println(c1 == c2);
		
		/*
		 * agora ele reconheceu que é igual.
		 */
		
		String s1 = "test";
		String s2 = "test";
	
		System.out.println(s1 == s2);
		/*
		 * funciona e da true, mas pq ele le a string. (caso especial).
		 * para corrigir isso basta fazer isso;
		 */
		
		String s3 = new String("test");
		String s4 =  new String("test");
		
		System.out.println(s3 == s4);
		
		/*
		 * nesse casop vai dar false.
		 */
	}

	
}
