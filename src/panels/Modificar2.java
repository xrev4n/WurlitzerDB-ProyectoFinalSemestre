package panels;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public final class Modificar2 extends javax.swing.JPanel {

    ArrayList<Cancion> listaCanciones = new ArrayList();
    private int selectedCancionId;

    /**
     * Creates new form AgregarPanel
     */
    public Modificar2(int selectedCancionId) {
        initComponents();
        this.selectedCancionId = selectedCancionId;
        System.out.println(selectedCancionId);
        lblCancionSel.setText(nombreCancion(selectedCancionId));
    }

    public String nombreCancion(int selectedCancionId) {
        String nombreCompleto = "";

        try {
            String url = "jdbc:mysql://localhost:3306/wurlitzerdb";
            String usuario = "root";
            String contraseña = "";

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            String sql = "SELECT titulo, autor FROM cancion WHERE id_cancion = ?";

            try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                preparedStatement.setInt(1, selectedCancionId);

                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    // Construir el nombre en el formato deseado
                    String titulo = resultSet.getString("titulo");
                    String autor = resultSet.getString("autor");
                    nombreCompleto = titulo + " - " + autor;
                } else {
                    System.out.println("No se encontró ninguna canción con el ID proporcionado: " + selectedCancionId);
                }
            }

            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nombreCompleto;
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
        txtAutor = new javax.swing.JTextField();
        txtDuracionMin = new javax.swing.JTextField();
        lblDuracion = new javax.swing.JLabel();
        txtEstilo = new javax.swing.JTextField();
        lblEstilo = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        lblAño = new javax.swing.JLabel();
        lblDuracionSeg = new javax.swing.JLabel();
        lblDisco = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        lblModificarCanciones = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        lblCancionSel = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        bgEnviar = new panels.PanelRound();
        lblEnviar = new javax.swing.JLabel();
        bgLimpiar = new panels.PanelRound();
        lblLimpiar = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(234, 246, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAutor.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblAutor.setForeground(new java.awt.Color(11, 19, 43));
        lblAutor.setText("Autor");
        bg.add(lblAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 150, 20));

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(11, 19, 43));
        lblTitulo.setText("Titulo");
        bg.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 150, -1));

        txtTitulo.setBackground(new java.awt.Color(234, 246, 255));
        txtTitulo.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtTitulo.setBorder(null);
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });
        bg.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 150, 30));

        txtDisco.setBackground(new java.awt.Color(234, 246, 255));
        txtDisco.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtDisco.setBorder(null);
        bg.add(txtDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 160, 30));

        txtDuracionSeg.setBackground(new java.awt.Color(234, 246, 255));
        txtDuracionSeg.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtDuracionSeg.setBorder(null);
        bg.add(txtDuracionSeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 150, 30));

        txtAutor.setBackground(new java.awt.Color(234, 246, 255));
        txtAutor.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtAutor.setBorder(null);
        bg.add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 150, 30));

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
        bg.add(lblDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 160, 30));

        txtEstilo.setBackground(new java.awt.Color(234, 246, 255));
        txtEstilo.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtEstilo.setBorder(null);
        bg.add(txtEstilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 160, 30));

        lblEstilo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblEstilo.setForeground(new java.awt.Color(11, 19, 43));
        lblEstilo.setText("Estilo");
        bg.add(lblEstilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 160, 30));

        txtAño.setBackground(new java.awt.Color(234, 246, 255));
        txtAño.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtAño.setBorder(null);
        bg.add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 160, 30));

        lblAño.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblAño.setForeground(new java.awt.Color(11, 19, 43));
        lblAño.setText("Año");
        bg.add(lblAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 50, 30));

        lblDuracionSeg.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblDuracionSeg.setForeground(new java.awt.Color(11, 19, 43));
        lblDuracionSeg.setText("Duracion (seg.)");
        bg.add(lblDuracionSeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 250, -1));

        lblDisco.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblDisco.setForeground(new java.awt.Color(11, 19, 43));
        lblDisco.setText("Disco");
        bg.add(lblDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 160, 20));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, 10));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 150, 10));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 150, 10));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 160, 10));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 150, 10));
        bg.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 160, 10));

        lblModificarCanciones.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lblModificarCanciones.setForeground(new java.awt.Color(11, 19, 43));
        lblModificarCanciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModificarCanciones.setText("Modificar Canción");
        bg.add(lblModificarCanciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 580, 30));
        bg.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 160, 10));

        lblCancionSel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblCancionSel.setForeground(new java.awt.Color(11, 19, 43));
        lblCancionSel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg.add(lblCancionSel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 580, 30));

        lblResultado.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(11, 19, 43));
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg.add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 580, 30));

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

        bg.add(bgEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 200, 50));

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

        bg.add(bgLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 200, 50));

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void txtDuracionMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracionMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracionMinActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

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
        // TODO add your handling code here:
        // Valida que se haya seteado correctamente el Id
        if (selectedCancionId == 0) {
            System.out.println("El campo de ID está vacío. Ingresa un ID válido.");
        } else {
            try {
                // Llama al método modificarCancion con el ID obtenido
                modificarCancion(selectedCancionId);
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir el ID a un número entero.");
            }
        }

    }//GEN-LAST:event_lblEnviarMouseReleased

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
        txtTitulo.setText("");
        txtAutor.setText("");
        txtDisco.setText("");
        txtAño.setText("");
        txtDuracionMin.setText("");
        txtDuracionSeg.setText("");
        txtEstilo.setText("");
    }//GEN-LAST:event_lblLimpiarMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private panels.PanelRound bgEnviar;
    private panels.PanelRound bgLimpiar;
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
    private javax.swing.JLabel lblEnviar;
    private javax.swing.JLabel lblEstilo;
    private javax.swing.JLabel lblLimpiar;
    private javax.swing.JLabel lblModificarCanciones;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtDisco;
    private javax.swing.JTextField txtDuracionMin;
    private javax.swing.JTextField txtDuracionSeg;
    private javax.swing.JTextField txtEstilo;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    private void modificarCancion(int idCancion) {
        try {
            String url = "jdbc:mysql://localhost:3306/wurlitzerdb";
            String usuario = "root";
            String contraseña = "";

            try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
                String sql = "UPDATE cancion SET titulo=?, autor=?, disco=?, anio=?, minuto=?, segundo=?, estilo=? WHERE id_cancion=?";

                try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                    // Obtener los valores de los JTextField
                    String nuevoTitulo = txtTitulo.getText();
                    String nuevoAutor = txtAutor.getText();
                    String nuevoDisco = txtDisco.getText();

                    // Validar que el campo de texto no esté vacío antes de intentar convertirlo a un número
                    int nuevoAnio = 0; // Valor por defecto
                    if (!txtAño.getText().isEmpty()) {
                        nuevoAnio = Integer.parseInt(txtAño.getText());
                    }

                    int nuevaDuracionMinuto = 0; // Valor por defecto
                    if (!txtDuracionMin.getText().isEmpty()) {
                        nuevaDuracionMinuto = Integer.parseInt(txtDuracionMin.getText());
                    }

                    int nuevaDuracionSegundo = 0; // Valor por defecto
                    if (!txtDuracionSeg.getText().isEmpty()) {
                        nuevaDuracionSegundo = Integer.parseInt(txtDuracionSeg.getText());
                    }

                    String nuevoEstilo = txtEstilo.getText();

                    // Establecer los valores de los parámetros para la actualización
                    preparedStatement.setString(1, nuevoTitulo);
                    preparedStatement.setString(2, nuevoAutor);
                    preparedStatement.setString(3, nuevoDisco);
                    preparedStatement.setInt(4, nuevoAnio);
                    preparedStatement.setInt(5, nuevaDuracionMinuto);
                    preparedStatement.setInt(6, nuevaDuracionSegundo);
                    preparedStatement.setString(7, nuevoEstilo);
                    preparedStatement.setInt(8, selectedCancionId);

                    // Ejecutar la actualización
                    int filasActualizadas = preparedStatement.executeUpdate();

                    if (filasActualizadas > 0) {
                        System.out.println("Canción actualizada correctamente en la base de datos.");
                        lblResultado.setText("Canción actualizada correctamente en la base de datos.");
                    } else {
                        System.out.println("No se encontró ninguna canción con el ID proporcionado.");
                        lblResultado.setText("No se encontró ninguna canción con el ID proporcionado.");
                    }
                }
            }

        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

}
