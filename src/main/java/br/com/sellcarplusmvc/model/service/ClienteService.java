package br.com.sellcarplusmvc.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sellcarplusmvc.model.negocio.Cliente;
import br.com.sellcarplusmvc.model.repository.IClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private IClienteRepository clienteRepository;

	public List<Cliente> findAll() {
		return (List<Cliente>) this.clienteRepository.findAll();
	}

	public Cliente findById(long id) {
		return this.clienteRepository.findById(id).get();
	}

	public void delete(long id) {
		this.clienteRepository.deleteById(id);
	}

	public void save(Cliente cliente) {
		this.clienteRepository.save(cliente);
	}
}
