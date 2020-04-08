package br.com.sellcarplusmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.sellcarplusmvc.model.service.VendaService;

@Controller
public class VendaController {

//	VendaService service;
//
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String showVendas(Model model) {
//		return obterVendas(model);
//	}
//
//	@RequestMapping(value = "/venda", method = RequestMethod.GET)
//	public String showVendasInterno(Model model) {
//		return obterVendas(model);
//	}
//
//	public String obterVendas(Model model) {
//		model.addAttribute("vendas", service.findAll());
//		return "/venda";
//	}

}