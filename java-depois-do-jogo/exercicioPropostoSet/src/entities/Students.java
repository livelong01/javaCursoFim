package entities;

import java.util.Objects;

public class Students {

	private Integer matricula;

	public Students(Integer matricula) {
		this.matricula = matricula;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
	
	
	
	
	
}
