package model.service;

public interface TaxService {

	double tax( double amount);
	
	/*
	 * Isso serve para criar como se fosse uma classe abstrata
	 * onde tem uma funcao padrao que faz o calculo das taxas
	 * assim se houver alguma alteracao, apenas a classe especifica
	 * da taxa sera alterada. OU seja, nao há necessidade de modificar
	 * a classe rentalService. Reduziando o trabalho.
	 */
}


