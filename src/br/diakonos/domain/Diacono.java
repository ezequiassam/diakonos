package br.diakonos.domain;

import java.sql.Date;
import java.util.List;

public class Diacono {

	private Integer id;
	private String nome;
	private Date nascimento;
	private String identidade;
	private List<Date> indisponibilidade;

	public Diacono(String nome, Date nascimento, String identidade, List<Date> indisponibilidade) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.identidade = identidade;
		this.indisponibilidade = indisponibilidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public List<Date> getIndisponibilidade() {
		return indisponibilidade;
	}

	public void setIndisponibilidade(List<Date> indisponibilidade) {
		this.indisponibilidade = indisponibilidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((identidade == null) ? 0 : identidade.hashCode());
		result = prime * result + ((indisponibilidade == null) ? 0 : indisponibilidade.hashCode());
		result = prime * result + ((nascimento == null) ? 0 : nascimento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diacono other = (Diacono) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (identidade == null) {
			if (other.identidade != null)
				return false;
		} else if (!identidade.equals(other.identidade))
			return false;
		if (indisponibilidade == null) {
			if (other.indisponibilidade != null)
				return false;
		} else if (!indisponibilidade.equals(other.indisponibilidade))
			return false;
		if (nascimento == null) {
			if (other.nascimento != null)
				return false;
		} else if (!nascimento.equals(other.nascimento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Diacono [id=" + id + ", nome=" + nome + ", nascimento=" + nascimento + ", identidade=" + identidade
				+ ", indisponibilidade=" + indisponibilidade + "]";
	}
}