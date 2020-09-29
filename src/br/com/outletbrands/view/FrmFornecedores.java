/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.outletbrands.view;

import br.com.outletbrands.dao.FornecedoresDAO;
import br.com.outletbrands.model.Fornecedores;
import br.com.outletbrands.model.Utilitarios;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class FrmFornecedores extends javax.swing.JFrame {

    public void listar() {
        FornecedoresDAO dao = new FornecedoresDAO();
        List<Fornecedores> lista = dao.listarFornecedores();
        DefaultTableModel dados = (DefaultTableModel) tabelaFornecedores.getModel();
        dados.setNumRows(0);
        for (Fornecedores c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCnpj(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getEstado()
            });
        }
    }

    public FrmFornecedores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painel_dados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JFormattedTextField();
        txttelefone = new javax.swing.JFormattedTextField();
        txtcep = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtendereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtbairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtcomplemento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnexcluir = new javax.swing.JButton();
        bnteditar = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        btnnovo = new javax.swing.JButton();
        cbuf = new javax.swing.JComboBox<>();
        txtcnpj = new javax.swing.JFormattedTextField();
        btnbusca = new javax.swing.JButton();
        painel_consulta = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtpesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedores = new javax.swing.JTable();
        btnpesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Fornecedores");
        setName(""); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel1.setText("Cadastro de Fornecedores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jLabel2.setText("Código:");

        txtcodigo.setEditable(false);

        jLabel3.setText("Nome:");

        jLabel4.setText("Email:");

        jLabel5.setText("Celular:");

        jLabel6.setText("Telefone:");

        try {
            txtcelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcelularActionPerformed(evt);
            }
        });

        try {
            txttelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txttelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefoneActionPerformed(evt);
            }
        });

        try {
            txtcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcepActionPerformed(evt);
            }
        });
        txtcep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcepKeyPressed(evt);
            }
        });

        jLabel7.setText("CEP:");

        jLabel8.setText("Endereço:");

        jLabel9.setText("Número:");

        jLabel10.setText("Cidade:");

        jLabel11.setText("Bairro:");

        jLabel12.setText("Complemento:");

        jLabel13.setText("UF:");

        jLabel14.setText("CNPJ:");

        btnexcluir.setText("EXCLUIR");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        bnteditar.setText("EDITAR");
        bnteditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnteditarActionPerformed(evt);
            }
        });

        btnsalvar.setText("SALVAR");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btnnovo.setText("NOVO");
        btnnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoActionPerformed(evt);
            }
        });

        cbuf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbuf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbufActionPerformed(evt);
            }
        });

        try {
            txtcnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcnpjActionPerformed(evt);
            }
        });

        btnbusca.setText("Buscar");
        btnbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_dadosLayout = new javax.swing.GroupLayout(painel_dados);
        painel_dados.setLayout(painel_dadosLayout);
        painel_dadosLayout.setHorizontalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_dadosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnnovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnsalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bnteditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnexcluir))
                            .addGroup(painel_dadosLayout.createSequentialGroup()
                                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painel_dadosLayout.createSequentialGroup()
                                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painel_dadosLayout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(painel_dadosLayout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbuf, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painel_dadosLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painel_dadosLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painel_dadosLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 126, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        painel_dadosLayout.setVerticalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel5)
                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnovo)
                    .addComponent(btnsalvar)
                    .addComponent(bnteditar)
                    .addComponent(btnexcluir))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Dados cadastrais", painel_dados);

        jLabel16.setText("Nome:");

        txtpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpesquisaKeyPressed(evt);
            }
        });

        tabelaFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CNPJ", "Email", "Telefone", "Celular", "Cep", "Endereço", "Nº", "Complemento", "Bairro", "Cidade", "Estado"
            }
        ));
        tabelaFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFornecedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFornecedores);

        btnpesquisar.setText("Pesquisar");
        btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_consultaLayout = new javax.swing.GroupLayout(painel_consulta);
        painel_consulta.setLayout(painel_consultaLayout);
        painel_consultaLayout.setHorizontalGroup(
            painel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_consultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
                    .addGroup(painel_consultaLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnpesquisar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painel_consultaLayout.setVerticalGroup(
            painel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_consultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(btnpesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta de fornecedores", painel_consulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txttelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefoneActionPerformed

    private void txtcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcepActionPerformed

    private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarActionPerformed
        // botao pesquisar
        String nome = "%" + txtpesquisa.getText() + "%";

        FornecedoresDAO dao = new FornecedoresDAO();
        List<Fornecedores> lista = dao.buscaFornecedoresPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaFornecedores.getModel();
        dados.setNumRows(0);
        for (Fornecedores c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCnpj(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getEstado()
            });
        }

    }//GEN-LAST:event_btnpesquisarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        // boto excluir
        Fornecedores obj = new Fornecedores();

        obj.setId(Integer.parseInt(txtcodigo.getText()));

        FornecedoresDAO dao = new FornecedoresDAO();

        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir?", "Excluir", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            dao.excluirFornecedores(obj);
            new Utilitarios().LimpaTela(painel_dados);
        } else {
            repaint();
        }
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void bnteditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnteditarActionPerformed
        // botao editar
        Fornecedores obj = new Fornecedores();

        obj.setNome(txtnome.getText());
        obj.setCnpj(txtcnpj.getText());
        obj.setEmail(txtemail.getText());
        obj.setTelefone(txttelefone.getText());
        obj.setCelular(txtcelular.getText());
        obj.setCep(txtcep.getText());
        obj.setEndereco(txtendereco.getText());
        obj.setNumero(Integer.parseInt(txtnumero.getText()));
        obj.setComplemento(txtcomplemento.getText());
        obj.setBairro(txtbairro.getText());
        obj.setCidade(txtcidade.getText());
        obj.setEstado(cbuf.getSelectedItem().toString());
        obj.setId(Integer.parseInt(txtcodigo.getText()));

        FornecedoresDAO dao = new FornecedoresDAO();
        dao.alterarFornecedores(obj);

        new Utilitarios().LimpaTela(painel_dados);
    }//GEN-LAST:event_bnteditarActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        // botao salvar
        Fornecedores obj = new Fornecedores();

        obj.setNome(txtnome.getText());
        obj.setCnpj(txtcnpj.getText());
        obj.setEmail(txtemail.getText());
        obj.setTelefone(txttelefone.getText());
        obj.setCelular(txtcelular.getText());
        obj.setCep(txtcep.getText());
        obj.setEndereco(txtendereco.getText());
        obj.setNumero(Integer.parseInt(txtnumero.getText()));
        obj.setComplemento(txtcomplemento.getText());
        obj.setBairro(txtbairro.getText());
        obj.setCidade(txtcidade.getText());
        obj.setEstado(cbuf.getSelectedItem().toString());

        FornecedoresDAO dao = new FornecedoresDAO();
        dao.cadastrarFornecedores(obj);
        new Utilitarios().LimpaTela(painel_dados);

    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btnnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoActionPerformed
        new Utilitarios().LimpaTela(painel_dados);
    }//GEN-LAST:event_btnnovoActionPerformed

    private void txtcelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcelularActionPerformed

    private void txtcnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcnpjActionPerformed

    private void cbufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbufActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbufActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void tabelaFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFornecedoresMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
        txtcodigo.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 0).toString());
        txtnome.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 1).toString());
        txtcnpj.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 2).toString());
        txtemail.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 3).toString());
        txttelefone.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 4).toString());
        txtcelular.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 5).toString());
        txtcep.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 6).toString());
        txtendereco.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 7).toString());
        txtnumero.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 8).toString());
        txtcomplemento.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 9).toString());
        txtbairro.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 10).toString());
        txtcidade.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 11).toString());
        cbuf.setSelectedItem(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 12).toString());
    }//GEN-LAST:event_tabelaFornecedoresMouseClicked

    private void txtpesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaKeyPressed
        String nome = "%" + txtpesquisa.getText() + "%";

        FornecedoresDAO dao = new FornecedoresDAO();
        List<Fornecedores> lista = dao.buscaFornecedoresPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaFornecedores.getModel();
        dados.setNumRows(0);
        for (Fornecedores c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCnpj(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getEstado()
            });
        }
    }//GEN-LAST:event_txtpesquisaKeyPressed

    private void btnbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaActionPerformed
        // botao buscar fornecedor por nome

        String nome = txtnome.getText();
        Fornecedores obj = new Fornecedores();
        FornecedoresDAO dao = new FornecedoresDAO();

        obj = dao.consultaPorNome(nome);

        if (obj.getNome() != null) {
            txtcodigo.setText(String.valueOf(obj.getId()));
            txtnome.setText(obj.getNome());
            txtcnpj.setText(obj.getCnpj());
            txtemail.setText(obj.getEmail());
            txttelefone.setText(obj.getTelefone());
            txtcelular.setText(obj.getCelular());
            txtcep.setText(obj.getCep());
            txtendereco.setText(obj.getEndereco());
            txtnumero.setText(String.valueOf(obj.getNumero()));
            txtcomplemento.setText(obj.getComplemento());
            txtbairro.setText(obj.getBairro());
            txtcidade.setText(obj.getCidade());
            cbuf.setSelectedItem(obj.getEstado());
        } else {
            JOptionPane.showMessageDialog(null, "Fornecedor não encontrado!");
        }

    }//GEN-LAST:event_btnbuscaActionPerformed

    private void txtcepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcepKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Fornecedores obj = new Fornecedores();
            FornecedoresDAO dao = new FornecedoresDAO();
            obj = dao.buscaCep(txtcep.getText());

            txtendereco.setText(obj.getEndereco());
            txtbairro.setText(obj.getBairro());
            txtcidade.setText(obj.getCidade());
            cbuf.setSelectedItem(obj.getEstado());
            System.out.println(obj.getEstado());

        }

    }//GEN-LAST:event_txtcepKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFornecedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnteditar;
    private javax.swing.JButton btnbusca;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnnovo;
    private javax.swing.JButton btnpesquisar;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JComboBox<String> cbuf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel painel_consulta;
    private javax.swing.JPanel painel_dados;
    private javax.swing.JTable tabelaFornecedores;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JFormattedTextField txtcelular;
    private javax.swing.JFormattedTextField txtcep;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JFormattedTextField txtcnpj;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcomplemento;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtpesquisa;
    private javax.swing.JFormattedTextField txttelefone;
    // End of variables declaration//GEN-END:variables
}
