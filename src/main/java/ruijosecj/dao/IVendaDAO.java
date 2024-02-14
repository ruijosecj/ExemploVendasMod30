/**
 * 
 */
package ruijosecj.dao;

import ruijosecj.dao.generic.IGenericDAO;
import ruijosecj.domain.Venda;
import ruijosecj.exceptions.DAOException;
import ruijosecj.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
