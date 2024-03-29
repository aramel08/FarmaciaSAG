/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios_SAG;

import Conexion.Conexion;
import static Formularios_SAG.Factura.ComboTipoPago;
import static Formularios_SAG.Factura.txtTotalaPagarP;
import Logs.log;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Integer.getInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Allisson Castro
 */
public class Operaciones2 extends javax.swing.JFrame {
     log lo = new log();
    String Operaciones = "Operaciones";
    /**
     * public static String Id_Agencia = "0"; public static String Id_Empleado =
     * "0"; public static String caja = "0";
     *
     */
    public static String Id_Agencia = "0";
    public static String Id_Empleado = "0";
    public static String caja = "0";
    public double efectico = 0.00;
    public double tarjeta = 0.00;

    public Operaciones2() {
        initComponents();
        Date max = new Date();
        CargarSucursal();
        txtFecha.setDate(max);
        txtFecha.setSelectableDateRange(max, max);
        String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        txtHoraI.setText(timeStamp);

        CargarCaja cs = new Operaciones2.CargarCaja();
        ComboCajaO.setModel(cs.getvalues());
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

        jSpinField1 = new com.toedter.components.JSpinField();
        txtHoraF = new javax.swing.JFormattedTextField();
        BotonGuardarO = new javax.swing.JLabel();
        BotonCancelarO = new javax.swing.JLabel();
        BotonEditarO = new javax.swing.JLabel();
        BotonRegresarO = new javax.swing.JLabel();
        txtIdE = new javax.swing.JLabel();
        txtNombreS = new javax.swing.JTextField();
        txtIdC = new javax.swing.JLabel();
        txtIdS = new javax.swing.JLabel();
        txtNombreE = new javax.swing.JTextField();
        txtHoraI = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        ComboCajaO = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHoraF.setBorder(null);
        try {
            txtHoraF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHoraF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoraFFocusLost(evt);
            }
        });
        txtHoraF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHoraFMouseClicked(evt);
            }
        });
        txtHoraF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraFKeyTyped(evt);
            }
        });
        getContentPane().add(txtHoraF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 190, 30));

        BotonGuardarO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardarOMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonGuardarOMouseEntered(evt);
            }
        });
        getContentPane().add(BotonGuardarO, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 120, 30));

        BotonCancelarO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCancelarOMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonCancelarOMousePressed(evt);
            }
        });
        getContentPane().add(BotonCancelarO, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 140, 120, 30));

        BotonEditarO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEditarOMouseClicked(evt);
            }
        });
        getContentPane().add(BotonEditarO, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 120, 30));

        BotonRegresarO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarOMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonRegresarOMousePressed(evt);
            }
        });
        getContentPane().add(BotonRegresarO, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 46, 120, 30));
        getContentPane().add(txtIdE, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 30, 20));

        txtNombreS.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtNombreS.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreS.setText("Ingrese Nombre Sucursal");
        txtNombreS.setBorder(null);
        txtNombreS.setEnabled(false);
        txtNombreS.setOpaque(false);
        txtNombreS.setVerifyInputWhenFocusTarget(false);
        txtNombreS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreSFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreSFocusLost(evt);
            }
        });
        txtNombreS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreSMousePressed(evt);
            }
        });
        txtNombreS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreSActionPerformed(evt);
            }
        });
        txtNombreS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreSKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreSKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombreS, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 180, 30));
        getContentPane().add(txtIdC, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 40, 20));

        txtIdS.setText("0");
        getContentPane().add(txtIdS, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 40, 20));

        txtNombreE.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtNombreE.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreE.setText("Ingrese Nombre y Apellido");
        txtNombreE.setBorder(null);
        txtNombreE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNombreE.setEnabled(false);
        txtNombreE.setOpaque(false);
        txtNombreE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreEFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreEFocusLost(evt);
            }
        });
        txtNombreE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreEMousePressed(evt);
            }
        });
        txtNombreE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEActionPerformed(evt);
            }
        });
        txtNombreE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 180, 30));

        txtHoraI.setText("jTextField1");
        txtHoraI.setBorder(null);
        getContentPane().add(txtHoraI, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 190, 30));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 190, 30));

        ComboCajaO.setBorder(null);
        getContentPane().add(ComboCajaO, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 190, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/Pantalla Operaciones 2(2).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void BotonGuardarOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarOMouseClicked
        String Guardar="Guardar Operacion";
        ObtenerIdC();
        if (ComboCajaO.equals("Seleccione Caja")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una caja");
        } else if (txtHoraF.getText().equals("  :  ")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una hora provisional, esta debe ser modificada al finalizar operaciones");
        } else {
            int Sucursal = Integer.parseInt(txtIdS.getText());
            int Caja = Integer.parseInt(txtIdC.getText());
            int Empleado = Integer.parseInt(txtIdE.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String Fecha = sdf.format(txtFecha.getDate());

            try {
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Insert into Operaciones (Id_Sucursal, Id_Caja,Id_Empleado,Fecha,Hora_Inicio,Hora_Finalizacion) VALUES(?,?,?,?,?,?)");
                ps.setInt(1, Sucursal);
                ps.setInt(2, Caja);
                ps.setInt(3, Empleado);
                ps.setString(4, Fecha);
                ps.setString(5, txtHoraI.getText());
                ps.setString(6, txtHoraF.getText());
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Operaciones Inicializadas");
                Id_Agencia = txtIdS.getText();
                //Id_Empleado = ComboE.getSelectedItem().toString();
                caja = ComboCajaO.getSelectedItem().toString();
                Factura F = new Factura();
                BotonGuardarO.setEnabled(Boolean.FALSE);
                txtNombreE.setEnabled(Boolean.FALSE);
                txtHoraI.setEnabled(Boolean.FALSE);
                ComboCajaO.setEnabled(Boolean.FALSE);
                txtFecha.setEnabled(Boolean.FALSE);
                BotonCancelarO.setEnabled(Boolean.FALSE);
                BotonRegresarO.setEnabled(Boolean.FALSE);
                {
                    F.setVisible(true);
                }

                // Inhabillitar();
            } catch (SQLException ex) {
               lo.LogBitacora("Error: No se pudo guardar la operacion" + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), Operaciones,Guardar);

                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }

    }//GEN-LAST:event_BotonGuardarOMouseClicked

    private void txtHoraFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHoraFMouseClicked
        if (Validar_CampoHora(txtHoraF.getText()) == true) {
        } else {
            JOptionPane.showMessageDialog(null, "la hora es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
            //evt.consume();

        }


    }//GEN-LAST:event_txtHoraFMouseClicked

    private void BotonRegresarOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarOMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_BotonRegresarOMouseClicked

    private void txtHoraFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraFKeyTyped
        validarNumeros(evt);
        if (txtHoraF.getText().length() > 7) {
            evt.consume();
        }

    }//GEN-LAST:event_txtHoraFKeyTyped

    private void txtNombreSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreSFocusGained
        if (txtNombreS.getText().equals("Ingrese Nombre Sucursal")) {
            txtNombreS.setText("");
            txtNombreS.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtNombreSFocusGained

    private void txtNombreSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreSFocusLost
        if (txtNombreS.getText().equals("")) {
            txtNombreS.setText("Ingrese Nombre Sucursal");
            txtNombreS.setForeground(new Color(153, 153, 153));
        } else if (txtNombreS.getText().length() < 20) {
            JOptionPane.showMessageDialog(null, "El nombre debe tener al menos 20 caracteres", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtNombreSFocusLost

    private void txtNombreSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreSMousePressed
        if (txtNombreS.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtNombreSMousePressed

    private void txtNombreSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreSActionPerformed

    private void txtNombreSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreSKeyReleased

    }//GEN-LAST:event_txtNombreSKeyReleased

    private void txtNombreSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreSKeyTyped

        if (txtNombreS.getText().length() > 25) {
            JOptionPane.showMessageDialog(null, "El máximo es de 25 caracteres para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (txtNombreS.getText().length() > 0) {
            if (!txtNombreS.getText().matches("^(?!.*([A-Za-zñÑáéíóúÁÉÍÓÚ\\s])\\1{2})[A-Za-zñÑáéíóúÁÉÍÓÚ\\s]+$")) {
                JOptionPane.showMessageDialog(null, "No repitas caracteres de forma incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                evt.consume();
            }
            /**
             * if (nuevo.isEmpty()) { JOptionPane.showMessageDialog(null, "NO
             * ESPACIOS EN BLANCO", "Advertencia", JOptionPane.WARNING_MESSAGE);
             * evt.consume();
             */

        }
    }//GEN-LAST:event_txtNombreSKeyTyped

    private void txtNombreEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreEFocusGained
        if (txtNombreE.getText().equals("Ingrese Nombre y Apellido")) {
            txtNombreE.setText("");
            txtNombreE.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtNombreEFocusGained

    private void txtNombreEFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreEFocusLost
        if (txtNombreE.getText().equals("")) {
            txtNombreE.setText("Ingrese Nombre y Apellido");
            txtNombreE.setForeground(new Color(153, 153, 153));
        } else if (!txtNombreE.getText().isEmpty()) {
            if (!txtNombreE.getText().matches("^[A-Z-ÁÉÍÓÚÑ]{1}[a-z-áéíóúñ]+$")) {
                JOptionPane.showMessageDialog(null, "Debes escribir un nombre comenzando en mayúscula. No utilice espacios", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtNombreEFocusLost

    private void txtNombreEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreEMousePressed
        if (txtNombreE.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtNombreEMousePressed

    private void txtNombreEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEActionPerformed

    private void txtNombreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEKeyTyped
        if (txtNombreE.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, " El máximo es de 20 caracteres para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (txtNombreE.getText().length() > 0) {
            if (!txtNombreE.getText().matches("^(?!.*([A-Za-zñÑáéíóúÁÉÍÓÚ\\s])\\1{2})[A-Za-zñÑáéíóúÁÉÍÓÚ\\s]+$")) {
                JOptionPane.showMessageDialog(null, "No repitas caracteres de forma incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtNombreEKeyTyped

    private void BotonGuardarOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarOMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonGuardarOMouseEntered

    private void BotonRegresarOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarOMousePressed
        if (BotonRegresarO.isEnabled() == false) {
            JOptionPane.showMessageDialog(null, "Debes Finalizar Opereaciones para regresar al inicio", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_BotonRegresarOMousePressed

    private void BotonCancelarOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCancelarOMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginVendedores().setVisible(true);
            }
        });
        this.dispose();

    }//GEN-LAST:event_BotonCancelarOMouseClicked

    private void BotonCancelarOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCancelarOMousePressed
        if (BotonCancelarO.isEnabled() == false) {
            JOptionPane.showMessageDialog(null, "No Se pueden cancelar las operaciones ya inicializadas debes Finalizar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_BotonCancelarOMousePressed

    private void BotonEditarOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarOMouseClicked
       /* obtenerEfectivo();
        obtenerTarjeta();
        Double EfectivoReal=efectico-tarjeta;
        System.out.print(EfectivoReal);
        Double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Cantidad Pagada en Efectivo:"));
        Double tarjeta = Double.valueOf(JOptionPane.showInputDialog("Ingrese Cantidad Pagada en tarjeta:"));
        
        if (efectico==(EfectivoReal+tarjeta)) {

           
            

        } else if (tarjeta!=this.tarjeta) {
            //String Mon=
            
                JOptionPane.showMessageDialog(null, "El monto de la tarjeta debe ser menor al total", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if(monto!=EfectivoReal ){
            JOptionPane.showMessageDialog(null, "El monto de los pagos en efectivo", "Advertencia", JOptionPane.WARNING_MESSAGE); 
        }*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
        this.dispose();
        JOptionPane.showMessageDialog(null, "Operaciones Finalizadas");

       
    }//GEN-LAST:event_BotonEditarOMouseClicked

    private void txtHoraFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraFFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraFFocusLost
    public void validarNumeros(java.awt.event.KeyEvent e) {
        if (e.getKeyChar() >= 33 && e.getKeyChar() <= 47
                || e.getKeyChar() >= 58 && e.getKeyChar() <= 238) {
            e.consume();
            JOptionPane.showMessageDialog(null, "Este campo solo admite números", "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Operaciones2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operaciones2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operaciones2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operaciones2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operaciones2().setVisible(true);
            }
        });
    }

    public Boolean Validar_CampoHora(String Hora) {
        boolean b;
        char[] a = Hora.toString().toCharArray();
        String[] c = Hora.split(":");
        if ((a[0] == ' ') || (a[1] == ' ') || (a[2] == ' ') || (a[3] == ' ') || (a[4] == ' ') || (getInteger(c[0]) > 24) || (getInteger(c[1]) > 59)) {
            b = false;
        } else {
            b = true;
        }
        return b;

    }

    public int getInteger(String valor) {
        int integer = Integer.parseInt(valor);
        return integer;
    }

    private void Limpiar() {

        ComboCajaO.setSelectedIndex(0);
    }

    void ObtenerIdC(String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public class CargarE {

        public DefaultComboBoxModel getvalues() {
            String CargarCombo="Cargar Empleado ";
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            try {

                int Surc = Integer.parseInt(txtIdS.getText());
                ResultSet rs;
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("select NombreE from Empleados where Id_Sucursal=?");
                ps.setInt(1, Surc);
                rs = ps.executeQuery();
                modelo.addElement("Seleccione Empleado...");
                while (rs.next()) {
                    modelo.addElement(rs.getString(1));
                }
                con.close();
                rs.close();
            } catch (Exception e) {
              lo.LogBitacora("Error: No se pudo cargar empleado" + "Excepción: " + e + ". Origen: " + this.getClass().getSimpleName(), Operaciones,CargarCombo);

                System.out.println(e);
            }
            return modelo;
        }
    }

    public void CargarSucursal() {

        try {
            String Surc = LoginVendedores.txtUsuarioV.getText();
            System.out.println(Surc);
            ResultSet rs;
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Select E.NombreE,S.Nombre,E.Id_Empleado,S.Id_Sucursal\n"
                    + "From Empleados as E\n"
                    + "Inner JOin Sucursal as S on E.Id_Sucursal=S.Id_Sucursal\n"
                    + "Where E.Usuario=?");
            ps.setString(1, Surc);
            rs = ps.executeQuery();
            while (rs.next()) {
                txtNombreE.setText(rs.getString("NombreE"));
                txtNombreS.setText(rs.getString("Nombre"));
                txtIdS.setText(rs.getString("Id_Sucursal"));
                txtIdE.setText(rs.getString("Id_Empleado"));
                Id_Empleado = rs.getString("Id_Empleado");
            }
            con.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public class CargarCaja {
          String cargarC="Carga Caja";
        public DefaultComboBoxModel getvalues() {

            // int Cj = Integer.parseInt(txtIdS.getText());
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            try {
                int Surc = Integer.parseInt(txtIdS.getText());
                ResultSet rs;
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Select Num_Caja from Caja where Id_Sucursal=?");
                ps.setInt(1, Surc);
                rs = ps.executeQuery();
                modelo.addElement("Seleccione Caja");
                while (rs.next()) {
                    modelo.addElement(rs.getString(1));
                }
                con.close();
                rs.close();
            } catch (Exception e) {
                lo.LogBitacora("Error: No se pudo cargar caja" + "Excepción: " + e + ". Origen: " + this.getClass().getSimpleName(), Operaciones,cargarC);

                System.out.println(e);
            }
            return modelo;
        }
    }

    public void ObtenerIdC() {
        String Nombre = ComboCajaO.getSelectedItem().toString();
        try {
            ResultSet rs;
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Select Id_Caja From Caja Where Num_Caja=?");
            ps.setString(1, Nombre);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtIdC.setText(rs.getString("Id_Caja"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void obtenerTarjeta() {
        try {
            ResultSet rs;
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Select Top 1 sum(montotarjeta)as MontoTarjeta From Factura \n"
                    + "Group by Fecha_Factura\n"
                    + "Order by Fecha_Factura desc");
            rs = ps.executeQuery();

            while (rs.next()) {
                tarjeta = Double.valueOf(rs.getString("MontoTarjeta"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void obtenerEfectivo() {
        try {
            ResultSet rs;
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Select TOP 1  (Sum(F.Precio_Unitario*F.Cantidad)  - Sum(f.Descuento))+Sum(F.Impuesto) as Total\n"
                    + "From DetalleFactura as F \n"
                    + "Inner Join Factura as DD ON F.Id_Factura=DD.Id_Factura\n"
                    + "Group by DD.Fecha_Factura\n"
                    + "Order by  DD.Fecha_Factura desc");
            rs = ps.executeQuery();

            while (rs.next()) {
                efectico = Double.valueOf(rs.getString("Total"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonCancelarO;
    private javax.swing.JLabel BotonEditarO;
    private javax.swing.JLabel BotonGuardarO;
    private javax.swing.JLabel BotonRegresarO;
    private javax.swing.JComboBox<String> ComboCajaO;
    private javax.swing.JLabel jLabel1;
    private com.toedter.components.JSpinField jSpinField1;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JFormattedTextField txtHoraF;
    private javax.swing.JTextField txtHoraI;
    private javax.swing.JLabel txtIdC;
    private javax.swing.JLabel txtIdE;
    private javax.swing.JLabel txtIdS;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtNombreS;
    // End of variables declaration//GEN-END:variables
}
