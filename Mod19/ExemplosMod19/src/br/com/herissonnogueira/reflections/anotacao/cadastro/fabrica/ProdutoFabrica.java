package br.com.herissonnogueira.reflections.anotacao.cadastro.fabrica;


import br.com.herissonnogueira.reflections.anotacao.cadastro.domain.Cliente;
import br.com.herissonnogueira.reflections.anotacao.cadastro.domain.Persistente;
import br.com.herissonnogueira.reflections.anotacao.cadastro.domain.Produto;
import br.com.herissonnogueira.reflections.anotacao.cadastro.exception.DadosInvalidosException;

/**
 * @author herisson.nogueira
 *
 * Classe que representa a cricação de objetos Produto
 */

public class ProdutoFabrica implements FabricaPersistente {

    @Override
    public Persistente criarObjeto(String[] dados) throws DadosInvalidosException {
        try {
            Produto produto = new Produto();
            produto.setCodigo(Long.parseLong(dados[0].trim()));
            produto.setNome(dados[1]);
            return produto;
        } catch(IndexOutOfBoundsException e) {
            throw new DadosInvalidosException("Dados de produto estão inválidos");
        }
    }
}
