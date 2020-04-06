package br.com.sellcarplusmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.sellcarplusmvc.model.negocio.Cliente;
import br.com.sellcarplusmvc.model.service.ClienteService;

@Controller
@RequestMapping("/api/cliente")
public class ClienteController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showInit() {	
		return this.showLogin();
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin() {	
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showHome(
			@RequestParam String login,
			@RequestParam String senha
			) {
		boolean isValid = "admin".equalsIgnoreCase(login) &&
						  "admin".equalsIgnoreCase(senha);
		if(!isValid) {
			return "login";
		}
		return "home";
	}
	
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
