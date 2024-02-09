package br.com.herissonnogueira.reflections.anotacao.cadastro.exception;

/**
 * @author herisson.nogueira
 */

public class DadosInvalidosException extends Exception {

    public DadosInvalidosException(String msg) {
        this(msg, null);
    }

    public DadosInvalidosException(String msg, Throwable e) {
        super(msg, e);
    }
}
