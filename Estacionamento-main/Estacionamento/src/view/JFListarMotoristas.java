/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.dao.MotoristaDAO;
import model.bean.Motorista;
import javax.swing.table.DefaultTableModel;

public class JFListarMotoristas extends javax.swing.JFrame {

    /**
     * Creates new form JFListarMotoristas
     */
    public JFListarMotoristas() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMotorista = new javax.swing.JTable();
        jBtnCancelar = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        jLabel1.setText("Listar Motoristas");

        jTMotorista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Motorista", "Nome", "Genero", "RG", "CPF", "Celular", "Email", "Senha"
            }
        ));
        jTMotorista.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTMotoristaVetoableChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTMotorista);

        jBtnCancelar.setText("Cancelar");

        jBtnEditar.setText("Editar");
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnExcluir)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnEditar)
                    .addComponent(jBtnExcluir))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTMotoristaVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTMotoristaVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMotoristaVetoableChange

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        readJTable();
    }//GEN-LAST:event_formWindowOpened

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        if (jTMotorista.getSelectedRow() != -1) {
            int opcao = JOptionPane.showConfirmDialog(null,
                    "Deseja excluir a vaga selecionada?", "Exclusão", JOptionPane.YES_NO_OPTION);
            if(opcao == 0) {
                MotoristaDAO dao = new MotoristaDAO();
                Motorista v = new Motorista();
                v.setIdMotorista((int)jTMotorista.getValueAt(jTMotorista.getSelectedRow(), 0));
                dao.delete(v);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um motorista!", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        }
        readJTable();
// TODO add your handling code here:
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        // TODO add your handling code here:
         if (jTMotorista.getSelectedRow() != -1) {
            int motoristaSelecionado = (int)jTMotorista.getValueAt(jTMotorista.getSelectedRow(), 0);
            JFAtualizarMotorista am = new JFAtualizarMotorista(motoristaSelecionado);
            am.setVisible(true);
            System.out.println(motoristaSelecionado);
            
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um motorista!", "ERRO", JOptionPane.ERROR_MESSAGE);
            
        }
        readJTable();
    }//GEN-LAST:event_jBtnEditarActionPerformed
    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jTMotorista.getModel();
        modelo.setNumRows(0);
        MotoristaDAO dao = new MotoristaDAO();
        for (Motorista m: dao.read()) {
            modelo.addRow(new Object[] {
            m.getIdMotorista(),
            m.getNome(),
            m.getGenero(),
            m.getRg(),
            m.getCpf(),
            m.getNumero(),
            m.getEmail(),
            m.getSenha()                    
        });
        }    
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
            java.util.logging.Logger.getLogger(JFListarMotoristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFListarMotoristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFListarMotoristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFListarMotoristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFListarMotoristas().setVisible(true);
            }
         });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTMotorista;
    // End of variables declaration//GEN-END:variables
}
