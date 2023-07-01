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
		Client c2 = new Client ("Maria", "alex@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.equals(c2));
		
		
		
	}

}
