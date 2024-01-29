package herisson.nogueira.pacote2;

import herisson.nogueira.Cliente;
import herisson.nogueira.ItemVenda;
import herisson.nogueira.pacote1.Classe1;
import herisson.nogueira.pacote1.Classe2;

import java.util.Iterator;

/**
 * @author herisson.nogueira
 *
 *
 */

public class Cliente3 extends Classe2 {
    /**
     * Comentário do que o método faz
     *
     * @param args  asdsada
     */
    public static void main(String args[]) {
        Classe1 class1 = new Classe1();
        Cliente cliente = new Cliente();
        cliente.retornarNomeCliente();
        cliente.getValorTotal();

        ItemVenda item = new ItemVenda();


    }

    /**
     * @deprecated
     */
    public void teste() {

    }
}
