package panels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author felip
 */
public class Modificar2 extends javax.swing.JPanel {

    ArrayList<Cancion> listaCanciones = new ArrayList();

    /**
     * Creates new form AgregarPanel
     */
    public Modificar2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblAutor = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtDisco = new javax.swing.JTextField();
        txtDuracionSeg = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtDuracionMin = new javax.swing.JTextField();
        lblDuracion = new javax.swing.JLabel();
        txtEstilo = new javax.swing.JTextField();
        lblEstilo = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        lblAño = new javax.swing.JLabel();
        lblDuracionSeg = new javax.swing.JLabel();
        lblDisco = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        btnEnviar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblModificarCanciones = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        lblCancionSel = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(234, 246, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAutor.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblAutor.setForeground(new java.awt.Color(11, 19, 43));
        lblAutor.setText("Autor");
        bg.add(lblAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 150, 20));

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(11, 19, 43));
        lblTitulo.setText("Titulo");
        bg.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, 20));

        txtTitulo.setBackground(new java.awt.Color(234, 246, 255));
        txtTitulo.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtTitulo.setBorder(null);
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });
        bg.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, 30));

        txtDisco.setBackground(new java.awt.Color(234, 246, 255));
        txtDisco.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtDisco.setBorder(null);
        bg.add(txtDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 160, 30));

        txtDuracionSeg.setBackground(new java.awt.Color(234, 246, 255));
        txtDuracionSeg.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtDuracionSeg.setBorder(null);
        bg.add(txtDuracionSeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 150, 30));

        lblID.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblID.setForeground(new java.awt.Color(11, 19, 43));
        lblID.setText("ID");
        bg.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 160, 20));

        txtID.setBackground(new java.awt.Color(234, 246, 255));
        txtID.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtID.setBorder(null);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        bg.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 160, 30));

        txtAutor.setBackground(new java.awt.Color(234, 246, 255));
        txtAutor.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtAutor.setBorder(null);
        bg.add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 150, 30));

        txtDuracionMin.setBackground(new java.awt.Color(234, 246, 255));
        txtDuracionMin.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtDuracionMin.setBorder(null);
        txtDuracionMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracionMinActionPerformed(evt);
            }
        });
        bg.add(txtDuracionMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 150, 30));

        lblDuracion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblDuracion.setForeground(new java.awt.Color(11, 19, 43));
        lblDuracion.setText("Duración(min.)");
        bg.add(lblDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 160, 20));

        txtEstilo.setBackground(new java.awt.Color(234, 246, 255));
        txtEstilo.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtEstilo.setBorder(null);
        bg.add(txtEstilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 160, 30));

        lblEstilo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblEstilo.setForeground(new java.awt.Color(11, 19, 43));
        lblEstilo.setText("Estilo");
        bg.add(lblEstilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 160, 20));

        txtAño.setBackground(new java.awt.Color(234, 246, 255));
        txtAño.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtAño.setBorder(null);
        bg.add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 160, 30));

        lblAño.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblAño.setForeground(new java.awt.Color(11, 19, 43));
        lblAño.setText("Año");
        bg.add(lblAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 50, 20));

        lblDuracionSeg.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblDuracionSeg.setForeground(new java.awt.Color(11, 19, 43));
        lblDuracionSeg.setText("Duracion (seg.)");
        bg.add(lblDuracionSeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 250, 20));

        lblDisco.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblDisco.setForeground(new java.awt.Color(11, 19, 43));
        lblDisco.setText("Disco");
        bg.add(lblDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 160, 20));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 160, 10));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, 10));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 150, 10));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 150, 10));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 160, 10));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 150, 10));
        bg.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 160, 10));

        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_enviar.png"))); // NOI18N
        btnEnviar.setBorderPainted(false);
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_enviar_sel.png"))); // NOI18N
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        bg.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 200, 50));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_limpiar.png"))); // NOI18N
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_limpiar_sel.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        bg.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 200, 50));

        lblModificarCanciones.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lblModificarCanciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModificarCanciones.setText("Modificar Canción");
        bg.add(lblModificarCanciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 580, 40));
        bg.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 160, 10));

        lblCancionSel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblCancionSel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCancionSel.setText("Cancion Seleccionada");
        bg.add(lblCancionSel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 580, 40));

        lblResultado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("RESULTADO");
        bg.add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 580, -1));

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void txtDuracionMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracionMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracionMinActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtID.setText("");
        txtTitulo.setText("");
        txtAutor.setText("");
        txtDisco.setText("");
        txtAño.setText("");
        txtDuracionMin.setText("");
        txtDuracionSeg.setText("");
        txtEstilo.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblCancionSel;
    private javax.swing.JLabel lblDisco;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblDuracionSeg;
    private javax.swing.JLabel lblEstilo;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblModificarCanciones;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtDisco;
    private javax.swing.JTextField txtDuracionMin;
    private javax.swing.JTextField txtDuracionSeg;
    private javax.swing.JTextField txtEstilo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    public static void insertarCancionEnDB(Cancion cancion) throws SQLException {
        // Configuración de la conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/wurlitzerdb";
        String usuario = "root";
        String contraseña = "";

        // Establecer la conexión
        Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
        // Crear la sentencia SQL para la inserción
        String sql = "INSERT INTO cancion (id_cancion, titulo, autor, disco, año, duracion_minuto, duracion_segundo, estilo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            // Establecer los valores de los parámetros
            preparedStatement.setInt(1, cancion.getId_cancion());
            preparedStatement.setString(2, cancion.getTitulo());
            preparedStatement.setString(3, cancion.getAutor());
            preparedStatement.setString(4, cancion.getDisco());
            preparedStatement.setInt(5, cancion.getAnio());
            preparedStatement.setInt(6, cancion.getDuracion_minuto());
            preparedStatement.setInt(7, cancion.getDuracion_segundo());
            preparedStatement.setString(8, cancion.getEstilo());

            // Ejecutar la inserción
            preparedStatement.executeUpdate();

            System.out.println("Canción insertada correctamente en la base de datos.");
        }
    }
}
