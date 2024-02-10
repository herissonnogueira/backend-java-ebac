package br.com.herissonnogueira.lambdas;

import java.util.function.IntBinaryOperator;

/**
 * @author herisson.nogueira
 */

public class IntBinaryOperatorClass implements IntBinaryOperator {
    @Override
    public int applyAsInt(int a, int b) {
        return a + b;
    }
}
