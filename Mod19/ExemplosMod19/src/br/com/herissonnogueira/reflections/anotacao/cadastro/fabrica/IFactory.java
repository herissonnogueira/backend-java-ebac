package br.com.herissonnogueira.reflections.anotacao.cadastro.fabrica;

/**
 * @author herisson.nogueira
 *
 * Interface que cria uma fábrica de fábrica de objetos
 */

public interface IFactory {

    /**
     * Método que sabe qual fábrica será criada
     *
     * @param opcaoMenuGeral Opção selecionada no menu inicial da aaplicação - <b>1 para cliente e 2 para produto</b>
     * @return FabricaPersistente que sabe criar objetos
     */
    FabricaPersistente criarFabrica(String opcaoMenuGeral);
}
