package br.com.sellcarplusmvc.model.negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.sellcarplusmvc.model.dto.VendaDTO;

@Entity
@Table(name = "T_venda")
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataRetirada;

	private double valorTotal;
	private double porcentagemDesconto;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "clienteid")
	private Cliente cliente;

	@OneToMany(mappedBy = "venda", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	private List<Veiculo> veiculos;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getPorcentagemDesconto() {
		return porcentagemDesconto;
	}

	public void setPorcentagemDesconto(double porcentagemDesconto) {
		this.porcentagemDesconto = porcentagemDesconto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public void adicionarVeiculo(Veiculo veiculo) {
		if (this.getVeiculos() == null) {
			this.veiculos = new ArrayList<Veiculo>();
		}

		veiculo.setVendido(true);
		this.veiculos.add(veiculo);

	}

	public static Venda fromDTO(VendaDTO dto) {
		Venda venda = new Venda();
		venda.setDataRetirada(dto.getDataRetirada());
		venda.setPorcentagemDesconto(dto.getPorcentagemDesconto());
		venda.setValorTotal(dto.getValorTotal());
		return venda;
	}

}
