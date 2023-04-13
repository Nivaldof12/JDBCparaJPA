/**
 * 
 */
package br.com.nivaldo.services.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.nivaldo.dao.Persistente;
import br.com.nivaldo.dao.generic.IGenericDAO;
import br.com.nivaldo.dao.generic.jpa.IGenericJapDAO;
import br.com.nivaldo.exceptions.DAOException;
import br.com.nivaldo.exceptions.MaisDeUmRegistroException;
import br.com.nivaldo.exceptions.TableException;
import br.com.nivaldo.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author nivaldo
 *
 */
public abstract class GenericJpaService<T extends Persistente, E extends Serializable> 
	implements IGenericJpaService<T, E> {
	
	protected IGenericJapDAO<T, E> dao;
	
	public GenericJpaService(IGenericJapDAO<T, E> dao) {
		this.dao = dao;
	}
	

	@Override
	public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.cadastrar(entity);
	}

	@Override
	public void excluir(T entity) throws DAOException {
		this.dao.excluir(entity);
	}

	@Override
	public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.alterar(entity);
	}

	@Override
	public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
		return this.dao.consultar(valor);
	}

	@Override
	public Collection<T> buscarTodos() throws DAOException {
		return this.dao.buscarTodos();
	}
	

}
