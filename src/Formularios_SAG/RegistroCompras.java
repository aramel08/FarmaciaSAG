/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios_SAG;

import Conexion.Conexion;
import static Formularios_SAG.RegistroVentas.TablaDEVenta;
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
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Allisson Castro
 */
public class RegistroCompras extends javax.swing.JFrame {

    log lo = new log();
    String comprasr = "RegistroCompra";

    String Estado;
    String EstadoDC;
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

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("componentes/LOGOSAG(2).png"));
        return retValue;
    }
    public static String Id_Comp = "0";

    public RegistroCompras() {
        initComponents();
        usuario.setText(Login.txtUsuario.getText());
        habilitarroles();
        cargartabla();
        anchoColumnas();
        TablaDTC.setVisible(Boolean.FALSE);
        Editar.setVisible(Boolean.FALSE);
        Anular.setVisible(Boolean.FALSE);
        barraEmpleado1.setVisible(false);
    }

    void anchoColumnas() {
        TableColumnModel anchoColumnas = TablaDEcompras.getColumnModel();
        anchoColumnas.getColumn(0).setPreferredWidth(50);
        anchoColumnas.getColumn(1).setPreferredWidth(150);
        anchoColumnas.getColumn(2).setPreferredWidth(150);
        anchoColumnas.getColumn(3).setPreferredWidth(150);
        anchoColumnas.getColumn(4).setPreferredWidth(150);
        anchoColumnas.getColumn(5).setPreferredWidth(150);
        anchoColumnas.getColumn(6).setPreferredWidth(150);
        anchoColumnas.getColumn(7).setPreferredWidth(150);
        anchoColumnas.getColumn(8).setPreferredWidth(150);
        anchoColumnas.getColumn(9).setPreferredWidth(150);

        TableColumnModel anchoColumna = TablaDTC.getColumnModel();
        anchoColumna.getColumn(0).setPreferredWidth(50);
        anchoColumna.getColumn(1).setPreferredWidth(150);
        anchoColumna.getColumn(2).setPreferredWidth(150);
        anchoColumna.getColumn(3).setPreferredWidth(150);
        anchoColumna.getColumn(4).setPreferredWidth(150);
        anchoColumna.getColumn(5).setPreferredWidth(150);
        anchoColumna.getColumn(6).setPreferredWidth(150);
        anchoColumna.getColumn(7).setPreferredWidth(150);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraEmpleado = new javax.swing.JScrollPane();
        TablaDEcompras = new javax.swing.JTable();
        barraEmpleado1 = new javax.swing.JScrollPane();
        TablaDTC = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Editar = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        reporte = new javax.swing.JLabel();
        txtRegresarC = new javax.swing.JLabel();
        BuscarC = new javax.swing.JTextField();
        iddetalle = new javax.swing.JLabel();
        Anular = new javax.swing.JLabel();
        Jlabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaDEcompras.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        TablaDEcompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Número de Factura", "Nombre de Empresa", "Fecha de Compra", "Fecha de Entrega", "Fecha de Vencimiento", "Descripción", "Descuento", "Total Compra", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDEcompras.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TablaDEcompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablaDEcompras.setRowHeight(30);
        TablaDEcompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDEcomprasMouseClicked(evt);
            }
        });
        barraEmpleado.setViewportView(TablaDEcompras);

        getContentPane().add(barraEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 1110, 160));

        TablaDTC.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        TablaDTC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Número de Factura", "Producto", "Costo Unitario", "Cantidad", "Impuesto", "Descuento", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDTC.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TablaDTC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablaDTC.setRowHeight(30);
        TablaDTC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDTCMouseClicked(evt);
            }
        });
        barraEmpleado1.setViewportView(TablaDTC);

        getContentPane().add(barraEmpleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 1110, 160));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 150, 160, 50));

        Editar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Editar.setText("Editar");
        Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditarMouseClicked(evt);
            }
        });
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 220, -1, -1));

        usuario.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 680, 230, 20));

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
        getContentPane().add(reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, 120, 40));

        txtRegresarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRegresarCMouseClicked(evt);
            }
        });
        getContentPane().add(txtRegresarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 56, 160, 40));

        BuscarC.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        BuscarC.setForeground(new java.awt.Color(153, 153, 153));
        BuscarC.setText("Buscar por Id o Número de Factura");
        BuscarC.setBorder(null);
        BuscarC.setOpaque(false);
        BuscarC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BuscarCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BuscarCFocusLost(evt);
            }
        });
        BuscarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarCMouseClicked(evt);
            }
        });
        BuscarC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarCKeyTyped(evt);
            }
        });
        getContentPane().add(BuscarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 155, 300, 37));
        getContentPane().add(iddetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, 20, 20));

        Anular.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Anular.setText("Anular");
        Anular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnularMouseClicked(evt);
            }
        });
        getContentPane().add(Anular, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 450, -1, -1));

        Jlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/Pantalla Compras(4).png"))); // NOI18N
        getContentPane().add(Jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 760));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 700, 70, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TablaDEcomprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDEcomprasMouseClicked
        cargarTDetalle();
    }//GEN-LAST:event_TablaDEcomprasMouseClicked

    private void TablaDTCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDTCMouseClicked
        int fila = TablaDTC.getSelectedRow();
        int id = Integer.parseInt(TablaDTC.getValueAt(fila, 0).toString());
        iddetalle.setText(String.valueOf(id));
        EstadoDC = TablaDTC.getValueAt(fila, 7).toString();
        System.out.println(id);
        System.out.println(EstadoDC);
        if (EstadoDC.equals("Procesada")) {
            Anular.setVisible(true);
        } else {
            Anular.setVisible(false);
        }
    }//GEN-LAST:event_TablaDTCMouseClicked

    private void EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarMouseClicked
        PantallaCompras PC = new PantallaCompras();
        {
            PC.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_EditarMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (jLabel1.isEnabled()) {
            Id_Comp = "0";
            PantallaCompras PC = new PantallaCompras();
            {
                PC.setVisible(true);
                dispose();
            }
        } else {
          JOptionPane.showMessageDialog(null, "Esta acción no se encuentra disponible para tu usuario", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jLabel1MouseClicked

    private void AnularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnularMouseClicked
        String anularc = "AnularCompra";
        int resp = JOptionPane.showConfirmDialog(null, "¿Deseas Anular este registro?" + " " + "Esta acción es irreversible", "Alerta!", JOptionPane.YES_NO_OPTION);
        int detalle = Integer.parseInt(iddetalle.getText());
        int fila = Integer.parseInt(iddetalle.getText());
        int filaw = TablaDTC.getSelectedRow();
        String id = TablaDTC.getValueAt(filaw, 0).toString();
        System.out.println(detalle);
        if (resp == 0) {
            try {
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Update Detalle_Compra set Cantidad=0,Id_EstadoDC=3 where Id_Detalle_Compra=?");
                ps.setString(1, id);
                ps.executeUpdate();
                /*PreparedStatement pst = con.prepareStatement("Update inventario set Entradas = Entradas-?, Stock= Stock-?");
            pst.setInt(1, cant);
            pst.setInt(2, cant);
            pst.executeUpdate();*/

                JOptionPane.showMessageDialog(null, "Registro Anulado");
                cargarTDetalle();
            } catch (SQLException ex) {
                lo.LogBitacora("Error: No se pudo anular la compra" + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), comprasr, anularc);
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }


    }//GEN-LAST:event_AnularMouseClicked

    private void txtRegresarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegresarCMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_txtRegresarCMouseClicked

    private void BuscarCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarCFocusGained
        if (BuscarC.getText().equals("Buscar por Id o Número de Factura")) {
            BuscarC.setText("");
            BuscarC.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_BuscarCFocusGained

    private void BuscarCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarCFocusLost
        if (BuscarC.getText().equals("")) {
            BuscarC.setText("Buscar por Id o Número de Factura");
            BuscarC.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_BuscarCFocusLost

    private void BuscarCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarCKeyTyped
        buscarData(BuscarC.getText());
    }//GEN-LAST:event_BuscarCKeyTyped

    private void reporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteMouseClicked
        JasperReport reporte;
        HashMap hm = new HashMap();
        hm.put("Usuario", usuario.getText());
        try {
            Connection con = Conexion.getConexion();
            reporte = JasperCompileManager.compileReport("src/Reportes/ReporteCompras.jrxml");
            JasperPrint jp = JasperFillManager.fillReport(reporte, hm, con);
            JasperViewer.viewReport(jp, true);
            ReportView view = new ReportView(jp, false);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reporteMouseClicked

    private void BuscarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarCMouseClicked

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
            java.util.logging.Logger.getLogger(RegistroCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Anular;
    private javax.swing.JTextField BuscarC;
    private javax.swing.JLabel Editar;
    private javax.swing.JLabel Jlabel;
    private javax.swing.JTable TablaDEcompras;
    private javax.swing.JTable TablaDTC;
    private javax.swing.JScrollPane barraEmpleado;
    private javax.swing.JScrollPane barraEmpleado1;
    private javax.swing.JLabel iddetalle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel reporte;
    private javax.swing.JLabel txtRegresarC;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

    private void cargartabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaDEcompras.getModel();
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        String cargart = "CargarTabla";

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select C.Id_Compra, c.Num_Factura,P.Nombre_Empresa, C.Fecha_Compra,C.Fecha_Entrega,C.Fecha_Vencimiento,C.Descripcion,C.Descuento,C.Total_Compra, E.Estado\n"
                    + "from Compras as C \n"
                    + "Inner Join Proveedor as P ON C.Id_Proveedor = P.Id_Proveedor\n"
                    + "Inner Join EstadoC as E on C.Id_EstadoC=E.Id_EstadoC\n"
                    + "Order by C.Id_Compra");
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
            lo.LogBitacora("Error: No se pudo cargar la tabla" + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), comprasr, cargart);
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

    private void cargarTDetalle() {
        String cargard = "CargarDetalle";
        barraEmpleado1.setVisible(true);
        TablaDTC.setVisible(true);
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaDTC.getModel();
        Estado = TablaDEcompras.getValueAt(TablaDEcompras.getSelectedRow(), 9).toString();

        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        if (Estado.equals("En revisión")) {
            Editar.setVisible(true);
        } else {
            Editar.setVisible(false);
        }
        try {
            int filaw = TablaDEcompras.getSelectedRow();
            int id = Integer.parseInt(TablaDEcompras.getValueAt(filaw, 0).toString());

            Connection con = Conexion.getConexion();

            ps = con.prepareStatement("Select DC.Id_Detalle_Compra,C.Num_Factura, P.Nombre_Producto, DC.Costo_Unitario, DC.Cantidad, DC.ISV, DC.Descuento,E.Estado\n"
                    + "From Detalle_Compra as DC\n"
                    + "Inner Join Productos as P On DC.Id_Producto = P.Id_Producto\n"
                    + "Inner Join Compras as C ON DC.Id_Compra = C.Id_Compra\n"
                    + "Inner Join EstadoDC as E ON E.Id_EstadoDC = DC.Id_EstadoDC\n"
                    + "Where DC.Id_Compra=?");
            ps.setInt(1, id);
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
            Id_Comp = TablaDEcompras.getValueAt(filaw, 0).toString();

        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo cargar el detalle" + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), comprasr, cargard);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    void buscarData(String valor) {
        String buscar = "Buscar";
        String[] titulos = {"ID", "Factura", "Empresa", "Fecha", "Fecha Entrega", "Fecha Vencimiento", "Descripcion", "Descuento", "Total Compra", "Estado"};
        String[] registros = new String[13];
        String sql = "Select C.Id_Compra, C.Num_Factura,P.Nombre_Empresa, C.Fecha_Compra,C.Fecha_Entrega,C.Fecha_Vencimiento,C.Descripcion,C.Descuento,C.Total_Compra, E.Estado\n"
                + "from Compras as C \n"
                + "Inner Join Proveedor as P ON C.Id_Proveedor = P.Id_Proveedor\n"
                + "Inner Join EstadoC as E on C.Id_EstadoC=E.Id_EstadoC\n"
                + "Where CONCAT (C.Id_Compra, ' ', C.Num_Factura) LIKE '%" + valor + "%'\n"
                + "Order by C.Id_Compra";

        DefaultTableModel model = new DefaultTableModel(null, titulos);
        Connection con = Conexion.getConexion();

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("Id_Compra");
                registros[1] = rs.getString("Num_Factura");
                registros[2] = rs.getString("Nombre_Empresa");
                registros[3] = rs.getString("Fecha_Compra");
                registros[4] = rs.getString("Fecha_Entrega");
                registros[5] = rs.getString("Fecha_Vencimiento");
                registros[6] = rs.getString("Descripcion");
                registros[7] = rs.getString("Descuento");
                registros[8] = rs.getString("Total_Compra");
                registros[9] = rs.getString("Estado");

                model.addRow(registros);
            }

            TablaDEcompras.setModel(model);
            anchoColumnas();
        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo buscar los datos" + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), comprasr, buscar);
            Logger.getLogger(Sucursales.class.getName()).log(Level.SEVERE, null, ex);
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
            ps.setInt(1, 7);
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
        /*if (agregari == 1) {
            BotonAgregarPro.setEnabled(Boolean.TRUE);
        } else if (agregari == 0) {
            BotonAgregarPro.setEnabled(Boolean.FALSE);
            BotonAgregarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));
        }*/

 /*if (guardari == 1) {
            BotonGuardarPro.setEnabled(Boolean.TRUE);
        } else if (guardari == 0) {
            BotonGuardarPro.setEnabled(Boolean.FALSE);
            BotonGuardarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));

        }*/
        if (editari == 1) {
            Editar.setVisible(Boolean.TRUE);
        } else {
            Editar.setVisible(Boolean.FALSE);
            //BotonEditarPro.setEnabled(Boolean.FALSE);
            //BotonEditarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));
        }

        /*if (cancelari == 1) {
            BotonCancelarPro.setEnabled(Boolean.TRUE);

        } else {
            BotonCancelarPro.setEnabled(Boolean.FALSE);
            BotonCancelarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));
        }*/
        if (reportesi == 1) {
            reporte.setVisible(Boolean.TRUE);

        } else {
            reporte.setVisible(Boolean.FALSE);
            //jLabel2.setEnabled(Boolean.TRUE);
        }
        if (buscari == 1) {
            BuscarC.setEnabled(Boolean.TRUE);
        } else {
            BuscarC.setEnabled(Boolean.FALSE);
            BuscarC.setText("NO DISPONIBLE");
        }
        if (anulari == 1) {
            Anular.setVisible(Boolean.TRUE);
        } else {
            Anular.setVisible(Boolean.FALSE);
        }
        /* if (activoi == 1) {
            //BotonActivoPro.setVisible(Boolean.TRUE);
        } else {
            BotonActivoPro.setVisible(Boolean.FALSE);
        }
        if (inactivoi == 1) {
            //BotonInactivoPro.setVisible(Boolean.TRUE);
        } else {
            BotonInactivoPro.setVisible(Boolean.FALSE);
        }
        /*if (historicoi == 1) {
            Historico.setSelected(Boolean.TRUE);
        } else {
            Historico.setSelected(Boolean.FALSE);
        }*/
        if (crearcomprai == 1) {
            jLabel1.setEnabled(Boolean.TRUE);
        } else {
            jLabel1.setEnabled(Boolean.FALSE);
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));
        }
    }
}
