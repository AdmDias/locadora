package view;
import javax.swing.JOptionPane;
import model.DaoVeiculo;
import model.Veiculo;

public class VeiculoView extends javax.swing.JFrame {
    DaoVeiculo daoVeiculo;
    Veiculo veiculo;
    
    public VeiculoView() {
        initComponents();
        daoVeiculo = new DaoVeiculo();
        jt_veiculos.setModel(new VeiculoTableModel(daoVeiculo.buscarTodos()));
        veiculo = new Veiculo();
        btn_excluir.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroupPesquisa = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_salvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tf_chassi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        tf_modelo = new javax.swing.JTextField();
        tf_marca = new javax.swing.JTextField();
        tf_ano = new javax.swing.JTextField();
        btn_novo = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_veiculos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        rb_marca = new javax.swing.JRadioButton();
        rb_modelo = new javax.swing.JRadioButton();
        tf_pesquisa = new javax.swing.JTextField();
        btn_listAll = new javax.swing.JButton();
        btn_filtrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Veiculos");
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(195, 20, 50));
        kGradientPanel1.setkStartColor(new java.awt.Color(36, 11, 54));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("GERENCIAMENTO DE VEÍCULOS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Código");

        btn_salvar.setBackground(new java.awt.Color(36, 11, 54));
        btn_salvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_salvar.setForeground(new java.awt.Color(255, 255, 255));
        btn_salvar.setText("SALVAR");
        btn_salvar.setBorderPainted(false);
        btn_salvar.setMaximumSize(new java.awt.Dimension(77, 25));
        btn_salvar.setMinimumSize(new java.awt.Dimension(77, 25));
        btn_salvar.setPreferredSize(new java.awt.Dimension(77, 25));
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel3.setText("Marca");

        tf_chassi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(36, 11, 54)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel4.setText("Ano");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel5.setText("Modelo");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel6.setText("Chassi");

        tf_codigo.setEditable(false);
        tf_codigo.setBackground(new java.awt.Color(255, 255, 255));
        tf_codigo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(36, 11, 54)));

        tf_modelo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(36, 11, 54)));

        tf_marca.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(36, 11, 54)));

        tf_ano.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(36, 11, 54)));

        btn_novo.setBackground(new java.awt.Color(36, 11, 54));
        btn_novo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_novo.setForeground(new java.awt.Color(255, 255, 255));
        btn_novo.setText("LIMPAR");
        btn_novo.setBorderPainted(false);
        btn_novo.setMaximumSize(new java.awt.Dimension(77, 25));
        btn_novo.setMinimumSize(new java.awt.Dimension(77, 25));
        btn_novo.setPreferredSize(new java.awt.Dimension(77, 25));
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_excluir.setBackground(new java.awt.Color(36, 11, 54));
        btn_excluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_excluir.setForeground(new java.awt.Color(255, 255, 255));
        btn_excluir.setText("EXCLUIR");
        btn_excluir.setBorderPainted(false);
        btn_excluir.setMaximumSize(new java.awt.Dimension(77, 25));
        btn_excluir.setMinimumSize(new java.awt.Dimension(77, 25));
        btn_excluir.setPreferredSize(new java.awt.Dimension(77, 25));
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        jt_veiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jt_veiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_veiculosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_veiculos);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Filtrar por");

        rb_marca.setBackground(new java.awt.Color(255, 255, 255));
        btngroupPesquisa.add(rb_marca);
        rb_marca.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        rb_marca.setText("Marca");

        rb_modelo.setBackground(new java.awt.Color(255, 255, 255));
        btngroupPesquisa.add(rb_modelo);
        rb_modelo.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        rb_modelo.setText("Modelo");

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

        btnVoltar.setBackground(new java.awt.Color(36, 11, 54));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("VOLTAR");
        btnVoltar.setBorderPainted(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("VEÍCULOS CADASTRADOS NO SISTEMA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(140, 140, 140))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(jLabel4))
                                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVoltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_filtrar)
                                .addGap(32, 32, 32)
                                .addComponent(btn_listAll))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_chassi, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(tf_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6)
                                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_marca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb_modelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2)
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(tf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_chassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rb_marca)
                    .addComponent(rb_modelo)
                    .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_listAll)
                    .addComponent(btn_filtrar)
                    .addComponent(btnVoltar))
                .addGap(20, 20, 20))
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
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        VeiculoView.this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Confirmar Exclusão?", "Excluir Veiculo", JOptionPane.YES_NO_OPTION);
        if(confirm == 0){
            daoVeiculo.excluir(Integer.parseInt(tf_codigo.getText()));
            jt_veiculos.setModel(new VeiculoTableModel(daoVeiculo.buscarTodos()));
            this.limparCampos();
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filtrarActionPerformed
        String campo;
        if(rb_marca.isSelected()){
            campo = "marca";
        }else{
            campo = "modelo";
        }

        jt_veiculos.setModel(new VeiculoTableModel(daoVeiculo.busca_comFiltro(campo, tf_pesquisa.getText())));
        btn_excluir.setEnabled(false);
        this.limparCampos();
    }//GEN-LAST:event_btn_filtrarActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_listAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listAllActionPerformed
        jt_veiculos.setModel(new VeiculoTableModel(daoVeiculo.buscarTodos()));
        btn_excluir.setEnabled(false);
        this.limparCampos();
    }//GEN-LAST:event_btn_listAllActionPerformed

    private void jt_veiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_veiculosMouseClicked
        tf_codigo.setText(jt_veiculos.getValueAt(jt_veiculos.getSelectedRow(),VeiculoTableModel.COL_CODIGO).toString());
        tf_marca.setText(jt_veiculos.getValueAt(jt_veiculos.getSelectedRow(),VeiculoTableModel.COL_MARCA).toString());
        tf_modelo.setText(jt_veiculos.getValueAt(jt_veiculos.getSelectedRow(),VeiculoTableModel.COL_MODELO).toString());
        tf_chassi.setText(jt_veiculos.getValueAt(jt_veiculos.getSelectedRow(),VeiculoTableModel.COL_CHASSI).toString());
        tf_ano.setText(jt_veiculos.getValueAt(jt_veiculos.getSelectedRow(),VeiculoTableModel.COL_ANO).toString());
        btn_excluir.setEnabled(true);
    }//GEN-LAST:event_jt_veiculosMouseClicked

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if(tf_marca.getText().equals("") || tf_modelo.getText().equals("") ||
            tf_chassi.getText().equals("") || tf_ano.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }else{
            veiculo.setMarca(tf_marca.getText());
            veiculo.setModelo(tf_modelo.getText());
            veiculo.setChassi(tf_chassi.getText());
            veiculo.setAno(Integer.parseInt(tf_ano.getText()));

            if(tf_codigo.getText().equals("")){
                daoVeiculo.inserir(veiculo);
            }else{
                veiculo.setCodigo(Integer.parseInt(tf_codigo.getText()));
                daoVeiculo.alterar(veiculo);
            }
            jt_veiculos.setModel(new VeiculoTableModel(daoVeiculo.buscarTodos()));
            this.limparCampos();
        }
    }//GEN-LAST:event_btn_salvarActionPerformed
    
    public void limparCampos(){
        tf_codigo.setText("");
        tf_marca.setText("");
        tf_modelo.setText("");
        tf_chassi.setText("");
        tf_ano.setText("");
        tf_pesquisa.setText("");
        btn_excluir.setEnabled(false);
    }
        
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VeiculoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_filtrar;
    private javax.swing.JButton btn_listAll;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.ButtonGroup btngroupPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt_veiculos;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JRadioButton rb_marca;
    private javax.swing.JRadioButton rb_modelo;
    private javax.swing.JTextField tf_ano;
    private javax.swing.JTextField tf_chassi;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_modelo;
    private javax.swing.JTextField tf_pesquisa;
    // End of variables declaration//GEN-END:variables
}
