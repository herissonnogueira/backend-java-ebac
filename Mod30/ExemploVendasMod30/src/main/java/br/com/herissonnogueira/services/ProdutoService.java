/**
 * 
 */
package br.com.herissonnogueira.services;

import br.com.herissonnogueira.dao.IProdutoDAO;
import br.com.herissonnogueira.domain.Produto;
import br.com.herissonnogueira.services.generic.GenericService;

/**
 * @author herisson.nogueira
 *
 */

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
