package br.com.herissonnogueira.dao;

import java.util.List;

import br.com.herissonnogueira.domain.Cliente;

/**
 * @author herisson.nogueira
 *
 */

public interface IClienteDAO {

	public Cliente cadastrar(Cliente cliente);

	public Cliente buscarPorID(Long id);

	public void excluir(Cliente cliente);

	public Cliente alterar(Cliente cliente);

	public List<Cliente> buscarTodos();
}
