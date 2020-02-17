package br.com.deab.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nomeAluno;
	private String cpfAluno;
	private Date dataNascimento;
	private String responsavel1;
	private String cpfResponsavel1;
	private String telefoneResponsavel1;
	private String responsavel2;
	private String cpfResponsavel2;
	private String telefoneResponsavel2;
	private String endereco;
	private boolean status;
	private String foto;
	private String observacao;
	
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpfAluno == null) ? 0 : cpfAluno.hashCode());
		result = prime * result + id;
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
		Aluno other = (Aluno) obj;
		if (cpfAluno == null) {
			if (other.cpfAluno != null)
				return false;
		} else if (!cpfAluno.equals(other.cpfAluno))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getCpfAluno() {
		return cpfAluno;
	}
	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getResponsavel1() {
		return responsavel1;
	}
	public void setResponsavel1(String responsavel1) {
		this.responsavel1 = responsavel1;
	}
	public String getCpfResponsavel1() {
		return cpfResponsavel1;
	}
	public void setCpfResponsavel1(String cpfResponsavel1) {
		this.cpfResponsavel1 = cpfResponsavel1;
	}
	public String getTelefoneResponsavel1() {
		return telefoneResponsavel1;
	}
	public void setTelefoneResponsavel1(String telefoneResponsavel1) {
		this.telefoneResponsavel1 = telefoneResponsavel1;
	}
	public String getResponsavel2() {
		return responsavel2;
	}
	public void setResponsavel2(String responsavel2) {
		this.responsavel2 = responsavel2;
	}
	public String getCpfResponsavel2() {
		return cpfResponsavel2;
	}
	public void setCpfResponsavel2(String cpfResponsavel2) {
		this.cpfResponsavel2 = cpfResponsavel2;
	}
	public String getTelefoneResponsavel2() {
		return telefoneResponsavel2;
	}
	public void setTelefoneResponsavel2(String telefoneResponsavel2) {
		this.telefoneResponsavel2 = telefoneResponsavel2;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}


	public String getObservacao() {
		return observacao;
	}


	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
