/**
 * @author herisson.nogueira
 */

package cadastro.fabrica;

// Interface que cria uma fábrica de fábrica de objetos

public interface IFactory {

    /**
     * Método que sabe qual fábrica será criada
     *
     * @param opcaoMenuGeral Opção selecionada no menu inicial da aaplicação - <b>1 para cliente e 2 para produto</b>
     * @return FabricaPersistente que sabe criar objetos
     */
    IFabricaPersistente criarFabrica(String opcaoMenuGeral);
}
