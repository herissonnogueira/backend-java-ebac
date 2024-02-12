/**
 * 
 */
package br.com.herissonnogueira.dao;

import br.com.herissonnogueira.dao.generic.GenericDAO;
import br.com.herissonnogueira.domain.Venda;
import br.com.herissonnogueira.domain.Venda.Status;
import br.com.herissonnogueira.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author herisson.nogueira
 *
 */

public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {

	@Override
	public Class<Venda> getTipoClasse() {
		return Venda.class;
	}

	@Override
	public void atualiarDados(Venda entity, Venda entityCadastrado) {
		entityCadastrado.setCodigo(entity.getCodigo());
		entityCadastrado.setStatus(entity.getStatus());
	}

	@Override
	public void excluir(String valor) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
		venda.setStatus(Status.CONCLUIDA);
		super.alterar(venda);
	}
}
