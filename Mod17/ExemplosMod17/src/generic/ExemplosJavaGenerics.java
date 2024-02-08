package generic;

import generic.fruta.Banana;
import generic.fruta.IFruta;
import generic.fruta.Maca;

import java.util.ArrayList;
import java.util.List;

/**
 * @author herisson.nogueira
 */

public class ExemplosJavaGenerics {

    public static void main(String[] args) {
        List<String> lista = new ArrayList();
        lista.add("Herisson");
        lista.add("1");
        imprimir(lista);

        List<Long> listaLong = new ArrayList();
        listaLong.add(1l);
        listaLong.add(2l);
        imprimir(listaLong);

        String primeiroSt = pegarPrimeiroLista(lista);
        System.out.println(primeiroSt);

        Long primeiroLong = pegarPrimeiroLista(listaLong);
        System.out.println(primeiroLong);

        ///Long primeiroLong1 = pegarPrimeiroListaLong(listaLong);
        //System.out.println(primeiroLong1);

        Long primeiroLong2 = pegarPrimeiroListaLong(listaLong);
        System.out.println(primeiroLong2);

        imprimir2(listaLong);

        List<IFruta> frutas = new ArrayList<>();
        frutas.add(new Maca());
        frutas.add(new Banana());
        imprimirFrutas(frutas);
    }

    public static void imprimirFrutas(List<? extends IFruta> lista) {
        for (IFruta fruta : lista) {
            System.out.println(fruta);
        }
    }

     public static void imprimir2(List<?> lista) {
         for (Object st : lista) {
             if (st instanceof Long) {
                 Long stLong = (Long) st;
                 System.out.println(stLong);
             }
             System.out.println("Qualquer coisa: " + st);
         }
     }

    public static <T> void imprimir(List<T> lista) {
        for (T st : lista) {
            System.out.println(st);
        }
    }

    public static <T> T pegarPrimeiroLista(List<T> lista) {
        return lista.get(0);
    }

    public static <T> T pegarPrimeiroListaLong(List<T> lista) {
        return lista.get(0);
    }
}
