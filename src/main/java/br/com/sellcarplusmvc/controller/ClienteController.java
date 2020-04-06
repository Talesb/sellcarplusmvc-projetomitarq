package br.com.sellcarplusmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sellcarplusmvc.model.negocio.Cliente;
import br.com.sellcarplusmvc.model.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public List<Cliente> obterLista() {
		return clienteService.findAll();
	}

	@RequestMapping("{id}")
	public Cliente obterPorId(@PathVariable int id) {
		return clienteService.findById(id);
	}

	@DeleteMapping("{id}")
	public void excluir(int id) {
		clienteService.delete(id);
	}

	@PostMapping(produces = "application/json", consumes = "application/json")
	public void salvar(@RequestBody Cliente cliente) {
		clienteService.save(cliente);
	}

}
