package testes_coringa_delimitado;

import java.util.ArrayList;
import java.util.List;

public class covariancia {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		List<? extends Number> list = intList;
		Number x = list.get(0);
		//list.add(20);
		
		/*
		 * COVARIANCIA: aceita get e nao aceita put.
		 * Quando vc diz que uma lista mais generica, 
		 * recebe uma lista mais especifica, como no caso acima
		 * voce consegue dar "get", ou seja, ver o que tem na
		 * lista, porem nao consegue dar "put", adc conteudo 
		 * na lista, pois o compilador nao sabe o tipo especifico
		 * dessa lista. E para evitar problemas ele bloqueia o put.
		 */

	}

}
