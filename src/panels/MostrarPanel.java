package panels;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author felip
 */
public class MostrarPanel extends javax.swing.JPanel {

    ArrayList<Cancion> listaCanciones = new ArrayList();

    /**
     * Creates new form MostrarPanel
     */
    public MostrarPanel() {
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

        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblMostrar = new javax.swing.JLabel();
        bgAño = new panels.PanelRound();
        lblAño = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        spAño = new javax.swing.JSeparator();
        lblResultado = new javax.swing.JLabel();
        bgEstilo = new panels.PanelRound();
        lblEstilo = new javax.swing.JLabel();
        spEstilo = new javax.swing.JSeparator();
        txtEstilo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(234, 246, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(600, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        btnMostrar.setBorderPainted(false);
        btnMostrar.setContentAreaFilled(false);
        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh _sel.png"))); // NOI18N
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 30, 30));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Titulo", "Autor", "Disco", "Año", "Minuto", "Segundo", "Estilo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
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
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 560, 270));

        lblMostrar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lblMostrar.setForeground(new java.awt.Color(11, 19, 43));
        lblMostrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMostrar.setText("Lista de Canciones");
        add(lblMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 580, 20));

        bgAño.setBackground(new java.awt.Color(28, 37, 65));
        bgAño.setRoundBottomLeft(50);
        bgAño.setRoundBottomRight(50);
        bgAño.setRoundTopLeft(50);
        bgAño.setRoundTopRight(50);
        bgAño.setLayout(null);

        lblAño.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblAño.setForeground(new java.awt.Color(255, 255, 255));
        lblAño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño.setText("Filtrar por Año");
        lblAño.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAñoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAñoMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAñoMouseReleased(evt);
            }
        });
        bgAño.add(lblAño);
        lblAño.setBounds(0, 0, 160, 50);

        add(bgAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 160, 50));

        txtAño.setBackground(new java.awt.Color(234, 246, 255));
        txtAño.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtAño.setToolTipText("");
        txtAño.setBorder(null);
        add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 140, 30));
        add(spAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 140, 10));

        lblResultado.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 550, 30));

        bgEstilo.setBackground(new java.awt.Color(28, 37, 65));
        bgEstilo.setRoundBottomLeft(50);
        bgEstilo.setRoundBottomRight(50);
        bgEstilo.setRoundTopLeft(50);
        bgEstilo.setRoundTopRight(50);
        bgEstilo.setLayout(null);

        lblEstilo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblEstilo.setForeground(new java.awt.Color(255, 255, 255));
        lblEstilo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstilo.setText("Filtrar por Estilo");
        lblEstilo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEstilo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEstiloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEstiloMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblEstiloMouseReleased(evt);
            }
        });
        bgEstilo.add(lblEstilo);
        lblEstilo.setBounds(0, 0, 160, 50);

        add(bgEstilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 160, 50));
        add(spEstilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 140, 10));

        txtEstilo.setBackground(new java.awt.Color(234, 246, 255));
        txtEstilo.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txtEstilo.setToolTipText("");
        txtEstilo.setBorder(null);
        add(txtEstilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        listaCanciones.clear();
        try {
            // Configuración de la conexión a la base de datos
            String url = "jdbc:mysql://localhost:3306/wurlitzerdb";
            String usuario = "root";
            String contraseña = "";

            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear la sentencia SQL para la consulta
            String sql = "SELECT * FROM cancion";

            // Crear el PreparedStatement y ejecutar la consulta
            try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                ResultSet resultSet = preparedStatement.executeQuery();

                // Procesar los resultados
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
                LlenarTabla();
                
            }

            // Cerrar la conexión
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de errores
        }

    }//GEN-LAST:event_btnMostrarActionPerformed

    private void lblAñoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAñoMouseEntered
        // TODO add your handling code here:
        bgAño.setBackground(new Color(0x5BC0BE));
    }//GEN-LAST:event_lblAñoMouseEntered

    private void lblAñoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAñoMouseExited
        // TODO add your handling code here:
        bgAño.setBackground(new Color(0x1C2541));
    }//GEN-LAST:event_lblAñoMouseExited

    private void lblAñoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAñoMouseReleased
        // TODO add your handling code here:
        listaCanciones.clear();
        try {
            // Configuración de la conexión a la base de datos
            String url = "jdbc:mysql://localhost:3306/wurlitzerdb";
            String usuario = "root";
            String contraseña = "";

            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Comprueba si es un número
            if (esNumero(txtAño.getText())) {
                // Pasa el año a int
                int año = Integer.parseInt(txtAño.getText());

                // Crear la sentencia SQL para la consulta
                String sql = "SELECT * FROM cancion WHERE anio = ?";

                // Crear el PreparedStatement y ejecutar la consulta
                try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                    preparedStatement.setInt(1, año);

                    ResultSet resultSet = preparedStatement.executeQuery();

                    // Procesar los resultados
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

                    LlenarTabla();
                }
            } else {
                // Manejar el caso en que el texto no es un número
                lblResultado.setText("El valor ingresado no es un numero");
            }

            // Cerrar la conexión
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de errores
        }
    }//GEN-LAST:event_lblAñoMouseReleased

    private void lblEstiloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEstiloMouseEntered
        // TODO add your handling code here:
        bgEstilo.setBackground(new Color(0x5BC0BE));
    }//GEN-LAST:event_lblEstiloMouseEntered

    private void lblEstiloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEstiloMouseExited
        // TODO add your handling code here:
        bgEstilo.setBackground(new Color(0x1C2541));
    }//GEN-LAST:event_lblEstiloMouseExited

    private void lblEstiloMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEstiloMouseReleased
        // TODO add your handling code here:
        listaCanciones.clear();
        try {
            // Configuración de la conexión a la base de datos
            String url = "jdbc:mysql://localhost:3306/wurlitzerdb";
            String usuario = "root";
            String contraseña = "";

            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear la sentencia SQL para la consulta
            String sql = "SELECT * FROM cancion WHERE estilo = ?";

            // Crear el PreparedStatement y ejecutar la consulta
            try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                preparedStatement.setString(1, txtEstilo.getText());
                ResultSet resultSet = preparedStatement.executeQuery();

                // Procesar los resultados
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
                LlenarTabla();
                
            }

            // Cerrar la conexión
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de errores
        }

    }//GEN-LAST:event_lblEstiloMouseReleased

    private void LlenarTabla() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear the existing table data

        for (Cancion cancion : listaCanciones) {
            Object[] rowData = {
                cancion.getId_cancion(),
                cancion.getTitulo(),
                cancion.getAutor(),
                cancion.getDisco(),
                cancion.getAnio(),
                cancion.getDuracion_minuto(),
                cancion.getDuracion_segundo(),
                cancion.getEstilo()
            };
            model.addRow(rowData);
        }
    }
    // Método auxiliar para verificar si una cadena es un número
    private boolean esNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private panels.PanelRound bgAño;
    private panels.PanelRound bgEstilo;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblEstilo;
    private javax.swing.JLabel lblMostrar;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JSeparator spAño;
    private javax.swing.JSeparator spEstilo;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtEstilo;
    // End of variables declaration//GEN-END:variables
}
