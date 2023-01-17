package com.vascobank.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transacoes implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long trasacaoId;
	private Long numeroConta;
	private Long userId;
	private Date dataTransacao;
	private String resumoTransacao;
	private String tipoTransacao;
	private Double valorTransacao;
	private Double saldoFinal;
	private String dataCriacao;

	public Transacoes() {
	}

	public Transacoes(Long trasacaoId, Long numeroConta, Long userId, Date dataTransacao, String resumoTransacao,
			String tipoTransacao, Double valorTransacao, Double saldoFinal, String dataCriacao) {
		super();
		this.trasacaoId = trasacaoId;
		this.numeroConta = numeroConta;
		this.userId = userId;
		this.dataTransacao = dataTransacao;
		this.resumoTransacao = resumoTransacao;
		this.tipoTransacao = tipoTransacao;
		this.valorTransacao = valorTransacao;
		this.saldoFinal = saldoFinal;
		this.dataCriacao = dataCriacao;
	}

	public Long getTrasacaoId() {
		return trasacaoId;
	}

	public void setTrasacaoId(Long trasacaoId) {
		this.trasacaoId = trasacaoId;
	}

	public Long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getDataTransacao() {
		return dataTransacao;
	}

	public void setDataTransacao(Date dataTransacao) {
		this.dataTransacao = dataTransacao;
	}

	public String getResumoTransacao() {
		return resumoTransacao;
	}

	public void setResumoTransacao(String resumoTransacao) {
		this.resumoTransacao = resumoTransacao;
	}

	public String getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(String tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

	public Double getValorTransacao() {
		return valorTransacao;
	}

	public void setValorTransacao(Double valorTransacao) {
		this.valorTransacao = valorTransacao;
	}

	public Double getSaldoFinal() {
		return saldoFinal;
	}

	public void setSaldoFinal(Double saldoFinal) {
		this.saldoFinal = saldoFinal;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(trasacaoId, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transacoes other = (Transacoes) obj;
		return Objects.equals(trasacaoId, other.trasacaoId) && Objects.equals(userId, other.userId);
	}

}
