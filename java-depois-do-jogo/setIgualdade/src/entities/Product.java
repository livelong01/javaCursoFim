package entities;

import java.util.Objects;

public class Product {
	
	private String name;
	private Double price;
	
	
	public Product(String name, Double price) {
	this.name = name;
	this.price = price;
	}
	
	public String getName() {
	return name;
	}
	
	public void setName(String name) {
	this.name = name;
	}
	
	public Double getPrice() {
	return price;
	}
	
	public void setPrice(Double price) {
	this.price = price;
	}

	/*
	 * Agora que foi instanciado o rashCOde e equals, 
	 * foi a respssta mudou para verdadeiro. POis utilizando
	 * esse metodo instanciado, ele consegue analisar o texto 
	 * e com isso confirmar se o conteudo é o mesmo.
	 * Diferente de antes que analisada a referencia.
	 */
	
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}
	
	
}
