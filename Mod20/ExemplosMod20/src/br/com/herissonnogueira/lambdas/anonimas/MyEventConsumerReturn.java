package br.com.herissonnogueira.lambdas.anonimas;

/**
 * @author herisson.nogueira
 */

@FunctionalInterface
public interface MyEventConsumerReturn<T> {

    public T consumer(Object value);

}
