/**
 * 
 */
package ruijosecj.services;

import ruijosecj.domain.Cliente;
import ruijosecj.exceptions.DAOException;
import ruijosecj.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
