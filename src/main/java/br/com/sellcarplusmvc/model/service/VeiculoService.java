package br.com.sellcarplusmvc.model.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sellcarplusmvc.model.negocio.Caminhao;
import br.com.sellcarplusmvc.model.negocio.Carro;
import br.com.sellcarplusmvc.model.negocio.Moto;
import br.com.sellcarplusmvc.model.negocio.Veiculo;
import br.com.sellcarplusmvc.model.repository.IVeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private IVeiculoRepository veiculoRepository;

	public List<Veiculo> findAll() {
		return (List<Veiculo>) this.veiculoRepository.findAll();
	}

	public List<Veiculo> findAllMotos() {
		return ((List<Veiculo>) this.veiculoRepository.findAll()).stream().filter(carro -> carro instanceof Moto)
				.collect(Collectors.toList());
	}

	public List<Veiculo> findAllCaminhoes() {
		return ((List<Veiculo>) this.veiculoRepository.findAll()).stream().filter(carro -> carro instanceof Caminhao)
				.collect(Collectors.toList());
	}

	public List<Veiculo> findAllCarros() {
		return ((List<Veiculo>) this.veiculoRepository.findAll()).stream().filter(carro -> carro instanceof Carro)
				.collect(Collectors.toList());
	}

	public Veiculo findById(long id) {
		return this.veiculoRepository.findById(id).get();
	}

	public void delete(long id) {
		this.veiculoRepository.deleteById(id);
	}

	public <T extends Veiculo> void save(T veiculo) {
		this.veiculoRepository.save(veiculo);
	}
}
