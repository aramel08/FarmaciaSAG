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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
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
public class Productos extends javax.swing.JFrame {

    /**
     * Creates new form Productos
     */
    public static String Id_Producto = "0";

    public Productos() {
        initComponents();
        Productos.CargarCategoria c = new Productos.CargarCategoria();
        Productos.CargarPresentacion pr = new Productos.CargarPresentacion();
        Productos.CargarImpuesto cim = new Productos.CargarImpuesto();
        Productos.CargarDescuento cdes = new Productos.CargarDescuento();
        ComboCategoriaP.setModel(c.getvalues());
        ComboPresentacionP.setModel(pr.getvalues());
        ComboImp.setModel(cim.getvalues());
        ComboDesc.setModel(cdes.getvalues());
        cargartabla();
        txtIDP.setVisible(Boolean.FALSE);
        BotonActivoP.setVisible(Boolean.FALSE);
        BotonInactivoP.setVisible(Boolean.FALSE);
        Inhabillitar();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, +1);//5 year before
        Calendar cale = Calendar.getInstance();
        cale.add(Calendar.YEAR, +3);//5 year before
        Date min = cal.getTime();
        Date max = cale.getTime();
        txtFechaVencimientoP.setSelectableDateRange(min, max);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("componentes/LOGOSAG(2).png"));
        return retValue;
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
                    JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo verificar\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoProductos = new javax.swing.ButtonGroup();
        botonRegresarP = new javax.swing.JLabel();
        botonAgregarP = new javax.swing.JLabel();
        botonEditarP = new javax.swing.JLabel();
        botonGuardarP = new javax.swing.JLabel();
        botonCancelarP = new javax.swing.JLabel();
        botonRestringirP = new javax.swing.JLabel();
        txtNombreP = new javax.swing.JTextField();
        txtDescripcionP = new javax.swing.JTextField();
        txtUnidadP = new javax.swing.JTextField();
        ComboCategoriaP = new javax.swing.JComboBox<>();
        ComboDesc = new javax.swing.JComboBox<>();
        ComboImp = new javax.swing.JComboBox<>();
        ComboPresentacionP = new javax.swing.JComboBox<>();
        txtTamañosP = new javax.swing.JTextField();
        txtLoteP = new javax.swing.JTextField();
        txtPrecioHistorico = new javax.swing.JLabel();
        txtPrecioP = new javax.swing.JTextField();
        txtBuscarP = new javax.swing.JTextField();
        BotonActivoP = new javax.swing.JRadioButton();
        txtFechaVencimientoP = new com.toedter.calendar.JDateChooser();
        txtIDP = new javax.swing.JLabel();
        BotonInactivoP = new javax.swing.JRadioButton();
        TablaP = new javax.swing.JScrollPane();
        tablaP = new javax.swing.JTable();
        Productos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonRegresarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarPMouseClicked(evt);
            }
        });
        getContentPane().add(botonRegresarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 130, 30));

        botonAgregarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarPMouseClicked(evt);
            }
        });
        getContentPane().add(botonAgregarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 130, 40));

        botonEditarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEditarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEditarPMouseClicked(evt);
            }
        });
        getContentPane().add(botonEditarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 120, 40));

        botonGuardarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGuardarPMouseClicked(evt);
            }
        });
        getContentPane().add(botonGuardarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 120, 40));

        botonCancelarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCancelarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCancelarPMouseClicked(evt);
            }
        });
        getContentPane().add(botonCancelarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 120, 40));

        botonRestringirP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRestringirP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRestringirPMouseClicked(evt);
            }
        });
        getContentPane().add(botonRestringirP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 130, 40));

        txtNombreP.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtNombreP.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreP.setText("Ingrese Nombre Producto");
        txtNombreP.setBorder(null);
        txtNombreP.setOpaque(false);
        txtNombreP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombrePFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombrePFocusLost(evt);
            }
        });
        txtNombreP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombrePMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombrePMousePressed(evt);
            }
        });
        txtNombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePActionPerformed(evt);
            }
        });
        txtNombreP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 200, 30));

        txtDescripcionP.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtDescripcionP.setForeground(new java.awt.Color(153, 153, 153));
        txtDescripcionP.setText("Ingrese Descripción Producto");
        txtDescripcionP.setBorder(null);
        txtDescripcionP.setOpaque(false);
        txtDescripcionP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescripcionPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescripcionPFocusLost(evt);
            }
        });
        txtDescripcionP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescripcionPMousePressed(evt);
            }
        });
        txtDescripcionP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionPKeyTyped(evt);
            }
        });
        getContentPane().add(txtDescripcionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 200, 30));

        txtUnidadP.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtUnidadP.setForeground(new java.awt.Color(153, 153, 153));
        txtUnidadP.setText("Ingrese Unidades Producto");
        txtUnidadP.setBorder(null);
        txtUnidadP.setOpaque(false);
        txtUnidadP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUnidadPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUnidadPFocusLost(evt);
            }
        });
        txtUnidadP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUnidadPMousePressed(evt);
            }
        });
        txtUnidadP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadPActionPerformed(evt);
            }
        });
        txtUnidadP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidadPKeyTyped(evt);
            }
        });
        getContentPane().add(txtUnidadP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 200, 30));

        ComboCategoriaP.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        ComboCategoriaP.setForeground(new java.awt.Color(153, 153, 153));
        ComboCategoriaP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Categoría...", "Analgésicos", "Antiácidos", "Antieméticos", "Antiinfecciosos y antidiarreicos", "Antitrombóticos ", "Antihemorragicos ", "Antianémicos ", "Antihipertensivos ", "Antilípidos ", "Betabloqueantes ", "Bloqueadores CC ", "Corticoides ", "Corticoides para uso sistémico ", "Diabetes ", "Diuréticos ", "Estomatologicos", "Emolientes ", "IECAS", "Inmunoestimulantes ", "Innunosupresores ", "Oftalmológicos" }));
        ComboCategoriaP.setBorder(null);
        ComboCategoriaP.setOpaque(false);
        ComboCategoriaP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ComboCategoriaPMousePressed(evt);
            }
        });
        getContentPane().add(ComboCategoriaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 190, 30));

        ComboDesc.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        ComboDesc.setForeground(new java.awt.Color(153, 153, 153));
        ComboDesc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Descuento..." }));
        ComboDesc.setBorder(null);
        ComboDesc.setOpaque(false);
        ComboDesc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ComboDescMousePressed(evt);
            }
        });
        getContentPane().add(ComboDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 730, 190, 30));

        ComboImp.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        ComboImp.setForeground(new java.awt.Color(153, 153, 153));
        ComboImp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Impuesto..." }));
        ComboImp.setBorder(null);
        ComboImp.setOpaque(false);
        ComboImp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ComboImpMousePressed(evt);
            }
        });
        getContentPane().add(ComboImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 690, 190, 30));

        ComboPresentacionP.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        ComboPresentacionP.setForeground(new java.awt.Color(153, 153, 153));
        ComboPresentacionP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Presentación...", "Inyectable", "Cápsulas", "Jarabe", " " }));
        ComboPresentacionP.setBorder(null);
        ComboPresentacionP.setOpaque(false);
        ComboPresentacionP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ComboPresentacionPMousePressed(evt);
            }
        });
        getContentPane().add(ComboPresentacionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 190, 30));

        txtTamañosP.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtTamañosP.setForeground(new java.awt.Color(153, 153, 153));
        txtTamañosP.setText("Ingrese Tamaño Producto");
        txtTamañosP.setBorder(null);
        txtTamañosP.setOpaque(false);
        txtTamañosP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTamañosPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTamañosPFocusLost(evt);
            }
        });
        txtTamañosP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTamañosPMousePressed(evt);
            }
        });
        txtTamañosP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTamañosPKeyTyped(evt);
            }
        });
        getContentPane().add(txtTamañosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 200, 30));

        txtLoteP.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtLoteP.setForeground(new java.awt.Color(153, 153, 153));
        txtLoteP.setText("Ingrese Lote Producto");
        txtLoteP.setBorder(null);
        txtLoteP.setOpaque(false);
        txtLoteP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLotePFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLotePFocusLost(evt);
            }
        });
        txtLoteP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtLotePMousePressed(evt);
            }
        });
        txtLoteP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLotePActionPerformed(evt);
            }
        });
        txtLoteP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLotePKeyTyped(evt);
            }
        });
        getContentPane().add(txtLoteP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 200, 30));

        txtPrecioHistorico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtPrecioHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrecioHistoricoMouseClicked(evt);
            }
        });
        getContentPane().add(txtPrecioHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 226, 120, 30));

        txtPrecioP.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtPrecioP.setForeground(new java.awt.Color(153, 153, 153));
        txtPrecioP.setText("Ingrese Precio Producto");
        txtPrecioP.setBorder(null);
        txtPrecioP.setOpaque(false);
        txtPrecioP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecioPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecioPFocusLost(evt);
            }
        });
        txtPrecioP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPrecioPMousePressed(evt);
            }
        });
        txtPrecioP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioPKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 200, 30));

        txtBuscarP.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtBuscarP.setText("Buscar Por ID,Nombre o Estado");
        txtBuscarP.setBorder(null);
        txtBuscarP.setOpaque(false);
        txtBuscarP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarPFocusLost(evt);
            }
        });
        txtBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarPActionPerformed(evt);
            }
        });
        txtBuscarP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarPKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 240, 30));

        GrupoProductos.add(BotonActivoP);
        BotonActivoP.setText("Activo");
        BotonActivoP.setContentAreaFilled(false);
        BotonActivoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActivoPActionPerformed(evt);
            }
        });
        getContentPane().add(BotonActivoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, -1, -1));

        txtFechaVencimientoP.setToolTipText("");
        txtFechaVencimientoP.setEnabled(false);
        txtFechaVencimientoP.setOpaque(false);
        txtFechaVencimientoP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFechaVencimientoPMousePressed(evt);
            }
        });
        getContentPane().add(txtFechaVencimientoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 200, 20));
        getContentPane().add(txtIDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 100, 20));

        GrupoProductos.add(BotonInactivoP);
        BotonInactivoP.setText("Inactivo");
        BotonInactivoP.setContentAreaFilled(false);
        BotonInactivoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInactivoPActionPerformed(evt);
            }
        });
        getContentPane().add(BotonInactivoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, -1, -1));

        tablaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Producto", "Nombre Producto", "Descripcion Producto", "Categoria", "Presentacion", "Unidad", "Tamaños", "Lote", "Fecha Vencimiento", "Precio", "Impuesto", "Descuento", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPMouseClicked(evt);
            }
        });
        TablaP.setViewportView(tablaP);

        getContentPane().add(TablaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 660, 360));

        Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/Pantalla Productos(4).png"))); // NOI18N
        getContentPane().add(Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePActionPerformed

    private void txtLotePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLotePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLotePActionPerformed

    private void txtBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarPActionPerformed

    private void txtNombrePFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombrePFocusGained
        if (txtNombreP.getText().equals("Ingrese Nombre Producto")) {
            txtNombreP.setText("");
            txtNombreP.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtNombrePFocusGained

    private void txtUnidadPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadPActionPerformed

    private void botonEditarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarPMouseClicked
        int Id = Integer.parseInt(txtIDP.getText());
        String Nombre = txtNombreP.getText();
        String Descripcion = txtDescripcionP.getText();
        int Categoria = ComboCategoriaP.getSelectedIndex();
        int Presentacion = ComboPresentacionP.getSelectedIndex();
        String Unidades = txtUnidadP.getText();
        String Tamaño = txtTamañosP.getText();
        String Lote = txtLoteP.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String FechaV = sdf.format(txtFechaVencimientoP.getDate());
        String Precio = txtPrecioP.getText();
        int desc = ComboDesc.getSelectedIndex();
        int impu = ComboImp.getSelectedIndex();

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Update Productos set Nombre_Producto=?,Descripcion=?,Id_Categoria=?,Id_Presentacion=?, Lote=?,Fecha_Vencimiento=?,Unidades=?,Tamaño=?,Precio=?, Id_Descuento=?,Id_Impuesto=? Where Id_Producto=?");
            ps.setString(1, Nombre);
            ps.setString(2, Descripcion);
            ps.setInt(3, Categoria);
            ps.setInt(4, Presentacion);
            ps.setString(7, Unidades);
            ps.setString(8, Tamaño);
            ps.setString(5, Lote);
            ps.setString(6, FechaV);
            ps.setString(9, Precio);
            ps.setInt(10, desc);
            ps.setInt(11, impu);
            ps.setInt(12, Id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
            cargartabla();
            Limpiar();
            Inhabillitar();
            //txtEstadoC.setVisible(Boolean.FALSE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_botonEditarPMouseClicked

    private void botonGuardarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarPMouseClicked
        if (txtNombreP.getText().equals("Ingrese Nombre Producto") && txtDescripcionP.getText().equals("Ingrese Descripción Producto") && ComboCategoriaP.getSelectedIndex() == 0 && ComboPresentacionP.getSelectedIndex() == 0
                && txtUnidadP.getText().equals("Ingrese Unidades Producto") && txtTamañosP.getText().equals("Ingrese Tamaño Producto") && txtLoteP.getText().equals("Ingrese Lote Producto") && txtFechaVencimientoP.getDate().equals("") && txtPrecioP.getText().equals("Ingrese Precio Producto")
                && ComboImp.getSelectedIndex() == 0 && ComboDesc.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            if (txtNombreP.getText().equals("Ingrese Nombre Producto")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un nombre al producto", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else if (txtDescripcionP.getText().equals("Ingrese Descripción Producto")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar una descripción", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else if (ComboCategoriaP.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Seleccione la categoria", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else if (ComboPresentacionP.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Seleccione la presentación", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else if (txtUnidadP.getText().equals("Ingrese Unidades Producto")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar una unidad", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else if (txtTamañosP.getText().equals("Ingrese Tamaño Producto")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un tamaño", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else if (txtLoteP.getText().equals("Ingrese Lote Producto")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un lote", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else if (txtFechaVencimientoP.getDate().equals("")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la fecha de vencimiento", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else if (txtPrecioP.getText().equals("Ingrese Precio Producto")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un precio", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else if (ComboImp.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Debe Seleccionar un Impuesto", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else if (ComboDesc.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Debe Seleccionar un Descuento", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                String Nombre = txtNombreP.getText();
                String Descripcion = txtDescripcionP.getText();
                int Categoria = ComboCategoriaP.getSelectedIndex();
                int Presentacion = ComboPresentacionP.getSelectedIndex();
                String Unidades = txtUnidadP.getText();
                String Tamaño = txtTamañosP.getText();
                String Lote = txtLoteP.getText();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String FechaV = sdf.format(txtFechaVencimientoP.getDate());
                String Precio = txtPrecioP.getText();
                int desc = ComboDesc.getSelectedIndex();
                int impu = ComboImp.getSelectedIndex();

                try {
                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("Insert into Productos (Nombre_Producto, Descripcion,Id_Categoria,Id_Presentacion,Lote,Fecha_Vencimiento,Id_Estado,Unidades,Tamaño,Precio,Id_Impuesto,Id_Descuento) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
                    ps.setString(1, Nombre);
                    ps.setString(2, Descripcion);
                    ps.setInt(3, Categoria);
                    ps.setInt(4, Presentacion);
                    ps.setString(5, Lote);
                    ps.setString(6, FechaV);
                    ps.setString(8, Unidades);
                    ps.setString(9, Tamaño);
                    ps.setString(10, Precio);
                    ps.setInt(7, 1);
                    ps.setInt(12, desc);
                    ps.setInt(11, impu);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro guardado");
                    cargartabla();
                    Limpiar();
                    Inhabillitar();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
            }
        }
    }

    private void cargartabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaP.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select P.Id_Producto,P.Nombre_Producto, P.Descripcion, C.Categoria, PR.Presentacion,P.Unidades, P.Tamaño, P.Lote, P.Fecha_Vencimiento, P.Precio,TI.ISV,DP.Descripcion ,E.Estado\n"
                    + "From Productos as P\n"
                    + "Inner Join Categorias as C On P.Id_Categoria=C.Id_Categoria\n"
                    + "Inner Join Presentacion as PR ON P.Id_Presentacion=PR.Id_Presentacion\n"
                    + "Inner Join Estado as E ON P.Id_Estado=E.Id_Estado\n"
                    + "Inner Join DescuentoProducto as DP on P.Id_Descuento=DP.Id_DescuentoP\n"
                    + "Inner Join Tipo_Impuesto as TI ON P.Id_Impuesto=TI.Id_Tipo_Impuesto\n"
                    + "ORDER BY P.Id_Producto");
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
        txtIDP.setText("");
        txtNombreP.setText("");
        if (txtNombreP.getText().equals("")) {
            txtNombreP.setText("Ingrese Nombre Producto");
            txtNombreP.setForeground(new Color(153, 153, 153));
        }
        txtDescripcionP.setText("");
        if (txtDescripcionP.getText().equals("")) {
            txtDescripcionP.setText("Ingrese Descripcion Producto");
            txtDescripcionP.setForeground(new Color(153, 153, 153));
        }
        txtUnidadP.setText("");
        if (txtUnidadP.getText().equals("")) {
            txtUnidadP.setText("Ingrese Unidad Producto");
            txtUnidadP.setForeground(new Color(153, 153, 153));
        }
        txtTamañosP.setText("");
        if (txtTamañosP.getText().equals("")) {
            txtTamañosP.setText("Ingrese Tamaño Producto");
            txtTamañosP.setForeground(new Color(153, 153, 153));
        }
        txtLoteP.setText("");
        if (txtLoteP.getText().equals("")) {
            txtLoteP.setText("Ingrese Lote Producto");
            txtLoteP.setForeground(new Color(153, 153, 153));
        }

        txtPrecioP.setText("");
        if (txtPrecioP.getText().equals("")) {
            txtPrecioP.setText("Ingrese Precio");
            txtPrecioP.setForeground(new Color(153, 153, 153));
        }
        ComboCategoriaP.setSelectedIndex(0);
        ComboPresentacionP.setSelectedIndex(0);
    }

    private void Inhabillitar() {
        txtNombreP.enable(Boolean.FALSE);
        txtDescripcionP.enable(Boolean.FALSE);
        ComboCategoriaP.enable(Boolean.FALSE);
        ComboPresentacionP.enable(Boolean.FALSE);
        txtUnidadP.enable(Boolean.FALSE);
        txtTamañosP.enable(Boolean.FALSE);
        txtLoteP.enable(Boolean.FALSE);
        txtFechaVencimientoP.enable(Boolean.FALSE);
        txtPrecioP.enable(Boolean.FALSE);
        txtFechaVencimientoP.setEnabled(Boolean.FALSE);

    }//GEN-LAST:event_botonGuardarPMouseClicked

    private void tablaPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPMouseClicked
        try {
            int fila = tablaP.getSelectedRow();
            int id = Integer.parseInt(tablaP.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select P.Nombre_Producto, P.Descripcion, C.Categoria, PR.Presentacion,P.Unidades, P.Tamaño, P.Lote, P.Fecha_Vencimiento, P.Precio,TI.ISV,DP.Descripcion ,E.Estado\n"
                    + "From Productos as P\n"
                    + "Inner Join Categorias as C On P.Id_Categoria=C.Id_Categoria\n"
                    + "Inner Join Presentacion as PR ON P.Id_Presentacion=PR.Id_Presentacion\n"
                    + "Inner Join Estado as E ON P.Id_Estado=E.Id_Estado\n"
                    + "Inner Join DescuentoProducto as DP on P.Id_Descuento=DP.Id_DescuentoP\n"
                    + "Inner Join Tipo_Impuesto as TI ON P.Id_Impuesto=TI.Id_Tipo_Impuesto\n"
                    + "Where Id_Producto=?\n"
                    + "ORDER BY P.Id_Producto");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtIDP.setText(String.valueOf(id));
                txtNombreP.setText(rs.getString("Nombre_Producto"));
                txtDescripcionP.setText(rs.getString("Descripcion"));
                ComboCategoriaP.setSelectedItem(rs.getString("Categoria"));
                ComboImp.setSelectedItem(rs.getString("ISV"));
                ComboDesc.setSelectedItem(rs.getString("Descripcion"));
                ComboPresentacionP.setSelectedItem(rs.getString("Presentacion"));
                txtLoteP.setText(rs.getString("Lote"));
                txtFechaVencimientoP.setDate(rs.getDate("Fecha_Vencimiento"));
                txtUnidadP.setText(rs.getString("Unidades"));
                txtTamañosP.setText(rs.getString("Tamaño"));
                txtPrecioP.setText(rs.getString("Precio"));
                if (rs.getString("Estado").equals("Activo")) {
                    BotonActivoP.setSelected(true);
                } else if (rs.getString("Estado").equals("Inactivo")) {
                    BotonInactivoP.setSelected(true);
                }
            }
            BotonInactivoP.setVisible(Boolean.TRUE);
            BotonActivoP.setVisible(Boolean.TRUE);
            Habillitar();
            txtFechaVencimientoP.setEnabled(Boolean.FALSE);
            Id_Producto = txtIDP.getText();
            System.out.println(Id_Producto);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }//GEN-LAST:event_tablaPMouseClicked

    private void botonAgregarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarPMouseClicked
        Habillitar();
        txtFechaVencimientoP.setEnabled(Boolean.TRUE);
    }//GEN-LAST:event_botonAgregarPMouseClicked

    private void botonCancelarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarPMouseClicked
        Limpiar();
        Inhabillitar();
    }//GEN-LAST:event_botonCancelarPMouseClicked

    private void BotonActivoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActivoPActionPerformed
        int Id = Integer.parseInt(txtIDP.getText());

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Update Productos set Id_Estado=? Where Id_Producto=?");
            ps.setInt(1, 2);
            ps.setInt(2, Id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Habilitado");
            cargartabla();
            Limpiar();
            Inhabillitar();
            // txt.setVisible(Boolean.FALSE);
            BotonActivoP.setVisible(Boolean.FALSE);
            BotonInactivoP.setVisible(Boolean.FALSE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_BotonActivoPActionPerformed

    private void BotonInactivoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInactivoPActionPerformed
        int Id = Integer.parseInt(txtIDP.getText());

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Update Productos set Id_Estado=? Where Id_Producto=?");
            ps.setInt(1, 1);
            ps.setInt(2, Id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Inhabilitado");
            cargartabla();
            Limpiar();
            Inhabillitar();
            // txtEstadoC.setVisible(Boolean.FALSE);
            BotonActivoP.setVisible(Boolean.FALSE);
            BotonInactivoP.setVisible(Boolean.FALSE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }//GEN-LAST:event_BotonInactivoPActionPerformed

    private void txtNombrePFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombrePFocusLost
        if (txtNombreP.getText().equals("")) {
            txtNombreP.setText("Ingrese Nombre Producto");
            txtNombreP.setForeground(new Color(153, 153, 153));
        } else if (!txtNombreP.getText().isEmpty()) {
            if (!txtNombreP.getText().matches("^[A-Z-ÁÉÍÓÚÑ]{1}[a-z-áéíóúñ]+$")) {
                JOptionPane.showMessageDialog(null, "Debes escribir un nombre de producto comenzando en mayúscula. No utilice espacios", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                verificarDatosExistentes(txtNombreP.getText(), "Nombre_Producto", "Productos", "Este medicamento ya existe en la base de datos");
            }
    }//GEN-LAST:event_txtNombrePFocusLost
    }
    private void txtDescripcionPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionPFocusGained
        if (txtDescripcionP.getText().equals("Ingrese Descripción Producto")) {
            txtDescripcionP.setText("");
            txtDescripcionP.setForeground(new Color(0, 0, 0));

        }
    }//GEN-LAST:event_txtDescripcionPFocusGained

    private void txtDescripcionPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionPFocusLost
        if (txtDescripcionP.getText().equals("")) {
            txtDescripcionP.setText("Ingrese Descripción Producto");
            txtDescripcionP.setForeground(new Color(153, 153, 153));
        } else if (!txtDescripcionP.getText().isEmpty()) {
            if (!txtDescripcionP.getText().matches("^[A-Z-ÁÉÍÓÚÑ]{1}[a-z-áéíóúñ]+$")) {
                JOptionPane.showMessageDialog(null, "Debes escribir la descripción del producto comenzado en mayúscula. No utilice espacios", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtDescripcionPFocusLost

    private void txtUnidadPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnidadPFocusGained
        if (txtUnidadP.getText().equals("Ingrese Unidades Producto")) {
            txtUnidadP.setText("");
            txtUnidadP.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtUnidadPFocusGained

    private void txtUnidadPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnidadPFocusLost
        if (txtUnidadP.getText().equals("")) {
            txtUnidadP.setText("Ingrese Unidades Producto");
            txtUnidadP.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtUnidadPFocusLost

    private void txtTamañosPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTamañosPFocusGained
        if (txtTamañosP.getText().equals("Ingrese Tamaño Producto")) {
            txtTamañosP.setText("");
            txtTamañosP.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtTamañosPFocusGained

    private void txtTamañosPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTamañosPFocusLost
        if (txtTamañosP.getText().equals("")) {
            txtTamañosP.setText("Ingrese Tamaño Producto");
            txtTamañosP.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtTamañosPFocusLost

    private void txtLotePFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLotePFocusGained
        if (txtLoteP.getText().equals("Ingrese Lote Producto")) {
            txtLoteP.setText("");
            txtLoteP.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtLotePFocusGained

    private void txtLotePFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLotePFocusLost
        if (txtLoteP.getText().equals("")) {
            txtLoteP.setText("Ingrese Lote Producto");
            txtLoteP.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtLotePFocusLost

    private void txtPrecioPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioPFocusGained
        if (txtPrecioP.getText().equals("Ingrese Precio Producto")) {
            txtPrecioP.setText("");
            txtPrecioP.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtPrecioPFocusGained

    private void txtPrecioPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioPFocusLost
        if (txtPrecioP.getText().equals("")) {
            txtPrecioP.setText("Ingrese Precio Producto");
            txtPrecioP.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtPrecioPFocusLost

    private void txtBuscarPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarPFocusGained
        if (txtBuscarP.getText().equals("Buscar Por ID,Nombre o Estado")) {
            txtBuscarP.setText("");
            txtBuscarP.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtBuscarPFocusGained

    private void txtBuscarPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarPFocusLost
        if (txtBuscarP.getText().equals("")) {
            txtBuscarP.setText("Buscar Por ID,Nombre o Estado");
            txtBuscarP.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtBuscarPFocusLost

    private void botonRegresarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarPMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_botonRegresarPMouseClicked

    private void txtNombrePMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombrePMousePressed
        if (txtNombreP.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtNombrePMousePressed

    private void txtNombrePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePKeyTyped
        if (txtNombreP.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "Alcanzaste el máximo de caracteres para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (txtNombreP.getText().length() > 0) {
            if (!txtNombreP.getText().matches("^(?!.*([A-Za-zñÑáéíóúÁÉÍÓÚ\\s])\\1{2})[A-Za-zñÑáéíóúÁÉÍÓÚ\\s0-9]+$")) {
                JOptionPane.showMessageDialog(null, "No repitas caracteres de forma incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtNombrePKeyTyped

    private void txtBuscarPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPKeyTyped
        buscarData(txtBuscarP.getText());
        validarNumerosLetras(evt);
        if (txtBuscarP.getText().length() > 15) {
            JOptionPane.showMessageDialog(null, "Alcanzaste el máximo de caracteres para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (txtBuscarP.getText().length() > 0) {
            if (!txtBuscarP.getText().matches("^(?!.*([A-Za-zñÑáéíóúÁÉÍÓÚ\\s])\\1{2})[A-Za-zñÑáéíóúÁÉÍÓÚ\\s0-9]+$")) {
                JOptionPane.showMessageDialog(null, "No repitas caracteres de forma incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtBuscarPKeyTyped

    public void validarNumeros(java.awt.event.KeyEvent e) {
        if (e.getKeyChar() >= 33 && e.getKeyChar() <= 47
                || e.getKeyChar() >= 58 && e.getKeyChar() <= 238) {
            e.consume();
            JOptionPane.showMessageDialog(null, "Este campo solo admite números", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void txtUnidadPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadPKeyTyped
        validarNumeros(evt);
        if (txtUnidadP.getText().length() > 2) {
            evt.consume();

        }
    }//GEN-LAST:event_txtUnidadPKeyTyped

    private void txtNombrePMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombrePMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePMouseClicked

    private void txtDescripcionPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionPMousePressed
        if (txtDescripcionP.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtDescripcionPMousePressed

    private void txtUnidadPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUnidadPMousePressed
        if (txtUnidadP.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtUnidadPMousePressed

    private void txtTamañosPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTamañosPMousePressed
        if (txtTamañosP.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtTamañosPMousePressed

    private void txtLotePMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLotePMousePressed
        if (txtLoteP.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtLotePMousePressed

    private void txtPrecioPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioPMousePressed
        if (txtPrecioP.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtPrecioPMousePressed

    private void txtPrecioPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioPKeyTyped
        validarNumeros(evt);
        if (txtPrecioP.getText().length() > 3) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioPKeyTyped

    private void txtTamañosPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamañosPKeyTyped
        validarNumerosLetras(evt);
        if (txtTamañosP.getText().length() > 10) {
            JOptionPane.showMessageDialog(null, "Alcanzaste el máximo de caracteres para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (txtTamañosP.getText().length() > 0) {
            if (!txtTamañosP.getText().matches("^(?!.*([A-Za-zñÑáéíóúÁÉÍÓÚ\\s])\\1{2})[A-Za-zñÑáéíóúÁÉÍÓÚ\\s0-9]+$")) {
                JOptionPane.showMessageDialog(null, "No repitas caracteres de forma incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtTamañosPKeyTyped

    private void txtDescripcionPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionPKeyTyped
        if (txtDescripcionP.getText().length() > 49) {
            JOptionPane.showMessageDialog(null, "Alcanzaste el máximo de caracteres para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (txtDescripcionP.getText().length() > 0) {
            if (!txtDescripcionP.getText().matches("^(?!.*([A-Za-zñÑáéíóúÁÉÍÓÚ\\s])\\1{2})[A-Za-zñÑáéíóúÁÉÍÓÚ\\s0-9]+$")) {
                JOptionPane.showMessageDialog(null, "No repitas caracteres de forma incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtDescripcionPKeyTyped

    private void txtLotePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLotePKeyTyped
        validarNumerosLetras(evt);
        if (txtLoteP.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "Alcanzaste el máximo de caracteres para este campo", "Error", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }

    }//GEN-LAST:event_txtLotePKeyTyped

    private void ComboCategoriaPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboCategoriaPMousePressed
        if (ComboCategoriaP.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_ComboCategoriaPMousePressed

    private void ComboPresentacionPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboPresentacionPMousePressed
        if (ComboPresentacionP.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_ComboPresentacionPMousePressed

    private void txtFechaVencimientoPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaVencimientoPMousePressed
        if (txtFechaVencimientoP.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtFechaVencimientoPMousePressed

    private void txtPrecioHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioHistoricoMouseClicked
        PrecioHistoricoProducto php = new PrecioHistoricoProducto();
        {
            php.setVisible(true);
            dispose();

        }
    }//GEN-LAST:event_txtPrecioHistoricoMouseClicked

    private void botonRestringirPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRestringirPMouseClicked
        Medicamentos_Restringidos mr = new Medicamentos_Restringidos();
        {
            mr.setVisible(true);
            dispose();

        }
    }//GEN-LAST:event_botonRestringirPMouseClicked

    private void ComboDescMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboDescMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboDescMousePressed

    private void ComboImpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboImpMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboImpMousePressed

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BotonActivoP;
    private javax.swing.JRadioButton BotonInactivoP;
    private javax.swing.JComboBox<String> ComboCategoriaP;
    private javax.swing.JComboBox<String> ComboDesc;
    private javax.swing.JComboBox<String> ComboImp;
    private javax.swing.JComboBox<String> ComboPresentacionP;
    private javax.swing.ButtonGroup GrupoProductos;
    private javax.swing.JLabel Productos;
    private javax.swing.JScrollPane TablaP;
    private javax.swing.JLabel botonAgregarP;
    private javax.swing.JLabel botonCancelarP;
    private javax.swing.JLabel botonEditarP;
    private javax.swing.JLabel botonGuardarP;
    private javax.swing.JLabel botonRegresarP;
    private javax.swing.JLabel botonRestringirP;
    private javax.swing.JTable tablaP;
    private javax.swing.JTextField txtBuscarP;
    private javax.swing.JTextField txtDescripcionP;
    private com.toedter.calendar.JDateChooser txtFechaVencimientoP;
    private javax.swing.JLabel txtIDP;
    private javax.swing.JTextField txtLoteP;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JLabel txtPrecioHistorico;
    private javax.swing.JTextField txtPrecioP;
    private javax.swing.JTextField txtTamañosP;
    private javax.swing.JTextField txtUnidadP;
    // End of variables declaration//GEN-END:variables

    private void Habillitar() {
        txtNombreP.enable(Boolean.TRUE);
        txtDescripcionP.enable(Boolean.TRUE);
        ComboCategoriaP.enable(Boolean.TRUE);
        ComboPresentacionP.enable(Boolean.TRUE);
        txtUnidadP.enable(Boolean.TRUE);
        txtTamañosP.enable(Boolean.TRUE);
        txtLoteP.enable(Boolean.TRUE);
        // txtFechaVencimientoP.setEnabled(Boolean.TRUE);
        txtPrecioP.enable(Boolean.TRUE);

    }

    public class CargarCategoria {

        public DefaultComboBoxModel getvalues() {

            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            try {
                Connection con = Conexion.getConexion();
                String sql = "select Categoria from Categorias";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                modelo.addElement("Seleccione Categoría...");
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

    public class CargarPresentacion {

        public DefaultComboBoxModel getvalues() {

            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            try {
                Connection con = Conexion.getConexion();
                String sql = "select Presentacion from Presentacion";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                modelo.addElement("Seleccione Presentación...");
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

    void buscarData(String valor) {
        String[] titulos = {"ID Producto", "Nombre Producto", "Descripción", "Categoría Producto", "Presentación Producto", "Unidades", "Tamaño", "Lote ", "Fecha Vencimiento", "Precio", "Impuesto", "Descuento", "IdEstado"};
        String[] registros = new String[13];
        String sql = "Select P.Id_Producto,P.Nombre_Producto, P.Descripcion, C.Categoria, PR.Presentacion,P.Unidades, P.Tamaño, P.Lote, P.Fecha_Vencimiento, P.Precio,TI.ISV,DP.Descripcion ,E.Estado\n"
                + "From Productos as P\n"
                + "Inner Join Categorias as C On P.Id_Categoria=C.Id_Categoria\n"
                + "Inner Join Presentacion as PR ON P.Id_Presentacion=PR.Id_Presentacion\n"
                + "Inner Join Estado as E ON P.Id_Estado=E.Id_Estado\n"
                + "Inner Join DescuentoProducto as DP on P.Id_Descuento=DP.Id_DescuentoP\n"
                + "Inner Join Tipo_Impuesto as TI ON P.Id_Impuesto=TI.Id_Tipo_Impuesto\n"
                + "WHERE CONCAT (P.Id_Producto, ' ',P. Nombre_Producto, ' ',C.Categoria) LIKE '%" + valor + "%'\n"
                + "ORDER BY P.Id_Producto";

        DefaultTableModel model = new DefaultTableModel(null, titulos);
        Connection con = Conexion.getConexion();

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("Id_Producto");
                registros[1] = rs.getString("Nombre_Producto");
                registros[2] = rs.getString("Descripcion");
                registros[3] = rs.getString("Categoria");
                registros[4] = rs.getString("Presentacion");
                registros[5] = rs.getString("Lote");
                registros[6] = rs.getString("Fecha_Vencimiento");
                registros[7] = rs.getString("Estado");
                registros[8] = rs.getString("Unidades");
                registros[9] = rs.getString("Tamaño");
                registros[10] = rs.getString("Precio");
                registros[11] = rs.getString("ISV");
                registros[12] = rs.getString("Descripcion");
                model.addRow(registros);
            }

            tablaP.setModel(model);
            // anchoColumnas();
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void inventario() {

    }

    public class CargarImpuesto {

        public DefaultComboBoxModel getvalues() {

            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            try {
                Connection con = Conexion.getConexion();
                String sql = "Select ISV from Tipo_Impuesto";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                modelo.addElement("Seleccione Impuesto...");
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

    public class CargarDescuento {

        public DefaultComboBoxModel getvalues() {

            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            try {
                Connection con = Conexion.getConexion();
                String sql = "Select Descripcion from DescuentoProducto";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                modelo.addElement("Seleccione Descuento...");
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
