/**
 * @author herisson.nogueira
 */

package cadastro.fabrica;

import cadastro.domain.Cliente;
import cadastro.domain.IPersistente;

// Classe que representa a cricação de objetos Cliente

public class ClienteFabrica implements IFabricaPersistente {

    @Override
    public IPersistente criarObjeto(String dadosSeparados[]) {
        return new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
    }
}
