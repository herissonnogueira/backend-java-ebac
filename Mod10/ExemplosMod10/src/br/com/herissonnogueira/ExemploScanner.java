/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira;

import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        System.out.println("Vc tem " + idade + " anos.");
    }
}
