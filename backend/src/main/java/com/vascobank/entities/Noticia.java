package com.vascobank.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;

@Entity
public class Noticia implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long noticiaId;
	private String noticiaResumo;
	private String noticiaDetalhes;
	private Date dataInicio;
	private Date dateTermino;
	private Date dataCriacao;
	private Date dataAtualizacao;

	public Noticia() {
	}

	public Noticia(Long noticiaId, String noticiaResumo, String noticiaDetalhes, Date dataInicio, Date dateTermino,
			Date dataCriacao, Date dataAtualizacao) {
		super();
		this.noticiaId = noticiaId;
		this.noticiaResumo = noticiaResumo;
		this.noticiaDetalhes = noticiaDetalhes;
		this.dataInicio = dataInicio;
		this.dateTermino = dateTermino;
		this.dataCriacao = dataCriacao;
		this.dataAtualizacao = dataAtualizacao;
	}

	public Long getNoticiaId() {
		return noticiaId;
	}

	public void setNoticiaId(Long noticiaId) {
		this.noticiaId = noticiaId;
	}

	public String getNoticiaResumo() {
		return noticiaResumo;
	}

	public void setNoticiaResumo(String noticiaResumo) {
		this.noticiaResumo = noticiaResumo;
	}

	public String getNoticiaDetalhes() {
		return noticiaDetalhes;
	}

	public void setNoticiaDetalhes(String noticiaDetalhes) {
		this.noticiaDetalhes = noticiaDetalhes;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDateTermino() {
		return dateTermino;
	}

	public void setDateTermino(Date dateTermino) {
		this.dateTermino = dateTermino;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(noticiaId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Noticia other = (Noticia) obj;
		return Objects.equals(noticiaId, other.noticiaId);
	}

}
