package application;

public class Product implements Comparable<Product> {
	
	/*
	 * Quando for usar o treeset, obrigatoriamente tera
	 * que implementar o comparable<product>, para que
	 * funcione corretamente. 
	 * Fora que voce tera q escrever a funcao la embaixo.
	 */
	
	
private String name;
private Double price;


public Product(String name, Double price) {
this.name = name;
this.price = price;
}


// (... get / set / hashCode / equals)


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

/*
 * COmo nesse caso, que pediu para q tudo fosse transformado em
 * letras maiusculas e dps comparados.
 */
@Override
public int compareTo(Product other) {
return name.toUpperCase().compareTo(other.getName().toUpperCase());
}
}
