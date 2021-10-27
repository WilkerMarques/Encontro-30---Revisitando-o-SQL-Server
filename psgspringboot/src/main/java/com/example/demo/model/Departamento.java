package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "FuncionarioPorDepartamento")
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DepartamentoID")
	private Integer departamentoID;

	@Column(name = "Nome")
	private String nome;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "Inclusao", nullable = true)
	private Date inclusao;

	public Departamento() {

	}

	public Integer getDepartamentoID() {
		return departamentoID;
	}

	public String getNome() {
		return nome;
	}

	public Date getInclusao() {
		return inclusao;
	}

	public void setDepartamentoID(Integer departamentoID) {
		this.departamentoID = departamentoID;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setInclusao(Date dataInsert) {
		this.inclusao = dataInsert;
	}

	public Departamento(Integer departamentoID, String nome, Date dataInsert) {
		super();
		this.departamentoID = departamentoID;
		this.nome = nome;
		this.inclusao = dataInsert;
	}

	@Override
	public String toString() {
		return "Departamento [departamentoID=" + departamentoID + ", nome=" + nome + ", inclusao="
				+ inclusao + "]";
	}
	
	
}