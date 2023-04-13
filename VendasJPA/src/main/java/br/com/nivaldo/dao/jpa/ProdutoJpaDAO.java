/**
 * 
 */
package br.com.nivaldo.dao.jpa;

import br.com.nivaldo.dao.generic.jpa.GenericJpaDAO;
import br.com.nivaldo.domain.jpa.ProdutoJpa;

/**
 * @author nivaldo
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
