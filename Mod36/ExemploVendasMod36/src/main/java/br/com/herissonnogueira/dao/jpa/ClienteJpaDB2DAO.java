/**
 * 
 */
package br.com.herissonnogueira.dao.jpa;

import br.com.herissonnogueira.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.herissonnogueira.domain.jpa.ClienteJpa;

/**
 * @author herisson.nogueira
 *
 */
public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
