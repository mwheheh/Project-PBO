/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author asus
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    boolean a=false;
    public Dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MENU = new javax.swing.JPanel();
        farmasi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pasien = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dokter = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        DASHBOARD = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        daftarpasien = new javax.swing.JButton();
        kamar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        kamarbtn = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(155, 126, 189));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-home-24.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(25, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dashboard");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(122, 122, 122))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(150, 150, 150))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));

        MENU.setBackground(new java.awt.Color(127, 85, 177));
        MENU.setPreferredSize(new java.awt.Dimension(270, 450));
        MENU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        farmasi.setBackground(new java.awt.Color(78, 48, 115));
        farmasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                farmasiMouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-pharmacy-shop-24.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(25, 25));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Farmasi");

        javax.swing.GroupLayout farmasiLayout = new javax.swing.GroupLayout(farmasi);
        farmasi.setLayout(farmasiLayout);
        farmasiLayout.setHorizontalGroup(
            farmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(farmasiLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(122, 122, 122))
        );
        farmasiLayout.setVerticalGroup(
            farmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(farmasiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(farmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(150, 150, 150))
        );

        MENU.add(farmasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 270, 40));

        dashboard.setBackground(new java.awt.Color(155, 126, 189));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-home-24.png"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(25, 25));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Dashboard");

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(122, 122, 122))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(150, 150, 150))
        );

        MENU.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 270, 40));

        pasien.setBackground(new java.awt.Color(78, 48, 115));
        pasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pasienMouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-patient-24.png"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(25, 25));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Pasien");

        javax.swing.GroupLayout pasienLayout = new javax.swing.GroupLayout(pasien);
        pasien.setLayout(pasienLayout);
        pasienLayout.setHorizontalGroup(
            pasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pasienLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(122, 122, 122))
        );
        pasienLayout.setVerticalGroup(
            pasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pasienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(150, 150, 150))
        );

        MENU.add(pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 270, 40));

        dokter.setBackground(new java.awt.Color(78, 48, 115));
        dokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dokterMouseClicked(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-doctor-24.png"))); // NOI18N
        jLabel9.setPreferredSize(new java.awt.Dimension(25, 25));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Dokter");

        javax.swing.GroupLayout dokterLayout = new javax.swing.GroupLayout(dokter);
        dokter.setLayout(dokterLayout);
        dokterLayout.setHorizontalGroup(
            dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dokterLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(122, 122, 122))
        );
        dokterLayout.setVerticalGroup(
            dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dokterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(150, 150, 150))
        );

        MENU.add(dokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 270, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Klinik Kartika Surabaya");
        MENU.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));
        MENU.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 82, 270, 10));

        getContentPane().add(MENU, java.awt.BorderLayout.LINE_START);

        DASHBOARD.setBackground(new java.awt.Color(255, 255, 255));
        DASHBOARD.setPreferredSize(new java.awt.Dimension(900, 500));
        DASHBOARD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(244, 155, 171));
        header.setAlignmentX(6.0F);
        header.setAlignmentY(6.0F);
        header.setPreferredSize(new java.awt.Dimension(630, 90));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Selamat Datang");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setText("Senin, 25 April 2025");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel11)
                .addGap(11, 11, 11)
                .addComponent(jLabel12))
        );

        DASHBOARD.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 630, 120));

        daftarpasien.setBackground(new java.awt.Color(127, 85, 177));
        daftarpasien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daftarpasien.setForeground(new java.awt.Color(255, 255, 255));
        daftarpasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-patient-24.png"))); // NOI18N
        daftarpasien.setText("Daftar Pasien");
        daftarpasien.setBorderPainted(false);
        daftarpasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarpasienActionPerformed(evt);
            }
        });
        DASHBOARD.add(daftarpasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 150, 40));

        kamar.setBackground(new java.awt.Color(127, 85, 177));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("3");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Kamar Tersedia");

        kamarbtn.setBackground(new java.awt.Color(255, 255, 255));
        kamarbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kamarbtn.setForeground(new java.awt.Color(127, 85, 177));
        kamarbtn.setText("Lihat Detail");
        kamarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kamarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kamarLayout = new javax.swing.GroupLayout(kamar);
        kamar.setLayout(kamarLayout);
        kamarLayout.setHorizontalGroup(
            kamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kamarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kamarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kamarbtn)
                .addContainerGap())
        );
        kamarLayout.setVerticalGroup(
            kamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kamarLayout.createSequentialGroup()
                .addGroup(kamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kamarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        DASHBOARD.add(kamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 210, 90));

        getContentPane().add(DASHBOARD, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void daftarpasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarpasienActionPerformed
        // TODO add your handling code here:
        new Registrasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_daftarpasienActionPerformed

    private void dokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dokterMouseClicked
        // TODO add your handling code here:
        new Dokter().setVisible(true);
        dispose();
    }//GEN-LAST:event_dokterMouseClicked

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_dashboardMouseClicked

    private void pasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pasienMouseClicked
        // TODO add your handling code here:
        new DataPasien().setVisible(true);
        dispose();
    }//GEN-LAST:event_pasienMouseClicked

    private void farmasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_farmasiMouseClicked
        // TODO add your handling code here:
        new Farmasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_farmasiMouseClicked

    private void kamarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kamarbtnActionPerformed
        // TODO add your handling code here:
        new Ruangan().setVisible(true);
        dispose();
    }//GEN-LAST:event_kamarbtnActionPerformed

    public void changeimage(JLabel button, String resourcheimg){
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);
    }
    
    
    public void hideshow(JPanel menushowhide, boolean dashboard, JLabel button){
        if(dashboard == true){
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            changeimage(button, "Images/icons8-menu-30.png");
        }
        else{
            menushowhide.setPreferredSize(new Dimension(270, menushowhide.getHeight()));
            changeimage(button, "Images/icon8-back-30.png");
        }
        
    }
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DASHBOARD;
    private javax.swing.JPanel MENU;
    private javax.swing.JButton daftarpasien;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel dokter;
    private javax.swing.JPanel farmasi;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel kamar;
    private javax.swing.JButton kamarbtn;
    private javax.swing.JPanel pasien;
    // End of variables declaration//GEN-END:variables
}
