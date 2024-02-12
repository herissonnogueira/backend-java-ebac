package br.com.herissonnogueira.service;

import br.com.herissonnogueira.dao.ClienteDao;
import br.com.herissonnogueira.dao.ClienteDaoMock;
import br.com.herissonnogueira.dao.IClienteDao;

/**
 * @author herisson.nogueira
 */

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
}
