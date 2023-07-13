package entities;

public class Product {

	private String name;
	private Double Price;
	
	
	
	public Product(String name, Double price) {
		this.name = name;
		Price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	
	public static boolean staticProductPredicate(Product p ) {
		return p.getPrice() >= 100;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", Price=" + Price + "]";
	}
}
