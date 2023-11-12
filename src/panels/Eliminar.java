package panels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class Eliminar extends javax.swing.JPanel {
    ArrayList<Cancion> listaCanciones = new ArrayList<>();
    private DefaultListModel<String> listModelJList;
    /**
     * Creates new form ModificarPanel
     */
    public Eliminar() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        JListCanciones = new javax.swing.JList<>();
        btnEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        lblEliminar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(234, 246, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JListCanciones.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        JListCanciones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        JListCanciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JListCanciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(JListCanciones);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 480, 360));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_eliminar.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_eliminar_sel.png"))); // NOI18N
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh _sel.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        lblResultado.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 431, 65, 25));

        lblEliminar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lblEliminar.setForeground(new java.awt.Color(11, 19, 43));
        lblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminar.setText("Selecciona una canción");
        add(lblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 574, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
    }//GEN-LAST:event_jButton1ActionPerformed
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
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblResultado;
    // End of variables declaration//GEN-END:variables
}
