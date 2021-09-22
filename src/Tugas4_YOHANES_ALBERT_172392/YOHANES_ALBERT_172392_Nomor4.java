/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4_YOHANES_ALBERT_172392;
import java.awt.Dimension;
import java.awt.Toolkit;
/**
 *
 * @author ASUS TUF
 */
public class YOHANES_ALBERT_172392_Nomor4 extends javax.swing.JFrame {

    /**
     * Creates new form YOHANES_ALBERT_172392_Nomor4
     */
    public YOHANES_ALBERT_172392_Nomor4() {
        initComponents();
        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
        
        
        jurusan.addItem("Teknik Informatika");
        jurusan.addItem("Sistem Informasi");
        jurusan.addItem("Manajemen Informasi");
        jurusan.addItem("RPL");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nama = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        jurusan = new javax.swing.JComboBox<>();
        umur = new javax.swing.JSpinner();
        tugas = new javax.swing.JTextField();
        mid = new javax.swing.JTextField();
        nfinal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewdata = new javax.swing.JTextArea();
        stb = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Hapus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------Pilih Jurusan-----------" }));

        nfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nfinalActionPerformed(evt);
            }
        });

        jLabel1.setText("Stambuk");

        jLabel2.setText("Nama");

        jLabel3.setText("Alamat");

        jLabel4.setText("Jurusan");

        jLabel5.setText("Umur");

        jLabel6.setText("Nilai Tugas");

        jLabel7.setText("Nilai MID");

        jLabel8.setText("Nilai Final");

        viewdata.setColumns(20);
        viewdata.setRows(5);
        viewdata.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                viewdataAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(viewdata);

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(umur, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(39, 39, 39))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(34, 34, 34)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(45, 45, 45)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(stb)
                                        .addComponent(nama)
                                        .addComponent(jScrollPane1)
                                        .addComponent(tugas)
                                        .addComponent(mid)
                                        .addComponent(nfinal)
                                        .addComponent(jurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLabel6))
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(stb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(umur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        viewdata.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nfinalActionPerformed
        String nhuruf="",ket="";

        viewdata.setText("Stambuk  : "+stb.getText()+'\n');
        viewdata.setText(viewdata.getText()+ "Nama : "+nama.getText()+'\n');
        viewdata.setText(viewdata.getText()+"Alamat : "+alamat.getText());
        viewdata.setText(viewdata.getText()+'\n'+"Jurusan : "+jurusan.getSelectedItem()+'\n');
        viewdata.setText(viewdata.getText()+"Umur : "+umur.getValue()+'\n');
        viewdata.setText(viewdata.getText()+"Nilai Tugas  : "+tugas.getText()+'\n');
        viewdata.setText(viewdata.getText()+"Nilai MID    : "+mid.getText()+'\n');
        viewdata.setText(viewdata.getText()+"Nilai Final  : "+nfinal.getText()+'\n');

        double nilai1 = Double.parseDouble(tugas.getText());
        double nilai2 = Double.parseDouble(mid.getText());
        double nilai3 = Double.parseDouble(nfinal.getText());
        double na = (0.3*nilai1)+(0.3*nilai2)+(0.3*nilai3);

        if (na >= 80){
            nhuruf = "A";
            ket = "Sangat Baik";
        }
        else if (na >= 70 && na <= 79 ){
            nhuruf = "B";
            ket = "Baik";
        }
        else if (na >= 60 && na <= 69){
            nhuruf = "C";
            ket = "Lumayan";
        }
        else if (na >= 40 && na <= 59){
            nhuruf = "D";
            ket = "Cukup";
        }
        else{
            nhuruf = "E";
            ket = "Buruk";
        }
        viewdata.setText(viewdata.getText()+"Nilai Huruf : "+nhuruf+'\n');
        viewdata.setText(viewdata.getText()+"Keterangan  : "+ket);

    }//GEN-LAST:event_nfinalActionPerformed

    private void viewdataAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_viewdataAncestorAdded
        viewdata.setEnabled(false);
    }//GEN-LAST:event_viewdataAncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nhuruf="",ket="";

        viewdata.setText("Stambuk  : "+stb.getText()+'\n');
        viewdata.setText(viewdata.getText()+ "Nama : "+nama.getText()+'\n');
        viewdata.setText(viewdata.getText()+"Alamat : "+alamat.getText());
        viewdata.setText(viewdata.getText()+'\n'+"Jurusan : "+jurusan.getSelectedItem()+'\n');
        viewdata.setText(viewdata.getText()+"Umur : "+umur.getValue()+'\n');
        viewdata.setText(viewdata.getText()+"Nilai Tugas  : "+tugas.getText()+'\n');
        viewdata.setText(viewdata.getText()+"Nilai MID    : "+mid.getText()+'\n');
        viewdata.setText(viewdata.getText()+"Nilai Final  : "+nfinal.getText()+'\n');

        double nilai1 = Double.parseDouble(tugas.getText());
        double nilai2 = Double.parseDouble(mid.getText());
        double nilai3 = Double.parseDouble(nfinal.getText());
        double na = (0.3*nilai1)+(0.3*nilai2)+(0.3*nilai3);

        if (na >= 80){
            nhuruf = "A";
            ket = "Sangat Baik";
        }
        else if (na >= 70 && na <= 79 ){
            nhuruf = "B";
            ket = "Baik";
        }
        else if (na >= 60 && na <= 69){
            nhuruf = "C";
            ket = "Lumayan";
        }
        else if (na >= 40 && na <= 59){
            nhuruf = "D";
            ket = "Cukup";
        }
        else{
            nhuruf = "E";
            ket = "Buruk";
        }
        viewdata.setText(viewdata.getText()+"Nilai Huruf : "+nhuruf+'\n');
        viewdata.setText(viewdata.getText()+"Keterangan  : "+ket);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(YOHANES_ALBERT_172392_Nomor4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YOHANES_ALBERT_172392_Nomor4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YOHANES_ALBERT_172392_Nomor4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YOHANES_ALBERT_172392_Nomor4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YOHANES_ALBERT_172392_Nomor4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jurusan;
    private javax.swing.JTextField mid;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nfinal;
    private javax.swing.JTextField stb;
    private javax.swing.JTextField tugas;
    private javax.swing.JSpinner umur;
    private javax.swing.JTextArea viewdata;
    // End of variables declaration//GEN-END:variables
}
