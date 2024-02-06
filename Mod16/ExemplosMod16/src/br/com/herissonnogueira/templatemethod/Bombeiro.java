/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira.templatemethod;

public class Bombeiro extends Trabalhador{

    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como bombeiro");
    }
}
