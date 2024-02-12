package br.com.herissonnogueira.service;

import br.com.herissonnogueira.dao.IContratoDao;

/**
 * @author herisson.nogueira
 */

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }
}
