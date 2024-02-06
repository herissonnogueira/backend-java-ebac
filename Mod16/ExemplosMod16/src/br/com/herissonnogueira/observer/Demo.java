/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira.observer;

public class Demo {

    public static void main(String[] args) {
        Jornalista jor = new Jornalista();
        jor.add(new TV());
        jor.notifyAll("Teste");
    }
}
