package com.vascobank.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cartoes implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cartaoId;
	private Long userId;
	private String numeroCartao;
	private String tipoCartao;
	private Double limiteTotal;
	private Double limiteUsado;
	private Double limiteDisponivel;
	private Double dataCriacao;

	public Cartoes() {
	}

	public Cartoes(Long cartaoId, Long userId, String numeroCartao, String tipoCartao, Double limiteTotal,
			Double limiteUsado, Double limiteDisponivel, Double dataCriacao) {
		super();
		this.cartaoId = cartaoId;
		this.userId = userId;
		this.numeroCartao = numeroCartao;
		this.tipoCartao = tipoCartao;
		this.limiteTotal = limiteTotal;
		this.limiteUsado = limiteUsado;
		this.limiteDisponivel = limiteDisponivel;
		this.dataCriacao = dataCriacao;
	}

	public Long getCartaoId() {
		return cartaoId;
	}

	public void setCartaoId(Long cartaoId) {
		this.cartaoId = cartaoId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getTipoCartao() {
		return tipoCartao;
	}

	public void setTipoCartao(String tipoCartao) {
		this.tipoCartao = tipoCartao;
	}

	public Double getLimiteTotal() {
		return limiteTotal;
	}

	public void setLimiteTotal(Double limiteTotal) {
		this.limiteTotal = limiteTotal;
	}

	public Double getLimiteUsado() {
		return limiteUsado;
	}

	public void setLimiteUsado(Double limiteUsado) {
		this.limiteUsado = limiteUsado;
	}

	public Double getLimiteDisponivel() {
		return limiteDisponivel;
	}

	public void setLimiteDisponivel(Double limiteDisponivel) {
		this.limiteDisponivel = limiteDisponivel;
	}

	public Double getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Double dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cartaoId, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cartoes other = (Cartoes) obj;
		return Objects.equals(cartaoId, other.cartaoId) && Objects.equals(userId, other.userId);
	}

}
