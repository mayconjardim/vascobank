package com.vascobank.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contato implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private String contatoId;
	private String contatoNome;
	private String contatoEmail;
	private String assunto;
	private String mensagem;
	private Date dataCriacao;
	
	public Contato() {
	}

	public Contato(String contatoId, String contatoNome, String contatoEmail, String assunto, String mensagem,
			Date dataCriacao) {
		super();
		this.contatoId = contatoId;
		this.contatoNome = contatoNome;
		this.contatoEmail = contatoEmail;
		this.assunto = assunto;
		this.mensagem = mensagem;
		this.dataCriacao = dataCriacao;
	}

	public String getContatoId() {
		return contatoId;
	}

	public void setContatoId(String contatoId) {
		this.contatoId = contatoId;
	}

	public String getContatoNome() {
		return contatoNome;
	}

	public void setContatoNome(String contatoNome) {
		this.contatoNome = contatoNome;
	}

	public String getContatoEmail() {
		return contatoEmail;
	}

	public void setContatoEmail(String contatoEmail) {
		this.contatoEmail = contatoEmail;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contatoId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(contatoId, other.contatoId);
	}
	
	
}
