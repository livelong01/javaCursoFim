package application;


import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		
		List<Shape> myShape = new ArrayList<>();
		myShape.add(new Rectangle (3.0, 2.0));
		myShape.add(new Circle(2.0));
		
		List<Circle> myCircle = new ArrayList<>();
		myCircle.add(new Circle(2.0));
		myCircle.add(new Circle(3.0));
		
		System.out.println("Total AREA: " + totalArea(myCircle));

	}
/*
 * Nessa funcao, sempre da erro se usar Shape ou ?, 
 * o primeiro caso da errado, pq tem q ser sempre uma super classe
 * e o circle é uma subclasse, dai nao funciona.
 * Na ? n funciona pq n pode fazer soma com tipo coringa.
 * A solucao é: "List<? extends Shape", pq ai ele reconhece
 * que a lista é extensao de Shape ou qualquer tipo de lista
 * com subtipo de Shape, dai funciona perfeitamente.
 */
	
	public static double totalArea(List<? extends Shape> list) {
		
		/*
		 * Porem o compilador, mesmo usando extends, ainda nao
		 * deixa adc nada na lista, segue dando erro. Esse é o preco de 
		 * usar o tipo coringa delimitado.
		 */
		
		//list.add(new Rectangle(3.0, 4.0));
		double sum = 0.0;
		for (Shape s : list ) {
			sum += s.area();
		}
		return sum;
	}
}
