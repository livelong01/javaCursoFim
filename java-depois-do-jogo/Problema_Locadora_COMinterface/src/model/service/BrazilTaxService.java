package model.service;

public class BrazilTaxService implements TaxService{

	// usar o implements para ligar o brazil tax service com o 
	// abstrato tax service.
	public double tax(double amount) {
		if (amount <= 100.0) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}
}
