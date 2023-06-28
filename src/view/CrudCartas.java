/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cartas;
import model.Jogador;
import servicos.CartaServicos;
import servicos.JogadorServicos;
import servicos.ServicosFactory;

/**
 *
 * @author artur
 */
public class CrudCartas extends javax.swing.JFrame implements ActionListener, MouseListener {

    /**
     * Creates new form CrudCartas
     */
    public CrudCartas() {
        initComponents();
        addRowToTable();
    }
    public void limparCampos() {
        jtfNome.setText("");
        jtfEdicao.setText("");
        jtfQuantidade.setText("");
        jtfPreco.setText("");
        jtfDono.setText("");
    }
    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.getDataVector().removeAllElements();//remove todas as linhas
        model.fireTableDataChanged();
        Object rowData[] = new Object[5];
        CartaServicos cartaC = ServicosFactory.getCartaServicos();
        for (Cartas j : cartaC.getCarta()) {
            rowData[0] = j.getNome();
            rowData[1] = j.getEdicao();
            rowData[2] = j.getQuantidade();
            rowData[3] = j.getPreco();
            rowData[4] = j.getDono();
            model.addRow(rowData);
        }
    }
    public boolean validInputs() {
        if (jtfNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo Nome obrigatório!");
            jtfNome.requestFocus();
            return false;
        } else if (jtfEdicao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo Edição obrigatório!");
            jtfEdicao.requestFocus();
            return false;
        } else if (jtfQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo Quantidade obrigatório!");
            jtfQuantidade.requestFocus();
            return false;
        } else if (jtfPreco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo Preço obrigatório!");
            jtfPreco.requestFocus();
            return false;
        } else if (jtfDono.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo Dono obrigatório!");
            jtfDono.requestFocus();
            return false;}
        return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfEdicao = new javax.swing.JTextField();
        jtfQuantidade = new javax.swing.JTextField();
        jtfDono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbSair = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jtfPreco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de cartas");

        jLabel2.setText("Nome");

        jLabel3.setText("Edição");

        jLabel4.setText("Quantidade");

        jLabel5.setText("Preço");

        jLabel6.setText("Dono");

        jtfDono.addActionListener(this);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Edição", "Quantidade", "Preço", "Dono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jbSair.setText("Sair");
        jbSair.addActionListener(this);

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(this);

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(this);

        jbEditar.setText("Editar");
        jbEditar.addMouseListener(this);
        jbEditar.addActionListener(this);

        jbDeletar.setText("Deletar");
        jbDeletar.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPreco))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfEdicao)
                            .addComponent(jtfNome)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfDono))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbDeletar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addComponent(jbEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbSair)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtfDono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSair)
                    .addComponent(jbLimpar)
                    .addComponent(jbSalvar)
                    .addComponent(jbEditar)
                    .addComponent(jbDeletar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == jtfDono) {
            CrudCartas.this.jtfDonoActionPerformed(evt);
        }
        else if (evt.getSource() == jbSair) {
            CrudCartas.this.jbSairActionPerformed(evt);
        }
        else if (evt.getSource() == jbLimpar) {
            CrudCartas.this.jbLimparActionPerformed(evt);
        }
        else if (evt.getSource() == jbSalvar) {
            CrudCartas.this.jbSalvarActionPerformed(evt);
        }
        else if (evt.getSource() == jbEditar) {
            CrudCartas.this.jbEditarActionPerformed(evt);
        }
        else if (evt.getSource() == jbDeletar) {
            CrudCartas.this.jbDeletarActionPerformed(evt);
        }
    }

    public void mouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getSource() == jbEditar) {
            CrudCartas.this.jbEditarMouseClicked(evt);
        }
    }

    public void mouseEntered(java.awt.event.MouseEvent evt) {
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
    }

    public void mousePressed(java.awt.event.MouseEvent evt) {
    }

    public void mouseReleased(java.awt.event.MouseEvent evt) {
    }// </editor-fold>//GEN-END:initComponents

    private void jtfDonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDonoActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
this.dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
if (jbLimpar.getText().equals("Limpar")) {
            limparCampos();

        } else {
            jbEditar.setEnabled(false);
            jbLimpar.setText("Limpar");
            limparCampos();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
if (validInputs()) {
            JogadorServicos jogadorJ = ServicosFactory.getJogadorServicos();
            CartaServicos  cartaC =ServicosFactory.getCartaServicos();
            String Nome = jtfNome.getText().toUpperCase();
            String Edicao = jtfEdicao.getText().toUpperCase();
            int Quantidade = Integer.parseInt(jtfQuantidade.getText());
            Float Preco = Float.parseFloat(jtfPreco.getText());
            Jogador Dono = jogadorJ.getjogadorByDoc(jtfDono.getText());
            Cartas j = new Cartas(Nome, Edicao, Quantidade, Preco, Dono);
            if (jbSalvar.getText().equals("Salvar")) {
                cartaC.cadastroCarta(j);
            } else {
                cartaC.atualizarCartaDAO(j);
            }
            addRowToTable();
            limparCampos();

}        // TODO add your handling code here:
             // TODO add your handling code here:
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
jbDeletar.setVisible(false);
        jbSalvar.setText("Confirmar");
        jbLimpar.setText("Cancelar");
        jtfNome.setEnabled(false);
        int linha = jTable1.getSelectedRow();
        String nome = (String) jTable1.getValueAt(linha, 0);
        CartaServicos cartaC = ServicosFactory.getCartaServicos();
        Cartas j = cartaC.getcardbyname(nome);
        jtfNome.setText(j.getNome());
        jtfEdicao.setText(j.getEdicao());
        jtfQuantidade.setText(Integer.toString(j.getQuantidade()));
        jtfPreco.setText(Float.toString(j.getPreco()));
        jtfDono.setText(j.getDono().getNome());// TODO add your handling code here:
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
int linha = jTable1.getSelectedRow();
        String nomec = (String) jTable1.getValueAt(linha, 0);
        CartaServicos jogadorJ = ServicosFactory.getCartaServicos();
        Cartas nome = jogadorJ.getcardbyname(nomec);
        Object[] btnMSG = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(this, "Deseja realmente deletar " + nome, "Deletar Pessoa", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, btnMSG, btnMSG[0]);
        if(resp == 0){
            jogadorJ.deletacarta(nomec);
            addRowToTable();
            JOptionPane.showMessageDialog(this, "Cadastro removido");
        }else{
            JOptionPane.showMessageDialog(this, "Operação cancelada pelo usuário");
        }jbLimpar.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jbEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEditarMouseClicked
jbDeletar.setVisible(false);
        jbSalvar.setText("Confirmar");
        jbLimpar.setText("Cancelar");
        jtfNome.setEnabled(false);
        int linha = jTable1.getSelectedRow();
        String nome = (String) jTable1.getValueAt(linha, 0);
        CartaServicos cartaC = ServicosFactory.getCartaServicos();
        Cartas j = cartaC.getcardbyname(nome);
        jtfNome.setText(j.getNome());
        jtfEdicao.setText(j.getEdicao());
        jtfQuantidade.setText(Integer.toString(j.getQuantidade()));
        jtfPreco.setText(Float.toString(j.getPreco())); 
        jtfDono.setText(j.getDono().getNome());        // TODO add your handling code here:
    }//GEN-LAST:event_jbEditarMouseClicked

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
            java.util.logging.Logger.getLogger(CrudCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudCartas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTextField jtfDono;
    private javax.swing.JTextField jtfEdicao;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPreco;
    private javax.swing.JTextField jtfQuantidade;
    // End of variables declaration//GEN-END:variables
}
