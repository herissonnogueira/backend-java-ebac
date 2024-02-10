package br.com.herissonnogueira.lambdas.anonimas;

import br.com.herissonnogueira.lambdas.TesteLambdasThreads;

/**
 * @author herisson.nogueira
 */

public class AnonimasTeste {

    public static void main(String[] args) {
        MyEventConsumer anonima = new MyEventConsumer() {
            @Override
            public void consumer(Object value) {
                System.out.println(value);
            }
        };
        anonima.consumer("Teste anônima");


        MyEventConsumer anonimaLambda = (Object value) -> System.out.println(value);
        anonimaLambda.consumer(10);

        receberInterface("Value", value -> System.out.println(value));

        receberInterface(Boolean.TRUE, value -> System.out.println(value));
    }

    private static void receberInterface(Object o, MyEventConsumer anonimaLambda) {
        anonimaLambda.consumer(o);
    }
}
