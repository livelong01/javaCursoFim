package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T> {
	/*
	 * Esse "T" é generico, pode ser qualquer coisa o nome.
	 * Isso garante que o primeiro "tipo" de objeto adc na lsita
	 * sera o tipo da lista. Por ex; se adc primeiro um string
	 * a lista sera string e n aceitara outros tipos.
	 */
	
	
	private List<T> list = new ArrayList<>();
	
	public void addValue (T value) {
		list.add(value);
	}
	
	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empy!");
			}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i =1; i< list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}
