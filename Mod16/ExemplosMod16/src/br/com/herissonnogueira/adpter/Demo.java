/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira.adpter;

import java.io.File;

public class Demo {

    public static void main(String args[]) {
        String file = "teste.txt";
        DropBox drop = new DropBox();
        IPersistenciaArquivos arquivos = new DropBoxAdapter(drop);
        arquivos.gravar(new File(file));
    }
}
