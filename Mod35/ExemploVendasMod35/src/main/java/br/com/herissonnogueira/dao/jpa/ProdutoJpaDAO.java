/**
 * 
 */
package br.com.herissonnogueira.dao.jpa;

import br.com.herissonnogueira.dao.generic.jpa.GenericJpaDAO;
import br.com.herissonnogueira.domain.jpa.ProdutoJpa;

/**
 * @author herisson.nogueira
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
