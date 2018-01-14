/**
 * @author  Edivan
 * www.vegasconsultoria.com.br
 * Venda de software e código fonte
 */
package view;

import controller.ControllerUsuario;
import javax.swing.JOptionPane;
import model.ModelSessaoUsuario;
import model.ModelUsuario;

public class ViewLogin extends javax.swing.JFrame {

    private ModelSessaoUsuario modelSessaoUsuario = new ModelSessaoUsuario();

    public ViewLogin() {

        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jtfSenha = new javax.swing.JPasswordField();
        bEntrar = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setAutoRequestFocus(false);
        setMaximumSize(new java.awt.Dimension(321, 167));
        setMinimumSize(new java.awt.Dimension(321, 167));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel2.setText("Usuário:");

        jLabel3.setText("Senha:");

        jtfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSenhaActionPerformed(evt);
            }
        });

        bEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/OK.png"))); // NOI18N
        bEntrar.setText("Confirmar");
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });

        bSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        bSair.setText("Cancelar");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Login do usuário");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vegaslogin.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bSair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bEntrar)))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEntrar)
                    .addComponent(bSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bSairActionPerformed

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        // TODO add your handling code here:
        autenticar();
    }//GEN-LAST:event_bEntrarActionPerformed

    private void autenticar() {

        ModelUsuario modelUsuario = new ModelUsuario();
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        modelUsuario.setLogin(this.jtfUsuario.getText());
        modelUsuario.setSenha(new String(this.jtfSenha.getPassword()));

        if (controllerUsuario.getUsuarioController(modelUsuario)) {
            modelUsuario = controllerUsuario.getUsuarioController(modelUsuario.getLogin());
            modelSessaoUsuario.nome = modelUsuario.getNome();
            modelSessaoUsuario.codigo = modelUsuario.getCodigo();
            modelSessaoUsuario.login = modelUsuario.getLogin();

            ViewiPrincipal viewPrincipal = new ViewiPrincipal();
            viewPrincipal.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário/Senha inválida.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }

    }
    private void jtfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSenhaActionPerformed
        // TODO add your handling code here:
        autenticar();
    }//GEN-LAST:event_jtfSenhaActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEntrar;
    private javax.swing.JButton bSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jtfSenha;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
