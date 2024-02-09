/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira.exceptions;

public class ClienteService {

    public static void consutlarCliente(String codigo) throws ClienteNaoEncontrado2Exception {
        try {
            ClienteDAO.consutlarCliente(codigo);
        } catch (ClienteNaoEncontradoException e) {
            throw new ClienteNaoEncontrado2Exception(e.getMessage(), e);
        }
    }
}
