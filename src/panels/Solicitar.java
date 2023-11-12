package panels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author felip
 */
public class Solicitar extends javax.swing.JPanel {

    ArrayList<Cancion> listaCanciones = new ArrayList();
    private DefaultListModel<String> listModelJList;

    /**
     * Creates new form AgregarPanel
     */
    public Solicitar() {
        initComponents();
        listModelJList = new DefaultListModel<>();
        JListCanciones.setModel(listModelJList);
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
        txtNombre = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        txtEscuela = new javax.swing.JTextField();
        lblEscuela = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnEnviar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblAgregarCanciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JListCanciones = new javax.swing.JList<>();
        btnRefresh = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(234, 246, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setBackground(new java.awt.Color(234, 246, 255));
        txtNombre.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtNombre.setBorder(null);
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 210, 30));

        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg.add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 580, 20));

        txtEscuela.setBackground(new java.awt.Color(234, 246, 255));
        txtEscuela.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtEscuela.setBorder(null);
        txtEscuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEscuelaActionPerformed(evt);
            }
        });
        bg.add(txtEscuela, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 160, 30));

        lblEscuela.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblEscuela.setForeground(new java.awt.Color(11, 19, 43));
        lblEscuela.setText("Escuela");
        bg.add(lblEscuela, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 160, 20));

        lblNombre.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(11, 19, 43));
        lblNombre.setText("Nombre Estudiante");
        bg.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 220, 20));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 160, 10));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 210, 10));

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
        bg.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 200, 50));

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
        bg.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 200, 50));

        lblAgregarCanciones.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lblAgregarCanciones.setForeground(new java.awt.Color(11, 19, 43));
        lblAgregarCanciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregarCanciones.setText("Solicitar canción");
        bg.add(lblAgregarCanciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 580, 20));

        JListCanciones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(JListCanciones);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 540, 260));

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        btnRefresh.setContentAreaFilled(false);
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh _sel.png"))); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        bg.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 30, 30));

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtNombre.setText("");
        txtEscuela.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtEscuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEscuelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEscuelaActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        listaCanciones.clear();
        try {
            String url = "jdbc:mysql://localhost:3306/wurlitzerdb";
            String usuario = "root";
            String contraseña = "";

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            String sql = "SELECT * FROM cancion";

            try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    Cancion cancion = new Cancion(
                            resultSet.getInt("id_cancion"),
                            resultSet.getString("titulo"),
                            resultSet.getString("autor"),
                            resultSet.getString("disco"),
                            resultSet.getInt("año"),
                            resultSet.getInt("duracion_minuto"),
                            resultSet.getInt("duracion_segundo"),
                            resultSet.getString("estilo")
                    );

                    listaCanciones.add(cancion);
                }

                // Llenar tanto la JList como la JTable
                LlenarJList();

            }

            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRefreshActionPerformed
    private void LlenarJList() {
        listModelJList.clear(); // Limpiar el modelo del JList

        for (Cancion cancion : listaCanciones) {
            String formato = String.format("%d.%s.%s.%s.%d",
                    cancion.getId_cancion(),
                    cancion.getTitulo(),
                    cancion.getAutor(),
                    cancion.getDisco(),
                    cancion.getAnio());

            listModelJList.addElement(formato);
        }

        JListCanciones.setModel(listModelJList); // Actualizar el JList con el nuevo modelo
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JListCanciones;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblAgregarCanciones;
    private javax.swing.JLabel lblEscuela;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtEscuela;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    public static void insertarSolicitudEnDB(Cancion cancion) throws SQLException {
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
