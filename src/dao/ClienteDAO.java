
package dao;

import classes.Cliente;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author José Flávio
 */
public class ClienteDAO {
    
    private List<Cliente> lista = null;

    public ClienteDAO() {
        lista = new ArrayList<Cliente>();
    }
    
    public void adicionarCliente(Cliente cliente){
    }
    
    public void removerCliente(String cpf){
    }
    
    public void alterarCliente(Cliente cliente){
    }
    
    public Cliente buscarCliente(String cpf){
        return null;
    }
    
}
