package br.com.sellcarplusmvc.test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.sellcarplusmvc.model.negocio.Carro;
import br.com.sellcarplusmvc.model.negocio.Cliente;
import br.com.sellcarplusmvc.model.negocio.Moto;
import br.com.sellcarplusmvc.model.negocio.Venda;

public class Test {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setCpf("12345678910");
		cliente.setDataNascimento(new GregorianCalendar(2000, Calendar.FEBRUARY, 11).getTime());
		cliente.setNome("Teste");

		Carro c1 = new Carro();
		c1.setAno(2015);
		c1.setNome("Cruze");
		c1.setMarca("GM");
		c1.setCor("Prata");
		c1.setModelo("Sedan");
		c1.setQtdAssento(5);
		c1.setQtdPorta(4);
		c1.setPreco(50000);

		Moto m1 = new Moto();
		m1.setNome("R1");
		m1.setMarca("Yamaha");
		m1.setCilindradas(1000);
		m1.setAno(2012);
		m1.setCor("Azul");
		m1.setPreco(36000);

		Venda venda = new Venda();

		venda.adicionarVeiculo(c1);
		venda.adicionarVeiculo(m1);
		venda.setCliente(cliente);
		venda.setDataRetirada(new GregorianCalendar(2020, Calendar.MARCH, 23).getTime());
		venda.setValorTotal(c1.getPreco() + m1.getPreco());

		c1.setVenda(venda);
		m1.setVenda(venda);

//		ClienteDao.save(cliente);
//		VendaDao.save(venda);

		System.out.println("Inclusão feita com sucesso!");
	}
}
