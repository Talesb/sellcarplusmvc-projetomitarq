package br.com.sellcarplusmvc.model.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class VendaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private Date dataRetirada;
	private double porcentagemDesconto;
	private int clienteId;
	private List<Integer> veiculoIds;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public double getPorcentagemDesconto() {
		return porcentagemDesconto;
	}

	public void setPorcentagemDesconto(double porcentagemDesconto) {
		this.porcentagemDesconto = porcentagemDesconto;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public List<Integer> getVeiculoIds() {
		return veiculoIds;
	}

	public void setVeiculoIds(List<Integer> veiculoIds) {
		this.veiculoIds = veiculoIds;
	}

}
