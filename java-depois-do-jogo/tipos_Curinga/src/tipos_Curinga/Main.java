package tipos_Curinga;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		//myObjs = myNumbers;
		
		/*
		 * Nesse caso a igualdade acima dá um erro de compilacao,
		 * pois a lista do tipo object nao é uma super classe da
		 * lista do tipo INteger. Diferente se fosse apenas uma i
		 * igualdade entre objetos sem lista. COMo no ex abaixo:
		 */
		
		Object  object;
		Integer x = 10;
		object = x;
		
		/*
		 * Nesse caso nao dá erro, pq o problema ta na lista,
		 * a lista de OBJ n é um super tipo de lista de Integer.
		 */
		
		/*
		 * Para resolver esse problema iremos utilizar o tipo Curinga
		 * que é "List<?>" com a interrogacao, dai os tipos de lista
		 * diferentes sao compativeis. É super dos objectos.
		 */

		List<?> myObjs2 = new ArrayList<Object>();
		List<Integer> myNumbers2 = new ArrayList<Integer>();
		myObjs2 = myNumbers2;
		
		/*
		 * COmo se pode ver, agora nao há mais erro de compilacao.
		 */
		
	}

}
