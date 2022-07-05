/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios_SAG;

import Conexion.Conexion;
import static Formularios_SAG.Proveedores.Id_Proveedor;
import Logs.log;
import Reportes.ReportView;
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
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author carba
 */
public class Caja extends javax.swing.JFrame {

    /**
     * Creates new form Caja
     */
    String caja = "Caja";
    log lo = new log();

    public Caja() {
        initComponents();
        usuario.setText(Login.txtUsuario.getText());
        cargartabla();
        Inhabillitar();
        CargarSucursal S = new Caja.CargarSucursal();
        comboSucursalSS.setModel(S.getvalues());
        AutoCompleteDecorator.decorate(comboSucursalSS);

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("componentes/LOGOSAG(2).png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupCaja = new javax.swing.ButtonGroup();
        botonRegresarCa = new javax.swing.JLabel();
        botonAgregarCa = new javax.swing.JLabel();
        botonEditarCa = new javax.swing.JLabel();
        botonGuardarCa = new javax.swing.JLabel();
        botonCancelarCa = new javax.swing.JLabel();
        txtBuscarCa = new javax.swing.JTextField();
        txtNumeroCaja = new javax.swing.JTextField();
        txtIdCaja = new javax.swing.JLabel();
        comboSucursalSS = new javax.swing.JComboBox<>();
        txtId_Sucursal = new javax.swing.JLabel();
        reporte = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCaja = new javax.swing.JTable();
        BotonActivoCa = new javax.swing.JRadioButton();
        BotonInactivoCa = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonRegresarCa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresarCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarCaMouseClicked(evt);
            }
        });
        getContentPane().add(botonRegresarCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, 30));

        botonAgregarCa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarCaMouseClicked(evt);
            }
        });
        getContentPane().add(botonAgregarCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 120, 30));

        botonEditarCa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEditarCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEditarCaMouseClicked(evt);
            }
        });
        getContentPane().add(botonEditarCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 120, 30));

        botonGuardarCa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardarCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGuardarCaMouseClicked(evt);
            }
        });
        getContentPane().add(botonGuardarCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 110, 30));

        botonCancelarCa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCancelarCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCancelarCaMouseClicked(evt);
            }
        });
        getContentPane().add(botonCancelarCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 110, 30));

        txtBuscarCa.setBackground(new java.awt.Color(240, 240, 240));
        txtBuscarCa.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtBuscarCa.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscarCa.setText("Buscar por Número de Caja y Sucursal");
        txtBuscarCa.setBorder(null);
        txtBuscarCa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtBuscarCa.setOpaque(false);
        txtBuscarCa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarCaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarCaFocusLost(evt);
            }
        });
        txtBuscarCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCaActionPerformed(evt);
            }
        });
        txtBuscarCa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarCaKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscarCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 236, 28));

        txtNumeroCaja.setBackground(new java.awt.Color(240, 240, 240));
        txtNumeroCaja.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtNumeroCaja.setForeground(new java.awt.Color(153, 153, 153));
        txtNumeroCaja.setText("Ingrese Número de Caja");
        txtNumeroCaja.setBorder(null);
        txtNumeroCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNumeroCaja.setOpaque(false);
        txtNumeroCaja.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumeroCajaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroCajaFocusLost(evt);
            }
        });
        txtNumeroCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNumeroCajaMousePressed(evt);
            }
        });
        txtNumeroCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCajaActionPerformed(evt);
            }
        });
        txtNumeroCaja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroCajaKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumeroCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 311, 180, 28));
        getContentPane().add(txtIdCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 80, 30));

        comboSucursalSS.setBackground(new java.awt.Color(240, 240, 240));
        comboSucursalSS.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        comboSucursalSS.setForeground(new java.awt.Color(153, 153, 153));
        comboSucursalSS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Sucursal" }));
        comboSucursalSS.setBorder(null);
        comboSucursalSS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboSucursalSS.setOpaque(false);
        comboSucursalSS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboSucursalSSMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboSucursalSSMousePressed(evt);
            }
        });
        comboSucursalSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSucursalSSActionPerformed(evt);
            }
        });
        getContentPane().add(comboSucursalSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 182, 28));
        getContentPane().add(txtId_Sucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 40, 20));

        reporte.setBackground(new java.awt.Color(204, 204, 204));
        reporte.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        reporte.setForeground(new java.awt.Color(255, 255, 255));
        reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/analitica.png"))); // NOI18N
        reporte.setText("REPORTE");
        reporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteMouseClicked(evt);
            }
        });
        getContentPane().add(reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 120, 40));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 70, -1));

        usuario.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 230, 20));

        TablaCaja.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        TablaCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Número de caja", "Sucursal", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        TablaCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablaCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCajaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaCaja);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 530, 220));

        buttonGroupCaja.add(BotonActivoCa);
        BotonActivoCa.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        BotonActivoCa.setForeground(new java.awt.Color(255, 255, 255));
        BotonActivoCa.setText("Activo");
        BotonActivoCa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonActivoCa.setOpaque(false);
        BotonActivoCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActivoCaActionPerformed(evt);
            }
        });
        getContentPane().add(BotonActivoCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        buttonGroupCaja.add(BotonInactivoCa);
        BotonInactivoCa.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        BotonInactivoCa.setForeground(new java.awt.Color(255, 255, 255));
        BotonInactivoCa.setText("Inactivo");
        BotonInactivoCa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInactivoCa.setOpaque(false);
        BotonInactivoCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInactivoCaActionPerformed(evt);
            }
        });
        getContentPane().add(BotonInactivoCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/Pantalla caja.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCajaActionPerformed

    private void txtBuscarCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCaActionPerformed

    }//GEN-LAST:event_txtBuscarCaActionPerformed

    private void BotonActivoCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActivoCaActionPerformed
        String Activo = "BtnActivo";
        String IdCaja = txtIdCaja.getText();

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Update Caja set Id_Estado=? Where Id_Caja=?");
            ps.setInt(1, 1);
            ps.setString(2, IdCaja);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Habilitado");
            cargartabla();
            BotonActivoCa.setVisible(Boolean.FALSE);
            BotonInactivoCa.setVisible(Boolean.FALSE);
            Limpiar();
            Inhabillitar();

        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo actualizar el estado " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), caja, Activo);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_BotonActivoCaActionPerformed

    private void BotonInactivoCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInactivoCaActionPerformed
        String Inactivo = "BtnInactivo";
        String IdCaja = txtIdCaja.getText();

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Update Caja set Id_Estado=? Where Id_Caja=?");
            ps.setInt(1, 2);
            ps.setString(2, IdCaja);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Inhabilitado");
            cargartabla();
            BotonActivoCa.setVisible(Boolean.FALSE);
            BotonInactivoCa.setVisible(Boolean.FALSE);
            Limpiar();
            Inhabillitar();

        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo actualizar el estado " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), caja, Inactivo);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_BotonInactivoCaActionPerformed

    private void botonRegresarCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarCaMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_botonRegresarCaMouseClicked

    private void botonAgregarCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarCaMouseClicked
        Habilitar();
        botonGuardarCa.isEnabled();
        botonCancelarCa.isEnabled();
    }//GEN-LAST:event_botonAgregarCaMouseClicked

    private void botonEditarCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarCaMouseClicked
        String Editar = "BtnEditar";
        ObtenerSucursal();
        if (txtNumeroCaja.getText().equals("Ingrese Número de Caja") || comboSucursalSS.equals("Seleccione Sucursal")) {
            JOptionPane.showMessageDialog(null, "No se puede Guardar datos vacios");
        } else {
            int Idca = Integer.parseInt(txtIdCaja.getText());
            int NumCa = Integer.parseInt(txtNumeroCaja.getText());
            int Sucursal = Integer.parseInt(txtId_Sucursal.getText());

            try {
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Update Caja set Num_Caja=?,Id_Sucursal=? Where Id_Caja=?");
                ps.setInt(1, NumCa);
                ps.setInt(2, Sucursal);
                ps.setInt(3, Idca);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Actualizado");

                cargartabla();
                Limpiar();
                Inhabillitar();

            } catch (SQLException ex) {
                lo.LogBitacora("Error: No se pudo editar el registro " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), caja, Editar);
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }//GEN-LAST:event_botonEditarCaMouseClicked

    private void botonGuardarCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarCaMouseClicked
        String Guardar = "BtnGuardafr";
        ObtenerSucursal();
        if (txtNumeroCaja.getText().equals("Ingrese Número de Caja") && comboSucursalSS.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            if (txtNumeroCaja.getText().equals("Ingrese Número de Caja")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número de caja", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else if (comboSucursalSS.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Seleccione una sucursal", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {

                int Sucursal = Integer.parseInt(txtId_Sucursal.getText());
                int NumCa = Integer.parseInt(txtNumeroCaja.getText());

                try {
                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("Insert into Caja (Id_Sucursal, Num_Caja,Id_Estado) VALUES(?,?,?)");
                    ps.setInt(1, Sucursal);
                    ps.setInt(2, NumCa);
                    ps.setInt(3, 1);
                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Registro guardado");
                    cargartabla();

                    //Limpiar();
                    Inhabillitar();

                } catch (SQLException ex) {
                    lo.LogBitacora("Error: No se pudo guardar el registro " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), caja, Guardar);

                    JOptionPane.showMessageDialog(null, ex.toString());
                }
            }

        }
    }//GEN-LAST:event_botonGuardarCaMouseClicked

    private void botonCancelarCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarCaMouseClicked
        Limpiar();
        Inhabillitar();
        botonEditarCa.setEnabled(Boolean.FALSE);
        botonGuardarCa.setEnabled(Boolean.FALSE);

    }//GEN-LAST:event_botonCancelarCaMouseClicked

    private void TablaCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCajaMouseClicked
        String Tabla = "Cargar Tabla Caja";
        try {
            int fila = TablaCaja.getSelectedRow();
            int id = Integer.parseInt(TablaCaja.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select .Id_Caja,C.Num_Caja,S.Nombre,E.Estado\n"
                    + "From Caja as C\n"
                    + "INNER JOIN Estado AS E ON E.Id_Estado = C.Id_Estado\n"
                    + "INNER JOIN Sucursal AS S ON C.Id_Sucursal = S.Id_Sucursal\n"
                    + "Where C.Id_Caja=?\n"
                    + "Order By C.Id_Caja");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtIdCaja.setText(String.valueOf(id));
                txtNumeroCaja.setText(rs.getString("Num_Caja"));
                comboSucursalSS.setSelectedItem(rs.getString("Nombre"));

                if (rs.getString("Estado").equals("Activo")) {
                    BotonActivoCa.setSelected(true);
                } else if (rs.getString("Estado").equals("Inactivo")) {
                    BotonInactivoCa.setSelected(true);

                }
                //IdCaja = txtIdCaja.getText();

                BotonActivoCa.setVisible(Boolean.TRUE);
                BotonInactivoCa.setVisible(Boolean.TRUE);
                //id = txtId_Proveedor.getText();
                Habilitar();
            }
        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo cargar el dato de la tabla " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), caja, Tabla);

            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_TablaCajaMouseClicked

    private void comboSucursalSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSucursalSSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSucursalSSActionPerformed

    private void txtBuscarCaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarCaFocusGained
        if (txtBuscarCa.getText().equals("Buscar por Número de Caja y Sucursal")) {
            txtBuscarCa.setText("");
            txtBuscarCa.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtBuscarCaFocusGained

    private void txtBuscarCaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarCaFocusLost
        if (txtBuscarCa.getText().equals("")) {
            txtBuscarCa.setText("Buscar por Número de Caja y Sucursal");
            txtBuscarCa.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtBuscarCaFocusLost

    private void txtNumeroCajaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroCajaFocusGained
        if (txtNumeroCaja.getText().equals("Ingrese Número de Caja")) {
            txtNumeroCaja.setText("");
            txtNumeroCaja.setForeground(new Color(0, 0, 0));

        }
    }//GEN-LAST:event_txtNumeroCajaFocusGained

    private void txtNumeroCajaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroCajaFocusLost
        if (txtNumeroCaja.getText().equals("")) {
            txtNumeroCaja.setText("Ingrese Número de Caja");
            txtNumeroCaja.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_txtNumeroCajaFocusLost
    }
    private void txtBuscarCaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCaKeyTyped
        buscarData(txtBuscarCa.getText());
        validarNumerosLetras(evt);
        if (txtBuscarCa.getText().length() > 15) {
            JOptionPane.showMessageDialog(null, "Alcanzaste el máximo de caracteres para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (txtBuscarCa.getText().length() > 0) {
            if (!txtBuscarCa.getText().matches("^(?!.*([A-Za-zñÑáéíóúÁÉÍÓÚ\\s])\\1{2})[A-Za-zñÑáéíóúÁÉÍÓÚ\\s0-9]+$")) {
                JOptionPane.showMessageDialog(null, "No repitas caracteres de forma incorrecta", "Advertencia", JOptionPane.WARNING_MESSAGE);
                evt.consume();

            }
        }
    }//GEN-LAST:event_txtBuscarCaKeyTyped

    private void txtNumeroCajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroCajaMousePressed
        if (txtNumeroCaja.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtNumeroCajaMousePressed

    private void comboSucursalSSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboSucursalSSMousePressed
        if (comboSucursalSS.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_comboSucursalSSMousePressed

    private void txtNumeroCajaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCajaKeyTyped
        validarNumeros(evt);
        if (txtNumeroCaja.getText().length() > 2) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroCajaKeyTyped

    private void comboSucursalSSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboSucursalSSMouseClicked

    }//GEN-LAST:event_comboSucursalSSMouseClicked

    private void reporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteMouseClicked
        JasperReport reporte;
        HashMap hm = new HashMap();
        hm.put("Usuario", usuario.getText());
        try {
            Connection con = Conexion.getConexion();
            reporte = JasperCompileManager.compileReport("src/Reportes/ReporteCaja.jrxml");
            JasperPrint jp = JasperFillManager.fillReport(reporte, hm, con);
            JasperViewer.viewReport(jp, true);
            ReportView view = new ReportView(jp, false);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reporteMouseClicked

    private void validarNumeros(KeyEvent e) {
        if (e.getKeyChar() >= 33 && e.getKeyChar() <= 47
                || e.getKeyChar() >= 58 && e.getKeyChar() <= 238) {
            e.consume();
            JOptionPane.showMessageDialog(null, "Este campo solo admite números", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

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
            java.util.logging.Logger.getLogger(Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BotonActivoCa;
    private javax.swing.JRadioButton BotonInactivoCa;
    private javax.swing.JTable TablaCaja;
    private javax.swing.JLabel botonAgregarCa;
    private javax.swing.JLabel botonCancelarCa;
    private javax.swing.JLabel botonEditarCa;
    private javax.swing.JLabel botonGuardarCa;
    private javax.swing.JLabel botonRegresarCa;
    private javax.swing.ButtonGroup buttonGroupCaja;
    private javax.swing.JComboBox<String> comboSucursalSS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel reporte;
    public static javax.swing.JTextField txtBuscarCa;
    private javax.swing.JLabel txtIdCaja;
    private javax.swing.JLabel txtId_Sucursal;
    private javax.swing.JTextField txtNumeroCaja;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

    private void Habilitar() {
        txtNumeroCaja.enable(Boolean.TRUE);
        comboSucursalSS.enable(Boolean.TRUE);

    }

    private void cargartabla() {
        String CargarTablas = "Cargar Tabla";
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaCaja.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select C.Id_Caja,C.Num_Caja,S.Nombre,E.Estado\n"
                    + "From Caja as C\n"
                    + "INNER JOIN Estado AS E ON E.Id_Estado = C.Id_Estado\n"
                    + "INNER JOIN Sucursal AS S ON C.Id_Sucursal = S.Id_Sucursal\n"
                    + "Order By C.Id_Caja");

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
            lo.LogBitacora("Error: No se pudo cargar la tabla" + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), caja, CargarTablas);

            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

    private void Limpiar() {
        txtNumeroCaja.setText("");
        if (txtNumeroCaja.getText().equals("")) {
            txtNumeroCaja.setText("Ingrese Número de Caja");
            txtNumeroCaja.setForeground(new Color(153, 153, 153));

        }
        comboSucursalSS.setSelectedIndex(0);
    }

    private void Inhabillitar() {
        txtNumeroCaja.enable(Boolean.FALSE);
        comboSucursalSS.enable(Boolean.FALSE);

    }

    public void ObtenerSucursal() {
        String Obtener = "BtnObtener";
        String Nombre = comboSucursalSS.getSelectedItem().toString();
        try {
            ResultSet rs;
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Select Id_Sucursal From Sucursal Where Nombre=?");
            ps.setString(1, Nombre);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtId_Sucursal.setText(rs.getString("Id_Sucursal"));
            }

        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo obtener sucursal " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), caja, Obtener);

            JOptionPane.showMessageDialog(null, ex.toString());
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

    public class CargarSucursal {

        String CargarS = "BtnCargarS";

        public DefaultComboBoxModel getvalues() {

            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            try {
                Connection con = Conexion.getConexion();
                String sql = "select Nombre from Sucursal";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                modelo.addElement("Seleccione Sucursal...");
                while (rs.next()) {
                    modelo.addElement(rs.getString(1));
                }
                con.close();
                rs.close();
            } catch (Exception e) {
                lo.LogBitacora("Error: No se pudo cargar la sucursal " + "Excepción: " + e + ". Origen: " + this.getClass().getSimpleName(), caja, CargarS);

                System.out.println(e);
            }
            return modelo;
        }
    }

    public void buscarData(String valor) {
        String Buscar = "BtnBuscar";
        String[] titulos = {"Id", "Número Caja", "Sucursal", "Estado"};
        String[] registros = new String[13];
        String sql = "Select C.Id_Caja, C.Num_Caja,S.Nombre,E.Estado\n"
                + "From Caja as C\n"
                + "INNER JOIN Estado AS E ON E.Id_Estado = C.Id_Estado\n"
                + "INNER JOIN Sucursal AS S ON C.Id_Sucursal = S.Id_Sucursal\n"
                + "WHERE CONCAT (C.Num_Caja, ' ', S.Nombre) LIKE '%" + valor + "%'\n"
                + "ORDER BY C.Id_Caja";

        DefaultTableModel model = new DefaultTableModel(null, titulos);
        Connection con = Conexion.getConexion();

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("Id_Caja");
                registros[1] = rs.getString("Num_Caja");
                registros[2] = rs.getString("Nombre");
                registros[3] = rs.getString("Estado");
                model.addRow(registros);
            }

            TablaCaja.setModel(model);
            // anchoColumnas();
        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo buscar el registro " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), caja, Buscar);

            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
