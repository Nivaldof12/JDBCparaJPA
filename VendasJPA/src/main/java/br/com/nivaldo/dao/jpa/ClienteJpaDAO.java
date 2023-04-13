/**
 * 
 */
package br.com.nivaldo.dao.jpa;

import br.com.nivaldo.dao.generic.jpa.GenericJpaDAO;
import br.com.nivaldo.domain.jpa.ClienteJpa;

/**
 * @author nivaldo
 *
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
