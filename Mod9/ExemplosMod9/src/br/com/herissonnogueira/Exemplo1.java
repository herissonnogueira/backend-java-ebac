package br.com.herissonnogueira;

/**
 * @author herisson.nogueira
 */

public class Exemplo1 {

    public static void main(String[] args) {
        
        // Boxing
        Boolean status = true;
        Boolean status1 = Boolean.TRUE;

        Character c = 'A';

        Integer idade = 10;

        Long cpf = Long.valueOf(123123);
        Long cpf1 = 123123123l;

        // unboxing
        boolean status2 = Boolean.TRUE;
        char letra = Character.valueOf('A');

        int idade2 = Integer.valueOf(12);

        long cpf3 = Long.valueOf(123123);

    }
}
