/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios_SAG;

import Conexion.Conexion;
import Logs.log;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Allisson Castro
 */
public class CargoHistorico extends javax.swing.JFrame {

    /**
     * Creates new form CargoHistorico
     */
    log lo = new log();
    String cargoH = "Cargo Historico";

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("componentes/LOGOSAG(2).png"));
        return retValue;
    }

    public CargoHistorico() {
        initComponents();
        cargarnombre();
        cargartabla();
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_WEEK, -10);
        Calendar cale = Calendar.getInstance();
        cale.add(Calendar.YEAR, -3);
        Calendar calen = Calendar.getInstance();
        calen.add(Calendar.DAY_OF_WEEK, -1);
        Date min = cal.getTime();
        Date mini = cale.getTime();
        Date max = new Date();
        Date maxi = calen.getTime();

        txtFechaFinalCH.setSelectableDateRange(min, max);
        txtFechaIncioCH.setSelectableDateRange(mini, maxi);
        CargaE CH = new CargoHistorico.CargaE();

        comboCargarEmpleado.setModel(CH.getvalues());
        Habillitar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonRegresarCH = new javax.swing.JLabel();
        BotonAgregarCH = new javax.swing.JLabel();
        BotonEditarCH = new javax.swing.JLabel();
        BotonGuardarCH = new javax.swing.JLabel();
        BotonCancelarCH = new javax.swing.JLabel();
        txtBuscarCH = new javax.swing.JTextField();
        txtCargoCH = new javax.swing.JTextField();
        txtFechaIncioCH = new com.toedter.calendar.JDateChooser();
        txtFechaFinalCH = new com.toedter.calendar.JDateChooser();
        txtNombreCH = new javax.swing.JTextField();
        txtIdE = new javax.swing.JLabel();
        comboCargarEmpleado = new javax.swing.JComboBox<>();
        txtIdCargoCH = new javax.swing.JLabel();
        Table = new javax.swing.JScrollPane();
        TablaCH = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonRegresarCH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresarCH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarCHMouseClicked(evt);
            }
        });
        getContentPane().add(BotonRegresarCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 130, 30));

        BotonAgregarCH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAgregarCHMouseClicked(evt);
            }
        });
        getContentPane().add(BotonAgregarCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 130, 40));

        BotonEditarCH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEditarCHMouseClicked(evt);
            }
        });
        getContentPane().add(BotonEditarCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 130, 40));

        BotonGuardarCH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardarCHMouseClicked(evt);
            }
        });
        getContentPane().add(BotonGuardarCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 130, 40));

        BotonCancelarCH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCancelarCHMouseClicked(evt);
            }
        });
        getContentPane().add(BotonCancelarCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 140, 40));

        txtBuscarCH.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtBuscarCH.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscarCH.setText("Buscar por ID y Nombre");
        txtBuscarCH.setBorder(null);
        txtBuscarCH.setOpaque(false);
        txtBuscarCH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarCHFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarCHFocusLost(evt);
            }
        });
        txtBuscarCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCHActionPerformed(evt);
            }
        });
        txtBuscarCH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarCHKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscarCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 225, 240, 30));
        txtBuscarCH.getAccessibleContext().setAccessibleDescription("");

        txtCargoCH.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtCargoCH.setForeground(new java.awt.Color(153, 153, 153));
        txtCargoCH.setText("Ingrese Cargo");
        txtCargoCH.setBorder(null);
        txtCargoCH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCargoCH.setEnabled(false);
        txtCargoCH.setOpaque(false);
        txtCargoCH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCargoCHFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCargoCHFocusLost(evt);
            }
        });
        txtCargoCH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCargoCHMousePressed(evt);
            }
        });
        txtCargoCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoCHActionPerformed(evt);
            }
        });
        txtCargoCH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCargoCHKeyTyped(evt);
            }
        });
        getContentPane().add(txtCargoCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 190, 30));

        txtFechaIncioCH.setToolTipText("");
        txtFechaIncioCH.setEnabled(false);
        txtFechaIncioCH.setOpaque(false);
        getContentPane().add(txtFechaIncioCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 190, 30));

        txtFechaFinalCH.setEnabled(false);
        txtFechaFinalCH.setOpaque(false);
        getContentPane().add(txtFechaFinalCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 478, 190, 28));

        txtNombreCH.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtNombreCH.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreCH.setText("Ingrese Nombre Empleado");
        txtNombreCH.setBorder(null);
        txtNombreCH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNombreCH.setEnabled(false);
        txtNombreCH.setOpaque(false);
        txtNombreCH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreCHFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreCHFocusLost(evt);
            }
        });
        txtNombreCH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreCHMousePressed(evt);
            }
        });
        txtNombreCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCHActionPerformed(evt);
            }
        });
        txtNombreCH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCHKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombreCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 190, 30));
        getContentPane().add(txtIdE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 20, 20));

        comboCargarEmpleado.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        comboCargarEmpleado.setForeground(new java.awt.Color(153, 153, 153));
        comboCargarEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Empleado..." }));
        comboCargarEmpleado.setOpaque(false);
        comboCargarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboCargarEmpleadoMouseClicked(evt);
            }
        });
        comboCargarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCargarEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(comboCargarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 230, 30));
        getContentPane().add(txtIdCargoCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 20, 20));

        TablaCH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Cargo", "Nombre Empleado", "Fecha Inicio", "Fecha Final", "Cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaCH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCHMouseClicked(evt);
            }
        });
        Table.setViewportView(TablaCH);

        getContentPane().add(Table, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 710, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/Pantalla Cargo Historico_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1000, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCargoCHFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCargoCHFocusGained
        if (txtCargoCH.getText().equals("Ingrese Cargo")) {
            txtCargoCH.setText("");
            txtCargoCH.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtCargoCHFocusGained

    private void txtCargoCHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCargoCHFocusLost
        if (txtCargoCH.getText().equals("")) {
            txtCargoCH.setText("Ingrese Cargo");
            txtCargoCH.setForeground(new Color(153, 153, 153));
        } else if (!txtCargoCH.getText().isEmpty()) {
            if (!txtCargoCH.getText().matches("([A-Z-ÁÉÍÓÚÑ]{1}[a-z-áéíóúñ]+[ ]*){2,4}$")) {
                JOptionPane.showMessageDialog(null, "Debes ingresar solo texto comenzándolos con mayúsculas", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtCargoCHFocusLost

    private void txtCargoCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoCHActionPerformed

    private void txtCargoCHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargoCHKeyTyped
        if (txtCargoCH.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "El máximo es de 20 caracteres para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (txtCargoCH.getText().length() > 0) {
            if (!txtCargoCH.getText().matches("^(?!.*([A-Za-zñÑáéíóúÁÉÍÓÚ\\s])\\1{2})[A-Za-zñÑáéíóúÁÉÍÓÚ\\s]+$")) {
                JOptionPane.showMessageDialog(null, "No repitas caracteres de forma incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCargoCHKeyTyped

    private void txtNombreCHFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreCHFocusGained
        if (txtNombreCH.getText().equals("Ingrese Nombre Empleado")) {
            txtNombreCH.setText("");
            txtNombreCH.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtNombreCHFocusGained

    private void txtNombreCHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreCHFocusLost
        if (txtNombreCH.getText().equals("")) {
            txtNombreCH.setText("Ingrese Nombre Empleado");
            txtNombreCH.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtNombreCHFocusLost

    private void txtNombreCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCHActionPerformed

    private void txtNombreCHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCHKeyTyped
        if (txtNombreCH.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "El máximo es de 20 caracteres para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (txtNombreCH.getText().length() > 0) {
            if (!txtNombreCH.getText().matches("^(?!.*([A-Za-zñÑáéíóúÁÉÍÓÚ\\s])\\1{2})[A-Za-zñÑáéíóúÁÉÍÓÚ\\s]+$")) {
                JOptionPane.showMessageDialog(null, "No repitas caracteres de forma incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtNombreCHKeyTyped

    private void BotonRegresarCHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarCHMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
        this.dispose();

    }//GEN-LAST:event_BotonRegresarCHMouseClicked

    private void BotonCancelarCHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCancelarCHMouseClicked

        Limpiar();
    }//GEN-LAST:event_BotonCancelarCHMouseClicked

    private void BotonAgregarCHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAgregarCHMouseClicked
        Habillitar();
    }//GEN-LAST:event_BotonAgregarCHMouseClicked

    private void BotonGuardarCHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarCHMouseClicked
        String Guardar = "BtnGuardar";
        if (txtNombreCH.getText().equals("Ingrese Nombre Empleado") || txtFechaIncioCH.getDate().equals("") || txtFechaFinalCH.getDate().equals("")
                || txtCargoCH.getText().equals("Ingrese Cargo")) {
            JOptionPane.showMessageDialog(null, "No se puede Guardar datos vacios");

        } else {
            String Id_Empleado = txtIdE.getText();
            String NombreE = txtNombreCH.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String FechaInicio = sdf.format(txtFechaIncioCH.getDate());
            String FechaFinal = sdf.format(txtFechaFinalCH.getDate());
            String Cargo = txtCargoCH.getText();

            try {
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Insert in Cargo_Historico(Id_Empleado,Fecha_Inicio,Fecha_Finalizacion,Cargo) VALUES(?,?,?,?)");

                ps.setInt(1, Integer.parseInt(Id_Empleado));
                ps.setString(2, FechaInicio);
                ps.setString(3, FechaFinal);
                ps.setString(4, Cargo);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro guardado");
                cargartabla();
                Limpiar();
            } catch (SQLException ex) {
                lo.LogBitacora("Error: No se pudo guardar el dato " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), cargoH, Guardar);
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }//GEN-LAST:event_BotonGuardarCHMouseClicked

    private void BotonEditarCHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarCHMouseClicked
        String editar = "BtnEditar";
        if (txtCargoCH.getText().equals("Ingrese Nombre Empleado") || txtCargoCH.getText().equals("Ingrese Número de Documento")) {
            JOptionPane.showMessageDialog(null, "No se puede Guardar datos vacios");
        } else {
            int IdCargo = Integer.parseInt(txtIdCargoCH.getText());

            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String FechaI = sdf.format(txtFechaIncioCH.getDate());
            String FechaF = sdf.format(txtFechaFinalCH.getDate());
            String Cargo = txtCargoCH.getText();

            try {
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Update Cargo_Historico set  Fecha_Inicio=?,Fecha_Finalizacion=?,Cargo=? Where Id_Cargo_Historico=?");
                ps.setString(1, FechaI);
                ps.setString(2, FechaF);
                ps.setString(3, Cargo);
                ps.setInt(4, IdCargo);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
                cargartabla();

                Limpiar();
                // Inhabillitar();

            } catch (SQLException ex) {
                lo.LogBitacora("Error: No se pudo editar el datos " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), cargoH, editar);
                JOptionPane.showMessageDialog(null, ex.toString());

            }
        }
    }//GEN-LAST:event_BotonEditarCHMouseClicked

    private void TablaCHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCHMouseClicked
        String tabla = "BtnTabla";
        try {
            int fila = TablaCH.getSelectedRow();
            int id = Integer.parseInt(TablaCH.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT  .Id_Empleado,CH. Id_Cargo_Historico,CH.Fecha_Inicio,CH.Fecha_Finalizacion,CH.Cargo,E.NombreE \n"
                    + "From Cargo_Historico as CH\n"
                    + "INNER JOIN Empleados AS E ON CH.Id_Empleado = E.Id_Empleado\n"
                    + "Where CH.Id_Cargo_Historico=?\n"
                    + "Order By CH.Id_Cargo_Historico");

            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {

                txtIdCargoCH.setText(String.valueOf(id));
                txtIdE.setText(rs.getString("Id_Empleado"));
                txtNombreCH.setText(rs.getString("NombreE"));
                txtFechaIncioCH.setDate(rs.getDate("Fecha_Inicio"));
                txtFechaFinalCH.setDate(rs.getDate("Fecha_Finalizacion"));
                txtCargoCH.setText(rs.getString("Cargo"));

            }

            Habillitar();
        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo guardar el dato " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), cargoH, tabla);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_TablaCHMouseClicked

    public void validarNumerosLetras(java.awt.event.KeyEvent e) {
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

    private void txtBuscarCHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCHKeyTyped
        buscarDato(txtBuscarCH.getText());
        validarNumerosLetras(evt);
        if (txtBuscarCH.getText().length() > 15) {
            JOptionPane.showMessageDialog(null, "Alcanzaste el máximo de caracteres para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (txtBuscarCH.getText().length() > 0) {
            if (!txtBuscarCH.getText().matches("^(?!.*([A-Za-zñÑáéíóúÁÉÍÓÚ\\s])\\1{2})[A-Za-zñÑáéíóúÁÉÍÓÚ\\s0-9]+$")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtBuscarCHKeyTyped

    private void comboCargarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboCargarEmpleadoMouseClicked

        // System.out.println(comboCargarEmpleado.getSelectedIndex());
    }//GEN-LAST:event_comboCargarEmpleadoMouseClicked

    private void comboCargarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCargarEmpleadoActionPerformed
        String cargar = "Btncargar";
        PreparedStatement ps;
        ResultSet rs;
        String Nombre = comboCargarEmpleado.getSelectedItem().toString();
        try {
            txtIdE.setText(Empleados.Id_emp);

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select  Id_Empleado from Empleados where NombreE=?");
            ps.setString(1, Nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                txtIdE.setText(rs.getString("Id_Empleado"));
            }
            buscarData(Integer.parseInt(txtIdE.getText()));
        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo cargar el dato " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), cargoH, cargar);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_comboCargarEmpleadoActionPerformed

    private void txtBuscarCHFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarCHFocusGained
        if (txtBuscarCH.getText().equals("Buscar por ID o Nombre")) {
            txtBuscarCH.setText("");
            txtBuscarCH.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtBuscarCHFocusGained

    private void txtBuscarCHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarCHFocusLost
        if (txtBuscarCH.getText().equals("")) {
            txtBuscarCH.setText("Buscar por ID o Nombre");
            txtBuscarCH.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtBuscarCHFocusLost

    private void txtBuscarCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCHActionPerformed

    private void txtNombreCHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreCHMousePressed
        if (txtNombreCH.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtNombreCHMousePressed

    private void txtCargoCHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCargoCHMousePressed
        if (txtCargoCH.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtCargoCHMousePressed

    /**
     * @param args the command line arguments
     */
    void buscarData(int valor) {
        String Buscar = "btnBuscar";
        String[] titulos = {"Id_Cargo", "Nombre Empleado", "Fecha inicio", "Fecha Final", "Cargo"};
        String[] registros = new String[13];
        String sql = "Select CH.Id_Cargo_Historico, E.NombreE, CH.Fecha_Inicio,CH.Fecha_Finalizacion,CH.Cargo\n"
                + "FROM Cargo_Historico AS CH \n"
                + "INNER JOIN Empleados AS E ON CH.Id_Empleado = E.Id_Empleado\n"
                + "WHERE E.Id_Empleado=" + valor + "\n"
                + "ORDER BY CH.Id_Cargo_Historico";

        DefaultTableModel model = new DefaultTableModel(null, titulos);
        Connection con = Conexion.getConexion();

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("Id_Cargo_Historico");
                registros[1] = rs.getString("NombreE");
                registros[2] = rs.getString("Fecha_Inicio");
                registros[3] = rs.getString("Fecha_Finalizacion");
                registros[4] = rs.getString("Cargo");

                model.addRow(registros);
            }

            TablaCH.setModel(model);
            // anchoColumnas();
        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo buscar el dato " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), cargoH, Buscar);
            Logger.getLogger(Sucursales.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(CargoHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargoHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargoHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargoHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargoHistorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonAgregarCH;
    private javax.swing.JLabel BotonCancelarCH;
    private javax.swing.JLabel BotonEditarCH;
    private javax.swing.JLabel BotonGuardarCH;
    private javax.swing.JLabel BotonRegresarCH;
    private javax.swing.JTable TablaCH;
    private javax.swing.JScrollPane Table;
    private javax.swing.JComboBox<String> comboCargarEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtBuscarCH;
    private javax.swing.JTextField txtCargoCH;
    private com.toedter.calendar.JDateChooser txtFechaFinalCH;
    private com.toedter.calendar.JDateChooser txtFechaIncioCH;
    private javax.swing.JLabel txtIdCargoCH;
    private javax.swing.JLabel txtIdE;
    private javax.swing.JTextField txtNombreCH;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        txtCargoCH.setText("");
        if (txtCargoCH.getText().equals("")) {
            txtCargoCH.setText("Ingrese Nombre Empleado");
            txtCargoCH.setForeground(new Color(153, 153, 153));
        }
        txtNombreCH.setText("");
        if (txtNombreCH.getText().equals("")) {
            txtNombreCH.setText("Ingrese Cargo");
            txtNombreCH.setForeground(new Color(153, 153, 153));
        }

    }

    private void Habillitar() {
        txtCargoCH.enable(Boolean.TRUE);
        txtFechaIncioCH.setEnabled(Boolean.TRUE);
        txtFechaFinalCH.setEnabled(Boolean.TRUE);
        // txtNombreCH.enable(Boolean.TRUE);

    }

    private void cargartabla() {
        String Cargar = "cargarTabla";
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaCH.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select CH.Id_Cargo_Historico, E.NombreE, CH.Fecha_Inicio,CH.Fecha_Finalizacion,CH.Cargo\n"
                    + "From Cargo_Historico as CH\n"
                    + "INNER JOIN Empleados AS E ON CH.Id_Empleado = E.Id_Empleado\n"
                    + "Order By CH.Id_Cargo_Historico");
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
            lo.LogBitacora("Error: No se pudo cargar la tabla " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), cargoH, Cargar);
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

    public void cargarnombre() {

        int tener = comboCargarEmpleado.getSelectedIndex();
        PreparedStatement ps;
        ResultSet rs;

        try {
            txtIdE.setText(Empleados.Id_emp);
            int Id = Integer.parseInt(txtIdE.getText());
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select  NombreE from Empleados where Id_Empleado=?");
            ps.setInt(1, Id);
            rs = ps.executeQuery();
            while (rs.next()) {
                txtNombreCH.setText(rs.getString("NombreE"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

    public class CargaE {

        public DefaultComboBoxModel getvalues() {
          String CargarEmpleado="Cargar Empleado";
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            try {
                Connection con = Conexion.getConexion();
                String sql = "select NombreE from Empleados";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                modelo.addElement("Seleccione Empleado...");
                while (rs.next()) {
                    modelo.addElement(rs.getString(1));
                }
                con.close();
                rs.close();
            } catch (Exception e) {
                            lo.LogBitacora("Error: No se pudo cargar empleado " + "Excepción: " + e + ". Origen: " + this.getClass().getSimpleName(), cargoH, CargarEmpleado);

                System.out.println(e);
            }
            return modelo;
        }
    }

    private void buscarDato(String valor) {
        String BuscarD = "BuscarDato";
        String[] titulos = {"ID Sueldo", "Nombre Empleado", "Fecha Inicio", "Fecha Final", "Sueldo"};
        String[] registros = new String[13];
        String sql = "Select SH.Id_Sueldo_Historico, E.NombreE, SH.Fecha_Inicio,SH.Fecha_Finalizacion,SH.Sueldo\n"
                + "FROM Sueldo_Historico AS SH \n"
                + "INNER JOIN Empleados AS E ON SH.Id_Empleado = E.Id_Empleado\n"
                + "WHERE CONCAT (SH.Id_Sueldo_Historico, ' ', E.NombreE) LIKE '%" + valor + "%'\n"
                + "ORDER BY SH.Id_Sueldo_Historico";

        DefaultTableModel model = new DefaultTableModel(null, titulos);
        Connection con = Conexion.getConexion();

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("Id_Sueldo_Historico");
                registros[1] = rs.getString("NombreE");
                registros[2] = rs.getString("Fecha_Inicio");
                registros[3] = rs.getString("Fecha_Finalizacion");
                registros[4] = rs.getString("Sueldo");

                model.addRow(registros);
            }

            TablaCH.setModel(model);
            // anchoColumnas();
        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo Buscar el dato " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), cargoH, BuscarD);
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
