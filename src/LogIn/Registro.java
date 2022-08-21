//REGISTRY
package LogIn;



import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    
    
    public Registro() {
        initComponents();
        this.setSize(600, 450);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        txtApellidos = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        RadioB1 = new javax.swing.JRadioButton();
        RadioB2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 450));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 330, 10));

        txtUsuario.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 102));
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 330, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 330, 10));

        txtNombre.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 102));
        txtNombre.setText("Ingrese su nombre");
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 10));

        txtCorreo.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 0, 102));
        txtCorreo.setText("Ingrese su correo electrónico");
        txtCorreo.setBorder(null);
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 330, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 330, 10));

        txtPassword.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 102));
        txtPassword.setText("jPasswordField1");
        txtPassword.setBorder(null);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 330, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 330, 10));

        txtApellidos.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(0, 0, 102));
        txtApellidos.setText("Ingrese su apellido");
        txtApellidos.setBorder(null);
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 130, -1));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 130, 10));

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cancelar");

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
        );

        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 140, 30));

        btnCrear.setBackground(new java.awt.Color(102, 153, 255));
        btnCrear.setForeground(new java.awt.Color(0, 0, 51));
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Crear cuenta");

        javax.swing.GroupLayout btnCrearLayout = new javax.swing.GroupLayout(btnCrear);
        btnCrear.setLayout(btnCrearLayout);
        btnCrearLayout.setHorizontalGroup(
            btnCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCrearLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        btnCrearLayout.setVerticalGroup(
            btnCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 140, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Apellido");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Correo electrónico");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre de ususario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Contraseña");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombre");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-sign-icon-person-symbol-human-avatar-isolated-on-white-backogrund-vector.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 180, 150));

        buttonGroup1.add(RadioB1);
        RadioB1.setForeground(new java.awt.Color(0, 0, 102));
        RadioB1.setText("Usuario");
        jPanel1.add(RadioB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        buttonGroup1.add(RadioB2);
        RadioB2.setForeground(new java.awt.Color(0, 0, 102));
        RadioB2.setText("Administrador");
        RadioB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioB2ActionPerformed(evt);
            }
        });
        jPanel1.add(RadioB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseClicked
        String nombre = txtNombre.getText();
        String apellido = txtApellidos.getText();
        String correo = txtCorreo.getText();
        String usuario = txtUsuario.getText();
        String contrasenna = txtPassword.getText();
        String rol = "";
        
        if (RadioB1.isSelected()||RadioB2.isSelected()) {
             if (RadioB1.isSelected()) {
                 rol = "Administrador";
        }else if (RadioB2.isSelected()) {
            rol = "Usuario";
        
        }else{
            JOptionPane.showMessageDialog(rootPane, "Debe de seleccionar uno");
        }
        }
            
        Usuarios user = new Usuarios();
        user.setNombre(nombre);
        user.setApellidos(apellido);
        user.setUsuario(correo);
        user.setUsuario(usuario);
        user.setContrasenna(contrasenna);
        user.setRol(rol);
        
        IniciarUsuario.Userlist.add(user);
        
        JOptionPane.showMessageDialog(this, "Usuario Creado");
        
        
        EnviarCorreo e = new EnviarCorreo();

        
        e.enviarMensaje(txtCorreo.getText());
        
        Login v = new Login();
        v.setVisible(true);
        this.dispose();
            
            
    }//GEN-LAST:event_btnCrearMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
       Login v = new Login();
       v.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void RadioB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioB2ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioB1;
    private javax.swing.JRadioButton RadioB2;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnCrear;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
