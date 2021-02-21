package view;
import javax.swing.JOptionPane;
import model.DaoCliente;
import model.Cliente;

public class ClienteView extends javax.swing.JFrame {
    DaoCliente daoCliente;
    Cliente cliente;
    
    public ClienteView() {
        initComponents();
        daoCliente = new DaoCliente();
        jt_clientes.setModel(new ClienteTableModel(daoCliente.buscarTodos()));
        cliente = new Cliente();
        btn_excluir.setEnabled(false);
    }
    
    public void limparCampos(){
        tf_codigo.setText("");
        tf_nome.setText("");
        tf_nacionalidade.setText("");
        tf_endereco.setText("");
        tf_dataNasc.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_groupPesquisa = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        tf_nome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_salvar = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        ComboBoxSexo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_dataNasc = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_endereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_nacionalidade = new javax.swing.JTextField();
        btn_excluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_clientes = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rb_nome = new javax.swing.JRadioButton();
        rb_endereco = new javax.swing.JRadioButton();
        tf_pesquisa = new javax.swing.JTextField();
        btn_listAll = new javax.swing.JButton();
        btn_filtrar = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(195, 20, 50));
        kGradientPanel1.setkStartColor(new java.awt.Color(36, 11, 54));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("GERENCIAMENTO DE CLIENTES");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel5.setText("Sexo");

        tf_codigo.setEditable(false);
        tf_codigo.setBackground(new java.awt.Color(255, 255, 255));
        tf_codigo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(36, 11, 54)));
        tf_codigo.setEnabled(false);

        tf_nome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(36, 11, 54)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel6.setText("Código");

        btn_salvar.setBackground(new java.awt.Color(36, 11, 54));
        btn_salvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_salvar.setForeground(new java.awt.Color(255, 255, 255));
        btn_salvar.setText("SALVAR");
        btn_salvar.setBorderPainted(false);
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_limpar.setBackground(new java.awt.Color(36, 11, 54));
        btn_limpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_limpar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpar.setText("LIMPAR");
        btn_limpar.setBorderPainted(false);
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        ComboBoxSexo.setEditable(true);
        ComboBoxSexo.setMaximumRowCount(2);
        ComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        ComboBoxSexo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel2.setText("Nome");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel10.setText("Endereço");

        tf_dataNasc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(36, 11, 54)));
        try {
            tf_dataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel3.setText("Data de Nascimento");

        tf_endereco.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(36, 11, 54)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel4.setText("Nacionalidade");

        tf_nacionalidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(36, 11, 54)));

        btn_excluir.setBackground(new java.awt.Color(36, 11, 54));
        btn_excluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_excluir.setForeground(new java.awt.Color(255, 255, 255));
        btn_excluir.setText("EXCLUIR");
        btn_excluir.setBorderPainted(false);
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        jt_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jt_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_clientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_clientes);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("CLIENTES CADASTRADOS NO SISTEMA");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Filtrar por");

        rb_nome.setBackground(new java.awt.Color(255, 255, 255));
        btn_groupPesquisa.add(rb_nome);
        rb_nome.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        rb_nome.setText("Nome");

        rb_endereco.setBackground(new java.awt.Color(255, 255, 255));
        btn_groupPesquisa.add(rb_endereco);
        rb_endereco.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        rb_endereco.setText("Endereço");

        tf_pesquisa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(36, 11, 54)));

        btn_listAll.setBackground(new java.awt.Color(36, 11, 54));
        btn_listAll.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_listAll.setForeground(new java.awt.Color(255, 255, 255));
        btn_listAll.setText("LISTAR TODOS");
        btn_listAll.setBorderPainted(false);
        btn_listAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listAllActionPerformed(evt);
            }
        });

        btn_filtrar.setBackground(new java.awt.Color(36, 11, 54));
        btn_filtrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_filtrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_filtrar.setText("FILTRAR");
        btn_filtrar.setBorderPainted(false);
        btn_filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filtrarActionPerformed(evt);
            }
        });

        btn_voltar.setBackground(new java.awt.Color(36, 11, 54));
        btn_voltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_voltar.setForeground(new java.awt.Color(255, 255, 255));
        btn_voltar.setText("VOLTAR");
        btn_voltar.setBorderPainted(false);
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_filtrar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_listAll))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(279, 279, 279))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(81, 81, 81))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(64, 64, 64)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel10)
                                                        .addComponent(tf_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tf_dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))))
                                            .addGap(35, 35, 35))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(ComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(tf_nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_excluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_nome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_endereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(177, 177, 177))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_salvar)
                        .addComponent(btn_limpar))
                    .addComponent(btn_excluir))
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_nome)
                        .addComponent(rb_endereco)
                        .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_listAll)
                    .addComponent(btn_filtrar)
                    .addComponent(btn_voltar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        ClienteView.this.dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_listAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listAllActionPerformed
        jt_clientes.setModel(new ClienteTableModel(daoCliente.buscarTodos()));
        btn_excluir.setEnabled(false);
        this.limparCampos();
    }//GEN-LAST:event_btn_listAllActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if(tf_nome.getText().equals("") || tf_nacionalidade.getText().equals("") ||
           tf_endereco.getText().equals("") || tf_dataNasc.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }else{
            cliente.setNomeCliente(tf_nome.getText());
            cliente.setNacionalidade(tf_nacionalidade.getText());
            cliente.setEndereco(tf_endereco.getText());
            cliente.setDataNascCliente(tf_dataNasc.getText());
            cliente.setSexo(ComboBoxSexo.getSelectedItem().toString());
                  
            if(tf_codigo.getText().equals("")){
                daoCliente.inserir(cliente);
            }else{
                cliente.setCodCliente(Integer.parseInt(tf_codigo.getText()));
                daoCliente.alterar(cliente);
            }
            jt_clientes.setModel(new ClienteTableModel(daoCliente.buscarTodos()));
            this.limparCampos();
        }
        
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
       int confirm = JOptionPane.showConfirmDialog(null, "Confirmar Exclusão?", "Excluir Cliente", JOptionPane.YES_NO_OPTION);
        if(confirm == 0){
            daoCliente.excluir(Integer.parseInt(tf_codigo.getText()));
            jt_clientes.setModel(new ClienteTableModel(daoCliente.buscarTodos()));
            this.limparCampos();
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_btn_limparActionPerformed

    private void jt_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_clientesMouseClicked
        tf_codigo.setText(jt_clientes.getValueAt(jt_clientes.getSelectedRow(),ClienteTableModel.COL_CODIGO).toString());
        tf_nome.setText(jt_clientes.getValueAt(jt_clientes.getSelectedRow(),ClienteTableModel.COL_NOME).toString());
        tf_nacionalidade.setText(jt_clientes.getValueAt(jt_clientes.getSelectedRow(),ClienteTableModel.COL_NACIONALIDADE).toString());
        tf_endereco.setText(jt_clientes.getValueAt(jt_clientes.getSelectedRow(),ClienteTableModel.COL_ENDERECO).toString());
        tf_dataNasc.setText(jt_clientes.getValueAt(jt_clientes.getSelectedRow(),ClienteTableModel.COL_DATANASCIMENTO).toString());
        String tf_sexo = jt_clientes.getValueAt(jt_clientes.getSelectedRow(),ClienteTableModel.COL_SEXO).toString();
        if(tf_sexo.equals("Masculino")){
            ComboBoxSexo.setSelectedIndex(0);
        }else{
            ComboBoxSexo.setSelectedIndex(1);
        }
        btn_excluir.setEnabled(true);
    }//GEN-LAST:event_jt_clientesMouseClicked

    private void btn_filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filtrarActionPerformed
        String campo;
        if(rb_nome.isSelected()){
            campo = "nomeCliente";
        }else{
            campo = "endereco";
        }
        
        jt_clientes.setModel(new ClienteTableModel(daoCliente.busca_comFiltro(campo, tf_pesquisa.getText())));
        btn_excluir.setEnabled(false);
        this.limparCampos();
    }//GEN-LAST:event_btn_filtrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxSexo;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_filtrar;
    private javax.swing.ButtonGroup btn_groupPesquisa;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_listAll;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt_clientes;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JRadioButton rb_endereco;
    private javax.swing.JRadioButton rb_nome;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JFormattedTextField tf_dataNasc;
    private javax.swing.JTextField tf_endereco;
    private javax.swing.JTextField tf_nacionalidade;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_pesquisa;
    // End of variables declaration//GEN-END:variables
}
