/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.outletbrands.dao;

import br.com.outletbrands.jdbc.ConnectionFactory;
import br.com.outletbrands.model.Fornecedores;
import br.com.outletbrands.model.WebServiceCep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class FornecedoresDAO {

    private Connection connection;

    public FornecedoresDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void cadastrarFornecedores(Fornecedores objeto) {
        try {
            String sql = "insert tb_fornecedores(nome,cnpj,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, objeto.getNome());
            statement.setString(2, objeto.getCnpj());
            statement.setString(3, objeto.getEmail());
            statement.setString(4, objeto.getTelefone());
            statement.setString(5, objeto.getCelular());
            statement.setString(6, objeto.getCep());
            statement.setString(7, objeto.getEndereco());
            statement.setInt(8, objeto.getNumero());
            statement.setString(9, objeto.getComplemento());
            statement.setString(10, objeto.getBairro());
            statement.setString(11, objeto.getCidade());
            statement.setString(12, objeto.getEstado());

            statement.execute();
            statement.close();

            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
        }
    }

    public void alterarFornecedores(Fornecedores objeto) {
        try {
            String sql = "update tb_fornecedores set  nome=?, cnpj=?, email=?, telefone=?, celular=?, cep=?, "
                    + "endereco=?, numero=?,complemento=?,bairro=?,cidade=?, estado=?  where id =?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, objeto.getNome());
            statement.setString(2, objeto.getCnpj());
            statement.setString(3, objeto.getEmail());
            statement.setString(4, objeto.getTelefone());
            statement.setString(5, objeto.getCelular());
            statement.setString(6, objeto.getCep());
            statement.setString(7, objeto.getEndereco());
            statement.setInt(8, objeto.getNumero());
            statement.setString(9, objeto.getComplemento());
            statement.setString(10, objeto.getBairro());
            statement.setString(11, objeto.getCidade());
            statement.setString(12, objeto.getEstado());

            statement.setInt(13, objeto.getId());

            statement.execute();
            statement.close();

            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
        }
    }

    public void excluirFornecedores(Fornecedores objeto) {
        try {
            String sql = "delete from tb_fornecedores where id=?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, objeto.getId());

            statement.execute();
            statement.close();

            JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
        }
    }

    public List<Fornecedores> listarFornecedores() {
        try {
            List<Fornecedores> lista = new ArrayList();

            String sql = "select*from tb_fornecedores";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Fornecedores objeto = new Fornecedores();
                objeto.setId(result.getInt("id"));
                objeto.setNome(result.getString("nome"));
                objeto.setCnpj(result.getString("cnpj"));
                objeto.setEmail(result.getString("email"));
                objeto.setTelefone(result.getString("telefone"));
                objeto.setCelular(result.getString("celular"));
                objeto.setCep(result.getString("cep"));
                objeto.setEndereco(result.getString("endereco"));
                objeto.setNumero(result.getInt("numero"));
                objeto.setComplemento(result.getString("complemento"));
                objeto.setBairro(result.getString("bairro"));
                objeto.setCidade(result.getString("cidade"));
                objeto.setEstado(result.getString("estado"));

                lista.add(objeto);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro:" + erro);
            return null;
        }
    }

    public List<Fornecedores> buscaFornecedoresPorNome(String nome) {
        try {
            List<Fornecedores> lista = new ArrayList();

            String sql = "select*from tb_fornecedores where nome like?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nome);

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Fornecedores objeto = new Fornecedores();
                objeto.setId(result.getInt("id"));
                objeto.setNome(result.getString("nome"));
                objeto.setCnpj(result.getString("cnpj"));
                objeto.setEmail(result.getString("email"));
                objeto.setTelefone(result.getString("telefone"));
                objeto.setCelular(result.getString("celular"));
                objeto.setCep(result.getString("cep"));
                objeto.setEndereco(result.getString("endereco"));
                objeto.setNumero(result.getInt("numero"));
                objeto.setComplemento(result.getString("complemento"));
                objeto.setBairro(result.getString("bairro"));
                objeto.setCidade(result.getString("cidade"));
                objeto.setEstado(result.getString("estado"));

                lista.add(objeto);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro:" + erro);
            return null;
        }
    }

    public Fornecedores consultaPorNome(String nome) {
        try {
            String sql = "select*from tb_fornecedores where nome = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nome);

            ResultSet result = statement.executeQuery();
            Fornecedores objeto = new Fornecedores();
            if (result.next()) {
                objeto.setId(result.getInt("id"));
                objeto.setNome(result.getString("nome"));
                objeto.setCnpj(result.getString("cnpj"));
                objeto.setEmail(result.getString("email"));
                objeto.setTelefone(result.getString("telefone"));
                objeto.setCelular(result.getString("celular"));
                objeto.setCep(result.getString("cep"));
                objeto.setEndereco(result.getString("endereco"));
                objeto.setNumero(result.getInt("numero"));
                objeto.setComplemento(result.getString("complemento"));
                objeto.setBairro(result.getString("bairro"));
                objeto.setCidade(result.getString("cidade"));
                objeto.setEstado(result.getString("estado"));
            }
            return objeto;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fornecedor não encontrado!");
            return null;
        }
    }

    public Fornecedores buscaCep(String cep) {

        WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);

        Fornecedores obj = new Fornecedores();

        if (webServiceCep.wasSuccessful()) {
            obj.setEndereco(webServiceCep.getLogradouroFull());
            obj.setCidade(webServiceCep.getCidade());
            obj.setBairro(webServiceCep.getBairro());
            obj.setEstado(webServiceCep.getUf());
            return obj;
        } else {
            JOptionPane.showMessageDialog(null, "Erro numero: " + webServiceCep.getResulCode());
            JOptionPane.showMessageDialog(null, "Descrição do erro: " + webServiceCep.getResultText());
            return null;
        }
    }

}
