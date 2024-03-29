/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios_SAG;

import Conexion.Conexion;
import Logs.log;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Allisson Castro
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Principal
     */
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("componentes/LOGOSAG(2).png"));
        return retValue;
    }
    int npermiso;

    public MenuPrincipal() {
        initComponents();
        usuario.setText(Login.txtUsuario.getText());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonSalir = new javax.swing.JLabel();
        BotonInventario = new javax.swing.JLabel();
        BotonFactura = new javax.swing.JLabel();
        BotonCompras = new javax.swing.JLabel();
        BotonAlmacen = new javax.swing.JLabel();
        BotonSucursal = new javax.swing.JLabel();
        BotonMedicamentos = new javax.swing.JLabel();
        BotonProveedores = new javax.swing.JLabel();
        BotonEmpleado = new javax.swing.JLabel();
        BotonCliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSalirMouseClicked(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 110, 50));

        BotonInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonInventarioMouseClicked(evt);
            }
        });
        getContentPane().add(BotonInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 530, 160, 100));

        BotonFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonFacturaMouseClicked(evt);
            }
        });
        getContentPane().add(BotonFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 526, 160, 100));

        BotonCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonComprasMouseClicked(evt);
            }
        });
        getContentPane().add(BotonCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 526, 160, 100));

        BotonAlmacen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAlmacenMouseClicked(evt);
            }
        });
        getContentPane().add(BotonAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 350, 160, 100));

        BotonSucursal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonSucursal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSucursalMouseClicked(evt);
            }
        });
        getContentPane().add(BotonSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 160, 100));

        BotonMedicamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMedicamentosMouseClicked(evt);
            }
        });
        getContentPane().add(BotonMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 346, 160, 100));

        BotonProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonProveedoresMouseClicked(evt);
            }
        });
        getContentPane().add(BotonProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 176, 150, 100));

        BotonEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEmpleadoMouseClicked(evt);
            }
        });
        getContentPane().add(BotonEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 160, 100));

        BotonCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonClienteMouseClicked(evt);
            }
        });
        getContentPane().add(BotonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 150, 100));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 700, 70, -1));

        usuario.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 680, 230, 20));

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/Menu_2.png"))); // NOI18N
        Menu.setText("jLabel2");
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonClienteMouseClicked

        if (habilitarroles(1) == 1) {
            Clientes CL = new Clientes();
            {
                CL.setVisible(true);
                dispose();

            }
        } else {
            JOptionPane.showMessageDialog(null, "Este usuario No tiene Acceso a esta pantalla", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BotonClienteMouseClicked

    private void BotonEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEmpleadoMouseClicked
        if (habilitarroles(2) == 2) {
            Empleados1 EM = new Empleados1();
            {
                EM.setVisible(true);
                dispose();

            }
        } else {
            JOptionPane.showMessageDialog(null, "Este usuario No tiene Acceso a esta pantalla", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_BotonEmpleadoMouseClicked

    private void BotonProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonProveedoresMouseClicked
        if (habilitarroles(3) == 3) {
            Proveedores PR = new Proveedores();
            {
                PR.setVisible(true);
                dispose();

            }
        } else {
            JOptionPane.showMessageDialog(null, "Este usuario No tiene Acceso a esta pantalla", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_BotonProveedoresMouseClicked

    private void BotonMedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMedicamentosMouseClicked
        if (habilitarroles(4) == 4) {
            Productos P = new Productos();
            {
                P.setVisible(true);
                dispose();

            }

        } else {
            JOptionPane.showMessageDialog(null, "Este usuario No tiene Acceso a esta pantalla", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_BotonMedicamentosMouseClicked

    private void BotonSucursalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSucursalMouseClicked
        if (habilitarroles(5) == 5) {
            Sucursales SC = new Sucursales();
            {
                SC.setVisible(true);
                dispose();

            }

        } else {
            JOptionPane.showMessageDialog(null, "Este usuario No tiene Acceso a esta pantalla", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_BotonSucursalMouseClicked

    private void BotonAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAlmacenMouseClicked
        if (habilitarroles(6) == 6) {
            Almacen OP = new Almacen();
            {
                OP.setVisible(true);
                dispose();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Este usuario No tiene Acceso a esta pantalla", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_BotonAlmacenMouseClicked

    private void BotonComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonComprasMouseClicked
        if (habilitarroles(7) == 7) {
            RegistroCompras PC = new RegistroCompras();
            {
                PC.setVisible(true);
                dispose();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Este usuario No tiene Acceso a esta pantalla", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }


    }//GEN-LAST:event_BotonComprasMouseClicked

    private void BotonFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonFacturaMouseClicked
        if (habilitarroles(8) == 8) {
            RegistroVentas F = new RegistroVentas();
            {
                F.setVisible(true);
                dispose();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Este usuario No tiene Acceso a esta pantalla", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }


    }//GEN-LAST:event_BotonFacturaMouseClicked

    private void BotonInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInventarioMouseClicked
        if (habilitarroles(20) == 20) {
            Inventario I = new Inventario();
            {
                I.setVisible(true);
                dispose();
                 }
            }else {
            JOptionPane.showMessageDialog(null, "Este usuario No tiene Acceso a esta pantalla", "Advertencia", JOptionPane.WARNING_MESSAGE);

              }

    }//GEN-LAST:event_BotonInventarioMouseClicked

    private void BotonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BotonSalirMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonAlmacen;
    private javax.swing.JLabel BotonCliente;
    private javax.swing.JLabel BotonCompras;
    private javax.swing.JLabel BotonEmpleado;
    private javax.swing.JLabel BotonFactura;
    private javax.swing.JLabel BotonInventario;
    private javax.swing.JLabel BotonMedicamentos;
    private javax.swing.JLabel BotonProveedores;
    private javax.swing.JLabel BotonSalir;
    private javax.swing.JLabel BotonSucursal;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

    public int habilitarroles(int numeroPermiso) {
        try {

            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select PU.IdPermiso\n"
                    + "From PermisosUsuario AS PU\n"
                    + "Inner Join Usuario as U on PU.IdUsuario=U.Id_Usuario\n"
                    + "where PU.IdPermiso=? and U.Nombre=?");
            ps.setInt(1, numeroPermiso);
            ps.setString(2, usuario.getText());
            rs = ps.executeQuery();
            System.out.println(usuario.getText());

            while (rs.next()) {
                npermiso = rs.getInt("IdPermiso");

            }
        } catch (SQLException ex) {
            //lo.LogBitacora("Error: No se pudo seleccionar la tabla" + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), proveedores, tablap);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return npermiso;

    }

}
