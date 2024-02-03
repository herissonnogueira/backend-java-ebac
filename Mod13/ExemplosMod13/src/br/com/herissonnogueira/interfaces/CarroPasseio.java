/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira.interfaces;

public class CarroPasseio implements ICarro{

    @Override
    public void andar() {
        System.out.println("Carro está andando rápido");
    }
}
