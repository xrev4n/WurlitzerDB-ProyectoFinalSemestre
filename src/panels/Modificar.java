package panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author felip
 */
public class Modificar extends javax.swing.JPanel {
    ArrayList<Cancion> listaCanciones = new ArrayList<>();
    private DefaultListModel<String> listModelJList;
    /**
     * Creates new form ModificarPanel
     */
    public Modificar() {
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

        Agregar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JListCanciones = new javax.swing.JList<>();
        btnModificar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        lblModificar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(225, 245, 254));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Agregar.setBackground(new java.awt.Color(234, 246, 255));
        Agregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JListCanciones.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        JListCanciones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        JListCanciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JListCanciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(JListCanciones);

        Agregar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 480, 360));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_modificar.png"))); // NOI18N
        btnModificar.setBorder(null);
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_modificar_sel.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        Agregar.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, -1, -1));

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        btnMostrar.setBorder(null);
        btnMostrar.setBorderPainted(false);
        btnMostrar.setContentAreaFilled(false);
        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh _sel.png"))); // NOI18N
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        Agregar.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        lblModificar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lblModificar.setForeground(new java.awt.Color(11, 19, 43));
        lblModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModificar.setText("Selecciona una canción");
        Agregar.add(lblModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 574, 20));

        add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
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
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        //Cambia a panel Modificar2
        Modificar2 agPn = new Modificar2();
        agPn.setSize(580, 570);
        agPn.setLocation(0, 0);

        Agregar.removeAll();
        Agregar.add(agPn, BorderLayout.CENTER);
        Agregar.revalidate();
        Agregar.repaint();

    }//GEN-LAST:event_btnModificarActionPerformed
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
    private javax.swing.JPanel Agregar;
    private javax.swing.JList<String> JListCanciones;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblModificar;
    // End of variables declaration//GEN-END:variables
}
