package model.entities;

public class Invoice {

	private Double BasicPayment;
	private Double tax;
	
	public Invoice(){
		
	}

	public Invoice(Double basicPayment, Double tax) {
		BasicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return BasicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		BasicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	
	public Double getTotalPayment() {
		return getBasicPayment() + getTax(); // usar o get ao inves do tax, pq a logica da tax pode mudar e com o get vc atualiza automaticamente.
	}
}
