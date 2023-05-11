package vista;

public class frmMural extends javax.swing.JPanel {


    public frmMural() {
        initComponents();
        setSize(1000, 3300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Muro = new javax.swing.JPanel();
        txtCorreo = new javax.swing.JLabel();
        lblUltimasPublicaciones1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPublicaciones = new javax.swing.JTextArea();
        txtDate = new javax.swing.JLabel();
        lblUltimasPublicaciones2 = new javax.swing.JLabel();
        scp = new javax.swing.JScrollPane();
        bg = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Muro.setBackground(new java.awt.Color(224, 224, 224));

        txtCorreo.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txtCorreo.setText("*correo*");

        lblUltimasPublicaciones1.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        lblUltimasPublicaciones1.setText("Hecho por:");

        txtPublicaciones.setEditable(false);
        txtPublicaciones.setColumns(20);
        txtPublicaciones.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtPublicaciones.setRows(5);
        txtPublicaciones.setText("sadsdsa\n");
        jScrollPane1.setViewportView(txtPublicaciones);

        txtDate.setFont(new java.awt.Font("SansSerif", 2, 16)); // NOI18N
        txtDate.setForeground(new java.awt.Color(153, 153, 153));
        txtDate.setText("*hora*");

        javax.swing.GroupLayout MuroLayout = new javax.swing.GroupLayout(Muro);
        Muro.setLayout(MuroLayout);
        MuroLayout.setHorizontalGroup(
            MuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MuroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(MuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MuroLayout.createSequentialGroup()
                        .addComponent(txtCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(MuroLayout.createSequentialGroup()
                        .addGroup(MuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUltimasPublicaciones1))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );
        MuroLayout.setVerticalGroup(
            MuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MuroLayout.createSequentialGroup()
                .addComponent(lblUltimasPublicaciones1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo)
                    .addComponent(txtDate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        add(Muro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        lblUltimasPublicaciones2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblUltimasPublicaciones2.setText("Ultimas publicaciones:");
        add(lblUltimasPublicaciones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 898, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );

        scp.setViewportView(bg);

        add(scp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 910));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Muro;
    public static javax.swing.JPanel bg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUltimasPublicaciones1;
    private javax.swing.JLabel lblUltimasPublicaciones2;
    public static javax.swing.JScrollPane scp;
    public static javax.swing.JLabel txtCorreo;
    public static javax.swing.JLabel txtDate;
    public static javax.swing.JTextArea txtPublicaciones;
    // End of variables declaration//GEN-END:variables
}
