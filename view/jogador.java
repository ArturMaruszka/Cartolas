/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;
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
public class jogador extends javax.swing.JFrame implements MouseListener, ActionListener, FocusListener {

    /**
     * Creates new form jogador
     */
    public jogador() {
        initComponents();

    }

    public void addRowToTable() {
        String Usuário = (String) jtfjogador.getText();
        DefaultTableModel model = (DefaultTableModel) jtcartas.getModel();
        model.getDataVector().removeAllElements();//remove todas as linhas
        model.fireTableDataChanged();
        Object rowData[] = new Object[4];
        CartaServicos cartaC = ServicosFactory.getCartaServicos();
        for (Cartas carta : cartaC.getcardbydono(Usuário)) {
            rowData[0] = carta.getNome();
            rowData[1] = carta.getEdicao();
            rowData[2] = carta.getPreco();
            rowData[3] = carta.getQuantidade();

            model.addRow(rowData);
        }
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
        jtfjogador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtcartas = new javax.swing.JTable();
        jbbusca = new javax.swing.JButton();
        jtnome = new javax.swing.JTextField();
        jttelefone = new javax.swing.JTextField();
        jtemail = new javax.swing.JTextField();
        jtcidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Buscar por:");

        jtfjogador.addFocusListener(this);
        jtfjogador.addActionListener(this);

        jtcartas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Edição", "Preço", "Quantidade"
            }
        ));
        jtcartas.addMouseListener(this);
        jScrollPane1.setViewportView(jtcartas);

        jbbusca.setText("Buscar");
        jbbusca.addMouseListener(this);
        jbbusca.addActionListener(this);

        jttelefone.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtcidade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtemail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jttelefone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtnome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfjogador, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbbusca)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfjogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbbusca))
                .addGap(18, 18, 18)
                .addComponent(jtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == jtfjogador) {
            jogador.this.jtfjogadorActionPerformed(evt);
        }
        else if (evt.getSource() == jbbusca) {
            jogador.this.jbbuscaActionPerformed(evt);
        }
        else if (evt.getSource() == jttelefone) {
            jogador.this.jttelefoneActionPerformed(evt);
        }
    }

    public void focusGained(java.awt.event.FocusEvent evt) {
    }

    public void focusLost(java.awt.event.FocusEvent evt) {
        if (evt.getSource() == jtfjogador) {
            jogador.this.jtfjogadorFocusLost(evt);
        }
    }

    public void mouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getSource() == jtcartas) {
            jogador.this.jtcartasMouseClicked(evt);
        }
        else if (evt.getSource() == jbbusca) {
            jogador.this.jbbuscaMouseClicked(evt);
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

    private void jtcartasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtcartasMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jtcartasMouseClicked

    private void jtfjogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfjogadorActionPerformed
        // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jtfjogadorActionPerformed

    private void jbbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscaActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jbbuscaActionPerformed

    private void jttelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jttelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jttelefoneActionPerformed

    private void jbbuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbbuscaMouseClicked
        
// TODO add your handling code here:
    }//GEN-LAST:event_jbbuscaMouseClicked

    private void jtfjogadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfjogadorFocusLost
JogadorServicos jogadorJ = ServicosFactory.getJogadorServicos();
        jogadorJ.getjogadorByDoc(jtfjogador.getText());
        Jogador j = (jogadorJ.getjogadorByDoc(jtfjogador.getText()));
        jtnome.setText(j.getNome());
        jttelefone.setText(j.getTelefone());
        jtemail.setText(j.getEmail());
        jtcidade.setText(j.getCidade());        // TODO add your handling code here:
    }//GEN-LAST:event_jtfjogadorFocusLost

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
            java.util.logging.Logger.getLogger(jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jogador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbbusca;
    private javax.swing.JTable jtcartas;
    private javax.swing.JTextField jtcidade;
    private javax.swing.JTextField jtemail;
    private javax.swing.JTextField jtfjogador;
    private javax.swing.JTextField jtnome;
    private javax.swing.JTextField jttelefone;
    // End of variables declaration//GEN-END:variables
}
