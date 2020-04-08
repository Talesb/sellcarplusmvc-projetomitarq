package br.com.sellcarplusmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.sellcarplusmvc.model.negocio.Carro;
import br.com.sellcarplusmvc.model.service.VeiculoService;

@Controller
public class CarroController {

	@Autowired
	private VeiculoService service;

	@RequestMapping(value = "/veiculo/carros", method = RequestMethod.GET)
	public String showLista(Model model) {
		model.addAttribute("carros", service.findAllCarros());
		return "veiculo/carro/lista";
	}

	@RequestMapping(value = "/veiculo/carro", method = RequestMethod.GET)
	public String showDetalhe() {
		return "veiculo/carro/detalhe";
	}

	@RequestMapping(value = "/veiculo/carro", method = RequestMethod.POST)
	public String incluir(Model model, Carro carro) {
		service.save(carro);
		return this.showLista(model);
	}

	@RequestMapping(value = "/veiculo/carro/{id}", method = RequestMethod.GET)
	public String excluir(Model model, @PathVariable Integer id) {
		service.delete(id);
		return this.showLista(model);
	}

}
