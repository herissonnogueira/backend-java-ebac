/**
 * 
 */
package br.com.herissonnogueira.dao;

import br.com.herissonnogueira.dao.generic.IGenericDAO;
import br.com.herissonnogueira.domain.Venda;
import br.com.herissonnogueira.exceptions.DAOException;
import br.com.herissonnogueira.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author herisson.nogueira
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
