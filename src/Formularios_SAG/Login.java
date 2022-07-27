package Formularios_SAG;

import Conexion.Conexion;
import Logs.log;
import encriptacion.Encode;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Allisson Castro
 */
public class Login extends javax.swing.JFrame {

    log lo = new log();
    String login = "Login";

    public Login() {
        initComponents();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("componentes/LOGOSAG(2).png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonInicio = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        cover = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonInicioMouseClicked(evt);
            }
        });
        getContentPane().add(botonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 490, 265, 65));

        txtUsuario.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setBorder(null);
        txtUsuario.setOpaque(false);
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 195, 330, 70));

        txtContrasena.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        txtContrasena.setBorder(null);
        txtContrasena.setOpaque(false);
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyTyped(evt);
            }
        });
        getContentPane().add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 325, 330, 70));

        cover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/Login.jpeg"))); // NOI18N
        cover.setMaximumSize(new java.awt.Dimension(1300, 600));
        cover.setPreferredSize(new java.awt.Dimension(1300, 600));
        getContentPane().add(cover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    public static String usuario;
    public boolean resultado = false;

    public boolean validarAdministradores() {
        Conexion cc = new Conexion();
        Connection cn = cc.getConexion();
        Encode encode = new Encode();
        String secretKey = "farmaciaSAG";
        String admin = txtUsuario.getText();
        String pass = String.valueOf(txtContrasena.getPassword());
        String sql = "SELECT * FROM Usuario WHERE Nombre = '" + admin + "'";
        String validar = "Validar";

        if (txtUsuario.getText().isEmpty() && txtContrasena.getText().isEmpty() || txtUsuario.getText().isEmpty() || txtContrasena.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes escribir un usuario y una contraseña", "Advertencia", JOptionPane.WARNING_MESSAGE);

        } else {
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);

                if (rs.next()) {
                    usuario = rs.getString("Nombre");
                    int intentos = Integer.parseInt(rs.getString("Intentos"));
                    if (rs.getString("Intentos").equals("0")) {
                        JOptionPane.showMessageDialog(null, "Usuario inactivo, comuniquese con el administrador del sistema para restablecer su usuario", "Acceso denegado", JOptionPane.ERROR_MESSAGE);
                        txtContrasena.setText("");

                    } else if (encode.deecnode(secretKey, rs.getString("Contraseña")).equals(pass)) {
                        resultado = true;
                        MenuPrincipal ad = new MenuPrincipal();
                        ad.setVisible(true);
                        this.dispose();
                        try {
                            String sqlRestar = "UPDATE Usuario SET Intentos = ? WHERE Usuario.Nombre = ? ";
                            PreparedStatement pst = (PreparedStatement) cn.prepareStatement(sqlRestar);
                            pst.setString(1, String.valueOf("3"));
                            pst.setString(2, admin);
                            pst.execute();

                        } catch (Exception e) {
                            lo.LogBitacora("Error: No se pudieron actualizar los intentos. " + "Excepción: " + e + ". Origen: " + this.getClass().getSimpleName(), login, validar);
                            System.out.println(e.getMessage());
                        }
                    } else {
                        --intentos;
                        if (intentos == 0) {
                            JOptionPane.showMessageDialog(null, "Ha excedido el número de intentos para ingresar \n" + "Su usuario ha sido deshabilitado", "Acceso denegado", JOptionPane.ERROR_MESSAGE);
                            txtUsuario.setText("");
                            txtContrasena.setText("");
                            try {
                                String sqlEstado = "UPDATE Usuario SET Intentos = ? WHERE Usuario.Nombre = ? ";
                                PreparedStatement pst = (PreparedStatement) cn.prepareStatement(sqlEstado);
                                pst.setString(1, String.valueOf(intentos));
                                pst.setString(2, admin);
                                pst.execute();

                            } catch (Exception e) {
                                lo.LogBitacora("No se pudieron restar los intentos " + e.getMessage(), login, validar);
                                System.out.println(e.getMessage());
                            }
                        } else {
                            try {
                                String sqlEstado = "UPDATE Usuario SET Intentos = ? WHERE Usuario.Nombre = ? ";
                                PreparedStatement pst = (PreparedStatement) cn.prepareStatement(sqlEstado);
                                pst.setString(1, String.valueOf(intentos));
                                pst.setString(2, admin);
                                pst.execute();

                            } catch (Exception e) {
                                lo.LogBitacora("Usuario o clave incorrecta  " + e +
                                " . Origen: " + this.getClass().getSimpleName(), login, validar);
                                System.out.println(e.getMessage());
                            }
                            JOptionPane.showMessageDialog(null, "Usuario o clave incorrecta, te quedan " + intentos + " intentos", "Advertencia", JOptionPane.WARNING_MESSAGE);
                            txtContrasena.setText("");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Asegurate de usar un usuario y una contraseña correctos", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
                lo.LogBitacora("Error: No se pudo establecer la conexión con la base de datos. " + "Excepción: " + e, login, validar);
                System.out.println(e.getMessage());
                txtUsuario.setText("");
                txtContrasena.setText("");
            }
        }
        return resultado;
    }

    private void botonInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioMouseClicked
        validarAdministradores();
        /*MenuPrincipal ad = new MenuPrincipal();
        ad.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_botonInicioMouseClicked

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained

    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost

    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaKeyTyped

    private void txtContrasenaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            validarAdministradores();
        }
    }//GEN-LAST:event_txtContrasenaKeyReleased

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });

    }
  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonInicio;
    private javax.swing.JLabel cover;
    public static javax.swing.JPasswordField txtContrasena;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
