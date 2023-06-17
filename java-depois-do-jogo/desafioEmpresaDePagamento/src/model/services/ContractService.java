package model.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public OnlinePaymentService onlinePaymentService;
	
	
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract (Contract contract, Integer months) {
		double TotalAmount = contract.getTotalValue()/months;
		for (int i = 1 ; i <= months; i++) {
			LocalDate date  = contract.getDate().plusMonths(i);
			Double amount = TotalAmount + onlinePaymentService.interest(TotalAmount, i);
			amount += onlinePaymentService.paymentFee(amount);

			contract.addInstallments(new Installment(date,amount));
			
			
		}
	}	
}
