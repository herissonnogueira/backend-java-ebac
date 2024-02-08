/**
 * @author herisson.nogueira
 */

package cadastro.fabrica;

import cadastro.domain.IPersistente;
import cadastro.domain.Produto;

// Classe que representa a cricação de objetos Produto

public class ProdutoFabrica implements IFabricaPersistente {

    @Override
    public IPersistente criarObjeto(String[] dados) {
        Produto produto = new Produto();
        produto.setCodigo(Long.parseLong(dados[0].trim()));
        produto.setNome(dados[1]);
        return produto;
    }
}
