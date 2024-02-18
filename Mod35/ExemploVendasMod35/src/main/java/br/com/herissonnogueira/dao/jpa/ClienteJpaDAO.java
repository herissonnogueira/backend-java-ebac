/**
 * 
 */
package br.com.herissonnogueira.dao.jpa;

import br.com.herissonnogueira.dao.generic.jpa.GenericJpaDAO;
import br.com.herissonnogueira.domain.jpa.ClienteJpa;

/**
 * @author herisson.nogueira
 *
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
