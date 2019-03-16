package br.com.vvcurso.model;

import java.util.Date;

public abstract class Base {

	private int codigo;
	private Date dataHoraInclusao;
	private Date dataHoraEdicao;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getDataHoraInclusao() {
		return dataHoraInclusao;
	}

	public void setDataHoraInclusao(Date dataHoraInclusao) {
		this.dataHoraInclusao = dataHoraInclusao;
	}

	public Date getDataHoraEdicao() {
		return dataHoraEdicao;
	}

	public void setDataHoraEdicao(Date dataHoraEdicao) {
		this.dataHoraEdicao = dataHoraEdicao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
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
		Base other = (Base) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	public Base() {
		// TODO Auto-generated constructor stub
	}

}
