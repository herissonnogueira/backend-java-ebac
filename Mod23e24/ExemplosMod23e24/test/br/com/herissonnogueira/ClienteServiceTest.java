package br.com.herissonnogueira;

import br.com.herissonnogueira.dao.ClienteDao;
import br.com.herissonnogueira.dao.ClienteDaoMock;
import br.com.herissonnogueira.dao.IClienteDao;
import br.com.herissonnogueira.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author herisson.nogueira
 */

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
