/**
 * 
 */
package ruijosecj.services;

import ruijosecj.dao.IProdutoDAO;
import ruijosecj.domain.Produto;
import ruijosecj.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
