/**
 * 
 */
package br.com.herissonnogueira.vendas.online.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.herissonnogueira.vendas.online.domain.Cliente;

/**
 * @author herisson.nogueira
 *
 */
@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String>{

	Optional<Cliente> findByCpf(Long cpf);
}
