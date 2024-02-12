/**
 * 
 */
package br.com.herissonnogueira.dao;

import br.com.herissonnogueira.dao.generic.GenericDAO;
import br.com.herissonnogueira.domain.Produto;

/**
 * @author herisson.nogueira
 *
 */

public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {
	
	public ProdutoDAO() {
		super();
	}

	@Override
	public Class<Produto> getTipoClasse() {
		return Produto.class;
	}

	@Override
	public void atualiarDados(Produto entity, Produto entityCadastrado) {
		entityCadastrado.setCodigo(entity.getCodigo());
		entityCadastrado.setDescricao(entity.getDescricao());
		entityCadastrado.setNome(entity.getNome());
		entityCadastrado.setValor(entity.getValor());
	}
}
