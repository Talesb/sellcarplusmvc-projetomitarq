package br.com.sellcarplusmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.sellcarplusmvc.model.negocio.Moto;
import br.com.sellcarplusmvc.model.service.VeiculoService;

@Controller
public class MotoController {

	@Autowired
	private VeiculoService service;

	@RequestMapping(value = "/veiculo/motos", method = RequestMethod.GET)
	public String showLista(Model model) {
		model.addAttribute("motos", service.findAllMotos());
		return "veiculo/moto/lista";
	}

	@RequestMapping(value = "/veiculo/moto", method = RequestMethod.GET)
	public String showDetalhe() {
		return "veiculo/moto/detalhe";
	}

	@RequestMapping(value = "/veiculo/moto", method = RequestMethod.POST)
	public String incluir(Model model, Moto moto) {
		service.save(moto);
		return this.showLista(model);
	}

	@RequestMapping(value = "/veiculo/moto/{id}", method = RequestMethod.GET)
	public String excluir(Model model, @PathVariable Integer id) {
		service.delete(id);
		return this.showLista(model);
	}

}
