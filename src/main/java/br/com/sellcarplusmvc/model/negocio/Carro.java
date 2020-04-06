package br.com.sellcarplusmvc.model.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T_carro")
public class Carro extends Veiculo {

	private String modelo;
	private int qtdAssento;
	private int qtdPorta;
	private boolean carga;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQtdAssento() {
		return qtdAssento;
	}

	public void setQtdAssento(int qtdAssento) {
		this.qtdAssento = qtdAssento;
	}

	public int getQtdPorta() {
		return qtdPorta;
	}

	public void setQtdPorta(int qtdPorta) {
		this.qtdPorta = qtdPorta;
	}

	public boolean isCarga() {
		return carga;
	}

	public void setCarga(boolean carga) {
		this.carga = carga;
	}

}
