package br.com.sellcarplusmvc.model.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T_caminhao")
public class Caminhao extends Veiculo {

	private double tara;
	private double lotacao;
	private double pesoBrutoTotal;

	public double getTara() {
		return tara;
	}

	public void setTara(double tara) {
		this.tara = tara;
	}

	public double getLotacao() {
		return lotacao;
	}

	public void setLotacao(double lotacao) {
		this.lotacao = lotacao;
	}

	public double getPesoBrutoTotal() {
		return pesoBrutoTotal;
	}

	public void setPesoBrutoTotal(double pesoBrutoTotal) {
		this.pesoBrutoTotal = pesoBrutoTotal;
	}

}
