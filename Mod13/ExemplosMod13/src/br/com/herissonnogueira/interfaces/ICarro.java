/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira.interfaces;

public interface ICarro {

    default void parar() {
        System.out.println("Carro está parando");
    }

    public void andar();
}
