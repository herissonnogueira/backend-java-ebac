/**
 * @author herisson.nogueira
 */

package cadastro.fabrica;

import cadastro.domain.IPersistente;


// Fábrica que sabe criar objetos da aplicação

public interface IFabricaPersistente {

    /**
     * Método que sabe criar objetos da aplicação
     *
     * @param dados São os dados a serem cadastrados no banco de dados
     * @return Retorna o objeto <b>Persistente</b> que é pai de todas as entidades da aplicação
     */
    IPersistente criarObjeto(String dados[]);
}
