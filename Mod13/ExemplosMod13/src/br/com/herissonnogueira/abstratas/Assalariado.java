/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira.abstratas;

public class Assalariado extends Empregado {

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public Double vencimento() {
        return salario;
    }
}
