package br.com.sellcarplusmvc.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.sellcarplusmvc.model.negocio.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long> {

}
