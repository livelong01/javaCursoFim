package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("Username", "Maria");
		cookies.put("Email", "Maria@gmail.com");
		cookies.put("Email", "jose@gmaik.com");
		cookies.put("Phone", "99711122");
		
		cookies.remove("Email");
		cookies.put("Phone", "99666582");
		/*
		 * Como o map nao aceita repeticoes, ele vai sobreescrever
		 * o valor do Phone , ou seja, o numero final vai ser o numeor
		 * que aparece no print. (99666582).
		 */
		
		System.out.println("Contais 'phone' key: " + cookies.containsKey("Phone"));
		
		System.out.println("Phone number: " + cookies.get("Phone"));
		/*
		 * Nesse caso acima ele da a chave "Phone" e recebe o valor que essa
		 * chave possui. No caso o numero de telefone 9966682.
		 */
		
		System.out.println("Email: " + cookies.get("Email"));
		System.out.println("Size: " +  cookies.size());
		
		
		System.out.println("ALl cookies");
		for (String key : cookies.keySet()) {
			System.out.println(key + " : " + cookies.get(key));
		}
		
	}

}
