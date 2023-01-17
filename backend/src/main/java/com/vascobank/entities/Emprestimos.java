package com.vascobank.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Emprestimos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numeroEmprestimo;
	private Long userId;
	private Date dataInicio;
	private String tipoEmprestimo;
	private Double totalEmprestimo;
	private Double totalPago;
	private Double totalPendente;
	private Double dataCriacao;

	public Emprestimos() {
	}

	public Emprestimos(Long numeroEmprestimo, Long userId, Date dataInicio, String tipoEmprestimo,
			Double totalEmprestimo, Double totalPago, Double totalPendente, Double dataCriacao) {
		super();
		this.numeroEmprestimo = numeroEmprestimo;
		this.userId = userId;
		this.dataInicio = dataInicio;
		this.tipoEmprestimo = tipoEmprestimo;
		this.totalEmprestimo = totalEmprestimo;
		this.totalPago = totalPago;
		this.totalPendente = totalPendente;
		this.dataCriacao = dataCriacao;
	}

	public Long getNumeroEmprestimo() {
		return numeroEmprestimo;
	}

	public void setNumeroEmprestimo(Long numeroEmprestimo) {
		this.numeroEmprestimo = numeroEmprestimo;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getTipoEmprestimo() {
		return tipoEmprestimo;
	}

	public void setTipoEmprestimo(String tipoEmprestimo) {
		this.tipoEmprestimo = tipoEmprestimo;
	}

	public Double getTotalEmprestimo() {
		return totalEmprestimo;
	}

	public void setTotalEmprestimo(Double totalEmprestimo) {
		this.totalEmprestimo = totalEmprestimo;
	}

	public Double getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(Double totalPago) {
		this.totalPago = totalPago;
	}

	public Double getTotalPendente() {
		return totalPendente;
	}

	public void setTotalPendente(Double totalPendente) {
		this.totalPendente = totalPendente;
	}

	public Double getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Double dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroEmprestimo, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emprestimos other = (Emprestimos) obj;
		return Objects.equals(numeroEmprestimo, other.numeroEmprestimo) && Objects.equals(userId, other.userId);
	}

}
