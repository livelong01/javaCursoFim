package testes_coringa_delimitado;

import java.util.ArrayList;
import java.util.List;

public class contravariancia {

	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		myObjs.add(3.16);
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		//Number x = myNums.get(0);
		
		for (Object x : myNums) {
			System.out.println(x);
		}

		/*
		 * CONTRAVARIANCIA: Voce consegue put, mas n get.
		 * O problema aqui é que voce cria uma lista mais
		 * generica e adc conteudo especifico, como string
		 * depois voce diz q essa lista especifica é um coringa
		 * do tipo "super number", ou seja, pode ser o number uma
		 * super classe dele, no caso, ate obj. 
		 * Com isso vc pode estanciar uma lista de string a essa lista
		 * coringa. E pode ainda adc double ou integer sem problemas.
		 * porem se voce instancia o tipo Number e pede pra mostrar
		 * com o get o primeiro item da lista, o compilador nao deixa
		 * pois ele nao reconhece o obj de tipos variados como Number.
		 */
		
	}

}
