/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios_SAG;

import Conexion.Conexion;
import Logs.log;
import Reportes.ReportView;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author carba
 */
public class PrecioHistoricoProducto extends javax.swing.JFrame {

    log lo = new log();
    String PrecioHistorico = "Precio historico producto";

    public static String Id_Preciop = "0";
    int agregari;
    int guardari;
    int editari;
    int cancelari;
    int reportesi;
    int activoi;
    int inactivoi;
    int anulari;
    int buscari;
    int crearcomprai;
    int historicoi;

    /**
     * Creates new form PrecioHistoricoProducto
     */
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("componentes/LOGOSAG(2).png"));
        return retValue;
    }

    public PrecioHistoricoProducto() {
        initComponents();
        txtId_Pro.setText(Productos.Id_Producto);
        usuario.setText(Login.txtUsuario.getText());
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_WEEK, +5);
        Date max = cal.getTime();
        Date min = new Date();
        txtId_Pro.setVisible(Boolean.FALSE);
        usuario.setText(Login.txtUsuario.getText());
        habilitarroles();
        //FechaFinalPH.setSelectableDateRange(min, max);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPH = new javax.swing.ButtonGroup();
        txtId_Pro = new javax.swing.JLabel();
        BotonRegresarPH = new javax.swing.JLabel();
        BotonAgregarPH = new javax.swing.JLabel();
        BotonCancelarPH = new javax.swing.JLabel();
        txtIdPH = new javax.swing.JLabel();
        txtId_PrecioHistorico = new javax.swing.JLabel();
        txtBuscarPH = new javax.swing.JTextField();
        ComboHistorico = new javax.swing.JComboBox<>();
        BotonGuardarPH = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reporte = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPrecioHistorico = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtId_Pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 20, 40));

        BotonRegresarPH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarPHMouseClicked(evt);
            }
        });
        getContentPane().add(BotonRegresarPH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        BotonAgregarPH.setEnabled(false);
        BotonAgregarPH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAgregarPHMouseClicked(evt);
            }
        });
        getContentPane().add(BotonAgregarPH, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 120, 30));
        getContentPane().add(BotonCancelarPH, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 120, 30));
        getContentPane().add(txtIdPH, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 40, 20));
        getContentPane().add(txtId_PrecioHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 100, 20));

        txtBuscarPH.setBackground(new java.awt.Color(240, 240, 240));
        txtBuscarPH.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtBuscarPH.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscarPH.setText("Buscar por Id");
        txtBuscarPH.setBorder(null);
        txtBuscarPH.setOpaque(false);
        txtBuscarPH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarPHFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarPHFocusLost(evt);
            }
        });
        txtBuscarPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarPHActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscarPH, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 235, 28));

        ComboHistorico.setBackground(new java.awt.Color(240, 240, 240));
        ComboHistorico.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        ComboHistorico.setForeground(new java.awt.Color(153, 153, 153));
        ComboHistorico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Historico", "Precio", "Impuesto", "Descuento" }));
        ComboHistorico.setBorder(null);
        ComboHistorico.setOpaque(false);
        ComboHistorico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboHistoricoItemStateChanged(evt);
            }
        });
        getContentPane().add(ComboHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 182, 28));

        BotonGuardarPH.setEnabled(false);
        BotonGuardarPH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardarPHMouseClicked(evt);
            }
        });
        getContentPane().add(BotonGuardarPH, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 110, 30));

        usuario.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 230, 20));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 70, -1));

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

        TablaPrecioHistorico.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        TablaPrecioHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Precio Historico", "Producto", "Fecha Inicio", "Fecha Final", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        TablaPrecioHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPrecioHistoricoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaPrecioHistorico);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 890, 310));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/Pantalla Precio Historico.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 940, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarPHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarPHActionPerformed

    private void BotonRegresarPHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarPHMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_BotonRegresarPHMouseClicked

    private void TablaPrecioHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPrecioHistoricoMouseClicked
        /* try {
            int fila = TablaPrecioHistorico.getSelectedRow();
            int id = Integer.parseInt(TablaPrecioHistorico.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select PH.Id_Precio_Historico, P.Nombre_Producto, PH.Fecha_Incio,PH.Fecha_Finalizacion,PH.Precio\n"
                    + "From PrecioHistorico as PH\n"
                    + "INNER JOIN Productos AS P ON PH.Id_Producto = P.Id_Producto\n"
                    + "Where PH.Id_Precio_Historico=?\n"
                    + "Order By PH.Id_Precio_Historico");

            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {

                txtIdPH.setText(String.valueOf(id));
                ComboIdProductoPH.setSelectedItem(rs.getString("Nombre_Producto"));
                FechaInicioPH.setDate(rs.getDate("Fecha_Incio"));
                FechaFinalPH.setDate(rs.getDate("Fecha_Finalizacion"));
                txtPrecioPH.setText(rs.getString("Precio"));

                System.out.println(id);

            }

            FechaFinalPH.setEnabled(Boolean.TRUE);
            BotonEditarPH.setEnabled(Boolean.TRUE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }*/
    }//GEN-LAST:event_TablaPrecioHistoricoMouseClicked

    private void BotonAgregarPHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAgregarPHMouseClicked
        if (BotonAgregarPH.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Los campos han sido cargados previamente no se puede agregar solo editar", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_BotonAgregarPHMouseClicked

    private void BotonGuardarPHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarPHMouseClicked
        if (BotonAgregarPH.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Los campos han sido cargados previamente no se puede guardar solo editar", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_BotonGuardarPHMouseClicked

    private void ComboHistoricoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboHistoricoItemStateChanged
        if (ComboHistorico.getSelectedIndex() == 1) {
            cargartabla();
        } else if (ComboHistorico.getSelectedIndex() == 2) {
            cargartablaImpuesto();
        } else if (ComboHistorico.getSelectedIndex() == 3) {
            cargartablaDescuento();
        }
    }//GEN-LAST:event_ComboHistoricoItemStateChanged

    private void txtBuscarPHFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarPHFocusGained
        if (txtBuscarPH.getText().equals("Buscar por Id")) {
            txtBuscarPH.setText("");
            txtBuscarPH.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtBuscarPHFocusGained

    private void txtBuscarPHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarPHFocusLost
        if (txtBuscarPH.getText().equals("")) {
            txtBuscarPH.setText("Buscar por Id");
            txtBuscarPH.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtBuscarPHFocusLost

    private void reporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteMouseClicked
        net.sf.jasperreports.engine.JasperReport reporte;
        HashMap hm = new HashMap();
        hm.put("Usuario", usuario.getText());
        hm.put("idp", Integer.valueOf(txtId_Pro.getText()));

        if (Integer.parseInt(txtId_Pro.getText()) == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un Producto en la pantalla de Productos");
        } else {
            if (ComboHistorico.getSelectedIndex() == 1) {

                try {
                    Connection con = Conexion.getConexion();
                    reporte = JasperCompileManager.compileReport("src/Reportes/ReporteHistoricoPrecio.jrxml");
                    JasperPrint jp = JasperFillManager.fillReport(reporte, hm, con);
                    JasperViewer.viewReport(jp, true);
                    ReportView view = new ReportView(jp, false);
                    view.setVisible(true);
                } catch (JRException ex) {
                    Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (ComboHistorico.getSelectedIndex() == 2) {
                try {
                    Connection con = Conexion.getConexion();
                    reporte = JasperCompileManager.compileReport("src/Reportes/ReporteHistoricoImpuesto.jrxml");
                    JasperPrint jp = JasperFillManager.fillReport(reporte, hm, con);
                    JasperViewer.viewReport(jp, true);
                    ReportView view = new ReportView(jp, false);
                    view.setVisible(true);
                } catch (JRException ex) {
                    Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (ComboHistorico.getSelectedIndex() == 3) {
                try {
                    Connection con = Conexion.getConexion();
                    reporte = JasperCompileManager.compileReport("src/Reportes/ReporteHistoricoDescuento.jrxml");
                    JasperPrint jp = JasperFillManager.fillReport(reporte, hm, con);
                    JasperViewer.viewReport(jp, true);
                    ReportView view = new ReportView(jp, false);
                    view.setVisible(true);
                } catch (JRException ex) {
                    Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un Historico");
            }
        }


    }//GEN-LAST:event_reporteMouseClicked

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
            java.util.logging.Logger.getLogger(PrecioHistoricoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrecioHistoricoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrecioHistoricoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrecioHistoricoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrecioHistoricoProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonAgregarPH;
    private javax.swing.JLabel BotonCancelarPH;
    private javax.swing.JLabel BotonGuardarPH;
    private javax.swing.JLabel BotonRegresarPH;
    private javax.swing.JComboBox<String> ComboHistorico;
    private javax.swing.JTable TablaPrecioHistorico;
    private javax.swing.ButtonGroup buttonGroupPH;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel reporte;
    private javax.swing.JTextField txtBuscarPH;
    private javax.swing.JLabel txtIdPH;
    private javax.swing.JLabel txtId_PrecioHistorico;
    private javax.swing.JLabel txtId_Pro;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
private void cargartabla() {
        String cargarTabla = "Cargar Tabla";
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaPrecioHistorico.getModel();
        modeloTabla.setRowCount(0);
        int idpro = Integer.parseInt(txtId_Pro.getText());

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select PH.Id_Precio_Historico, P.Nombre_Producto, PH.Fecha_Incio,PH.Fecha_Finalizacion,PH.Precio\n"
                    + "From PrecioHistorico as PH\n"
                    + "INNER JOIN Productos AS P ON PH.Id_Producto = P.Id_Producto\n"
                    + "Where P.Id_Producto=?\n"
                    + "Order By PH.Id_Precio_Historico");
            ps.setInt(1, idpro);
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
            lo.LogBitacora("Error: No se pudo cargar id de la tabla " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), PrecioHistorico, cargarTabla);

            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

    private void cargartablaImpuesto() {
        String CargarTablaImpuesto = "Cargar tabla impuesto";
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaPrecioHistorico.getModel();
        modeloTabla.setRowCount(0);
        int idpro = Integer.parseInt(txtId_Pro.getText());

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select IH.Id_Impuesto_Historico,P.Nombre_Producto,IH.Fecha_Incio,IH.Fecha_Finalizacion,TI.ISV\n"
                    + "From ImpuestoHistorico as IH\n"
                    + "Inner Join Productos as P ON IH.Id_Producto=P.Id_Producto\n"
                    + "Inner Join Tipo_Impuesto as TI ON IH.Id_Impuesto=TI.Id_Tipo_Impuesto\n"
                    + "Where P.Id_Producto=?\n"
                    + "Order by IH.Id_Impuesto_Historico");
            ps.setInt(1, idpro);
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
            lo.LogBitacora("Error: No se pudo cargar tabla impuesto " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), PrecioHistorico, CargarTablaImpuesto);

            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

    private void cargartablaDescuento() {
        String cargarD = "Cargar descuento";
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaPrecioHistorico.getModel();
        modeloTabla.setRowCount(0);
        int idpro = Integer.parseInt(txtId_Pro.getText());

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select IH.Id_Descuento_Historico,P.Nombre_Producto,IH.Fecha_Inicio,IH.Fecha_Finalizacion,TI.Descripcion\n"
                    + "                    From Descuento_Historico as IH\n"
                    + "                    Inner Join Productos as P ON IH.Id_Producto=P.Id_Producto\n"
                    + "                    Inner Join DescuentoProducto as TI ON IH.Id_Descuento=TI.Id_DescuentoP\n"
                    + "                    Where P.Id_Producto=?\n"
                    + "                    Order by IH.Id_Descuento_Historico");
            ps.setInt(1, idpro);
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
            lo.LogBitacora("Error: No se pudo cargar tabla descuento " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), PrecioHistorico, cargarD);

            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

    public void habilitarroles() {
        try {

            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select PU.Agregar, PU.Guardar, PU.Cancelar, PU.Editar, PU.Activo, PU.Inactivo, PU.Reporte, PU.Anular, PU.CrearCompra, PU.Historicos, PU.Buscar\n"
                    + "From PermisosUsuario AS PU\n"
                    + "Inner Join Usuario as U on PU.IdUsuario=U.Id_Usuario\n"
                    + "where PU.IdPermiso=? and U.Nombre=?");
            ps.setInt(1, 12);
            ps.setString(2, usuario.getText());
            rs = ps.executeQuery();
            System.out.println(usuario.getText());

            while (rs.next()) {
                agregari = rs.getInt("Agregar");
                guardari = rs.getInt("Guardar");
                cancelari = rs.getInt("Cancelar");
                editari = rs.getInt("Editar");
                activoi = rs.getInt("Activo");
                inactivoi = rs.getInt("Inactivo");
                reportesi = rs.getInt("Reporte");
                anulari = rs.getInt("Anular");
                crearcomprai = rs.getInt("CrearCompra");
                historicoi = rs.getInt("Historicos");
                buscari = rs.getInt("Buscar");
                System.out.print(agregari + " " + guardari + " " + cancelari);

            }
        } catch (SQLException ex) {
            //lo.LogBitacora("Error: No se pudo seleccionar la tabla" + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), proveedores, tablap);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
//        if (agregari == 1) {
//            BotonAgregarPro.setEnabled(Boolean.TRUE);
//        } else if (agregari == 0) {
//            BotonAgregarPro.setEnabled(Boolean.FALSE);
//            BotonAgregarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));
//        }
//
//        if (guardari == 1) {
//            BotonGuardarPro.setEnabled(Boolean.TRUE);
//        } else if (guardari == 0) {
//            BotonGuardarPro.setEnabled(Boolean.FALSE);
//            BotonGuardarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));
//
//        }
//        if (editari == 1) {
//            BotonEditarPro.setEnabled(Boolean.TRUE);
//        } else {
//            BotonEditarPro.setEnabled(Boolean.FALSE);
//            BotonEditarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));
//        }
//
//        if (cancelari == 1) {
//            BotonCancelarPro.setEnabled(Boolean.TRUE);
//
//        } else {
//            BotonCancelarPro.setEnabled(Boolean.FALSE);
//            BotonCancelarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));

        if (reportesi == 1) {
            reporte.setVisible(Boolean.TRUE);

        } else {
            reporte.setVisible(Boolean.FALSE);
            //jLabel2.setEnabled(Boolean.TRUE);
        }
        if (buscari == 1) {
            txtBuscarPH.setEnabled(Boolean.TRUE);
        } else {
            txtBuscarPH.setEnabled(Boolean.FALSE);
            txtBuscarPH.setText("NO DISPONIBLE");
        }
        /* if (anulari == 1) {
            Anular.setSelected(Boolean.TRUE);
        } else {
            Anular.setSelected(Boolean.FALSE);
        }*/
//        if (activoi == 1) {
//            //BotonActivoPro.setVisible(Boolean.TRUE);
//        } else {
//            BotonActivoPro.setVisible(Boolean.FALSE);
//        }
//        if (inactivoi == 1) {
//            //BotonInactivoPro.setVisible(Boolean.TRUE);
//        } else {
//            BotonInactivoPro.setVisible(Boolean.FALSE);
    }
    /*if (historicoi == 1) {
            Historico.setSelected(Boolean.TRUE);
        } else {
            Historico.setSelected(Boolean.FALSE);
        }
        if (crearcomprai == 1) {
            CrearCompra.setSelected(Boolean.TRUE);
        } else {
            CrearCompra.setSelected(Boolean.FALSE);
        }*/
}
