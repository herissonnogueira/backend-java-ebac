package br.com.herissonnogueira.services;

import br.com.herissonnogueira.domain.Cliente;
import br.com.herissonnogueira.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author herisson.nogueira
 *
 */

public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
