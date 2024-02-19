/**
 * 
 */
package br.com.herissonnogueira.dao.jpa;

import br.com.herissonnogueira.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.herissonnogueira.domain.jpa.ProdutoJpa;

/**
 * @author herisson.nogueira
 *
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
