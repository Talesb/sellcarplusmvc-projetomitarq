package br.com.sellcarplusmvc.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sellcarplusmvc.model.dto.VendaDTO;
import br.com.sellcarplusmvc.model.negocio.Cliente;
import br.com.sellcarplusmvc.model.negocio.Veiculo;
import br.com.sellcarplusmvc.model.negocio.Venda;
import br.com.sellcarplusmvc.model.repository.IVendaRepository;

@Service
public class VendaService {

	@Autowired
	private IVendaRepository vendaRepository;

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private VeiculoService veiculoService;

	public List<Venda> findAll() {
		return (List<Venda>) this.vendaRepository.findAll();
	}

	public Venda findById(long id) {
		return this.vendaRepository.findById(id).get();
	}

	public void delete(long id) {
		this.vendaRepository.deleteById(id);
	}

	public void save(VendaDTO vendaDTO) throws Exception {

		if (vendaDTO.getClienteId() == 0) {
			throw new Exception("É necessário informar um Cliente id");
		}

		if (vendaDTO.getVeiculoIds().isEmpty()) {
			throw new Exception("É necessário informar um id de um veículo");
		}

		Cliente clienteVenda = this.clienteService.findById(vendaDTO.getClienteId());

		if (clienteVenda == null) {
			throw new Exception("Cliente não encontrado");
		}

		List<Veiculo> veiculos = new ArrayList<Veiculo>();

		vendaDTO.getVeiculoIds().forEach(id -> {
			Veiculo veiculoEncontrado = this.veiculoService.findById(id);
			if (veiculoEncontrado != null) {
				veiculos.add(veiculoEncontrado);
			}
		});

		if (veiculos.isEmpty()) {
			throw new Exception("Não foi encontrado nenhum veículo com os ids informados");

		}

		Venda novaVenda = Venda.fromDTO(vendaDTO);
		novaVenda.setCliente(clienteVenda);
		novaVenda.setVeiculos(veiculos);

		this.vendaRepository.save(novaVenda);

		veiculos.forEach(veiculo -> {
			veiculo.setVenda(novaVenda);
			this.veiculoService.save(veiculo);
		});
	}

}
