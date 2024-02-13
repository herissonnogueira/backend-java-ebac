package br.com.herissonnogueira.dao;

import br.com.herissonnogueira.domain.Produto;

import java.sql.SQLException;
import java.util.List;

public interface IProdutoDAO {

    public Integer cadastrar(Produto produto) throws SQLException;

    public Produto consultar(Produto produto) throws SQLException;

    public Integer excluir(Produto produto) throws   SQLException;

    public Integer atualizar(Produto produto) throws SQLException;

    public List<Produto> buscarTodos() throws  SQLException;
    
}
