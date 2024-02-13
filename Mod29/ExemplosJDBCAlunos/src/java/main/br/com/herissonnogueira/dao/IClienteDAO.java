package br.com.herissonnogueira.dao;

import br.com.herissonnogueira.domain.Cliente;

/**
 * @author herisson.nogueira
 *
 */

public interface IClienteDAO {

	
	public Integer cadastrar(Cliente cliente) throws Exception;

	public Cliente consultar(String codigo) throws Exception;

	public Integer excluir(Cliente clienteBD) throws Exception;
}
