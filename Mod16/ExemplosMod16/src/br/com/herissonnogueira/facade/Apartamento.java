/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira.facade;

public class Apartamento {

    private Long codigo;

    private String end;

    public Apartamento(Long codigo, String endereco) {
        this.codigo = codigo;
        this.end = endereco;
    }

    public java.lang.Long getCodigo() {
        return codigo;
    }

    public void setCodigo(java.lang.Long codigo) {
        this.codigo = codigo;
    }

    public java.lang.String getEnd() {
        return end;
    }

    public void setEnd(java.lang.String end) {
        this.end = end;
    }
}
