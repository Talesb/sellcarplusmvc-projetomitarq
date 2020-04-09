package br.com.sellcarplusmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.sellcarplusmvc.model.negocio.Caminhao;
import br.com.sellcarplusmvc.model.service.VeiculoService;

@Controller
public class CaminhaoController {

	@Autowired
	private VeiculoService service;

	@RequestMapping(value = "/veiculo/caminhoes", method = RequestMethod.GET)
	public String showLista(Model model) {
		model.addAttribute("caminhoes", service.findAllCaminhoes());
		return "veiculo/caminhao/lista";
	}

	@RequestMapping(value = "/veiculo/caminhao", method = RequestMethod.GET)
	public String showDetalhe() {
		return "veiculo/caminhao/detalhe";
	}

	@RequestMapping(value = "/veiculo/caminhao", method = RequestMethod.POST)
	public String incluir(Model model, Caminhao caminhao) {
		service.save(caminhao);
		return this.showLista(model);
	}

	@RequestMapping(value = "/veiculo/caminhao/{id}", method = RequestMethod.GET)
	public String excluir(Model model, @PathVariable Integer id) {
		service.delete(id);
		return this.showLista(model);
	}

}
