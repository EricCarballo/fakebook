package vista;

import com.google.gson.Gson;
import control.publicacionesController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import modelo.publicacionesModel;
import org.bson.Document;

public class frmPerfil extends javax.swing.JPanel {

    public frmPerfil() {
        initComponents();
        setSize(1000, 1000);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombreUsuario = new javax.swing.JLabel();
        txtEdad = new javax.swing.JLabel();
        pnlAñadir = new javax.swing.JPanel();
        lblAñadir = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlPublicacion = new javax.swing.JPanel();
        txtFecha = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPublicaciones = new javax.swing.JTextArea();
        txtSeguidores = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JLabel();
        lblFotoPerfil = new javax.swing.JLabel();
        pnlPortada = new javax.swing.JPanel();
        portada = new javax.swing.JLabel();
        lblInfo1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1000, 1000));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreUsuario.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombreUsuario.setText("*Nombre de la persona*");
        add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        txtEdad.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtEdad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEdad.setText("*Edad*");
        add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 200, 30));

        pnlAñadir.setBackground(new java.awt.Color(82, 120, 206));
        pnlAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAñadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAñadirMouseExited(evt);
            }
        });

        lblAñadir.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblAñadir.setForeground(new java.awt.Color(255, 255, 255));
        lblAñadir.setText("Añadir amigo");

        javax.swing.GroupLayout pnlAñadirLayout = new javax.swing.GroupLayout(pnlAñadir);
        pnlAñadir.setLayout(pnlAñadirLayout);
        pnlAñadirLayout.setHorizontalGroup(
            pnlAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAñadirLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnlAñadirLayout.setVerticalGroup(
            pnlAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAñadirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAñadir)
                .addContainerGap())
        );

        add(pnlAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 150, 40));

        txtCorreo.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        txtCorreo.setText("*correo");
        add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 220, -1));

        pnlPublicacion.setBackground(new java.awt.Color(224, 224, 224));

        txtFecha.setFont(new java.awt.Font("Sans Serif Collection", 2, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(102, 102, 102));
        txtFecha.setText("fecha");

        txtPublicaciones.setEditable(false);
        txtPublicaciones.setColumns(20);
        txtPublicaciones.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtPublicaciones.setRows(5);
        jScrollPane2.setViewportView(txtPublicaciones);

        javax.swing.GroupLayout pnlPublicacionLayout = new javax.swing.GroupLayout(pnlPublicacion);
        pnlPublicacion.setLayout(pnlPublicacionLayout);
        pnlPublicacionLayout.setHorizontalGroup(
            pnlPublicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPublicacionLayout.createSequentialGroup()
                .addGroup(pnlPublicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPublicacionLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPublicacionLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        pnlPublicacionLayout.setVerticalGroup(
            pnlPublicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPublicacionLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(pnlPublicacion);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 840, 510));

        txtSeguidores.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtSeguidores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSeguidores.setText("*Cantidad de amigos*");
        add(txtSeguidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 200, 30));

        txtCiudad.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtCiudad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCiudad.setText("*Ciudad*");
        add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 200, 30));

        lblFotoPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        add(lblFotoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 120, 120));

        pnlPortada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        javax.swing.GroupLayout pnlPortadaLayout = new javax.swing.GroupLayout(pnlPortada);
        pnlPortada.setLayout(pnlPortadaLayout);
        pnlPortadaLayout.setHorizontalGroup(
            pnlPortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(portada, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );
        pnlPortadaLayout.setVerticalGroup(
            pnlPortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(portada, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );

        add(pnlPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 560, 250));

        lblInfo1.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        lblInfo1.setText("Publicaciones");
        add(lblInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 140, -1));
    }// </editor-fold>//GEN-END:initComponents
   
    private void pnlAñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAñadirMouseEntered
        pnlAñadir.setBackground(new Color(62,143,80));
    }//GEN-LAST:event_pnlAñadirMouseEntered

    private void pnlAñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAñadirMouseExited
        pnlAñadir.setBackground(new Color(82,120,206));
    }//GEN-LAST:event_pnlAñadirMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAñadir;
    public static javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JLabel lblInfo1;
    private javax.swing.JPanel pnlAñadir;
    public static javax.swing.JPanel pnlPortada;
    private javax.swing.JPanel pnlPublicacion;
    public static javax.swing.JLabel portada;
    public static javax.swing.JLabel txtCiudad;
    public static javax.swing.JLabel txtCorreo;
    public static javax.swing.JLabel txtEdad;
    public static javax.swing.JLabel txtFecha;
    public static javax.swing.JLabel txtNombreUsuario;
    public static javax.swing.JTextArea txtPublicaciones;
    public static javax.swing.JLabel txtSeguidores;
    // End of variables declaration//GEN-END:variables
}
