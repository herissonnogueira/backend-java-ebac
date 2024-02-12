package br.com.herissonnogueira;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.herissonnogueira.dao.ClienteDaoMock;
import br.com.herissonnogueira.dao.IClienteDAO;
import br.com.herissonnogueira.domain.Cliente;
import br.com.herissonnogueira.exceptions.TipoChaveNaoEncontradaException;
import br.com.herissonnogueira.services.ClienteService;
import br.com.herissonnogueira.services.IClienteService;

/**
 * @author herisson.nogueira
 *
 */

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Herisson");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Herisson Nogueira");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Herisson Nogueira", cliente.getNome());
	}
}
