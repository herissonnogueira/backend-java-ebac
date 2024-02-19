/**
 * 
 */
package br.com.herissonnogueira.dao.generic.jpa;

import java.io.Serializable;

import br.com.herissonnogueira.domain.jpa.Persistente;

/**
 * @author herisson.nogueira
 *
 */
public abstract class GenericJpaDB3DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB3DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Mysql1");
	}

}
