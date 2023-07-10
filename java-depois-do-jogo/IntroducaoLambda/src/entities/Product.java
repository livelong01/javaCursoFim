package entities;

public class Product implements Comparable<Product>{

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

	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product o) {
		return name.compareToIgnoreCase(o.getName());
	}
	
	/*
	 * O problema do comparador estar implementado na classe Product 
	 * é indesejado, pq a manutencao fica mais dificil e precisa mudar
	 * mais coisas que o necessario. Qualquer alteracao que se quiser
	 * fazer no comparator, precisara abrir a classe product.
	 */

	
	
	
}
