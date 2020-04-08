package br.com.sellcarplusmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.sellcarplusmvc.model.negocio.Cliente;
import br.com.sellcarplusmvc.model.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService service;

	@RequestMapping(value = "/clientes", method = RequestMethod.GET)
	public String showLista(Model model) {
		model.addAttribute("clientes", service.findAll());
		return "cliente/lista";
	}

	@RequestMapping(value = "/cliente", method = RequestMethod.GET)
	public String showDetalhe() {
		return "cliente/detalhe";
	}

	@RequestMapping(value = "/cliente", method = RequestMethod.POST)
	public String incluir(Model model, Cliente cliente) {
		service.save(cliente);
		return this.showLista(model);
	}

	@RequestMapping(value = "/cliente/{id}", method = RequestMethod.GET)
	public String excluir(Model model, @PathVariable Integer id) {
		service.delete(id);
		return this.showLista(model);
	}

}
