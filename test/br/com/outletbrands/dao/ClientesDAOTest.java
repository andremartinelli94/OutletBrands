/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.outletbrands.dao;

import br.com.outletbrands.model.Clientes;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author andre
 */
public class ClientesDAOTest {

    public ClientesDAOTest() {
    }

    @Test
    @Ignore
    public void InserirCliente() {
        Clientes obj = new Clientes("Nome");
        ClientesDAO dao = new ClientesDAO();

        if (dao.cadastrarCliente(obj)) {
            System.out.println("Salvo com sucesso");
        } else {
            fail("Erro ao salvar");
        }
    }

    @Test
    @Ignore
    public void AlterarCliente() {
        Clientes cl = new Clientes("Fenix");
        cl.setId(11);
        ClientesDAO dao = new ClientesDAO();

        if (dao.alterarCliente(cl)) {
            System.out.println("Alteração realizada com sucesso");
        } else {
            fail("Erro ao editar");
        }
    }

    @Test
    @Ignore
    public void ExcluirCliente() {
        Clientes cl = new Clientes();
        cl.setId(11);
        ClientesDAO dao = new ClientesDAO();

        if (dao.excluirCliente(cl)) {
            System.out.println("Exclusão realizada com sucesso");
        } else {
            fail("Erro ao excluir");
        }
    }

    @Test
    @Ignore
    public void Listar() {
        ClientesDAO dao = new ClientesDAO();

        for (Clientes c : dao.listarClientes()) {
            System.out.println("Cliente: " + c.getNome());
        }
    }

}
