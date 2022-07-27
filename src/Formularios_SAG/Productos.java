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
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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

/**
 *
 * @author Allisson Castro
 */
public class Productos extends javax.swing.JFrame {

    /**
     * Creates new form Productos
     */
    log lo = new log();
    String producto = "Productos";

    public static String Id_Producto = "0";

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
    String userName;

    public Productos() {
        initComponents();
        usuario.setText(Login.txtUsuario.getText());
        habilitarroles();
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
        userName = usuario.getText();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("componentes/LOGOSAG(2).png"));
        return retValue;
    }

    int npermiso;

    public boolean verificarDatosExistentes(String campo, String columna, String tabla, String mensaje) {
        Conexion cc = new Conexion();
        Connection cn = cc.getConexion();
        boolean resultado = true;
        String verificar = "Verificar";
        String sql = "SELECT " + columna + " FROM " + tabla + " WHERE " + columna + " = '" + campo + "'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                if (rs.getString(columna).equals(campo)) {
                    JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                    resultado = false;
                }
            }
        } catch (Exception e) {
            lo.LogBitacora("Error: No se pudo verificar el dato " + "Excepción: " + e + ". Origen: " + this.getClass().getSimpleName(), producto, verificar);
            JOptionPane.showMessageDialog(null, "No se pudo verificar\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
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
        jLabel1 = new javax.swing.JLabel();
        txtIDP = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reporte = new javax.swing.JLabel();
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
        getContentPane().add(txtNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 275, 190, 30));

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
        getContentPane().add(txtDescripcionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 190, 30));

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
        getContentPane().add(txtUnidadP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 190, 30));

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
        getContentPane().add(ComboImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 685, 190, 30));

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
        getContentPane().add(txtTamañosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 505, 190, 30));

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
        getContentPane().add(txtLoteP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 190, 30));

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
        getContentPane().add(txtPrecioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 190, 30));

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
        getContentPane().add(txtBuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 225, 240, 30));

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
        getContentPane().add(txtFechaVencimientoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 606, 186, 20));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Fecha Vencimiento");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 594, 180, 15));
        getContentPane().add(txtIDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 100, 20));

        usuario.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 720, 230, 20));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 740, 70, -1));

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
        getContentPane().add(reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, 120, 40));

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
        if (editari == 1) {
            String editar = "BtnEditar";
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
                        lo.LogBitacora("Error: No se pudo editar el dato " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), producto, editar);
                        JOptionPane.showMessageDialog(null, ex.toString());
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esta acción no se encuentra disponible para tu usuario", "ERROR", JOptionPane.ERROR_MESSAGE);
            lo.LogUsuarios(producto, "Boton Editar", userName);
        }

    }//GEN-LAST:event_botonEditarPMouseClicked

    private void botonGuardarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarPMouseClicked
        if (botonGuardarP.isEnabled()) {
            String guardar = "BtnGuardar";
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
                        lo.LogBitacora("Error: No se pudo guardar el dato " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), producto, guardar);
                        JOptionPane.showMessageDialog(null, ex.toString());
                        JOptionPane.showMessageDialog(null, ex.toString());
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esta acción no se encuentra disponible para tu usuario", "ERROR", JOptionPane.ERROR_MESSAGE);
            lo.LogUsuarios(producto, "Boton Guardar", userName);
        }

    }

    private void cargartabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaP.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        String cargart = "CargarTabla";

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
            lo.LogBitacora("Error: No se pudo vcargar la tabla " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), producto, cargart);
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
            txtDescripcionP.setText("Ingrese Descripción Producto");
            txtDescripcionP.setForeground(new Color(153, 153, 153));
        }
        txtUnidadP.setText("");
        if (txtUnidadP.getText().equals("")) {
            txtUnidadP.setText("Ingrese Unidades Producto");
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
            txtPrecioP.setText("Ingrese Precio Producto");
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
        String tablap = "TablaProducto";
        try {
            int fila = tablaP.getSelectedRow();
            int id = Integer.parseInt(tablaP.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select P.Id_Producto,P.Nombre_Producto, P.Descripcion, C.Categoria, PR.Presentacion,P.Unidades, P.Tamaño, P.Lote, P.Fecha_Vencimiento, P.Precio,TI.ISV,DP.Descripcion as Descri ,E.Estado\n"
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
                ComboDesc.setSelectedItem(rs.getString("Descri"));
                txtDescripcionP.setText(rs.getString("Descripcion"));
                ComboCategoriaP.setSelectedItem(rs.getString("Categoria"));
                ComboImp.setSelectedItem(rs.getString("ISV"));

                ComboPresentacionP.setSelectedItem(rs.getString("Presentacion"));
                txtLoteP.setText(rs.getString("Lote"));
                txtFechaVencimientoP.setDate(rs.getDate("Fecha_Vencimiento"));
                txtUnidadP.setText(rs.getString("Unidades"));
                txtTamañosP.setText(rs.getString("Tamaño"));
                txtPrecioP.setText(rs.getString("Precio"));
                //combo
                if (activoi == 1) {
                    BotonActivoP.setVisible(Boolean.TRUE);
                    if (rs.getString("Id_Estado").equals("1")) {
                        BotonActivoP.setSelected(true);
                    }
                } else {
                    BotonActivoP.setVisible(Boolean.FALSE);
                }
                if (inactivoi == 1) {
                    BotonInactivoP.setVisible(Boolean.TRUE);
                    if (rs.getString("Id_Estado").equals("2")) {
                        BotonInactivoP.setSelected(true);

                    }
                } else {
                    BotonInactivoP.setVisible(Boolean.FALSE);
                }

                Id_Producto = txtIDP.getText();

                //BotonActivoPro.setVisible(Boolean.TRUE);
                //BotonInactivoPro.setVisible(Boolean.TRUE);
                //id = txtId_Proveedor.getText();
                Habillitar();
            }
        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo seleccionar la tabla " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), producto, tablap);
            JOptionPane.showMessageDialog(null, ex.toString());

        }


    }//GEN-LAST:event_tablaPMouseClicked

    private void botonAgregarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarPMouseClicked
        if (botonAgregarP.isEnabled()) {
            Habillitar();
            if (guardari == 1) {
                botonGuardarP.isEnabled();
                //BotonCancelarPro.isEnabled();   
            }
            if (cancelari == 1) {
                //BotonGuardarPro.isEnabled();
                botonCancelarP.isEnabled();
            }
        } else {

            JOptionPane.showMessageDialog(null, "Esta acción no se encuentra disponible para tu usuario", "ERROR", JOptionPane.ERROR_MESSAGE);
            lo.LogUsuarios(producto, "Boton Agregar", userName);

        }

    }//GEN-LAST:event_botonAgregarPMouseClicked

    private void botonCancelarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarPMouseClicked
        if (botonCancelarP.isEnabled()) {
            // Limpiar();
            //Inhabillitar();
            botonCancelarP.setEnabled(Boolean.FALSE);
            botonCancelarP.setEnabled(Boolean.FALSE);
        } else {
            JOptionPane.showMessageDialog(null, "Esta acción no se encuentra disponible para tu usuario", "ERROR", JOptionPane.ERROR_MESSAGE);
            lo.LogUsuarios(producto, "Boton Cancelar", userName);
        }
    }//GEN-LAST:event_botonCancelarPMouseClicked

    private void BotonActivoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActivoPActionPerformed

        String Id = txtIDP.getText();
        String activo = "BtnActivo";

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Update Productos set Id_Estado=? Where Id_Producto=?");
            ps.setInt(1, 2);
            ps.setString(2, Id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Habilitado");
            cargartabla();
            Limpiar();
            Inhabillitar();
            // txt.setVisible(Boolean.FALSE);
            BotonActivoP.setVisible(Boolean.FALSE);
            BotonInactivoP.setVisible(Boolean.FALSE);

        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo guardar el dato " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), producto, activo);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_BotonActivoPActionPerformed

    private void BotonInactivoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInactivoPActionPerformed

        String Id = txtIDP.getText();
        String inactivo = "BtnInactivo";
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Update Productos set Id_Estado=? Where Id_Producto=?");
            ps.setInt(1, 1);
            ps.setString(2, Id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Inhabilitado");
            cargartabla();
            Limpiar();
            Inhabillitar();
            // txtEstadoC.setVisible(Boolean.FALSE);
            BotonActivoP.setVisible(Boolean.FALSE);
            BotonInactivoP.setVisible(Boolean.FALSE);

        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo guardar el dato " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), producto, inactivo);
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }//GEN-LAST:event_BotonInactivoPActionPerformed

    private void txtNombrePFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombrePFocusLost
        if (txtNombreP.getText().equals("")) {
            txtNombreP.setText("Ingrese Nombre Producto");
            txtNombreP.setForeground(new Color(153, 153, 153));
            if (!txtNombreP.getText().matches("^[A-Z-ÁÉÍÓÚÑ]{1}[a-z-áéíóúñ]+$")) {
                JOptionPane.showMessageDialog(null, "Debes escribir un nombre de producto comenzando en mayúscula.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                verificarDatosExistentes(txtNombreP.getText(), "Nombre_Producto", "Productos", "Este medicamento ya existe en la base de datos");
            }

        }
    }//GEN-LAST:event_txtNombrePFocusLost

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
        if (txtNombreP.getText().length() > 50) {
            JOptionPane.showMessageDialog(null, "El máximo es de 50 caracteres para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
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
        if (txtTamañosP.getText().length() > 15) {
            JOptionPane.showMessageDialog(null, "El máximo es de 15 caracteres para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (txtTamañosP.getText().length() > 0) {
            if (!txtTamañosP.getText().matches("^(?!.*([A-Za-zñÑáéíóúÁÉÍÓÚ\\s])\\1{2})[A-Za-zñÑáéíóúÁÉÍÓÚ\\s0-9]+$")) {
                JOptionPane.showMessageDialog(null, "No repitas caracteres de forma incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtTamañosPKeyTyped

    private void txtDescripcionPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionPKeyTyped
        if (txtDescripcionP.getText().length() > 50) {
            JOptionPane.showMessageDialog(null, "El máximo es de 50 caracteres para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "El máximo es de 20 caracteres para este campo", "Error", JOptionPane.ERROR_MESSAGE);
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
        if (habilitarr(12) == 12) {

            PrecioHistoricoProducto php = new PrecioHistoricoProducto();
            {
                php.setVisible(true);
                dispose();

            }
        } else {
            JOptionPane.showMessageDialog(null, "Este usuario No tiene Acceso a esta pantalla", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtPrecioHistoricoMouseClicked

    private void botonRestringirPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRestringirPMouseClicked
        if (habilitarr(11) == 11) {
            Medicamentos_Restringidos mr = new Medicamentos_Restringidos();
            {
                mr.setVisible(true);
                dispose();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Este usuario No tiene Acceso a esta pantalla", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_botonRestringirPMouseClicked

    private void ComboDescMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboDescMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboDescMousePressed

    private void ComboImpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboImpMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboImpMousePressed

    private void reporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteMouseClicked
        JasperReport reporte;
        HashMap hm = new HashMap();
        hm.put("Usuario", usuario.getText());
        try {
            Connection con = Conexion.getConexion();
            reporte = JasperCompileManager.compileReport("src/Reportes/ReporteProductos.jrxml");
            JasperPrint jp = JasperFillManager.fillReport(reporte, hm, con);
            JasperViewer.viewReport(jp, true);
            ReportView view = new ReportView(jp, false);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reporteMouseClicked

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel reporte;
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
    private javax.swing.JLabel usuario;
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
            String cargarc = "CargarCategoria";

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
                lo.LogBitacora("Error: No se pudo cargar la categoria " + "Excepción: " + e + ". Origen: " + this.getClass().getSimpleName(), producto, cargarc);
                System.out.println(e);
            }
            return modelo;
        }
    }

    public class CargarPresentacion {

        public DefaultComboBoxModel getvalues() {
            String cargarp = "CargarPresentacion";

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
                lo.LogBitacora("Error: No se pudo cargar la presentacion " + "Excepción: " + e + ". Origen: " + this.getClass().getSimpleName(), producto, cargarp);
                System.out.println(e);
            }
            return modelo;
        }
    }

    void buscarData(String valor) {
        String buscar = "Buscar";
        String[] titulos = {"ID Producto", "Nombre Producto", "Descripción", "Categoría Producto", "Presentación Producto", "Unidades", "Tamaño", "Lote ", "Fecha Vencimiento", "Precio", "Impuesto", "Descuento", "IdEstado"};
        String[] registros = new String[13];
        String sql = "Select P.Id_Producto,P.Nombre_Producto, P.Descripcion, C.Categoria, PR.Presentacion,P.Unidades, P.Tamaño, P.Lote, P.Fecha_Vencimiento, P.Precio,TI.ISV,DP.Descripcion as Descri ,E.Estado\n"
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
                registros[7] = rs.getString("Lote");
                registros[8] = rs.getString("Fecha_Vencimiento");
                registros[12] = rs.getString("Estado");
                registros[5] = rs.getString("Unidades");
                registros[6] = rs.getString("Tamaño");
                registros[9] = rs.getString("Precio");
                registros[10] = rs.getString("ISV");
                registros[11] = rs.getString("Descri");
                model.addRow(registros);
            }

            tablaP.setModel(model);
            // anchoColumnas();
        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo buscar el dato " + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), producto, buscar);
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void inventario() {

    }

    public class CargarImpuesto {

        public DefaultComboBoxModel getvalues() {
            String cargarI = "CargarImpuesto";

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
                lo.LogBitacora("Error: No se pudo cargar el impuesto " + "Excepción: " + e + ". Origen: " + this.getClass().getSimpleName(), producto, cargarI);
                System.out.println(e);
            }
            return modelo;
        }
    }

    public class CargarDescuento {

        public DefaultComboBoxModel getvalues() {
            String cargarD = "CargarDescuento";

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
                lo.LogBitacora("Error: No se pudo cargar el descuento " + "Excepción: " + e + ". Origen: " + this.getClass().getSimpleName(), producto, cargarD);
                System.out.println(e);
            }
            return modelo;
        }
    }

    private void habilitarroles() {
        try {

            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select PU.Agregar, PU.Guardar, PU.Cancelar, PU.Editar, PU.Activo, PU.Inactivo, PU.Reporte, PU.Anular, PU.CrearCompra, PU.Historicos, PU.Buscar\n"
                    + "From PermisosUsuario AS PU\n"
                    + "Inner Join Usuario as U on PU.IdUsuario=U.Id_Usuario\n"
                    + "where PU.IdPermiso=? and U.Nombre=?");
            ps.setInt(1, 4);
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
        if (agregari == 1) {
            botonAgregarP.setEnabled(Boolean.TRUE);
        } else if (agregari == 0) {
            botonAgregarP.setEnabled(Boolean.FALSE);
            botonAgregarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));
        }

        if (guardari == 1) {
            botonGuardarP.setEnabled(Boolean.TRUE);
        } else if (guardari == 0) {
            botonGuardarP.setEnabled(Boolean.FALSE);
            botonGuardarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));

        }
        if (editari == 1) {
            botonEditarP.setEnabled(Boolean.TRUE);
        } else {
            botonEditarP.setEnabled(Boolean.FALSE);
            botonEditarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));
        }

        if (cancelari == 1) {
            botonCancelarP.setEnabled(Boolean.TRUE);

        } else {
            botonCancelarP.setEnabled(Boolean.FALSE);
            botonCancelarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));
        }
        if (reportesi == 1) {
            reporte.setVisible(Boolean.TRUE);

        } else {
            reporte.setVisible(Boolean.FALSE);
            //jLabel2.setEnabled(Boolean.TRUE);
        }
        if (buscari == 1) {
            txtBuscarP.setEnabled(Boolean.TRUE);
        } else {
            txtBuscarP.setEnabled(Boolean.FALSE);
            txtBuscarP.setText("NO DISPONIBLE");
        }
        /* if (anulari == 1) {
            Anular.setSelected(Boolean.TRUE);
        } else {
            Anular.setSelected(Boolean.FALSE);
        }*/
        if (activoi == 1) {
            //BotonActivoPro.setVisible(Boolean.TRUE);
        } else {
            BotonActivoP.setVisible(Boolean.FALSE);
        }
        if (inactivoi == 1) {
            //BotonInactivoPro.setVisible(Boolean.TRUE);
        } else {
            BotonInactivoP.setVisible(Boolean.FALSE);
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

    public int habilitarr(int numeroPermiso) {
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
