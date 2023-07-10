package entities;

import java.util.Objects;

public class Votos {

	private String candidato;
	private Integer qtdVotos;
	
	
	public Votos(String candidato, Integer qtdVotos) {
		this.candidato = candidato;
		this.qtdVotos = qtdVotos;
	}


	public String getCandidato() {
		return candidato;
	}


	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}


	public Integer getQtdVotos() {
		return qtdVotos;
	}


	public void setQtdVotos(Integer qtdVotos) {
		this.qtdVotos = qtdVotos;
	}


	@Override
	public int hashCode() {
		return Objects.hash(candidato, qtdVotos);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Votos other = (Votos) obj;
		return Objects.equals(candidato, other.candidato) && Objects.equals(qtdVotos, other.qtdVotos);
	}
	
	
	
	
}
