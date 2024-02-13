package br.com.herissonnogueira.dao;

import br.com.herissonnogueira.dao.jdbc.ConnectionFactory;
import br.com.herissonnogueira.domain.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements IProdutoDAO {
    @Override
    public Integer cadastrar(Produto produto) throws SQLException {
        Connection connection = null;
        PreparedStatement stm = null;

        try {
            connection = ConnectionFactory.getConnection();

            String sql = "INSERT INTO PRODUTO (NOME, DESCRICAO, PRECO) VALUES (?, ?, ?)";
            stm = connection.prepareStatement(sql);

            stm.setString(1, produto.getNome());
            stm.setString(2, produto.getDescricao());
            stm.setDouble(3, produto.getPreco());
            return stm.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Produto consultar(Produto produto) throws SQLException {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Produto produtoRetorno = null;

        try {
            connection = ConnectionFactory.getConnection();

            String sql = "SELECT * FROM PRODUTO WHERE PRODUTO_ID = ?";
            stm = connection.prepareStatement(sql);

            stm.setLong(1, produto.getId());
            rs = stm.executeQuery();

            if(rs.next()) {
                produtoRetorno = new Produto();
                produtoRetorno.setId(rs.getInt("PRODUTO_ID"));
                produtoRetorno.setNome(rs.getString("NOME"));
                produtoRetorno.setDescricao(rs.getString("DESCRICAO"));
                produtoRetorno.setPreco(rs.getDouble("PRECO"));
            }
            return produtoRetorno;

        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Integer excluir(Produto produto) throws SQLException {
        Connection connection = null;
        PreparedStatement stm = null;

        try {
            connection = ConnectionFactory.getConnection();

            String sql = "DELETE FROM PRODUTO WHERE PRODUTO_ID = ?";
            stm = connection.prepareStatement(sql);

            stm.setInt(1, produto.getId());
            return stm.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Integer atualizar(Produto produto) throws SQLException {
        Connection connection = null;
        PreparedStatement stm = null;

        try {
            connection = ConnectionFactory.getConnection();

            String sql = "UPDATE PRODUTO SET  NOME = ? , DESCRICAO = ? , PRECO = ? WHERE PRODUTO_ID = ?";
            stm = connection.prepareStatement(sql);

            stm.setString(1, produto.getNome());
            stm.setString(2, produto.getDescricao());
            stm.setDouble(3, produto.getPreco());
            stm.setInt(4, produto.getId());
            return stm.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public List<Produto> buscarTodos() throws SQLException {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Produto produtoRetorno = null;
        List<Produto> listaProdutos = new ArrayList<>();

        try {
            connection = ConnectionFactory.getConnection();

            String sql = "SELECT * FROM PRODUTO";
            stm = connection.prepareStatement(sql);

            rs = stm.executeQuery();

            while (rs.next()) {
                produtoRetorno = new Produto();
                produtoRetorno.setId(rs.getInt("PRODUTO_ID"));
                produtoRetorno.setNome(rs.getString("NOME"));
                produtoRetorno.setDescricao(rs.getString("DESCRICAO"));
                produtoRetorno.setPreco(rs.getDouble("PRECO"));
                listaProdutos.add(produtoRetorno);
            }
            return listaProdutos;

        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
}
