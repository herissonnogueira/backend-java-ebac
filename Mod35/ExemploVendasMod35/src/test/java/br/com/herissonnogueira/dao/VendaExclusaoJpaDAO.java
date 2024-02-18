/**
 * 
 */
package br.com.herissonnogueira.dao;

import br.com.herissonnogueira.dao.generic.jpa.GenericJpaDAO;
import br.com.herissonnogueira.dao.jpa.IVendaJpaDAO;
import br.com.herissonnogueira.domain.jpa.VendaJpa;
import br.com.herissonnogueira.exceptions.DAOException;
import br.com.herissonnogueira.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author herisson.nogueira
 *
 * Classe utilizada somente no teste para fazer a exclusão das vendas
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
