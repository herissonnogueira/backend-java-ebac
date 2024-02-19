/**
 * 
 */
package br.com.herissonnogueira.dao.jpa;

import br.com.herissonnogueira.dao.generic.jpa.IGenericJapDAO;
import br.com.herissonnogueira.domain.jpa.Persistente;

/**
 * @author herisson.nogueira
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
