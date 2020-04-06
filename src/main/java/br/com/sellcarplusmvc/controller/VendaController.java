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

import br.com.sellcarplusmvc.model.dto.VendaDTO;
import br.com.sellcarplusmvc.model.negocio.Venda;
import br.com.sellcarplusmvc.model.service.VendaService;

@RestController
@RequestMapping("/api/venda")
public class VendaController {
	@Autowired
	private VendaService vendaService;

	@GetMapping
	public List<Venda> obterLista() {
		return vendaService.findAll();
	}

	@RequestMapping("{id}")
	public Venda obterPorId(@PathVariable int id) {
		return vendaService.findById(id);
	}

	@DeleteMapping("{id}")
	public void excluir(int id) {
		vendaService.delete(id);
	}

	@PostMapping
	public void salvar(@RequestBody VendaDTO venda) throws Exception {
		vendaService.save(venda);
	}
}