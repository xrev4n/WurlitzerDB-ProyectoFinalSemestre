package panels;


import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Cetecom
 */
public class Conectar extends javax.swing.JFrame {
    //Instanciar un objeto de clase Connection
    private static Connection con;
    //Declarar variables para realizar conexion
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    //Variables Barra Ventana
    int xMouse,yMouse;
    //Url de la base de datos (Revisar si el puerto corresponde)
    private static final String url="jdbc:mysql://localhost:3306/wurlitzerdb";
    //Funcion conectar
    public void Conectar(){
        //Se vacia el objeto Connection
        con = null;
        //Try catch para capturar los errores
        try{
            Class.forName(driver);
            // Nos conectamos a la bd (Volver a escribir los atributos en caso de que arroje error)
            //Se importa DriverManager
            con= (Connection) DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con!=null){
                lblResultado.setText("Conexion establecida");
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        //Se importa SQLException
        catch (ClassNotFoundException | SQLException e){
            lblResultado.setText("Error de conexion" + e);
        }
    }

    /**
     * Creates new form Conectar
     */
    public Conectar() {
        initComponents();
        
        AgregarPanel agPn = new AgregarPanel();
        agPn.setSize(800, 600);
        agPn.setLocation(0,0);
        this.setResizable(false);
        
       Agregar.removeAll();
       Agregar.add(agPn, BorderLayout.CENTER);
       Agregar.revalidate();
       Agregar.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConectar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        Agregar = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        bgTitle = new javax.swing.JPanel();
        lblWulritzer = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnSolicitar = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        panelVentana = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConectar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnConectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_conectar.png"))); // NOI18N
        btnConectar.setBorder(null);
        btnConectar.setBorderPainted(false);
        btnConectar.setContentAreaFilled(false);
        btnConectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConectar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_conectar_sel.png"))); // NOI18N
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 220, 40));

        lblResultado.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(11, 19, 43));
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("Estado");
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 505, 220, 30));

        Agregar.setBackground(new java.awt.Color(255, 255, 255));
        Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.setMaximumSize(new java.awt.Dimension(400, 600));
        Agregar.setMinimumSize(new java.awt.Dimension(400, 600));
        Agregar.setPreferredSize(new java.awt.Dimension(400, 600));

        javax.swing.GroupLayout AgregarLayout = new javax.swing.GroupLayout(Agregar);
        Agregar.setLayout(AgregarLayout);
        AgregarLayout.setHorizontalGroup(
            AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        AgregarLayout.setVerticalGroup(
            AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 580, 570));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_agregar.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_agregar_sel.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, 50));

        bgTitle.setBackground(new java.awt.Color(28, 37, 65));

        lblWulritzer.setBackground(new java.awt.Color(0, 0, 102));
        lblWulritzer.setFont(new java.awt.Font("Strasua", 0, 30)); // NOI18N
        lblWulritzer.setForeground(new java.awt.Color(255, 255, 255));
        lblWulritzer.setText("WULRITZER DB");

        javax.swing.GroupLayout bgTitleLayout = new javax.swing.GroupLayout(bgTitle);
        bgTitle.setLayout(bgTitleLayout);
        bgTitleLayout.setHorizontalGroup(
            bgTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblWulritzer)
                .addContainerGap())
        );
        bgTitleLayout.setVerticalGroup(
            bgTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgTitleLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lblWulritzer)
                .addContainerGap())
        );

        getContentPane().add(bgTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 60));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_eliminar.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_eliminar_sel.png"))); // NOI18N
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 220, -1));

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_modificar.png"))); // NOI18N
        btnModificar.setBorder(null);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_modificar_sel.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 220, 50));

        btnMostrar.setBackground(new java.awt.Color(60, 63, 65));
        btnMostrar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(0, 0, 0));
        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_mostrar.png"))); // NOI18N
        btnMostrar.setBorder(null);
        btnMostrar.setContentAreaFilled(false);
        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_mostrar_sel.png"))); // NOI18N
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 220, 50));

        btnSolicitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_solicitar.png"))); // NOI18N
        btnSolicitar.setContentAreaFilled(false);
        btnSolicitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSolicitar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_solicitar_sel.png"))); // NOI18N
        getContentPane().add(btnSolicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 220, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 600));

        panelVentana.setBackground(new java.awt.Color(255, 255, 255));
        panelVentana.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelVentanaMouseDragged(evt);
            }
        });
        panelVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelVentanaMousePressed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_salir.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_salir_sel.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVentanaLayout = new javax.swing.GroupLayout(panelVentana);
        panelVentana.setLayout(panelVentanaLayout);
        panelVentanaLayout.setHorizontalGroup(
            panelVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentanaLayout.createSequentialGroup()
                .addContainerGap(770, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        panelVentanaLayout.setVerticalGroup(
            panelVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentanaLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(btnSalir))
        );

        getContentPane().add(panelVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        // TODO add your handling code here:
        Conectar();
    }//GEN-LAST:event_btnConectarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        
        AgregarPanel agPn = new AgregarPanel();
        agPn.setSize(580, 570);
        agPn.setLocation(0,0);
        
       Agregar.removeAll();
       Agregar.add(agPn, BorderLayout.CENTER);
       Agregar.revalidate();
       Agregar.repaint();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        
        ModificarPanel moPn = new ModificarPanel();
        moPn.setSize(580, 570);
        moPn.setLocation(0,0);
        
       Agregar.removeAll();
       Agregar.add(moPn, BorderLayout.CENTER);
       Agregar.revalidate();
       Agregar.repaint();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        MostrarPanel mosPn = new MostrarPanel();
        mosPn.setSize(580, 570);
        mosPn.setLocation(0,0);
        
       Agregar.removeAll();
       Agregar.add(mosPn, BorderLayout.CENTER);
       Agregar.revalidate();
       Agregar.repaint();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void panelVentanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVentanaMousePressed
        // TODO add your handling code here:
        //Asigna valores actuales a variables de posicion del mouse
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelVentanaMousePressed

    private void panelVentanaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVentanaMouseDragged
        // TODO add your handling code here:
        //Asigna posicion del mouse en la pantalla
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        //Mueve ventana a la posicion del mouse
        this.setLocation(x-xMouse , y-yMouse);
    }//GEN-LAST:event_panelVentanaMouseDragged

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
            java.util.logging.Logger.getLogger(Conectar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conectar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conectar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conectar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conectar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agregar;
    private javax.swing.JLabel background;
    private javax.swing.JPanel bgTitle;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblWulritzer;
    private javax.swing.JPanel panelVentana;
    // End of variables declaration//GEN-END:variables
}
