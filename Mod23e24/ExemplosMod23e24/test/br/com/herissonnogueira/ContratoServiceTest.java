package br.com.herissonnogueira;

import br.com.herissonnogueira.dao.ContratoDao;
import br.com.herissonnogueira.dao.IContratoDao;
import br.com.herissonnogueira.dao.mocks.ContratoDaoMock;
import br.com.herissonnogueira.service.ContratoService;
import br.com.herissonnogueira.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author herisson.nogueira
 */

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}
