/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira.forewhile;

public class ExemploPPT2 {

    public static void main(String[] args) {
        for (int contador = 1; contador <= 1000; contador++) {
            System.out.println("Está é a repetição nr: " + contador);
            if (contador == 10)
                break;

//            if (contador == 10) {
//                break;
//            }
        }
    }
}
