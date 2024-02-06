/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira.facade;

public class Demo {

    public static void main(String[] args) {
        IApartamentoService service = new ApartamentoService();
        service.cadastrarApartamento(new Apartamento(1L, "Endereco"));
    }
}
