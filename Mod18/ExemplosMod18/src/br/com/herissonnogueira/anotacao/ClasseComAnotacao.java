/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira.anotacao;

@IPrimeiraAnotacao(value = "Herisson", bairros = "Teste", numeroCasa = 10)
public class ClasseComAnotacao {

    @IPrimeiraAnotacao(value = "Nogueira", bairros = {"Teste", "Teste1"}, numeroCasa = 20, valores = 100d)
    private String nome;

    @IPrimeiraAnotacao(value = "Herisson", bairros = "Teste", numeroCasa = 10)
    public ClasseComAnotacao() {

    }
}
