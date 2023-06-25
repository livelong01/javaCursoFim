package entities;

/*
 * Tenho que implementar o comparable com o Product,
 * para que se possa definir o que é essa funcao comparable,
 * ou seja, o que ela vai comparar, qual a funcao dela.
 * Ao implementar o COmparable, o programa pede pra vc 
 * adc e criar a funcao obrigatoriamente.
 */
public class Product implements Comparable<Product> {

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
	
	public String toString () {
		return name + ", " + String.format("%.2f", price);
	}

	@Override
	public int compareTo(Product o) {
		return price.compareTo(o.getPrice());
		/*
		 * O objeto doble tem no seu escopo o compareTo,
		 * por isso podemos usar esse metodo para comparar os 
		 * precos entre si e com isso ver qual o maior.
		 */
		}
	
	
}
