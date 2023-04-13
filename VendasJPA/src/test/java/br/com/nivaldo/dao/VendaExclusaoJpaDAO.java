/**
 * 
 */
package br.com.nivaldo.dao;

import br.com.nivaldo.dao.generic.jpa.GenericJpaDAO;
import br.com.nivaldo.dao.jpa.IVendaJpaDAO;
import br.com.nivaldo.domain.jpa.VendaJpa;
import br.com.nivaldo.exceptions.DAOException;
import br.com.nivaldo.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author nivaldo
 *
 * Classe utilizada somente no teste para fazer a exclusão das vendas
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
