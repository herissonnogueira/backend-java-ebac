/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira;

import br.com.herissonnogueira.interfaces.Caminhao;
import br.com.herissonnogueira.interfaces.CanetaEsferografica;
import br.com.herissonnogueira.interfaces.CarroPasseio;
import br.com.herissonnogueira.interfaces.Giz;
import br.com.herissonnogueira.interfaces.ICaneta;
import br.com.herissonnogueira.interfaces.ICarro;
import br.com.herissonnogueira.interfaces.Lapis;

public class ClasseTeste {

    public static void main(String[] args) {
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Olá, Herisson");
        caneta.escreverComumATodas();
        System.out.println(caneta.getCor());

        ICaneta giz = new Giz();
        giz.escrever("Olá, Herisson");
        caneta.escreverComumATodas();
        System.out.println(giz.getCor());

        Lapis lapis = new Lapis();
        lapis.escrever("Olá, Herisson");
        caneta.escreverComumATodas();
        System.out.println(lapis.getCor());

        ICarro carro = new CarroPasseio();
        carro.andar();
        carro.parar();

        ICarro caminhao = new Caminhao();
        caminhao.andar();
        caminhao.parar();
    }
    
}
