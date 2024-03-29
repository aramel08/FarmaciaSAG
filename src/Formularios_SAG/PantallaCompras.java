/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios_SAG;

import Conexion.Conexion;
import static Formularios_SAG.Empleados.Id_emp;
import static Formularios_SAG.Factura.Usuario;
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
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Allisson Castro
 */
public class PantallaCompras extends javax.swing.JFrame {

    log lo = new log();
    String comprasp = "PantallaCompra";

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
    int eliminari;
    int aprobari;
    String userName;

    public static String Detalle = "";

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("componentes/LOGOSAG(2).png"));
        return retValue;
    }

    boolean verificarDatosExistentes(String campo, String columna, String tabla, String mensaje) {
        Conexion cc = new Conexion();
        Connection cn = cc.getConexion();
        boolean resultado = true;
        String verificar = "verificar";
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
            lo.LogBitacora("Error: No se pudo verificar datos existentes" + "Excepción: " + e + ". Origen: " + this.getClass().getSimpleName(), comprasp, verificar);
            JOptionPane.showMessageDialog(null, "No se pudo verificar\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }

    public PantallaCompras() {
        initComponents();
        txtidCompra.setText(RegistroCompras.Id_Comp);
        usuario.setText(Login.txtUsuario.getText());
        habilitarroles();
        if (txtidCompra.getText() != "0") {
            cargarcampose();
            habilitarDetalle();
            cargarFact();
            ComboEstado.setEnabled(Boolean.TRUE);
            userName = usuario.getText();

            //CargarProductor cp = new PantallaCompras.CargarProductor();
            //  ComboProductos.setModel(cp.getvalues());
        }
        //cargarcampose();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_WEEK, -10);
        //Calendar cale = Calendar.getInstance();
        //cale.add(Calendar.DAY_OF_WEEK, -10);
        Calendar calen = Calendar.getInstance();
        calen.add(Calendar.DAY_OF_WEEK, +1);
        //Calendar calendar = Calendar.getInstance();
        //cal.add(Calendar.YEAR, +1);//5 year before
        Calendar calendario = Calendar.getInstance();
        calendario.add(Calendar.MONTH, +3);//5 year before
        Date min = cal.getTime();
        Date max = new Date();
        // Date minimo = calendar.getTime();
        Date mini = calen.getTime();
        //Date maximo = cale.getTime();
        Date maxi = calendario.getTime();
        FechaCompra.setDateFormatString("dd/MM/yyyy");
        FechaEntrega.setDateFormatString("dd/MM/yyyy");
        FechaVencimiento.setDateFormatString("dd/MM/yyyy");
        FechaCompra.setSelectableDateRange(min, max);
        FechaEntrega.setSelectableDateRange(min, max);
        FechaVencimiento.setSelectableDateRange(mini, maxi);
        FechaCompra.setDate(maxi);
        CargarProveedor ch = new PantallaCompras.CargarProveedor();
        ComboProveedor.setModel(ch.getvalues());
        CargarEstado ce = new PantallaCompras.CargarEstado();
        ComboEstado.setModel(ce.getvalues());
        ComboEstado.setSelectedIndex(1);
        AutoCompleteDecorator.decorate(ComboEstado);
        AutoCompleteDecorator.decorate(ComboProductos);
        AutoCompleteDecorator.decorate(ComboProveedor);
        //lbfechaentrega.setVisible(Boolean.TRUE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        lbfechacompra = new javax.swing.JLabel();
        txtTotalCompra = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtNumeroFactura = new javax.swing.JTextField();
        txtIdDetalle = new javax.swing.JLabel();
        txtidCompra = new javax.swing.JLabel();
        txtIdProv = new javax.swing.JLabel();
        lbfechavencimiento = new javax.swing.JLabel();
        lbfechaentrega = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JLabel();
        FechaVencimiento = new com.toedter.calendar.JDateChooser();
        FechaEntrega = new com.toedter.calendar.JDateChooser();
        FechaCompra = new com.toedter.calendar.JDateChooser();
        ComboProductos = new javax.swing.JComboBox<>();
        txtNumeroFacturaC = new javax.swing.JTextField();
        botonRegresar = new javax.swing.JLabel();
        BotonCancelar = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JLabel();
        BotonEditar = new javax.swing.JLabel();
        txtDescuentoC = new javax.swing.JTextField();
        txtISV = new javax.swing.JTextField();
        txtCostoUnitario = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        usuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonEditarC = new javax.swing.JLabel();
        BotonEliminarC = new javax.swing.JLabel();
        BotonAgregarC = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacompra = new javax.swing.JTable();
        ComboProveedor = new javax.swing.JComboBox<>();
        ComboEstado = new javax.swing.JComboBox<>();
        BotonBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbfechacompra.setBackground(new java.awt.Color(255, 255, 255));
        lbfechacompra.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        lbfechacompra.setForeground(new java.awt.Color(153, 153, 153));
        lbfechacompra.setText("Fecha de Compra");
        lbfechacompra.setToolTipText("");
        lbfechacompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lbfechacompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 170, 30));

        txtTotalCompra.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtTotalCompra.setForeground(new java.awt.Color(153, 153, 153));
        txtTotalCompra.setText("Ingrese Total");
        txtTotalCompra.setBorder(null);
        txtTotalCompra.setOpaque(false);
        txtTotalCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTotalCompraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTotalCompraFocusLost(evt);
            }
        });
        txtTotalCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTotalCompraMousePressed(evt);
            }
        });
        txtTotalCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalCompraKeyTyped(evt);
            }
        });
        getContentPane().add(txtTotalCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 264, 195, 30));

        txtDescuento.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtDescuento.setForeground(new java.awt.Color(153, 153, 153));
        txtDescuento.setText("Ingrese Descuento");
        txtDescuento.setBorder(null);
        txtDescuento.setOpaque(false);
        txtDescuento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescuentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescuentoFocusLost(evt);
            }
        });
        txtDescuento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescuentoMousePressed(evt);
            }
        });
        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyTyped(evt);
            }
        });
        getContentPane().add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 208, 195, 30));

        txtDescripcion.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(153, 153, 153));
        txtDescripcion.setText("Ingrese Descripción");
        txtDescripcion.setBorder(null);
        txtDescripcion.setOpaque(false);
        txtDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescripcionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescripcionFocusLost(evt);
            }
        });
        txtDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescripcionMousePressed(evt);
            }
        });
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 192, 30));

        txtNumeroFactura.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtNumeroFactura.setForeground(new java.awt.Color(153, 153, 153));
        txtNumeroFactura.setText("Ingrese Número Factura");
        txtNumeroFactura.setBorder(null);
        txtNumeroFactura.setOpaque(false);
        txtNumeroFactura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumeroFacturaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroFacturaFocusLost(evt);
            }
        });
        txtNumeroFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNumeroFacturaMousePressed(evt);
            }
        });
        txtNumeroFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroFacturaKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumeroFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 214, 195, 30));
        getContentPane().add(txtIdDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 30, 20));
        getContentPane().add(txtidCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 20, 20));
        getContentPane().add(txtIdProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 20, 20));

        lbfechavencimiento.setBackground(new java.awt.Color(255, 255, 255));
        lbfechavencimiento.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        lbfechavencimiento.setForeground(new java.awt.Color(153, 153, 153));
        lbfechavencimiento.setText("Fecha de Vencimiento");
        lbfechavencimiento.setToolTipText("");
        lbfechavencimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lbfechavencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 170, 20));

        lbfechaentrega.setBackground(new java.awt.Color(255, 255, 255));
        lbfechaentrega.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        lbfechaentrega.setForeground(new java.awt.Color(153, 153, 153));
        lbfechaentrega.setText("Fecha de Entrega");
        lbfechaentrega.setToolTipText("");
        lbfechaentrega.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbfechaentrega.setNextFocusableComponent(FechaEntrega);
        getContentPane().add(lbfechaentrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 150, 20));
        getContentPane().add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 40, 20));

        FechaVencimiento.setToolTipText("Fecha Vencimiento");
        getContentPane().add(FechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 275, 195, 20));

        FechaEntrega.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        FechaEntrega.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FechaEntregaFocusLost(evt);
            }
        });
        FechaEntrega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FechaEntregaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FechaEntregaMousePressed(evt);
            }
        });
        getContentPane().add(FechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 222, 200, 20));

        FechaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FechaCompraMouseClicked(evt);
            }
        });
        getContentPane().add(FechaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 170, 195, 20));

        ComboProductos.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        ComboProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Productos" }));
        ComboProductos.setEnabled(false);
        ComboProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ComboProductosMousePressed(evt);
            }
        });
        ComboProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ComboProductosKeyPressed(evt);
            }
        });
        getContentPane().add(ComboProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 190, 30));

        txtNumeroFacturaC.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtNumeroFacturaC.setForeground(new java.awt.Color(153, 153, 153));
        txtNumeroFacturaC.setText("Ingrese Número Factura");
        txtNumeroFacturaC.setBorder(null);
        txtNumeroFacturaC.setEnabled(false);
        txtNumeroFacturaC.setOpaque(false);
        txtNumeroFacturaC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumeroFacturaCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroFacturaCFocusLost(evt);
            }
        });
        txtNumeroFacturaC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNumeroFacturaCMousePressed(evt);
            }
        });
        txtNumeroFacturaC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroFacturaCKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumeroFacturaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 415, 190, 30));

        botonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 20, 130, 40));

        BotonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCancelarMouseClicked(evt);
            }
        });
        getContentPane().add(BotonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 130, 40));

        BotonGuardar.setBackground(java.awt.Color.lightGray);
        BotonGuardar.setForeground(new java.awt.Color(204, 204, 204));
        BotonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardarMouseClicked(evt);
            }
        });
        getContentPane().add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(831, 160, 120, 30));

        BotonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEditarMouseClicked(evt);
            }
        });
        getContentPane().add(BotonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 130, 30));

        txtDescuentoC.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtDescuentoC.setForeground(new java.awt.Color(153, 153, 153));
        txtDescuentoC.setText("Ingrese Descuento");
        txtDescuentoC.setBorder(null);
        txtDescuentoC.setOpaque(false);
        txtDescuentoC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescuentoCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescuentoCFocusLost(evt);
            }
        });
        txtDescuentoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescuentoCMousePressed(evt);
            }
        });
        txtDescuentoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescuentoCKeyTyped(evt);
            }
        });
        getContentPane().add(txtDescuentoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 629, 190, 30));

        txtISV.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtISV.setForeground(new java.awt.Color(153, 153, 153));
        txtISV.setText("Ingrese ISV");
        txtISV.setBorder(null);
        txtISV.setOpaque(false);
        txtISV.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtISVFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtISVFocusLost(evt);
            }
        });
        txtISV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtISVMousePressed(evt);
            }
        });
        txtISV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtISVActionPerformed(evt);
            }
        });
        txtISV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtISVKeyTyped(evt);
            }
        });
        getContentPane().add(txtISV, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 585, 190, 30));

        txtCostoUnitario.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtCostoUnitario.setForeground(new java.awt.Color(153, 153, 153));
        txtCostoUnitario.setText("Ingrese Costo Unitario");
        txtCostoUnitario.setBorder(null);
        txtCostoUnitario.setOpaque(false);
        txtCostoUnitario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCostoUnitarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCostoUnitarioFocusLost(evt);
            }
        });
        txtCostoUnitario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCostoUnitarioMousePressed(evt);
            }
        });
        txtCostoUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoUnitarioActionPerformed(evt);
            }
        });
        txtCostoUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoUnitarioKeyTyped(evt);
            }
        });
        getContentPane().add(txtCostoUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 500, 190, 30));

        txtCantidad.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(153, 153, 153));
        txtCantidad.setText("Ingrese Cantidad");
        txtCantidad.setBorder(null);
        txtCantidad.setOpaque(false);
        txtCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCantidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCantidadFocusLost(evt);
            }
        });
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCantidadMousePressed(evt);
            }
        });
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 542, 190, 30));

        usuario.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 650, 230, 20));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 670, 70, -1));

        BotonEditarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEditarCMouseClicked(evt);
            }
        });
        getContentPane().add(BotonEditarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 120, 30));

        BotonEliminarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEliminarCMouseClicked(evt);
            }
        });
        getContentPane().add(BotonEliminarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 120, 30));

        BotonAgregarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAgregarCMouseClicked(evt);
            }
        });
        getContentPane().add(BotonAgregarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 410, 120, 40));

        tablacompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Detalle", "Número Factura", "Producto", "Costo Unitario", "Cantidad", "ISV", "Descuento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablacompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablacompraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablacompra);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 540, 180));

        ComboProveedor.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        ComboProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Proveedor" }));
        ComboProveedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboProveedorItemStateChanged(evt);
            }
        });
        ComboProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ComboProveedorMousePressed(evt);
            }
        });
        getContentPane().add(ComboProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 200, 30));

        ComboEstado.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        ComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Estado" }));
        ComboEstado.setEnabled(false);
        ComboEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ComboEstadoMousePressed(evt);
            }
        });
        getContentPane().add(ComboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 267, 200, 30));

        BotonBuscar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        BotonBuscar.setForeground(new java.awt.Color(153, 153, 153));
        BotonBuscar.setText("Buscar por Numero,Costo o Producto");
        BotonBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BotonBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BotonBuscarFocusLost(evt);
            }
        });
        BotonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonBuscarMousePressed(evt);
            }
        });
        BotonBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BotonBuscarKeyTyped(evt);
            }
        });
        getContentPane().add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 415, 265, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/Pantalla Compras(6).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FechaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaCompraMouseClicked

    }//GEN-LAST:event_FechaCompraMouseClicked

    private void FechaEntregaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaEntregaMouseClicked

    }//GEN-LAST:event_FechaEntregaMouseClicked

    private void FechaEntregaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaEntregaMousePressed
        //lbfechaentrega.setVisible(Boolean.FALSE);
    }//GEN-LAST:event_FechaEntregaMousePressed

    private void FechaEntregaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FechaEntregaFocusLost
        if (FechaEntrega.getDate().equals("")) {
            //lbfechaentrega.setVisible(Boolean.TRUE);
            //FechaEntrega.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_FechaEntregaFocusLost

    private void BotonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseClicked
        if (BotonGuardar.isEnabled()) {
            String guardar = "BtnGuardar";
            ObtenerID();
            Calendar Cal = Calendar.getInstance();
            String fec = Cal.get(Cal.HOUR_OF_DAY) + ":" + Cal.get(Cal.MINUTE) + ":" + Cal.get(Cal.SECOND);
            if (txtNumeroFactura.getText().equals("Ingrese Número Factura") || ComboEstado.equals("Seleccione Estado") || ComboProveedor.equals("Seleccione Proveedor")
                    || txtDescripcion.getText().equals("Ingrese Descripción") || txtDescuento.getText().equals("Ingrese Descuento") || txtTotalCompra.getText().equals("Ingrese Total")
                    || FechaCompra.getDate().equals("") || FechaEntrega.getDate().equals("") || FechaVencimiento.getDate().equals("")) {
                JOptionPane.showMessageDialog(null, "No se puede Guardar datos vacios");
                if (FechaCompra.getDate().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar fecha de compra");
                } else if (FechaEntrega.getDate().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar fecha de entrega");
                } else if (FechaVencimiento.getDate().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar fecha de Vencimiento");
                } else if (ComboProveedor.equals("Seleccione Proveedor")) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un proveedor");
                } else if (txtNumeroFactura.getText().equals("Ingrese Número Factura")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar número de factura");
                } else if (ComboEstado.getSelectedItem().equals("Seleccione Estado")) {
                    JOptionPane.showMessageDialog(null, "Debe Seleccionar Estado");
                } else if (txtDescripcion.getText().equals("Ingrese Descripción")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar Descripción");
                } else if (txtDescuento.getText().equals("Ingrese Descuento")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar Descuento");
                } else if (txtTotalCompra.getText().equals("Ingrese Total")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar el total de la compra");
                }
            } else {
                String Numerofactura = txtNumeroFactura.getText();
                String Descripcion = txtDescripcion.getText();
                String Descuento = txtDescuento.getText();
                String tcompra = txtTotalCompra.getText();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String FechaCom = sdf.format(FechaCompra.getDate());
                String FechaEnt = sdf.format(FechaEntrega.getDate());
                String Fechavenc = sdf.format(FechaVencimiento.getDate());
                int Prov = Integer.parseInt(txtIdProv.getText());

                try {
                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("Insert into Compras (Id_Proveedor, Num_Factura,Fecha_Compra,Fecha_Entrega, Fecha_Vencimiento, Descripcion,Descuento,Total_Compra,Id_EstadoC) VALUES(?,?,?,?,?,?,?,?,?)");
                    ps.setInt(1, Prov);
                    ps.setString(2, Numerofactura);
                    ps.setString(3, FechaCom);
                    ps.setString(4, FechaEnt);
                    ps.setString(5, Fechavenc);
                    ps.setString(6, Descripcion);
                    ps.setString(7, Descuento);
                    ps.setString(8, tcompra);
                    ps.setInt(9, ComboEstado.getSelectedIndex());
                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Registro guardado");
                    //Inhabillitar();
                    cargarFact();
                    habilitarDetalle();
                    CargarProductor cp = new PantallaCompras.CargarProductor();
                    ComboProductos.setModel(cp.getvalues());

                } catch (SQLException ex) {
                    lo.LogBitacora("Error: No se pudo guardar los datos" + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), comprasp, guardar);
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esta acción no se encuentra disponible para tu usuario", "ERROR", JOptionPane.ERROR_MESSAGE);
            lo.LogUsuarios(comprasp, "Boton Editar", userName);
        }


    }//GEN-LAST:event_BotonGuardarMouseClicked

    private void BotonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarMouseClicked
        if (BotonEditar.isEnabled()) {
            if (editari == 1) {
                String editar = "BtnEditar";
                String Numerofactura = txtNumeroFactura.getText();
//        String Hora = txtHora.getText();
                String Descripcion = txtDescripcion.getText();
                String Descuento = txtDescuento.getText();
                String tcompra = txtTotalCompra.getText();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String FechaCom = sdf.format(FechaCompra.getDate());
                String FechaEnt = sdf.format(FechaEntrega.getDate());
                String Fechavenc = sdf.format(FechaVencimiento.getDate());
                int Prov = Integer.parseInt(txtIdProv.getText());
                int Id_Compra = Integer.parseInt(txtidCompra.getText());
                String Estado = "";

                try {
                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("Update Compras set Id_Proveedor=?, Num_Factura=?,Fecha_Compra=?,Fecha_Entrega=?, Fecha_Vencimiento=?,Id_EstadoC=?, Descripcion=?,Descuento=?,Total_Compra=? where Id_Compra=?");
                    ps.setInt(1, Prov);
                    ps.setString(2, Numerofactura);
                    ps.setString(3, FechaCom);
                    ps.setString(4, FechaEnt);
                    ps.setString(5, Fechavenc);
                    ps.setInt(6, ComboEstado.getSelectedIndex());
                    ps.setString(7, Descripcion);
                    ps.setString(8, Descuento);
                    ps.setString(9, tcompra);
                    ps.setInt(10, Id_Compra);
                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Registro guardado");
                    //Inhabillitar();
                    CargarProductor cp = new PantallaCompras.CargarProductor();
                    ComboProductos.setModel(cp.getvalues());

                } catch (SQLException ex) {
                    lo.LogBitacora("Error: No se pudo eitar los datos" + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), comprasp, editar);
                    JOptionPane.showMessageDialog(null, ex.toString());

                }
            } else {
                JOptionPane.showMessageDialog(null, "Esta acción no se encuentra disponible para tu usuario", "ERROR", JOptionPane.ERROR_MESSAGE);
                lo.LogUsuarios(comprasp, "Boton Guardar", userName);
            }
        }

    }//GEN-LAST:event_BotonEditarMouseClicked

    private void BotonAgregarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAgregarCMouseClicked
        if (BotonAgregarC.isEnabled()) {
            String agregar = "BtnAgregar";
            ObtenerIdProd();
            if (txtNumeroFacturaC.getText().equals("Ingrese Número Factura") || txtCostoUnitario.getText().equals("Ingrese Costo Unitario") || ComboProductos.equals("Seleccione Productos")
                    || txtCantidad.getText().equals("Ingrese Cantidad") || txtISV.getText().equals("Ingrese ISV") || txtDescuento.getText().equals("Ingrese Descuento")) {
                JOptionPane.showMessageDialog(null, "No se puede Guardar datos vacios");
                if (ComboProductos.equals("Seleccione Productos")) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
                } else if (txtNumeroFacturaC.getText().equals("Ingrese Número Factura")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar número de factura");
                } else if (ComboEstado.getSelectedItem().equals("Seleccione Estado")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar Hora");
                } else if (txtCostoUnitario.getText().equals("Ingrese Costo Unitario")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar Costo Unitario");
                } else if (txtCantidad.getText().equals("Ingrese Cantidad")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar Cantidad");
                } else if (txtISV.getText().equals("Ingrese ISV")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar el impuesto");
                } else if (txtDescuento.getText().equals("Ingrese Descuento")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar el descuento");
                }
            } else {
                int idcompra = Integer.parseInt(txtidCompra.getText());
                String costou = txtCostoUnitario.getText();
                String Descripcion = txtDescripcion.getText();
                String Descuento = txtDescuentoC.getText();
                String cantidad = txtCantidad.getText();
                String ISv = txtISV.getText();
                int Prod = Integer.parseInt(txtIdProducto.getText());
                int IDDT = 1;
                if (ComboEstado.getSelectedIndex() == 1) {
                    IDDT = 1;
                } else if (ComboEstado.getSelectedIndex() == 2) {
                    IDDT = 2;
                }
                try {
                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("Insert Into Detalle_Compra(Id_Compra,Id_Producto,Costo_Unitario,Descuento,Cantidad,ISV,Id_EstadoDC) Values (?,?,?,?,?,?,?)");
                    ps.setInt(1, idcompra);
                    ps.setInt(2, Prod);
                    ps.setString(3, costou);
                    ps.setString(4, Descuento);
                    ps.setString(5, cantidad);
                    ps.setString(6, ISv);
                    ps.setInt(7, IDDT);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro guardado");
                    //Inhabillitar();
                    cargartabla();

                } catch (SQLException ex) {
                    lo.LogBitacora("Error: No se pudo agregar el producto" + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), comprasp, agregar);
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esta acción no se encuentra disponible para tu usuario", "ERROR", JOptionPane.ERROR_MESSAGE);
            lo.LogUsuarios(comprasp, "Boton Guardar", userName);
        }

    }//GEN-LAST:event_BotonAgregarCMouseClicked

    private void BotonEliminarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarCMouseClicked
        if (BotonEliminarC.isEnabled()) {
            String eliminar = "BtnEliminar";
            int id_Detalle = Integer.parseInt(txtIdDetalle.getText());
            try {
                ResultSet rs;
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Delete Detalle_Compra where Id_Detalle_Compra=?");
                ps.setInt(1, id_Detalle);
                rs = ps.executeQuery();
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                cargartabla();
            } catch (SQLException ex) {
                lo.LogBitacora("Error: No se pudo eliminar los datos" + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), comprasp, eliminar);
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        } else {

            JOptionPane.showMessageDialog(null, "Esta acción no se encuentra disponible para tu usuario", "ERROR", JOptionPane.ERROR_MESSAGE);
            lo.LogUsuarios(comprasp, "Boton Eliminar", userName);
        }
    }//GEN-LAST:event_BotonEliminarCMouseClicked

    private void tablacompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablacompraMouseClicked
        String tablac = "TablaCompra";
        try {
            int fila = tablacompra.getSelectedRow();
            int id = Integer.parseInt(tablacompra.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select DC.Id_Detalle_Compra,C.Num_Factura, P.Nombre_Producto, DC.Costo_Unitario, DC.Cantidad, DC.ISV, DC.Descuento, DC.Id_EstadoDC\n"
                    + "From Detalle_Compra as DC\n"
                    + "Inner Join Productos as P On DC.Id_Producto = P.Id_Producto\n"
                    + "Inner Join Compras as C ON DC.Id_Compra = C.Id_Compra\n"
                    + "Where DC.Id_Detalle_Compra=?\n"
                    + "Order By DC.Id_Detalle_Compra");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtIdDetalle.setText(String.valueOf(id));
                txtNumeroFacturaC.setText(rs.getString("Num_Factura"));
                ComboProductos.setSelectedItem(rs.getString("Nombre_Producto"));
                txtCostoUnitario.setText(rs.getString("Costo_Unitario"));
                txtCantidad.setText(rs.getString("Cantidad"));
                txtISV.setText(rs.getString("ISV"));
                txtDescuentoC.setText(rs.getString("Descuento"));
                Detalle = rs.getString("Id_EstadoDC");
            }
            BotonEditarC.setEnabled(Boolean.TRUE);

        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo cargar la tabla compra" + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), comprasp, tablac);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_tablacompraMouseClicked

    private void BotonEditarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarCMouseClicked
        if (editari == 1) {
            String edit = "btnEditar";
            if (BotonEditarC.isEnabled() == false) {
                JOptionPane.showMessageDialog(null, "Selecciona un registro de la tabla", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else if (Detalle.equals("1")) {
                try {
                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("Update Detalle_Compra set Id_EstadoDC=2 where Id_Detalle_Compra=?");
                    ps.setInt(1, Integer.parseInt(txtIdDetalle.getText()));
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro Aprobado");
                    cargartabla();
                    BotonEditarC.setEnabled(Boolean.FALSE);
                } catch (SQLException ex) {
                    lo.LogBitacora("Error: No se pudo editar los datos" + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), comprasp, edit);
                    JOptionPane.showMessageDialog(null, ex.toString());

                }
            } else if (Detalle.equals("2")) {
                JOptionPane.showMessageDialog(null, "Este registro ya fue aprobado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                BotonEditarC.setEnabled(Boolean.FALSE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Esta acción no se encuentra disponible para tu usuario", "ERROR", JOptionPane.ERROR_MESSAGE);
            lo.LogUsuarios(comprasp, "Boton Editar", userName);
        }
    }//GEN-LAST:event_BotonEditarCMouseClicked

    private void txtNumeroFacturaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFacturaFocusGained
        if (txtNumeroFactura.getText().equals("Ingrese Número Factura")) {
            txtNumeroFactura.setText("");
            txtNumeroFactura.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtNumeroFacturaFocusGained

    private void txtNumeroFacturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFacturaFocusLost
        if (txtNumeroFactura.getText().equals("")) {
            txtNumeroFactura.setText("Ingrese Número Factura");
            txtNumeroFactura.setForeground(new Color(153, 153, 153));
        } else if (txtNumeroFactura.getText().length() < 16) {
            JOptionPane.showMessageDialog(null, "El Número de Factura debe contener  16 dígitos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            verificarDatosExistentes(txtNumeroFactura.getText(), "Num_Factura", "Compras", "El número de factura ya existe");
        }

    }//GEN-LAST:event_txtNumeroFacturaFocusLost

    private void txtDescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionFocusGained
        if (txtDescripcion.getText().equals("Ingrese Descripción")) {
            txtDescripcion.setText("");
            txtDescripcion.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtDescripcionFocusGained

    private void txtDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionFocusLost
        if (txtDescripcion.getText().equals("")) {
            txtDescripcion.setText("Ingrese Descripción");
            txtDescripcion.setForeground(new Color(153, 153, 153));
        } else if (!txtDescripcion.getText().isEmpty()) {
            if (!txtDescripcion.getText().matches("^[A-Z-ÁÉÍÓÚÑ]{1}[a-z-áéíóúñ]+$")) {
                JOptionPane.showMessageDialog(null, "Debes escribir la descripción del producto comenzado en mayúscula. No utilice espacios", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_txtDescripcionFocusLost

    private void txtDescuentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescuentoFocusGained
        if (txtDescuento.getText().equals("Ingrese Descuento")) {
            txtDescuento.setText("");
            txtDescuento.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtDescuentoFocusGained

    private void txtDescuentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescuentoFocusLost
        if (txtDescuento.getText().equals("")) {
            txtDescuento.setText("Ingrese Descuento");
            txtDescuento.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtDescuentoFocusLost

    private void txtTotalCompraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalCompraFocusGained
        if (txtTotalCompra.getText().equals("Ingrese Total")) {
            txtTotalCompra.setText("");
            txtTotalCompra.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtTotalCompraFocusGained

    private void txtTotalCompraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalCompraFocusLost
        if (txtTotalCompra.getText().equals("")) {
            txtTotalCompra.setText("Ingrese Total");
            txtTotalCompra.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtTotalCompraFocusLost

    private void txtTotalCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalCompraKeyTyped
        validarNumeros(evt);
        if (txtTotalCompra.getText().length() > 3) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTotalCompraKeyTyped

    private void txtNumeroFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroFacturaKeyTyped
        validarNumeros(evt);
        if (txtNumeroFactura.getText().length() > 16) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroFacturaKeyTyped

    private void txtNumeroFacturaCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFacturaCFocusGained
        if (txtNumeroFacturaC.getText().equals("Ingrese Número Factura")) {
            txtNumeroFacturaC.setText("");
            txtNumeroFacturaC.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtNumeroFacturaCFocusGained

    private void txtNumeroFacturaCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFacturaCFocusLost
        if (txtNumeroFactura.getText().equals("")) {
            txtNumeroFactura.setText("Ingrese Número Factura");
            txtNumeroFactura.setForeground(new Color(153, 153, 153));
        } else if (txtNumeroFactura.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "El Número de Factura debe contener al menos 8 dígitos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNumeroFacturaCFocusLost

    private void txtNumeroFacturaCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroFacturaCKeyTyped
        validarNumeros(evt);
        if (txtNumeroFacturaC.getText().length() > 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroFacturaCKeyTyped

    private void txtCostoUnitarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCostoUnitarioFocusGained
        if (txtCostoUnitario.getText().equals("Ingrese Costo Unitario")) {
            txtCostoUnitario.setText("");
            txtCostoUnitario.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtCostoUnitarioFocusGained

    private void txtCostoUnitarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCostoUnitarioFocusLost
        if (txtCostoUnitario.getText().equals("")) {
            txtCostoUnitario.setText("Ingrese Costo Unitario");
            txtCostoUnitario.setForeground(new Color(153, 153, 153));
        } else if (txtCostoUnitario.getText().length() < 10) {
            JOptionPane.showMessageDialog(null, "El Costo unitario debe contener 10 dígitos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtCostoUnitarioFocusLost

    private void txtCostoUnitarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoUnitarioKeyTyped
        validarNumeros(evt);
        if (txtCostoUnitario.getText().length() > 4) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCostoUnitarioKeyTyped

    private void txtCantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadFocusGained
        if (txtCantidad.getText().equals("Ingrese Cantidad")) {
            txtCantidad.setText("");
            txtCantidad.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtCantidadFocusGained

    private void txtCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadFocusLost
        if (txtCantidad.getText().equals("")) {
            txtCantidad.setText("Ingrese Cantidad");
            txtCantidad.setForeground(new Color(153, 153, 153));
        } else if (txtCantidad.getText().length() > 3) {

            JOptionPane.showMessageDialog(null, "El Cantidad debe contener entre 1 y 3 dígitos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtCantidadFocusLost

    private void txtISVFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtISVFocusLost
        if (txtISV.getText().equals("")) {
            txtISV.setText("Ingrese ISV");
            txtISV.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtISVFocusLost

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtISVFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtISVFocusGained
        if (txtISV.getText().equals("Ingrese ISV")) {
            txtISV.setText("");
            txtISV.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtISVFocusGained

    private void txtISVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtISVKeyTyped
        validarNumeros(evt);
        if (txtISV.getText().length() > 4) {
            evt.consume();
        }
    }//GEN-LAST:event_txtISVKeyTyped

    private void txtDescuentoCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescuentoCFocusGained
        if (txtDescuentoC.getText().equals("Ingrese Descuento")) {
            txtDescuentoC.setText("");
            txtDescuentoC.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtDescuentoCFocusGained

    private void txtDescuentoCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescuentoCFocusLost
        if (txtDescuentoC.getText().equals("")) {
            txtDescuentoC.setText("Ingrese Descuento");
            txtDescuentoC.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtDescuentoCFocusLost

    private void txtDescuentoCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoCKeyTyped
        validarNumeros(evt);
        if (txtDescuentoC.getText().length() > 4) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDescuentoCKeyTyped

    private void BotonBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BotonBuscarFocusGained
        if (BotonBuscar.getText().equals("Buscar por Numero,Costo o Producto")) {
            BotonBuscar.setText("");
            BotonBuscar.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_BotonBuscarFocusGained

    private void BotonBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BotonBuscarFocusLost
        if (BotonBuscar.getText().equals("")) {
            BotonBuscar.setText("Buscar por Numero,Costo o Producto");
            BotonBuscar.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_BotonBuscarFocusLost

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
    private void BotonBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotonBuscarKeyTyped
        buscarData(BotonBuscar.getText());
        validarNumerosLetras(evt);
        if (BotonBuscar.getText().length() > 15) {
            JOptionPane.showMessageDialog(null, "El máximo de caracteres es de 15 para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (BotonBuscar.getText().length() > 0) {
            if (!BotonBuscar.getText().matches("^(?!.*([A-Za-zñÑáéíóúÁÉÍÓÚ\\s])\\1{2})[A-Za-zñÑáéíóúÁÉÍÓÚ\\s0-9]+$")) {
                JOptionPane.showMessageDialog(null, "No repitas caracteres de forma incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                evt.consume();
            }
        }
    }//GEN-LAST:event_BotonBuscarKeyTyped

    private void ComboProveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboProveedorMousePressed
        if (ComboProveedor.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Guardar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_ComboProveedorMousePressed

    private void txtNumeroFacturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroFacturaMousePressed
        if (txtNumeroFactura.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Guardar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtNumeroFacturaMousePressed

    private void txtDescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionMousePressed
        if (txtDescripcion.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Guardar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtDescripcionMousePressed

    private void txtDescuentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescuentoMousePressed
        if (txtDescuento.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Guardar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtDescuentoMousePressed

    private void txtTotalCompraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTotalCompraMousePressed
        if (txtTotalCompra.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Guardar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtTotalCompraMousePressed

    private void txtNumeroFacturaCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroFacturaCMousePressed
        if (txtNumeroFacturaC.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtNumeroFacturaCMousePressed

    private void ComboProductosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ComboProductosKeyPressed

    }//GEN-LAST:event_ComboProductosKeyPressed

    private void ComboProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboProductosMousePressed
        if (ComboProductos.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_ComboProductosMousePressed

    private void txtCostoUnitarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCostoUnitarioMousePressed
        if (txtCostoUnitario.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtCostoUnitarioMousePressed

    private void txtCantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMousePressed
        if (txtCantidad.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtCantidadMousePressed

    private void txtISVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtISVMousePressed
        if (txtISV.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtISVMousePressed

    private void txtDescuentoCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescuentoCMousePressed
        if (txtDescuentoC.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_txtDescuentoCMousePressed

    private void BotonBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMousePressed
        if (BotonBuscar.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_BotonBuscarMousePressed

    private void botonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
        this.dispose();

    }//GEN-LAST:event_botonRegresarMouseClicked

    private void txtDescuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyTyped
        validarNumeros(evt);
        if (txtDescuento.getText().length() > 4) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDescuentoKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        validarNumeros(evt);
        if (txtCantidad.getText().length() > 3) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtISVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtISVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtISVActionPerformed

    private void ComboEstadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboEstadoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboEstadoMousePressed

    private void ComboProveedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboProveedorItemStateChanged
        ObtenerID();
        CargarProductor cp = new PantallaCompras.CargarProductor();
        ComboProductos.setModel(cp.getvalues());
    }//GEN-LAST:event_ComboProveedorItemStateChanged

    private void txtCostoUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoUnitarioActionPerformed

    private void BotonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCancelarMouseClicked
        if (BotonCancelar.isEnabled()) {
            // Limpiar();
            //Inhabillitar();
            BotonCancelar.setEnabled(Boolean.FALSE);
            BotonCancelar.setEnabled(Boolean.FALSE);
        } else {
            JOptionPane.showMessageDialog(null, "Esta acción no se encuentra disponible para tu usuario", "ERROR", JOptionPane.ERROR_MESSAGE);
            lo.LogUsuarios(comprasp, "Boton Cancelar", userName);
        }

    }//GEN-LAST:event_BotonCancelarMouseClicked
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
            java.util.logging.Logger.getLogger(PantallaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonAgregarC;
    private javax.swing.JTextField BotonBuscar;
    private javax.swing.JLabel BotonCancelar;
    private javax.swing.JLabel BotonEditar;
    private javax.swing.JLabel BotonEditarC;
    private javax.swing.JLabel BotonEliminarC;
    private javax.swing.JLabel BotonGuardar;
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.JComboBox<String> ComboProductos;
    public static javax.swing.JComboBox<String> ComboProveedor;
    private com.toedter.calendar.JDateChooser FechaCompra;
    private com.toedter.calendar.JDateChooser FechaEntrega;
    private com.toedter.calendar.JDateChooser FechaVencimiento;
    private javax.swing.JLabel botonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbfechacompra;
    private javax.swing.JLabel lbfechaentrega;
    private javax.swing.JLabel lbfechavencimiento;
    private javax.swing.JTable tablacompra;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCostoUnitario;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtDescuentoC;
    private javax.swing.JTextField txtISV;
    private javax.swing.JLabel txtIdDetalle;
    private javax.swing.JLabel txtIdProducto;
    private javax.swing.JLabel txtIdProv;
    public static javax.swing.JTextField txtNumeroFactura;
    public static javax.swing.JTextField txtNumeroFacturaC;
    private javax.swing.JTextField txtTotalCompra;
    public static javax.swing.JLabel txtidCompra;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

    private void cargartabla() {
        String cargart = "CargarTabla";
        DefaultTableModel modeloTabla = (DefaultTableModel) tablacompra.getModel();
        modeloTabla.setRowCount(0);
        int id = Integer.parseInt(txtidCompra.getText());
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select DC.Id_Detalle_Compra,C.Num_Factura, P.Nombre_Producto, DC.Costo_Unitario, DC.Cantidad, DC.ISV, DC.Descuento\n"
                    + "From Detalle_Compra as DC\n"
                    + "Inner Join Productos as P On DC.Id_Producto = P.Id_Producto\n"
                    + "Inner Join Compras as C ON DC.Id_Compra = C.Id_Compra\n"
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

            // JOptionPane.showMessageDialog(null, "Registro guardado");
        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo cargar la tabla" + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), comprasp, cargart);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    private void buscarData(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public class CargarProveedor {

        public DefaultComboBoxModel getvalues() {
            String cargarp = "CargarProveedor";

            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            try {
                Connection con = Conexion.getConexion();
                String sql = "select Nombre_Empresa from Proveedor";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                modelo.addElement("Seleccione Proveedor");
                while (rs.next()) {
                    modelo.addElement(rs.getString(1));
                }
                con.close();
                rs.close();
            } catch (Exception e) {
                lo.LogBitacora("Error: No se pudo cargar los datos del proveedor" + "Excepción: " + e + ". Origen: " + this.getClass().getSimpleName(), comprasp, cargarp);
                System.out.println(e);
            }
            return modelo;
        }
    }

    public class CargarProductor {

        public DefaultComboBoxModel getvalues() {
            String cargarpro = "CargarProducto";
            int Prove = Integer.parseInt(txtIdProv.getText());
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            try {
                ResultSet rs;
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Select P.Nombre_Producto\n"
                        + "From Producto_Proveedor as PP\n"
                        + "Inner Join Productos as P On PP.Id_Producto=P.Id_Producto\n"
                        + "Where PP.Id_Proveedor=?");
                ps.setInt(1, Prove);
                rs = ps.executeQuery();
                modelo.addElement("Seleccione Productos");
                while (rs.next()) {
                    modelo.addElement(rs.getString(1));
                }
                con.close();
                rs.close();
            } catch (Exception e) {
                lo.LogBitacora("Error: No se pudo cargar los productos" + "Excepción: " + e + ". Origen: " + this.getClass().getSimpleName(), comprasp, cargarpro);
                System.out.println(e);
            }
            return modelo;
        }
    }

    public class CargarEstado {

        public DefaultComboBoxModel getvalues() {
            String cargare = "CargarEstado";
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            try {
                ResultSet rs;
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Select Estado from EstadoC");
                rs = ps.executeQuery();
                modelo.addElement("Seleccione Estado");
                while (rs.next()) {
                    modelo.addElement(rs.getString(1));
                }
                con.close();
                rs.close();
            } catch (Exception e) {
                lo.LogBitacora("Error: No se pudo cargar el estado" + "Excepción: " + e + ". Origen: " + this.getClass().getSimpleName(), comprasp, cargare);
                System.out.println(e);
            }
            return modelo;
        }
    }

    public void ObtenerID() {
        String Nombre = ComboProveedor.getSelectedItem().toString();
        try {
            ResultSet rs;
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Select Id_Proveedor From Proveedor Where Nombre_Empresa=?");
            ps.setString(1, Nombre);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtIdProv.setText(rs.getString("Id_Proveedor"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void ObtenerIdProd() {
        String Nombre = ComboProductos.getSelectedItem().toString();
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

    public void cargarFact() {
        String Factura = txtNumeroFactura.getText();
        String cargarf = "CargarFactura";
        try {
            ResultSet rs;
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("Select Id_Compra From Compras Where Num_Factura=?");
            ps.setString(1, Factura);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtidCompra.setText(rs.getString("Id_Compra"));
                txtNumeroFacturaC.setText(txtNumeroFactura.getText());
            }

        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo cargar factura" + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), comprasp, cargarf);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public int cargarcampose() {
        String cargarcamp = "cargarCampo";
        int id = Integer.parseInt(txtidCompra.getText());
        int resultado = 1;
        try {

            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select C.Id_Compra, c.Num_Factura,P.Nombre_Empresa, C.Fecha_Compra,C.Fecha_Entrega,C.Fecha_Vencimiento,C.Descripcion,C.Descuento,C.Total_Compra, E.Estado\n"
                    + "from Compras as C \n"
                    + "Inner Join Proveedor as P ON C.Id_Proveedor = P.Id_Proveedor\n"
                    + "Inner Join EstadoC as E on C.Id_EstadoC=E.Id_EstadoC\n"
                    + "Where C.Id_Compra=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                FechaCompra.setDate(rs.getDate("Fecha_Compra"));
                FechaEntrega.setDate(rs.getDate("Fecha_Entrega"));
                FechaVencimiento.setDate(rs.getDate("Fecha_Vencimiento"));
                txtDescripcion.setText(rs.getString("Descripcion"));
                ComboProveedor.setSelectedItem(rs.getString("Nombre_Empresa"));
                ComboEstado.setSelectedItem(rs.getString("Estado"));
                txtDescuento.setText(rs.getString("Descuento"));
                txtNumeroFactura.setText(rs.getString("Num_Factura"));
                txtTotalCompra.setText(rs.getString("Total_Compra"));
            }
            cargartabla();

        } catch (SQLException ex) {
            lo.LogBitacora("Error: No se pudo cargar el campo" + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), comprasp, cargarcamp);
            JOptionPane.showMessageDialog(null, ex.getMessage());
            resultado = 0;
        }
        return resultado;
    }

    public void habilitarDetalle() {
        ComboProductos.setEnabled(Boolean.TRUE);
        txtDescuentoC.setEnabled(Boolean.TRUE);
        txtISV.setEnabled(Boolean.TRUE);
        txtNumeroFacturaC.setEnabled(Boolean.FALSE);
        txtCostoUnitario.setEnabled(Boolean.TRUE);
        txtCantidad.setEnabled(Boolean.TRUE);
    }

    public void habilitarroles() {
        try {

            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select PU.Agregar, PU.Guardar, PU.Cancelar, PU.Editar, PU.Activo, PU.Inactivo, PU.Reporte, PU.Anular, PU.CrearCompra, PU.Historicos, PU.Buscar, PU.Eliminar, PU.Aprobar\n"
                    + "From PermisosUsuario AS PU\n"
                    + "Inner Join Usuario as U on PU.IdUsuario=U.Id_Usuario\n"
                    + "where PU.IdPermiso=? and U.Nombre=?");
            ps.setInt(1, 22);
            ps.setString(2, usuario.getText());
            rs = ps.executeQuery();
            //System.out.println(Usuario.getText());

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
                eliminari = rs.getInt("Eliminar");
                aprobari = rs.getInt("Aprobar");
                System.out.print(agregari + " " + guardari + " " + cancelari);

            }
        } catch (SQLException ex) {
            //lo.LogBitacora("Error: No se pudo seleccionar la tabla" + "Excepción: " + ex + ". Origen: " + this.getClass().getSimpleName(), proveedores, tablap);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        if (agregari == 1) {
            BotonAgregarC.setEnabled(Boolean.TRUE);
        } else if (agregari == 0) {
            BotonAgregarC.setEnabled(Boolean.FALSE);
            BotonAgregarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));
        }

        if (guardari == 1) {
            BotonGuardar.setEnabled(Boolean.TRUE);
        } else if (guardari == 0) {
            BotonGuardar.setEnabled(Boolean.FALSE);
            BotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));
        }

            if (eliminari == 1) {
                BotonEliminarC.setEnabled(Boolean.TRUE);
            } else if (eliminari == 0) {
                BotonEliminarC.setEnabled(Boolean.FALSE);
                BotonEliminarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));

            }
            if (editari == 1) {
                BotonEditar.setEnabled(Boolean.TRUE);
            } else {
                BotonEditar.setEnabled(Boolean.FALSE);
                BotonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));
            }

            if (cancelari == 1) {
                BotonCancelar.setEnabled(Boolean.TRUE);

            } else {
                BotonCancelar.setEnabled(Boolean.FALSE);
                BotonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));

            }
            if (buscari == 1) {
                BotonBuscar.setEnabled(Boolean.TRUE);
            } else {
                BotonBuscar.setEnabled(Boolean.FALSE);
                BotonBuscar.setText("NO DISPONIBLE");
            }

            if (eliminari == 1) {
                BotonEliminarC.setEnabled(Boolean.TRUE);
            } else {
                BotonEliminarC.setEnabled(Boolean.FALSE);
                BotonEliminarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));

            }
            if (aprobari == 1) {
                BotonEditarC.setEnabled(Boolean.TRUE);
            } else {
                BotonEditarC.setEnabled(Boolean.FALSE);
                BotonEditarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/obstruido (1).png")));

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
    
}

    
