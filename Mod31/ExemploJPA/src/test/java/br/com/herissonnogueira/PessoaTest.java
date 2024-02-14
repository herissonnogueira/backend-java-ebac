package br.com.herissonnogueira;

import org.junit.Test;

import br.com.herissonnogueira.domain.Pessoa;

/**
 * @author herisson.nogueira
 *
 */

public class PessoaTest {

	
	
	@Test
	public void cadastrar() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Herisson");
		pessoa.addApelido("HerissonDev");
		//pessoaDao.cadastrar(pessoa);
	}
}
