package services;

import java.security.InvalidParameterException;

public class BrazilianInterestService  implements InterestService{

	private Double interestRate;

	public BrazilianInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

	
	
}
