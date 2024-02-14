package br.com.herissonnogueira.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author herisson.nogueira
 *
 */

@Embeddable
public class Endereco {

	@Column(name="rua")
	private String rua;
	
	@Column(name="numero")
    private int numero;
    
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
    
    
}
