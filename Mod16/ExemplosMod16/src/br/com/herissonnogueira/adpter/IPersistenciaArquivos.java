/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira.adpter;

import java.io.File;

public interface IPersistenciaArquivos {

    //byte[] bytes = Files.readAllBytes(file.toPath());
    public void gravar(File file);

    public File ler(String caminho);
}
