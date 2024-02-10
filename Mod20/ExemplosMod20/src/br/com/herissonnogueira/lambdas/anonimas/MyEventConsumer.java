package br.com.herissonnogueira.lambdas.anonimas;

/**
 * @author herisson.nogueira
 */

@FunctionalInterface
public interface MyEventConsumer {

    public void consumer(Object value);

    default void calcular() {

    }
}
