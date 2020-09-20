/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.outletbrands.dao;

import br.com.outletbrands.jdbc.ConnectionFactory;
import br.com.outletbrands.model.Funcionarios;
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
public class FuncionariosDAO {

    private Connection connection;

    public FuncionariosDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void cadastrarFuncionario(Funcionarios objeto) {
        try {
            String sql = "insert tb_funcionarios(nome,rg,cpf,email,senha,cargo,nivel_acesso,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, objeto.getNome());
            statement.setString(2, objeto.getRg());
            statement.setString(3, objeto.getCpf());
            statement.setString(4, objeto.getEmail());
            statement.setString(5, objeto.getSenha());
            statement.setString(6, objeto.getCargo());
            statement.setString(7, objeto.getNivel_acesso());
            statement.setString(8, objeto.getTelefone());
            statement.setString(9, objeto.getCelular());
            statement.setString(10, objeto.getCep());
            statement.setString(11, objeto.getEndereco());
            statement.setInt(12, objeto.getNumero());
            statement.setString(13, objeto.getComplemento());
            statement.setString(14, objeto.getBairro());
            statement.setString(15, objeto.getCidade());
            statement.setString(16, objeto.getEstado());

            statement.execute();
            statement.close();

            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
        }
    }

    public List<Funcionarios> listarFuncionarios() {
        try {
            List<Funcionarios> lista = new ArrayList();

            String sql = "select*from tb_funcionarios";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Funcionarios objeto = new Funcionarios();
                objeto.setId(result.getInt("id"));
                objeto.setNome(result.getString("nome"));
                objeto.setRg(result.getString("rg"));
                objeto.setCpf(result.getString("cpf"));
                objeto.setEmail(result.getString("email"));
                objeto.setSenha(result.getString("senha"));
                objeto.setCargo(result.getString("cargo"));
                objeto.setNivel_acesso(result.getString("nivel_acesso"));
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

    public void alterarFuncionario(Funcionarios objeto) {
        try {
            String sql = "update tb_funcionarios set  nome=?, rg=?, cpf=?, email=?,senha=?, cargo=?,nivel_acesso=?, telefone=?, celular=?, cep=?, "
                    + "endereco=?, numero=?,complemento=?,bairro=?,cidade=?, estado=?  where id =?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, objeto.getNome());
            statement.setString(2, objeto.getRg());
            statement.setString(3, objeto.getCpf());
            statement.setString(4, objeto.getEmail());
            statement.setString(5, objeto.getSenha());
            statement.setString(6, objeto.getCargo());
            statement.setString(7, objeto.getNivel_acesso());
            statement.setString(8, objeto.getTelefone());
            statement.setString(9, objeto.getCelular());
            statement.setString(10, objeto.getCep());
            statement.setString(11, objeto.getEndereco());
            statement.setInt(12, objeto.getNumero());
            statement.setString(13, objeto.getComplemento());
            statement.setString(14, objeto.getBairro());
            statement.setString(15, objeto.getCidade());
            statement.setString(16, objeto.getEstado());
            statement.setInt(17, objeto.getId());

            statement.execute();
            statement.close();

            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
        }
    }

    public void excluirFuncionario(Funcionarios objeto) {
        try {
            String sql = "delete from tb_funcionarios where id=?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, objeto.getId());

            statement.execute();
            statement.close();

            JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
        }
    }

    public List<Funcionarios> listarFuncionariosPorNome(String nome) {
        try {
            List<Funcionarios> lista = new ArrayList();

            String sql = "select*from tb_funcionarios where nome like?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nome);

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Funcionarios objeto = new Funcionarios();
                objeto.setId(result.getInt("id"));
                objeto.setNome(result.getString("nome"));
                objeto.setRg(result.getString("rg"));
                objeto.setCpf(result.getString("cpf"));
                objeto.setEmail(result.getString("email"));
                objeto.setSenha(result.getString("senha"));
                objeto.setCargo(result.getString("cargo"));
                objeto.setNivel_acesso(result.getString("nivel_acesso"));
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

    public Funcionarios consultaPorNome(String nome) {
        try {
            String sql = "select*from tb_funcionarios where nome = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nome);

            ResultSet result = statement.executeQuery();
            Funcionarios objeto = new Funcionarios();
            if (result.next()) {
                objeto.setId(result.getInt("id"));
                objeto.setNome(result.getString("nome"));
                objeto.setRg(result.getString("rg"));
                objeto.setCpf(result.getString("cpf"));
                objeto.setEmail(result.getString("email"));
                objeto.setSenha(result.getString("senha"));
                objeto.setCargo(result.getString("cargo"));
                objeto.setNivel_acesso(result.getString("nivel_acesso"));
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
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
            return null;
        }
    }

}
