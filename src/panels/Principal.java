/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author mosor
 */
public class Principal extends javax.swing.JPanel {

    ArrayList<Reproduccions> listaReproduccion = new ArrayList();
    ArrayList<Cancion> listaCanciones = new ArrayList();
    int idSeleccionada;
    int idCancionSel;
    int idSel;

    /**
     * Creates new form Reproduccion
     */
    public Principal() {
        initComponents();
        ConsultaCancion();
        ConsultaReproduccion();
        SeleccionarCancionRandom();
        ObtenerCancion(idSeleccionada);
    }

    public void ConsultaReproduccion() {
        listaReproduccion.clear();
        try {
            // Configuración de la conexión a la base de datos
            String url = "jdbc:mysql://localhost:3306/wurlitzerdb";
            String usuario = "root";
            String contraseña = "";

            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear la sentencia SQL para la consulta
            String sql = "SELECT * FROM reproduccion";

            // Crear el PreparedStatement y ejecutar la consulta
            try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                ResultSet resultSet = preparedStatement.executeQuery();

                // Procesar los resultados
                while (resultSet.next()) {
                    Reproduccions reproduccion = new Reproduccions(
                            resultSet.getInt("id_reproduccion"),
                            resultSet.getInt("id_cancion"),
                            resultSet.getString("nombre"),
                            resultSet.getString("fecha"),
                            resultSet.getString("escuela")
                    );

                    listaReproduccion.add(reproduccion);

                }

            }

            // Cerrar la conexión
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de errores
        }
    }

    public void ConsultaCancion() {
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
            }
            // Cerrar la conexión
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de errores
        }
    }

    public void SeleccionarCancionRandom() {
        // Verifica si la lista de reproducción está vacía
        if (listaReproduccion.isEmpty()) {
            System.out.println("La lista de reproducción está vacía.");
            return;
        }

        // Crea un objeto Random para seleccionar al azar
        Random random = new Random();

        // Obtiene un objeto Reproduccions aleatorio de la lista
        Reproduccions reproduccionAleatoria = listaReproduccion.get(random.nextInt(listaReproduccion.size()));

        // Obtiene el id_cancion seleccionado al azar directamente de reproduccionAleatoria
        idSeleccionada = reproduccionAleatoria.getId_reproduccion();  // Utiliza la variable de instancia

        // Ahora idSeleccionada contiene el id_cancion seleccionado al azar
        System.out.println("id_cancion seleccionado al azar: " + idSeleccionada);

    }


    public void ObtenerCancion(int idCancionSeleccionada) {
        // Variables para almacenar la información
        String nombreSel = null;
        String discoSel = null;
        String autorSel = null;

        // Buscar información en listaCanciones
        for (Cancion cancion : listaCanciones) {
            if (cancion.getId_cancion() == idCancionSeleccionada) {  // Utiliza la variable idCancionSeleccionada
                nombreSel = cancion.getTitulo();
                discoSel = cancion.getDisco();
                autorSel = cancion.getAutor();
                break;
            }
        }

        // Set textos en los labels correspondientes
        lblCancion.setText(nombreSel);
        lblDisco.setText(discoSel);
        lblAutor.setText(autorSel);
        System.out.println("Nombre: " + nombreSel);
        System.out.println("Disco: " + discoSel);
        System.out.println("Autor: " + autorSel);
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
        panelReproductor = new panels.PanelRound();
        lblDisco = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        bgCancion = new panels.PanelRound();
        lblCancion = new javax.swing.JLabel();
        lblDisc = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(234, 246, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelReproductor.setBackground(new java.awt.Color(255, 255, 255));
        panelReproductor.setRoundBottomLeft(50);
        panelReproductor.setRoundBottomRight(50);
        panelReproductor.setRoundTopLeft(50);
        panelReproductor.setRoundTopRight(50);
        panelReproductor.setLayout(null);

        lblDisco.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblDisco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelReproductor.add(lblDisco);
        lblDisco.setBounds(0, 100, 540, 30);

        lblAutor.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblAutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelReproductor.add(lblAutor);
        lblAutor.setBounds(0, 150, 540, 30);

        bgCancion.setBackground(new java.awt.Color(28, 37, 65));
        bgCancion.setRoundBottomLeft(75);
        bgCancion.setRoundBottomRight(75);
        bgCancion.setRoundTopLeft(75);
        bgCancion.setRoundTopRight(75);
        bgCancion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCancion.setBackground(new java.awt.Color(255, 255, 255));
        lblCancion.setFont(new java.awt.Font("Roboto Medium", 1, 30)); // NOI18N
        lblCancion.setForeground(new java.awt.Color(255, 255, 255));
        lblCancion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bgCancion.add(lblCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

        panelReproductor.add(bgCancion);
        bgCancion.setBounds(90, 30, 350, 60);

        lblDisc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disc.gif"))); // NOI18N
        panelReproductor.add(lblDisc);
        lblDisc.setBounds(0, 190, 540, 60);

        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/random.png"))); // NOI18N
        btnPlay.setBorder(null);
        btnPlay.setBorderPainted(false);
        btnPlay.setContentAreaFilled(false);
        btnPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlay.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/random_sel.png"))); // NOI18N
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        panelReproductor.add(btnPlay);
        btnPlay.setBounds(250, 270, 40, 48);

        bg.add(panelReproductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 540, 330));

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        // TODO add your handling code here:
        ConsultaCancion();
        ConsultaReproduccion();
        SeleccionarCancionRandom();
        ObtenerCancion(idSeleccionada);
    }//GEN-LAST:event_btnPlayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private panels.PanelRound bgCancion;
    private javax.swing.JButton btnPlay;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCancion;
    private javax.swing.JLabel lblDisc;
    private javax.swing.JLabel lblDisco;
    private panels.PanelRound panelReproductor;
    // End of variables declaration//GEN-END:variables
}
