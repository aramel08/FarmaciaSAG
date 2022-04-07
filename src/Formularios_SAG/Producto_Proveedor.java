/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios_SAG;

import Conexion.Conexion;
import static Formularios_SAG.Proveedores.Id_Proveedor;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carba
 */
public class Producto_Proveedor extends javax.swing.JFrame {

    /**
     * Creates new form Producto_Proveedor
     */
    public Producto_Proveedor() {
        initComponents();
        CargarP PP = new Producto_Proveedor.CargarP();
        ComboIdProductoPP.setModel(PP.getvalues());
        CargarPro Pro = new Producto_Proveedor.CargarPro();
        ComboIdProveedorPP.setModel(Pro.getvalues());
        cargartabla();
        Inhabillitar();
        
       
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("componentes/LOGOSAG(2).png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPP = new javax.swing.ButtonGroup();
        BotonRegresarPP = new javax.swing.JLabel();
        BotonAgregarPP = new javax.swing.JLabel();
        BotonEditarPP = new javax.swing.JLabel();
        BotonGuardarPP = new javax.swing.JLabel();
        BotonCancelarPP = new javax.swing.JLabel();
        txtBuscarPP = new javax.swing.JTextField();
        ComboIdProductoPP = new javax.swing.JComboBox<>();
        ComboIdProveedorPP = new javax.swing.JComboBox<>();
        txtProducto = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JLabel();
        txtProductoPro = new javax.swing.JLabel();
        BotonActivoPP = new javax.swing.JRadioButton();
        BotonInactivoPP = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductoProveedor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonRegresarPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarPPMouseClicked(evt);
            }
        });
        getContentPane().add(BotonRegresarPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, 30));

        BotonAgregarPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAgregarPPMouseClicked(evt);
            }
        });
        getContentPane().add(BotonAgregarPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 120, 30));

        BotonEditarPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEditarPPMouseClicked(evt);
            }
        });
        getContentPane().add(BotonEditarPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 120, 30));

        BotonGuardarPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardarPPMouseClicked(evt);
            }
        });
        getContentPane().add(BotonGuardarPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 120, 40));

        BotonCancelarPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCancelarPPMouseClicked(evt);
            }
        });
        getContentPane().add(BotonCancelarPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 130, 40));

        txtBuscarPP.setBackground(new java.awt.Color(240, 240, 240));
        txtBuscarPP.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtBuscarPP.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscarPP.setText("Buscar Por Producto o Proveedor");
        txtBuscarPP.setBorder(null);
        txtBuscarPP.setOpaque(false);
        txtBuscarPP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarPPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarPPFocusLost(evt);
            }
        });
        txtBuscarPP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarPPKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscarPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 205, 235, 28));

        ComboIdProductoPP.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        ComboIdProductoPP.setForeground(new java.awt.Color(153, 153, 153));
        ComboIdProductoPP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione ID Producto" }));
        ComboIdProductoPP.setBorder(null);
        ComboIdProductoPP.setOpaque(false);
        ComboIdProductoPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboIdProductoPPMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ComboIdProductoPPMousePressed(evt);
            }
        });
        getContentPane().add(ComboIdProductoPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 316, 190, 28));

        ComboIdProveedorPP.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        ComboIdProveedorPP.setForeground(new java.awt.Color(153, 153, 153));
        ComboIdProveedorPP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione ID Proveedor" }));
        ComboIdProveedorPP.setOpaque(false);
        ComboIdProveedorPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ComboIdProveedorPPMousePressed(evt);
            }
        });
        ComboIdProveedorPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboIdProveedorPPActionPerformed(evt);
            }
        });
        getContentPane().add(ComboIdProveedorPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 405, 190, 28));
        getContentPane().add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 70, 20));
        getContentPane().add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 80, 20));
        getContentPane().add(txtProductoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 70, 20));

        buttonGroupPP.add(BotonActivoPP);
        BotonActivoPP.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        BotonActivoPP.setForeground(new java.awt.Color(255, 255, 255));
        BotonActivoPP.setText("Activo");
        BotonActivoPP.setOpaque(false);
        BotonActivoPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActivoPPActionPerformed(evt);
            }
        });
        getContentPane().add(BotonActivoPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        buttonGroupPP.add(BotonInactivoPP);
        BotonInactivoPP.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        BotonInactivoPP.setForeground(new java.awt.Color(255, 255, 255));
        BotonInactivoPP.setText("Inactivo");
        BotonInactivoPP.setOpaque(false);
        BotonInactivoPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInactivoPPActionPerformed(evt);
            }
        });
        getContentPane().add(BotonInactivoPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        TablaProductoProveedor.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        TablaProductoProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Producto-Proveedor", "Producto", " Proveedor", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaProductoProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductoProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProductoProveedor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 530, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/Pantalla Producto Proveedor.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonActivoPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActivoPPActionPerformed
        int IdPP = Integer.parseInt(txtProductoPro.getText());
        
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Update Producto_Proveedor set Id_Estado=? Where Id_Producto_Proveedor=?");
            ps.setInt(1,1);
            ps.setInt(2, IdPP);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Habilitado");
            cargartabla();
            BotonActivoPP.setVisible(Boolean.FALSE);
            BotonInactivoPP.setVisible(Boolean.FALSE);
            Limpiar();
            Inhabillitar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_BotonActivoPPActionPerformed

    private void BotonInactivoPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInactivoPPActionPerformed
       int IdPP = Integer.parseInt(txtProductoPro.getText());
        
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Update Producto_Proveedor set Id_Estado=? Where Id_Producto_Proveedor=?");
            ps.setInt(1, 2);
            ps.setInt(2, IdPP);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Inhabilitado");
            cargartabla();
            BotonActivoPP.setVisible(Boolean.FALSE);
            BotonInactivoPP.setVisible(Boolean.FALSE);
            Limpiar();
            Inhabillitar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_BotonInactivoPPActionPerformed

    private void ComboIdProveedorPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboIdProveedorPPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboIdProveedorPPActionPerformed

    private void BotonRegresarPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarPPMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_BotonRegresarPPMouseClicked

    private void BotonAgregarPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAgregarPPMouseClicked
       Habilitar ();
       
    }//GEN-LAST:event_BotonAgregarPPMouseClicked

    private void BotonGuardarPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarPPMouseClicked
         ObtenerIDPro();
         ObtenerIDProduct();
        if ( ComboIdProductoPP.equals("Seleccione Producto...") || ComboIdProveedorPP.equals("Seleccione Proveedor...")) {
            JOptionPane.showMessageDialog(null, "No se puede Guardar datos vacios");
        } else {
            int Producto = Integer.parseInt(txtProducto.getText());
            int Proveedor = Integer.parseInt(txtProveedor.getText());

            try {
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Insert into Producto_Proveedor (Id_Producto, Id_Proveedor,Id_Estado) VALUES(?,?,?)");
                ps.setInt(1, Producto);
                ps.setInt(2, Proveedor);
                ps.setInt(3, 1);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Registro guardado");
                cargartabla();
                
                //Limpiar();
                Inhabillitar();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }//GEN-LAST:event_BotonGuardarPPMouseClicked

    private void BotonEditarPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarPPMouseClicked
        ObtenerIDPro();
         ObtenerIDProduct();
        if ( ComboIdProductoPP.equals("Seleccione Producto...") || ComboIdProveedorPP.equals("Seleccione Proveedor...")) {
            JOptionPane.showMessageDialog(null, "No se puede Guardar datos vacios");
        } else {
            int Producto = Integer.parseInt(txtProducto.getText());
            int Proveedor = Integer.parseInt(txtProveedor.getText());
            int Produ_Prov = Integer.parseInt(txtProductoPro.getText());
             
        try {
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement ("Update Producto_Proveedor set  Id_Producto=?,Id_Proveedor=? Where Id_Producto_Proveedor=?");
                ps.setInt(1, Producto);
                ps.setInt(2, Proveedor);
                ps.setInt(3,Produ_Prov);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Registro Actualizado");
                cargartabla();
                
                //Limpiar();
                Inhabillitar();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        
        
        } 
    }//GEN-LAST:event_BotonEditarPPMouseClicked

    private void TablaProductoProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductoProveedorMouseClicked
       
        try {
            int fila = TablaProductoProveedor.getSelectedRow();
            int id = Integer.parseInt(TablaProductoProveedor.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select PP.Id_Producto_Proveedor, PV.Nombre_Empresa, PR.Nombre_Producto, E.Estado\n"
                    + "From Producto_Proveedor as PP\n"
                    + "INNER JOIN Productos AS PR ON PP.Id_Producto = PR.Id_Producto\n"
                    + "INNER JOIN Proveedor AS PV ON PP.Id_Proveedor = PV.Id_Proveedor\n"
                    + "INNER JOIN Estado AS E ON PP.Id_Estado = E.Id_Estado\n"
                    + "where PP.Id_Producto_Proveedor=?\n"
                    + "Order By PP.Id_Producto_Proveedor");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtProductoPro.setText(String.valueOf(id));
                ComboIdProductoPP.setSelectedItem(rs.getString("Nombre_Producto"));
                ComboIdProveedorPP.setSelectedItem(rs.getString("Nombre_Empresa"));
               
                
                
               
                //if (rs.getString("Id_Estado").equals("1")) {
                   // BotonActivoPro.setSelected(true);
                //} else if (rs.getString("Id_Estado").equals("2")) {
                   // BotonInactivoPro.setSelected(true);
               
            
            //}
           

            //BotonActivoPro.setVisible(Boolean.TRUE);
            //BotonInactivoPro.setVisible(Boolean.TRUE);
            //id = txtId_Proveedor.getText();
            Habilitar();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_TablaProductoProveedorMouseClicked

    private void txtBuscarPPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPPKeyTyped
        buscarData(txtBuscarPP.getText());
        validarNumerosLetras(evt);
        if (txtBuscarPP.getText().length() > 15) {
            JOptionPane.showMessageDialog(null, "Alcanzaste el máximo de caracteres para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (txtBuscarPP.getText().length() > 0) {
            if (!txtBuscarPP.getText().matches("^(?!.*([A-Za-zñÑáéíóúÁÉÍÓÚ\\s])\\1{2})[A-Za-zñÑáéíóúÁÉÍÓÚ\\s0-9]+$")) {
                JOptionPane.showMessageDialog(null, "No repitas caracteres de forma incorrecta", "Advertencia", JOptionPane.WARNING_MESSAGE);
                evt.consume();
                
                
            }
        }
    }//GEN-LAST:event_txtBuscarPPKeyTyped

    private void BotonCancelarPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCancelarPPMouseClicked
        Limpiar();
        Inhabillitar();
        BotonEditarPP.setEnabled(Boolean.FALSE);
        BotonGuardarPP.setEnabled(Boolean.FALSE);
    }//GEN-LAST:event_BotonCancelarPPMouseClicked

    private void txtBuscarPPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarPPFocusGained
        if (txtBuscarPP.getText().equals("Buscar Por Producto o Proveedor")) {
            txtBuscarPP.setText("");
            txtBuscarPP.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtBuscarPPFocusGained

    private void txtBuscarPPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarPPFocusLost
         if (txtBuscarPP.getText().equals("")) {
            txtBuscarPP.setText("Buscar Por Producto o Proveedor");
            txtBuscarPP.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtBuscarPPFocusLost

    private void ComboIdProductoPPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboIdProductoPPMousePressed
        if (ComboIdProductoPP.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_ComboIdProductoPPMousePressed

    private void ComboIdProveedorPPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboIdProveedorPPMousePressed
         if (ComboIdProveedorPP.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_ComboIdProveedorPPMousePressed

    private void ComboIdProductoPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboIdProductoPPMouseClicked
         if (ComboIdProductoPP.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_ComboIdProductoPPMouseClicked
 
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
            java.util.logging.Logger.getLogger(Producto_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto_Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BotonActivoPP;
    private javax.swing.JLabel BotonAgregarPP;
    private javax.swing.JLabel BotonCancelarPP;
    private javax.swing.JLabel BotonEditarPP;
    private javax.swing.JLabel BotonGuardarPP;
    private javax.swing.JRadioButton BotonInactivoPP;
    private javax.swing.JLabel BotonRegresarPP;
    private javax.swing.JComboBox<String> ComboIdProductoPP;
    private javax.swing.JComboBox<String> ComboIdProveedorPP;
    private javax.swing.JTable TablaProductoProveedor;
    private javax.swing.ButtonGroup buttonGroupPP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscarPP;
    private javax.swing.JLabel txtProducto;
    private javax.swing.JLabel txtProductoPro;
    private javax.swing.JLabel txtProveedor;
    // End of variables declaration//GEN-END:variables

    private void Habilitar() {
        ComboIdProductoPP.enable(Boolean.TRUE);
        ComboIdProveedorPP.enable(Boolean.TRUE);
    }

    private void cargartabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaProductoProveedor.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select PP.Id_Producto_Proveedor, PV.Nombre_Empresa, PR.Nombre_Producto, E.Estado\n"
                    + "From Producto_Proveedor as PP\n"
                    + "INNER JOIN Productos AS PR ON PP.Id_Producto = PR.Id_Producto\n"
                    + "INNER JOIN Proveedor AS PV ON PP.Id_Proveedor = PV.Id_Proveedor\n"
                    + "INNER JOIN Estado AS E ON PP.Id_Estado = E.Id_Estado\n"
                    + "Order By PP.Id_Producto_Proveedor");
            
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    private void Inhabillitar() {
       ComboIdProductoPP.enable(Boolean.FALSE);
       ComboIdProveedorPP.enable(Boolean.FALSE);
    }

    private void validarNumerosLetras(KeyEvent e) {
        if (e.getKeyChar() >= 33 && e.getKeyChar() <= 47
                || e.getKeyChar() >= 58 && e.getKeyChar() <= 64
                || e.getKeyChar() >= 91 && e.getKeyChar() <= 96
                || e.getKeyChar() >= 123 && e.getKeyChar() <= 129
                || e.getKeyChar() >= 145 && e.getKeyChar() <= 159
                || e.getKeyChar() >= 164 && e.getKeyChar() <= 238) {

            e.consume();
            JOptionPane.showMessageDialog(null, "Este campo no acepta caracteres especiales", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void Limpiar() {
        ComboIdProductoPP.setSelectedIndex(0);
        ComboIdProveedorPP.setSelectedIndex(0);
    }
     public class CargarP {

        public DefaultComboBoxModel getvalues() {

            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            try {
                Connection con = Conexion.getConexion();
                String sql = "select Nombre_Producto from Productos";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                modelo.addElement("Seleccione Producto...");
                while (rs.next()) {
                    modelo.addElement(rs.getString(1));
                }
                con.close();
                rs.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            return modelo;
        }
     }
        public class CargarPro {

        public DefaultComboBoxModel getvalues() {

            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            try {
                Connection con = Conexion.getConexion();
                String sql = "select Nombre_Empresa from Proveedor";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                modelo.addElement("Seleccione Proveedor...");
                while (rs.next()) {
                    modelo.addElement(rs.getString(1));
                }
                con.close();
                rs.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            return modelo;
         } 
        } 
        public void ObtenerIDPro(){
        String Nombre=ComboIdProveedorPP.getSelectedItem().toString();
        try {
                ResultSet rs;
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Select Id_Proveedor From Proveedor Where Nombre_Empresa=?");
                ps.setString(1, Nombre);
                rs = ps.executeQuery();
                
               while (rs.next()) {
                txtProveedor.setText(rs.getString("Id_Proveedor"));
               }
                

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            } }
        
        
        public void ObtenerIDProduct(){
        String Nombre=ComboIdProductoPP.getSelectedItem().toString();
        try {
                ResultSet rs;
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Select Id_Producto From Productos Where Nombre_Producto=?");
                ps.setString(1, Nombre);
                rs = ps.executeQuery();
                
               while (rs.next()) {
                txtProducto.setText(rs.getString("Id_Producto"));
               }
                

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
    }
        void buscarData(String valor) {
        String[] titulos = {"ID-Producto-Proveedor", "Producto", "Proveedor","Estado"};
        String[] registros = new String[13];
        String sql = "Select PP.Id_Producto_Proveedor, PV.Nombre_Empresa, PR.Nombre_Producto, E.Estado \n"
                    + "From Producto_Proveedor as PP\n"
                    + "INNER JOIN Productos AS PR ON PP.Id_Producto = PR.Id_Producto\n"
                    + "INNER JOIN Proveedor AS PV ON PP.Id_Proveedor = PV.Id_Proveedor\n"
                    + "INNER JOIN Estado AS E ON PP.Id_Estado = E.Id_Estado\n"
                    + "WHERE CONCAT (PV.Nombre_Empresa, ' ', PR.Nombre_Producto) LIKE '%" + valor + "%'\n"
                    + "ORDER BY PP.Id_Producto_Proveedor";
            
                

        DefaultTableModel model = new DefaultTableModel(null, titulos);
        Connection con = Conexion.getConexion();

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("Id_Producto_Proveedor");
                registros[1] = rs.getString("Nombre_Empresa");
                registros[2] = rs.getString("Nombre_Producto");
                registros[3] = rs.getString("Estado");
                model.addRow(registros);
            }

            TablaProductoProveedor.setModel(model);
            // anchoColumnas();
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     }
}

