/*
 * @Author Diego Lins 09/04/2021
 * 
 * Classe pessoa com get and setters
 */


package com.entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries ({
	@NamedQuery(name = "find Pessoa id", query="Select p From Pessoa p Where p.idPessoa = :id"),
	@NamedQuery(name = "find Pessoa CPF", query="Select p From Pessoa p Where p.cpf = :cpf"),
	@NamedQuery(name = "find Pessoa RG", query="Select p From Pessoa p Where p.rg = :rg"),
	@NamedQuery(name = "find Pessoa Nome", query="Select p From Pessoa p Where p.nome like :nome"),
	@NamedQuery(name = "list Pessoa", query="Select p From Pessoa p"),
	@NamedQuery(name = "delete Pessoa", query="Delete From Pessoa p Where p.idPessoa = :id"),
})
public class Pessoa {
	// Atributos
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "idPessoa")
	private int idPessoa;
	
	@Column(name = "Nome", columnDefinition="VARCHAR(100)", nullable = false)
	private String nome;

	@Column(name = "RG", columnDefinition="VARCHAR(12)", nullable = false)
	private String rg;
	
	@Column(name = "CPF", columnDefinition="VARCHAR(15)", nullable = false)
	private String cpf;
	
	@Column(name = "dtNascimento", columnDefinition="Date", nullable = false)
	private Date dtNascimento;
	
	@Column(name = "Altura", columnDefinition="DECIMAL(5,2)", nullable = false)
	private float altura;
	
	@Column(name = "Peso", columnDefinition="DECIMAL(5,2)", nullable = false)
	private float peso;
	
	// Construtores
	public Pessoa() {
	}

	public Pessoa(String nome, String cpf, String rg, Date dtNascimento, float altura, float peso) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
		this.altura = altura;
		this.peso = peso;
	}

	// Getters and Setters
	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", dtNascimento="
				+ dtNascimento + ", altura=" + altura + ", peso=" + peso + "]";
	}
}
