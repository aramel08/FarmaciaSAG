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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carba
 */
public class Contacto_Proveedor extends javax.swing.JFrame {

    /**
     * Creates new form Contacto_Proveedor
     */
    public Contacto_Proveedor() {
        initComponents();
        cargarnombre();
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

        buttonGroupCont = new javax.swing.ButtonGroup();
        BotonRegresarCon = new javax.swing.JLabel();
        BotonAgregarCon = new javax.swing.JLabel();
        BotonEditarCon = new javax.swing.JLabel();
        BotonGuardarCon = new javax.swing.JLabel();
        BotonCancelarCon = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        txtNombreContacto = new javax.swing.JTextField();
        txtTelefonoContacto = new javax.swing.JTextField();
        txtEmailContacto = new javax.swing.JTextField();
        txtBuscarContacto = new javax.swing.JTextField();
        txtIdContacto = new javax.swing.JLabel();
        txtIdProv = new javax.swing.JLabel();
        BotonActivoCont = new javax.swing.JRadioButton();
        BotonInactivoCont = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaContacto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonRegresarCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarConMouseClicked(evt);
            }
        });
        getContentPane().add(BotonRegresarCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, 30));

        BotonAgregarCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAgregarConMouseClicked(evt);
            }
        });
        getContentPane().add(BotonAgregarCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 120, 30));

        BotonEditarCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEditarConMouseClicked(evt);
            }
        });
        getContentPane().add(BotonEditarCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 120, 40));

        BotonGuardarCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardarConMouseClicked(evt);
            }
        });
        getContentPane().add(BotonGuardarCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 110, 40));

        BotonCancelarCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCancelarConMouseClicked(evt);
            }
        });
        getContentPane().add(BotonCancelarCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 120, 30));

        txtNombreProveedor.setEditable(false);
        txtNombreProveedor.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtNombreProveedor.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreProveedor.setText("Ingresar Proveedor");
        txtNombreProveedor.setBorder(null);
        txtNombreProveedor.setOpaque(false);
        txtNombreProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 180, 30));

        txtNombreContacto.setBackground(new java.awt.Color(240, 240, 240));
        txtNombreContacto.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtNombreContacto.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreContacto.setText("Ingresar Nombre Contacto");
        txtNombreContacto.setToolTipText("");
        txtNombreContacto.setBorder(null);
        txtNombreContacto.setOpaque(false);
        txtNombreContacto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreContactoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreContactoFocusLost(evt);
            }
        });
        txtNombreContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreContactoMousePressed(evt);
            }
        });
        txtNombreContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreContactoActionPerformed(evt);
            }
        });
        txtNombreContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreContactoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreContactoKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombreContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 355, 180, 30));

        txtTelefonoContacto.setBackground(new java.awt.Color(240, 240, 240));
        txtTelefonoContacto.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtTelefonoContacto.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefonoContacto.setText("Ingresar Teléfono");
        txtTelefonoContacto.setBorder(null);
        txtTelefonoContacto.setOpaque(false);
        txtTelefonoContacto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefonoContactoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoContactoFocusLost(evt);
            }
        });
        txtTelefonoContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefonoContactoMousePressed(evt);
            }
        });
        txtTelefonoContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoContactoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelefonoContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 418, 178, 28));

        txtEmailContacto.setBackground(new java.awt.Color(240, 240, 240));
        txtEmailContacto.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtEmailContacto.setForeground(new java.awt.Color(153, 153, 153));
        txtEmailContacto.setText("Ingresar Email");
        txtEmailContacto.setToolTipText("");
        txtEmailContacto.setBorder(null);
        txtEmailContacto.setOpaque(false);
        txtEmailContacto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailContactoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailContactoFocusLost(evt);
            }
        });
        txtEmailContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEmailContactoMousePressed(evt);
            }
        });
        getContentPane().add(txtEmailContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 178, 28));

        txtBuscarContacto.setBackground(new java.awt.Color(240, 240, 240));
        txtBuscarContacto.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtBuscarContacto.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscarContacto.setText("Buscar Por Proveedor");
        txtBuscarContacto.setBorder(null);
        txtBuscarContacto.setOpaque(false);
        txtBuscarContacto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarContactoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarContactoFocusLost(evt);
            }
        });
        txtBuscarContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarContactoKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscarContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 215, 230, 28));

        txtIdContacto.setEnabled(false);
        getContentPane().add(txtIdContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 50, 20));
        getContentPane().add(txtIdProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 70, 20));

        buttonGroupCont.add(BotonActivoCont);
        BotonActivoCont.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        BotonActivoCont.setForeground(new java.awt.Color(255, 255, 255));
        BotonActivoCont.setText("Activo");
        BotonActivoCont.setOpaque(false);
        BotonActivoCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActivoContActionPerformed(evt);
            }
        });
        getContentPane().add(BotonActivoCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        buttonGroupCont.add(BotonInactivoCont);
        BotonInactivoCont.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        BotonInactivoCont.setForeground(new java.awt.Color(255, 255, 255));
        BotonInactivoCont.setText("Inactivo");
        BotonInactivoCont.setOpaque(false);
        BotonInactivoCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInactivoContActionPerformed(evt);
            }
        });
        getContentPane().add(BotonInactivoCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        TablaContacto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Contacto", "Proveedor", "Nombre Contacto ", "Teléfono", "Email", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaContactoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaContacto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 500, 300));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/Pantalla contacto proveedor(1)(1).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -100, 940, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegresarConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarConMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_BotonRegresarConMouseClicked

    private void BotonAgregarConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAgregarConMouseClicked
        Habilitar();
        BotonGuardarCon.isEnabled();
        BotonCancelarCon.isEnabled();
         
    }//GEN-LAST:event_BotonAgregarConMouseClicked

    private void txtNombreProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProveedorActionPerformed

    private void BotonEditarConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarConMouseClicked
        if (txtNombreContacto.getText().equals("Ingrese Nombre Contacto") || txtTelefonoContacto.getText().equals("Ingrese Teléfono") || txtEmailContacto.getText().equals("Ingrese Email")) {
            JOptionPane.showMessageDialog(null, "No se puede Guardar datos vacios");
        } else {
            int IdContacto = Integer.parseInt(txtIdContacto.getText());
            String NombreContacto = txtNombreContacto.getText();
            String Telefono = txtTelefonoContacto.getText();
            String Email = txtEmailContacto.getText();

            try {
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Update Contacto_Proveedor set Nombre_Contacto=?,Telefono=?,[E-mail]=? Where Id_Contacto=?");
                ps.setString(1, NombreContacto);
                ps.setString(2, Telefono);
                ps.setString(3, Email);
                ps.setInt(4, IdContacto);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Actualizado");

                cargartabla();
                Limpiar();
                Inhabillitar();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }//GEN-LAST:event_BotonEditarConMouseClicked

    private void BotonCancelarConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCancelarConMouseClicked
        Limpiar();
        Inhabillitar();
        BotonEditarCon.setEnabled(Boolean.FALSE);
        BotonGuardarCon.setEnabled(Boolean.FALSE);
    
    }//GEN-LAST:event_BotonCancelarConMouseClicked

    private void BotonGuardarConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarConMouseClicked
        if (txtNombreContacto.getText().equals("Ingrese Nombre Contacto") && txtTelefonoContacto.getText().equals("Ingrese Teléfono")
                && txtEmailContacto.getText().equals("Ingrese Email")) {
         
           JOptionPane.showMessageDialog(null, "Debes llenar todos los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            if (txtNombreContacto.getText().equals("Ingrese Nombre Contacto")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un nombre", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else if (txtTelefonoContacto.getText().equals("Ingrese Teléfono")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un Teléfono", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else if (txtEmailContacto.getText().equals("Ingrese Email")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un Email", "Advertencia", JOptionPane.WARNING_MESSAGE);

            } else {
       
            String NombreCont = txtNombreContacto.getText();
            String Telefono = txtTelefonoContacto.getText();
            String Email = txtEmailContacto.getText();
            int Id_P=Integer.parseInt(txtIdProv.getText());
            
            try {
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Insert into Contacto_Proveedor (Id_Proveedor,Nombre_Contacto,Telefono,[E-mail],Id_Estado) VALUES(?,?,?,?,?)");
                ps.setString(2, NombreCont);
                ps.setString(3, Telefono);
                ps.setString(4, Email);
                ps.setInt(1, Id_P);
                ps.setInt(5, 1);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Registro guardado");
                cargartabla();
                Limpiar();
                Inhabillitar();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        } }
    }//GEN-LAST:event_BotonGuardarConMouseClicked

    private void TablaContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaContactoMouseClicked
        try {
            int fila = TablaContacto .getSelectedRow();
            int id = Integer.parseInt(TablaContacto.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select CP.Id_Contacto,PROV.Nombre_Empresa,CP.Nombre_Contacto,CP.Telefono,CP.[E-mail], E.Estado \n"
                    + "From Contacto_Proveedor as CP\n"
                    + "INNER JOIN Proveedor AS PROV ON CP.Id_Proveedor= PROV.Id_Proveedor\n"
                    + "INNER JOIN Estado AS E ON E.Id_Estado = CP.Id_Estado\n"
                    + "where CP.Id_Contacto=?\n"
                    + "Order By CP.Id_Contacto");
                     
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtIdContacto.setText(String.valueOf(id));
                txtNombreContacto.setText(rs.getString("Nombre_Contacto"));
                txtTelefonoContacto.setText(rs.getString("Telefono"));
                txtEmailContacto.setText(rs.getString("E-mail"));
                
                
               
                if (rs.getString("Estado").equals("Activo")) {
                    BotonActivoCont.setSelected(true);
                } else if (rs.getString("Estado").equals("Inactivo")) {
                    BotonInactivoCont.setSelected(true);
               
            
            }
         

            BotonActivoCont.setVisible(Boolean.TRUE);
            BotonInactivoCont.setVisible(Boolean.TRUE);
            //id = txtId_Proveedor.getText();
            Habilitar();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_TablaContactoMouseClicked

    private void BotonActivoContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActivoContActionPerformed
        int IdContacto = Integer.parseInt(txtIdContacto.getText());

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Update Contacto_Proveedor set Id_Estado=? Where Id_Contacto=?");
            ps.setInt(1,1);
            ps.setInt(2, IdContacto);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Habilitado");
            cargartabla();
            BotonActivoCont.setVisible(Boolean.FALSE);
            BotonInactivoCont.setVisible(Boolean.FALSE);
            Limpiar();
            Inhabillitar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_BotonActivoContActionPerformed

    private void BotonInactivoContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInactivoContActionPerformed
        int IdContacto = Integer.parseInt(txtIdContacto.getText());

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Update Contacto_Proveedor set Id_Estado=? Where Id_Contacto=?");
            ps.setInt(1, 2);
            ps.setInt(2, IdContacto);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Inhabilitado");
            cargartabla();
            BotonActivoCont.setVisible(Boolean.FALSE);
            BotonInactivoCont.setVisible(Boolean.FALSE);
            Limpiar();
            Inhabillitar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_BotonInactivoContActionPerformed

    private void txtBuscarContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarContactoKeyTyped
         buscarData(txtBuscarContacto.getText());
        //validarNumerosLetras(evt);
        if (txtBuscarContacto.getText().length() > 15) {
            JOptionPane.showMessageDialog(null, "Alcanzaste el máximo de caracteres para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (txtBuscarContacto.getText().length() > 0) {
            if (!txtBuscarContacto.getText().matches("^(?!.*([A-Za-zñÑáéíóúÁÉÍÓÚ\\s])\\1{2})[A-Za-zñÑáéíóúÁÉÍÓÚ\\s0-9]+$")) {
                JOptionPane.showMessageDialog(null, "No repitas caracteres de forma incorrecta", "Advertencia", JOptionPane.WARNING_MESSAGE);
                evt.consume();
                
                
            }
        }
    }//GEN-LAST:event_txtBuscarContactoKeyTyped

    private void txtNombreContactoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreContactoFocusGained
       if (txtNombreContacto.getText().equals("Ingresar Nombre Contacto")) {
            txtNombreContacto.setText("");
            txtNombreContacto.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtNombreContactoFocusGained

    private void txtNombreContactoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreContactoFocusLost
        if (txtNombreContacto.getText().equals("")) {
            txtNombreContacto.setText("Ingresar Nombre Contacto");
            txtNombreContacto.setForeground(new Color(153, 153, 153));
            } else if (txtNombreContacto.getText().length() < 10) {
            JOptionPane.showMessageDialog(null, "El nombre debe tener al menos 10 caracteres", "Advertencia", JOptionPane.WARNING_MESSAGE);
        
        }
    }//GEN-LAST:event_txtNombreContactoFocusLost

    private void txtTelefonoContactoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoContactoFocusGained
        if (txtTelefonoContacto.getText().equals("Ingresar Teléfono")) {
            txtTelefonoContacto.setText("");
            txtTelefonoContacto.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtTelefonoContactoFocusGained

    private void txtTelefonoContactoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoContactoFocusLost
        if (txtTelefonoContacto.getText().equals("")) {
            txtTelefonoContacto.setText("Ingresar Teléfono");
            txtTelefonoContacto.setForeground(new Color(153, 153, 153));
        } else if (txtTelefonoContacto.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "El número de teléfono debe contener 8 dígitos", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!txtTelefonoContacto.getText().matches("(^[9]{1}[0-9]{7}$)|(^[3]{1}[0-9]{7}$)|(^[7]{1}[0-9]{7}$)")) {
            JOptionPane.showMessageDialog(null, "El número de celular debe comenzar en 9, 3, 7 o 8", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            verificarDatosExistentes(txtTelefonoContacto.getText(), "Telefono", "Contacto_Proveedor", "El  número de telefono ya existe");

        }
    }//GEN-LAST:event_txtTelefonoContactoFocusLost

    private void txtEmailContactoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailContactoFocusGained
        if (txtEmailContacto.getText().equals("Ingresar Email")) {
            txtEmailContacto.setText("");
            txtEmailContacto.setForeground(new Color(0, 0, 0));
        
        
        }
    }//GEN-LAST:event_txtEmailContactoFocusGained

    private void txtEmailContactoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailContactoFocusLost
       if (txtEmailContacto.getText().equals("")) {
            txtEmailContacto.setText("Ingresar Email");
            txtEmailContacto.setForeground(new Color(153, 153, 153));
           
        
        }
    }//GEN-LAST:event_txtEmailContactoFocusLost

    private void txtBuscarContactoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarContactoFocusGained
         if (txtBuscarContacto.getText().equals("Buscar Por Proveedor")) {
            txtBuscarContacto.setText("");
            txtBuscarContacto.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtBuscarContactoFocusGained

    private void txtBuscarContactoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarContactoFocusLost
        if (txtBuscarContacto.getText().equals("")) {
            txtBuscarContacto.setText("Buscar Por Proveedor");
            txtBuscarContacto.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtBuscarContactoFocusLost

    private void txtNombreContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreContactoActionPerformed

    private void txtNombreContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreContactoKeyTyped
       if (txtNombreContacto.getText().length() > 12) {
            JOptionPane.showMessageDialog(null, "Alcanzaste el máximo de caracteres para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (txtNombreContacto.getText().length() > 0) {
            if (!txtNombreContacto.getText().matches("^(?!.*([A-Za-zñÑáéíóúÁÉÍÓÚ\\s])\\1{2})[A-Za-zñÑáéíóúÁÉÍÓÚ\\s0-9]+$")) {
                JOptionPane.showMessageDialog(null, "No repitas caracteres de forma incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                evt.consume();
            } }
    }//GEN-LAST:event_txtNombreContactoKeyTyped

    private void txtNombreContactoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreContactoKeyPressed
        
    }//GEN-LAST:event_txtNombreContactoKeyPressed

    private void txtNombreContactoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreContactoMousePressed
       if (txtNombreContacto.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtNombreContactoMousePressed

    private void txtTelefonoContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoContactoKeyTyped
          validarNumeros(evt);
        if (txtTelefonoContacto.getText().length() > 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoContactoKeyTyped

    private void txtTelefonoContactoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoContactoMousePressed
       if (txtTelefonoContacto.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtTelefonoContactoMousePressed

    private void txtEmailContactoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailContactoMousePressed
        if (txtEmailContacto.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtEmailContactoMousePressed

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
            java.util.logging.Logger.getLogger(Contacto_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contacto_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contacto_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contacto_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contacto_Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BotonActivoCont;
    private javax.swing.JLabel BotonAgregarCon;
    private javax.swing.JLabel BotonCancelarCon;
    private javax.swing.JLabel BotonEditarCon;
    private javax.swing.JLabel BotonGuardarCon;
    private javax.swing.JRadioButton BotonInactivoCont;
    private javax.swing.JLabel BotonRegresarCon;
    private javax.swing.JTable TablaContacto;
    private javax.swing.ButtonGroup buttonGroupCont;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscarContacto;
    private javax.swing.JTextField txtEmailContacto;
    private javax.swing.JLabel txtIdContacto;
    private javax.swing.JLabel txtIdProv;
    private javax.swing.JTextField txtNombreContacto;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtTelefonoContacto;
    // End of variables declaration//GEN-END:variables

    private void Habilitar() {
        
        txtNombreContacto.enable(Boolean.TRUE);
        txtTelefonoContacto.enable(Boolean.TRUE);
        txtEmailContacto.enable(Boolean.TRUE);

    }

    public void cargarnombre() {

        // int tener = comboCargarEmpleado.getSelectedIndex();
        PreparedStatement ps;
        ResultSet rs;

        try {
            txtIdProv.setText(Proveedores.Id_Proveedor);
            int Id = Integer.parseInt(txtIdProv.getText());
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select  Nombre_Empresa from Proveedor where Id_Proveedor=?");
            ps.setInt(1, Id);
            rs = ps.executeQuery();
            while (rs.next()) {
                txtNombreProveedor.setText(rs.getString("Nombre_Empresa"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    private void cargartabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaContacto.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select CP.Id_Contacto,PROV.Nombre_Empresa,CP.Nombre_Contacto,CP.Telefono,CP.[E-mail], E.Estado\n"
                    + "From Contacto_Proveedor as CP\n"
                    + "INNER JOIN Proveedor AS PROV ON CP.Id_Proveedor= PROV.Id_Proveedor\n"
                    + "INNER JOIN Estado AS E ON E.Id_Estado = CP.Id_Estado\n"
                    + "Order By CP.Id_Contacto");
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
        txtNombreContacto.setText("");
        if (txtNombreContacto.getText().equals("")) {
            txtNombreContacto.setText("Ingrese Nombre Contacto");
            txtNombreContacto.setForeground(new Color(153, 153, 153));
        }
        txtTelefonoContacto.setText("");
        if (txtTelefonoContacto.getText().equals("")) {
            txtTelefonoContacto.setText("Ingrese Teléfono");
            txtTelefonoContacto.setForeground(new Color(153, 153, 153));
        }
        txtEmailContacto.setText("");
        if (txtEmailContacto.getText().equals("")) {
            txtEmailContacto.setText("Ingrese Email");
            txtEmailContacto.setForeground(new Color(153, 153, 153));

        }

    }

    private void Inhabillitar() {
        txtNombreContacto.enable(Boolean.FALSE);
        txtTelefonoContacto.enable(Boolean.FALSE);
        txtEmailContacto.enable(Boolean.FALSE);

    }
    private void buscarData(String valor) {
        String[] titulos = {"Id Contacto", "Proveedor", "Nombre Contacto", "Telefono", "Email","Estado"};
        String[] registros = new String[13];
        String sql = "Select  CP.Id_Contacto,PROV.Nombre_Empresa,CP.Nombre_Contacto,CP.Telefono,CP.[E-mail], E.Estado \n"
                + "From Contacto_Proveedor as CP\n"
                + "INNER JOIN Proveedor AS PROV ON CP.Id_Proveedor= PROV.Id_Proveedor\n"
                + "INNER JOIN Estado AS E ON E.Id_Estado = CP.Id_Estado\n"
                + "WHERE CONCAT (CP.Id_Contacto, ' ', PROV.Nombre_Empresa, ' ', CP.Nombre_Contacto) LIKE '%" + valor + "%'\n"
                + "ORDER BY CP.Id_Contacto";

        DefaultTableModel model = new DefaultTableModel(null, titulos);
        Connection con = Conexion.getConexion();

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("Id_Contacto");
                registros[1] = rs.getString("Nombre_Empresa");
                registros[2] = rs.getString("Nombre_Contacto");
                registros[3] = rs.getString("Telefono");
                registros[4] = rs.getString("E-mail");
                registros[5] = rs.getString("Estado");
                model.addRow(registros);
            }

            TablaContacto.setModel(model);
            // anchoColumnas();
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    private void validarNumeros(KeyEvent e) {
         if (e.getKeyChar() >= 33 && e.getKeyChar() <= 47
                || e.getKeyChar() >= 58 && e.getKeyChar() <= 238) {
            e.consume();
            JOptionPane.showMessageDialog(null, "Este campo solo admite números", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     void verificarDatosExistentes(String campo, String columna, String tabla, String mensaje) {
        Conexion cc = new Conexion();
        Connection cn = cc.getConexion();
        String sql = "SELECT " + columna + " FROM " + tabla + " WHERE " + columna + " = '" + campo + "'";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                if (rs.getString(columna).equals(campo)) {
                      }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo verificar\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
                }
}
