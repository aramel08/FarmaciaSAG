/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios_SAG;

import Conexion.Conexion;
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
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author carba
 */
public class DetalleAlmacen extends javax.swing.JFrame {

    /**
     * Creates new form DetalleAlmacen
     */
    public DetalleAlmacen() {
        initComponents();
        cargartabla();
        Inhabillitar();
        DetalleAlmacen.CargarAlmacen A = new DetalleAlmacen.CargarAlmacen();
        comboAlmacen.setModel(A.getvalues());
        DetalleAlmacen.CargarProducto p = new DetalleAlmacen.CargarProducto();
        comboProducto.setModel(p.getvalues());
         AutoCompleteDecorator.decorate(comboAlmacen);
             AutoCompleteDecorator.decorate(comboProducto);
       

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("componentes/LOGOSAG(2).png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonRegresarDA = new javax.swing.JLabel();
        botonAgregarDA = new javax.swing.JLabel();
        botonEditarDA = new javax.swing.JLabel();
        botonGuardarDA = new javax.swing.JLabel();
        botonCancelarDA = new javax.swing.JLabel();
        comboAlmacen = new javax.swing.JComboBox<>();
        comboProducto = new javax.swing.JComboBox<>();
        txtCapacidadDA = new javax.swing.JTextField();
        txtDescripcionDA = new javax.swing.JTextField();
        txtBuscarDetalle = new javax.swing.JTextField();
        txtIdDetalleAL = new javax.swing.JLabel();
        txtIdAlmacen = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalleAlmacen = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonRegresarDA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresarDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarDAMouseClicked(evt);
            }
        });
        getContentPane().add(botonRegresarDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, 30));

        botonAgregarDA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarDAMouseClicked(evt);
            }
        });
        getContentPane().add(botonAgregarDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 120, 40));

        botonEditarDA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEditarDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEditarDAMouseClicked(evt);
            }
        });
        getContentPane().add(botonEditarDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 110, 40));

        botonGuardarDA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardarDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGuardarDAMouseClicked(evt);
            }
        });
        getContentPane().add(botonGuardarDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 110, 30));

        botonCancelarDA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCancelarDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCancelarDAMouseClicked(evt);
            }
        });
        getContentPane().add(botonCancelarDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 120, 30));

        comboAlmacen.setBackground(new java.awt.Color(240, 240, 240));
        comboAlmacen.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        comboAlmacen.setForeground(new java.awt.Color(153, 153, 153));
        comboAlmacen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Almacén" }));
        comboAlmacen.setBorder(null);
        comboAlmacen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboAlmacen.setOpaque(false);
        comboAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboAlmacenMousePressed(evt);
            }
        });
        getContentPane().add(comboAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 329, 177, 28));

        comboProducto.setBackground(new java.awt.Color(240, 240, 240));
        comboProducto.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        comboProducto.setForeground(new java.awt.Color(153, 153, 153));
        comboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Producto" }));
        comboProducto.setBorder(null);
        comboProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboProducto.setOpaque(false);
        comboProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboProductoMousePressed(evt);
            }
        });
        getContentPane().add(comboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 177, 28));

        txtCapacidadDA.setBackground(new java.awt.Color(240, 240, 240));
        txtCapacidadDA.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtCapacidadDA.setForeground(new java.awt.Color(153, 153, 153));
        txtCapacidadDA.setText("Ingrese Capacidad");
        txtCapacidadDA.setBorder(null);
        txtCapacidadDA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCapacidadDA.setOpaque(false);
        txtCapacidadDA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCapacidadDAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCapacidadDAFocusLost(evt);
            }
        });
        txtCapacidadDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCapacidadDAMousePressed(evt);
            }
        });
        txtCapacidadDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadDAActionPerformed(evt);
            }
        });
        txtCapacidadDA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacidadDAKeyTyped(evt);
            }
        });
        getContentPane().add(txtCapacidadDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 452, 178, 28));

        txtDescripcionDA.setBackground(new java.awt.Color(240, 240, 240));
        txtDescripcionDA.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtDescripcionDA.setForeground(new java.awt.Color(153, 153, 153));
        txtDescripcionDA.setText("Ingrese Descripción");
        txtDescripcionDA.setBorder(null);
        txtDescripcionDA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtDescripcionDA.setOpaque(false);
        txtDescripcionDA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescripcionDAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescripcionDAFocusLost(evt);
            }
        });
        txtDescripcionDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescripcionDAMousePressed(evt);
            }
        });
        txtDescripcionDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionDAActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescripcionDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 515, 178, 28));

        txtBuscarDetalle.setBackground(new java.awt.Color(240, 240, 240));
        txtBuscarDetalle.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtBuscarDetalle.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscarDetalle.setText("Buscar Por Almacén o Producto");
        txtBuscarDetalle.setBorder(null);
        txtBuscarDetalle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtBuscarDetalle.setOpaque(false);
        txtBuscarDetalle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarDetalleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarDetalleFocusLost(evt);
            }
        });
        txtBuscarDetalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarDetalleKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscarDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 215, 222, 28));
        getContentPane().add(txtIdDetalleAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 40, 20));
        getContentPane().add(txtIdAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 40, 20));
        getContentPane().add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 40, 20));

        TablaDetalleAlmacen.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        TablaDetalleAlmacen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Almacén", "Producto", "Capacidad", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDetalleAlmacen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablaDetalleAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDetalleAlmacenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDetalleAlmacen);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 480, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/Pantalla Detalle Almacen.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescripcionDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionDAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionDAActionPerformed

    private void txtCapacidadDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadDAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadDAActionPerformed

    private void botonRegresarDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarDAMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Almacen().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_botonRegresarDAMouseClicked

    private void botonAgregarDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarDAMouseClicked
        Habilitar();
        botonGuardarDA.isEnabled();
        botonCancelarDA.isEnabled();
    }//GEN-LAST:event_botonAgregarDAMouseClicked

    private void botonEditarDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarDAMouseClicked
        ObtenerIDAlmacen();
        ObtenerIDProducto();
        if (comboAlmacen.equals("Seleccione Almacen") || comboProducto.equals("Seleccione Producto") || txtCapacidadDA.getText().equals("Ingrese Capacidad") || txtDescripcionDA.getText().equals("Ingrese Descripción")) {
            JOptionPane.showMessageDialog(null, "No se puede Guardar datos vacios");
        } else {
            int Id = Integer.parseInt(txtIdDetalleAL.getText());
            int Almacen = Integer.parseInt(txtIdAlmacen.getText());
            int Producto = Integer.parseInt(txtIdProducto.getText());
            String Capacidad = txtCapacidadDA.getText();
            String Descripcion = txtDescripcionDA.getText();

            try {
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Update Detalle_Almacen set Id_Almacen=?, Id_Producto=?,Capacidad=?,Descripcion=? Where Id_Detalle_Almacen=?");
                ps.setInt(1, Almacen);
                ps.setInt(2, Producto);
                ps.setString(3, Capacidad);
                ps.setString(4, Descripcion);
                ps.setInt(5, Id);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Actualizado");

                cargartabla();
                Limpiar();
                Inhabillitar();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }

    }//GEN-LAST:event_botonEditarDAMouseClicked

    private void botonGuardarDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarDAMouseClicked
        ObtenerIDAlmacen();
        ObtenerIDProducto();
        if (comboAlmacen.getSelectedIndex() == 0 && comboProducto.getSelectedIndex() == 0 && txtCapacidadDA.getText().equals("Ingrese Capacidad") && txtDescripcionDA.getText().equals("Ingrese Descripción")) {
            JOptionPane.showMessageDialog(null, "No se puede Guardar datos vacios");
        } else {
            int Almacen = Integer.parseInt(txtIdAlmacen.getText());
            int Productos = Integer.parseInt(txtIdProducto.getText());
            String Capacidad = txtCapacidadDA.getText();
            String Descripcion = txtDescripcionDA.getText();

            try {
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Insert into Detalle_Almacen ( Id_Almacen,Id_Producto,Capacidad,Descripcion) VALUES(?,?,?,?)");
                ps.setInt(1, Almacen);
                ps.setInt(2, Productos);
                ps.setString(3, Capacidad);
                ps.setString(4, Descripcion);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Registro guardado");
                cargartabla();

                //Limpiar();
                Inhabillitar();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }//GEN-LAST:event_botonGuardarDAMouseClicked

    private void TablaDetalleAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDetalleAlmacenMouseClicked
        try {
            int fila = TablaDetalleAlmacen.getSelectedRow();
            int id = Integer.parseInt(TablaDetalleAlmacen.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select DA.Id_Detalle_Almacen,Al.Ubicacion,P.Nombre_Producto,DA.Capacidad,DA.Descripcion\n"
                    + "From Detalle_Almacen as DA\n"
                    + "INNER JOIN Almacen AS AL ON AL.Id_Almacen =DA.Id_Almacen\n"
                    + "INNER JOIN Productos AS P ON DA.Id_Producto = P.Id_Producto\n"
                    + "where DA.Id_Detalle_Almacen=?\n"
                    + "Order By DA.Id_Detalle_Almacen");

            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtIdDetalleAL.setText(String.valueOf(id));
                comboAlmacen.setSelectedItem(rs.getString("Ubicacion"));
                comboProducto.setSelectedItem(rs.getString("Nombre_Producto"));
                txtCapacidadDA.setText(rs.getString("Capacidad"));
                txtDescripcionDA.setText(rs.getString("Descripcion"));

                Habilitar();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_TablaDetalleAlmacenMouseClicked

    private void botonCancelarDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarDAMouseClicked
        Limpiar();
        Inhabillitar();
        botonEditarDA.setEnabled(Boolean.FALSE);
        botonGuardarDA.setEnabled(Boolean.FALSE);

    }//GEN-LAST:event_botonCancelarDAMouseClicked

    private void txtBuscarDetalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDetalleKeyTyped
         buscarData(txtBuscarDetalle.getText());
        validarNumerosLetras(evt);
        if (txtBuscarDetalle.getText().length() > 15) {
           JOptionPane.showMessageDialog(null, "Alcanzaste el máximo de caracteres para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (txtBuscarDetalle.getText().length() > 0) {
            if (!txtBuscarDetalle.getText().matches("^(?!.*([A-Za-zñÑáéíóúÁÉÍÓÚ\\s])\\1{2})[A-Za-zñÑáéíóúÁÉÍÓÚ\\s0-9]+$")) {
                JOptionPane.showMessageDialog(null, "No repitas caracteres de forma incorrecta", "Advertencia", JOptionPane.WARNING_MESSAGE);
                evt.consume();
                
                
            }
        }
    }//GEN-LAST:event_txtBuscarDetalleKeyTyped

    private void comboAlmacenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboAlmacenMousePressed
        if (comboAlmacen.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_comboAlmacenMousePressed

    private void txtCapacidadDAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCapacidadDAMousePressed
        if (txtCapacidadDA.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtCapacidadDAMousePressed

    private void comboProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboProductoMousePressed
        if (comboProducto.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_comboProductoMousePressed

    private void txtDescripcionDAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionDAMousePressed
        if (txtDescripcionDA.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtDescripcionDAMousePressed

    private void txtCapacidadDAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCapacidadDAFocusGained
        if (txtCapacidadDA.getText().equals("Ingrese Capacidad")) {
            txtCapacidadDA.setText("");
            txtCapacidadDA.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtCapacidadDAFocusGained

    private void txtCapacidadDAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCapacidadDAFocusLost
        if (txtCapacidadDA.getText().equals("")) {
            txtCapacidadDA.setText("Ingrese Capacidad");
            txtCapacidadDA.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtCapacidadDAFocusLost

    private void txtDescripcionDAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionDAFocusGained
        if (txtDescripcionDA.getText().equals("Ingrese Descripción")) {
            txtDescripcionDA.setText("");
            txtDescripcionDA.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtDescripcionDAFocusGained

    private void txtDescripcionDAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionDAFocusLost
       if (txtDescripcionDA.getText().equals("")) {
            txtDescripcionDA.setText("Ingrese Descripción");
            txtDescripcionDA.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtDescripcionDAFocusLost

    private void txtBuscarDetalleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarDetalleFocusGained
        if (txtBuscarDetalle.getText().equals("Buscar Por Almacén o Producto")) {
            txtBuscarDetalle.setText("");
            txtBuscarDetalle.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtBuscarDetalleFocusGained

    private void txtBuscarDetalleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarDetalleFocusLost
       if (txtBuscarDetalle.getText().equals("")) {
            txtBuscarDetalle.setText("Buscar Por Almacén o Producto");
            txtBuscarDetalle.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtBuscarDetalleFocusLost

    private void txtCapacidadDAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadDAKeyTyped
        validarNumeros(evt);
        if (txtCapacidadDA.getText().length() > 4) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCapacidadDAKeyTyped

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
            java.util.logging.Logger.getLogger(DetalleAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleAlmacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDetalleAlmacen;
    private javax.swing.JLabel botonAgregarDA;
    private javax.swing.JLabel botonCancelarDA;
    private javax.swing.JLabel botonEditarDA;
    private javax.swing.JLabel botonGuardarDA;
    private javax.swing.JLabel botonRegresarDA;
    private javax.swing.JComboBox<String> comboAlmacen;
    private javax.swing.JComboBox<String> comboProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscarDetalle;
    private javax.swing.JTextField txtCapacidadDA;
    private javax.swing.JTextField txtDescripcionDA;
    private javax.swing.JLabel txtIdAlmacen;
    private javax.swing.JLabel txtIdDetalleAL;
    private javax.swing.JLabel txtIdProducto;
    // End of variables declaration//GEN-END:variables

    private void Habilitar() {
        comboAlmacen.enable(Boolean.TRUE);
        comboProducto.enable(Boolean.TRUE);
        txtCapacidadDA.enable(Boolean.TRUE);
        txtDescripcionDA.enable(Boolean.TRUE);

    }

    private void cargartabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaDetalleAlmacen.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select DA.Id_Detalle_Almacen,Al.Ubicacion,P.Nombre_Producto,DA.Capacidad,DA.Descripcion\n"
                    + "From Detalle_Almacen as DA\n"
                    + "INNER JOIN Almacen AS AL ON AL.Id_Almacen =DA.Id_Almacen\n"
                    + "INNER JOIN Productos AS P ON DA.Id_Producto = P.Id_Producto\n"
                    + "Order By DA.Id_Detalle_Almacen");
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

    private void Limpiar() {
        comboAlmacen.setSelectedIndex(0);
        comboProducto.setSelectedIndex(0);

        txtCapacidadDA.setText("");
        if (txtCapacidadDA.getText().equals("")) {
            txtCapacidadDA.setText("Ingrese Capacidad");
            txtCapacidadDA.setForeground(new Color(153, 153, 153));

            txtDescripcionDA.setText("");
            if (txtDescripcionDA.getText().equals("")) {
                txtDescripcionDA.setText("Ingrese Descripción");
                txtDescripcionDA.setForeground(new Color(153, 153, 153));

            }
        }
    }

    private void Inhabillitar() {
        comboAlmacen.enable(Boolean.FALSE);
        comboProducto.enable(Boolean.FALSE);
        txtCapacidadDA.enable(Boolean.FALSE);
        txtDescripcionDA.enable(Boolean.FALSE);

    }

    private void ObtenerIDAlmacen() {
        String Nombre = comboAlmacen.getSelectedItem().toString();
        try {
            ResultSet rs;
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Select Id_Almacen From Almacen Where Ubicacion=?");
            ps.setString(1, Nombre);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtIdAlmacen.setText(rs.getString("Id_Almacen"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    private void ObtenerIDProducto() {
        String Nombre = comboProducto.getSelectedItem().toString();
        try {
            ResultSet rs;
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Select Id_Producto From Productos Where Nombre_Producto=?");
            ps.setString(1, Nombre);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtIdProducto.setText(rs.getString("Id_Producto"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

    private void buscarData(String valor) {
        String[] titulos = {"Id Detalle Almacen", "Ubicacion", "Producto", "Capacidad", "Descipcion"};
        String[] registros = new String[13];
        String sql = "Select DA.Id_Detalle_Almacen,AL.Ubicacion,P.Nombre_Producto,DA.Capacidad,DA.Descripcion\n"
                + "From Detalle_Almacen as DA\n"
                + "INNER JOIN Almacen AS AL ON AL.Id_Almacen =DA.Id_Almacen\n"
                + "INNER JOIN Productos AS P ON DA.Id_Producto = P.Id_Producto\n"
                + "WHERE CONCAT (P.Nombre_Producto, ' ', AL.Ubicacion, ' ') LIKE '%" + valor + "%'\n"
                + "Order By DA.Id_Detalle_Almacen";

        DefaultTableModel model = new DefaultTableModel(null, titulos);
        Connection con = Conexion.getConexion();

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("Id_Detalle_Almacen");
                registros[1] = rs.getString("Ubicacion");
                registros[2] = rs.getString("Nombre_Producto");
                registros[3] = rs.getString("Capacidad");
                registros[4] = rs.getString("Descripcion");

                model.addRow(registros);
            }

            TablaDetalleAlmacen.setModel(model);
            // anchoColumnas();
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    private void validarNumeros(KeyEvent e) {
         
        if (e.getKeyChar() >= 33 && e.getKeyChar() <= 47
               || e.getKeyChar() >= 58 && e.getKeyChar() <= 238) {
            e.consume();
           JOptionPane.showMessageDialog(null, "Este campo solo admite números", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    } 
    

    public class CargarProducto {

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

    public class CargarAlmacen {

        public DefaultComboBoxModel getvalues() {

            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            try {
                Connection con = Conexion.getConexion();
                String sql = "select Ubicacion from Almacen";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                modelo.addElement("Seleccione Almacen...");
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

}
