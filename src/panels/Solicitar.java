package panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;

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
    private Cancion cancionSeleccionada;

    /**
     * Creates new form AgregarPanel
     */
    public Solicitar() {
        initComponents();
        listModelJList = new DefaultListModel<>();
        JListCanciones1.setModel(listModelJList);
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
        lblAgregarCanciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JListCanciones1 = new javax.swing.JList<>();
        btnRefresh = new javax.swing.JButton();
        btnSolicitudes = new panels.PanelRound();
        lblSolicitudes = new javax.swing.JLabel();
        bgLimpiar = new panels.PanelRound();
        lblLimpiar = new javax.swing.JLabel();
        bgEnviar = new panels.PanelRound();
        lblEnviar = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(234, 246, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setBackground(new java.awt.Color(234, 246, 255));
        txtNombre.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtNombre.setBorder(null);
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 210, 30));

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
        bg.add(txtEscuela, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 160, 30));

        lblEscuela.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblEscuela.setForeground(new java.awt.Color(11, 19, 43));
        lblEscuela.setText("Escuela");
        bg.add(lblEscuela, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 160, 20));

        lblNombre.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(11, 19, 43));
        lblNombre.setText("Nombre Estudiante");
        bg.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 220, 20));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 210, 10));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 210, 10));

        lblAgregarCanciones.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lblAgregarCanciones.setForeground(new java.awt.Color(11, 19, 43));
        lblAgregarCanciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregarCanciones.setText("Solicitar canción");
        bg.add(lblAgregarCanciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 580, 30));

        JListCanciones1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(JListCanciones1);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 540, 230));

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        btnRefresh.setContentAreaFilled(false);
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh _sel.png"))); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        bg.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 30, 30));

        btnSolicitudes.setBackground(new java.awt.Color(28, 37, 65));
        btnSolicitudes.setRoundBottomLeft(50);
        btnSolicitudes.setRoundBottomRight(50);
        btnSolicitudes.setRoundTopLeft(50);
        btnSolicitudes.setRoundTopRight(50);
        btnSolicitudes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSolicitudes.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblSolicitudes.setForeground(new java.awt.Color(255, 255, 255));
        lblSolicitudes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSolicitudes.setText("Solicitudes");
        lblSolicitudes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSolicitudesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSolicitudesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSolicitudesMouseExited(evt);
            }
        });
        btnSolicitudes.add(lblSolicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 140, 40));

        bg.add(btnSolicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 40));

        bgLimpiar.setBackground(new java.awt.Color(28, 37, 65));
        bgLimpiar.setRoundBottomLeft(55);
        bgLimpiar.setRoundBottomRight(55);
        bgLimpiar.setRoundTopLeft(55);
        bgLimpiar.setRoundTopRight(55);
        bgLimpiar.setLayout(null);

        lblLimpiar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lblLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        lblLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLimpiar.setText("Limpiar");
        lblLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLimpiarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblLimpiarMouseReleased(evt);
            }
        });
        bgLimpiar.add(lblLimpiar);
        lblLimpiar.setBounds(0, 0, 200, 50);

        bg.add(bgLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 200, 50));

        bgEnviar.setBackground(new java.awt.Color(28, 37, 65));
        bgEnviar.setRoundBottomLeft(55);
        bgEnviar.setRoundBottomRight(55);
        bgEnviar.setRoundTopLeft(55);
        bgEnviar.setRoundTopRight(55);
        bgEnviar.setLayout(null);

        lblEnviar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lblEnviar.setForeground(new java.awt.Color(255, 255, 255));
        lblEnviar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnviar.setText("Enviar");
        lblEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEnviarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEnviarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblEnviarMouseReleased(evt);
            }
        });
        bgEnviar.add(lblEnviar);
        lblEnviar.setBounds(0, 0, 200, 50);

        bg.add(bgEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 200, 50));

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 570));
    }// </editor-fold>//GEN-END:initComponents

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
                            resultSet.getInt("anio"),
                            resultSet.getInt("minuto"),
                            resultSet.getInt("segundo"),
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

    private void lblSolicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSolicitudesMouseClicked
        // TODO add your handling code here:
        Solicitar2 solPn = new Solicitar2();
        solPn.setSize(580, 570);
        solPn.setLocation(0, 0);

        Container contentPane = getParent();
        contentPane.removeAll();
        contentPane.add(solPn);
        contentPane.revalidate();
        contentPane.repaint();
    }//GEN-LAST:event_lblSolicitudesMouseClicked

    private void lblSolicitudesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSolicitudesMouseEntered
        // TODO add your handling code here:
        btnSolicitudes.setBackground(new Color(0x5BC0BE));
    }//GEN-LAST:event_lblSolicitudesMouseEntered

    private void lblSolicitudesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSolicitudesMouseExited
        // TODO add your handling code here:
        btnSolicitudes.setBackground(new Color(0x1C2541));
    }//GEN-LAST:event_lblSolicitudesMouseExited

    private void lblLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLimpiarMouseClicked

    private void lblLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarMouseEntered
        // TODO add your handling code here:
        bgLimpiar.setBackground(new Color(0x5BC0BE));
    }//GEN-LAST:event_lblLimpiarMouseEntered

    private void lblLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarMouseExited
        // TODO add your handling code here:
        bgLimpiar.setBackground(new Color(0x1C2541));
    }//GEN-LAST:event_lblLimpiarMouseExited

    private void lblLimpiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarMouseReleased
        // TODO add your handling code here:
        txtNombre.setText("");
        txtEscuela.setText("");
    }//GEN-LAST:event_lblLimpiarMouseReleased

    private void lblEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnviarMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_lblEnviarMouseClicked

    private void lblEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnviarMouseEntered
        // TODO add your handling code here:
        bgEnviar.setBackground(new Color(0x5BC0BE));
    }//GEN-LAST:event_lblEnviarMouseEntered

    private void lblEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnviarMouseExited
        // TODO add your handling code here:
        bgEnviar.setBackground(new Color(0x1C2541));
    }//GEN-LAST:event_lblEnviarMouseExited

    private void lblEnviarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnviarMouseReleased
        // Obtener el índice de la canción seleccionada en la JList
        int selectedIndex = JListCanciones1.getSelectedIndex();

        // Verificar si se ha seleccionado una canción
        if (selectedIndex != -1) {
            // Obtener el formato del elemento seleccionado (ID.NOMBRE.AUTOR.DISCO.AÑO)
            String selectedItemFormat = listModelJList.getElementAt(selectedIndex);

            // Obtener el ID del elemento seleccionado
            int selectedId = Integer.parseInt(selectedItemFormat.split("\\.")[0]);

            // Buscar la canción seleccionada en la lista de canciones
            for (Cancion cancion : listaCanciones) {
                if (cancion.getId_cancion() == selectedId) {
                    cancionSeleccionada = cancion; // Asignar la canción seleccionada
                    break;
                }
            }

            //PROGRAMAR AQUI BOTON ENVIAR
            String escuela = txtEscuela.getText();
            String nombre = txtNombre.getText();
            if (cancionSeleccionada != null) {
                try {
                    // Llamar al método para insertar la solicitud en la base de datos
                    insertarSolicitudEnDB(cancionSeleccionada, nombre ,escuela);
                    System.out.println("Solicitud enviada correctamente. ID de la canción: " + selectedId);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    System.err.println("Error al enviar la solicitud a la base de datos.");
                }
            } else {
                System.err.println("No se ha seleccionado ninguna canción.");
            }
        } else {
            System.err.println("No se ha seleccionado ninguna canción.");
        }
    }//GEN-LAST:event_lblEnviarMouseReleased
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

        JListCanciones1.setModel(listModelJList); // Actualizar el JList con el nuevo modelo

        // Seleccionar el primer elemento de la lista (si existe)
        if (listModelJList.getSize() > 0) {
            JListCanciones1.setSelectedIndex(0);
            // También puedes agregar la lógica para asignar la canción seleccionada aquí si es necesario
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JListCanciones1;
    private javax.swing.JPanel bg;
    private panels.PanelRound bgEnviar;
    private panels.PanelRound bgLimpiar;
    private javax.swing.JButton btnRefresh;
    private panels.PanelRound btnSolicitudes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblAgregarCanciones;
    private javax.swing.JLabel lblEnviar;
    private javax.swing.JLabel lblEscuela;
    private javax.swing.JLabel lblLimpiar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSolicitudes;
    private javax.swing.JTextField txtEscuela;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    public static void insertarSolicitudEnDB(Cancion cancionSeleccionada, String nombre , String escuela) throws SQLException {
        // Configuración de la conexión a la base de datos
        java.sql.Timestamp fechaActualSQL = java.sql.Timestamp.valueOf(LocalDateTime.now());

        // Configuración de la conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/wurlitzerdb";
        String usuario = "root";
        String contraseña = "";

        try {
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            // Crear la sentencia SQL para la inserción
            String sql = "INSERT INTO reproduccion (id_cancion, nombre , fecha, escuela) VALUES (?, ?, ? , ?)";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                // Establecer los valores de los parámetros
                preparedStatement.setInt(1, cancionSeleccionada.getId_cancion());
                preparedStatement.setString(2, nombre);
                preparedStatement.setTimestamp(3, fechaActualSQL);
                preparedStatement.setString(4, escuela);

                // Ejecutar la inserción
                preparedStatement.executeUpdate();

                System.out.println("Canción insertada correctamente en la base de datos.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Error al enviar la solicitud a la base de datos.");
        }
    }

}
