package br.com.herissonnogueira;

import org.junit.Assert;
import org.junit.Test;

import br.com.herissonnogueira.TesteCliente;

public class TesteClienteTest {

	@Test
	public void testeClasseCliente() {
		TesteCliente cli = new TesteCliente();
		cli.adicionarNome("Herisson");
		cli.adicionarNome1("Herisson");

		Assert.assertEquals("Herisson", cli.getNome());
	}
}
