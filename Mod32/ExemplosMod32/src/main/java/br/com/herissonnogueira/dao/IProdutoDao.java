package br.com.herissonnogueira.dao;

import br.com.herissonnogueira.domain.Produto;

/**
 * @author herisson.nogueira
 *
 */

public interface IProdutoDao {
    
    Produto cadastrar(Produto produtoTest);

	Produto consultarProdutoId(Long idConsulta);

	Produto atualizar(Produto produtoCadastrado);

	void excluirProduto(Long idParaExclusao);
}
