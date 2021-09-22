/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5_YOHANES_ALBERT_172392;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import koneksi.koneksidb;
import java.awt.*;
import java.lang.*;
import java.text.SimpleDateFormat;
/**
 *
 * @author ASUS TUF
 */
public class quiz extends javax.swing.JFrame {
        private Connection con;
        private Statement st;
        private ResultSet rs;
        private DefaultTableModel model;
        
    public quiz() {
        initComponents();
        
       
        
        stambuk();
        jTextField1.setEditable(false);
        setTitle("Form Data");
        DefaultTableModel model = new DefaultTableModel ();
        String[] data = {"Nomor","Nama","Tanggal Masuk"};
        model = new DefaultTableModel(data,0); 
        tabel.setModel(model);
        tampil();
        
    
    }
    private void simpan(){
    String Tampilan ="yyyy-MM-dd";
            SimpleDateFormat fm = new SimpleDateFormat(Tampilan);
            String tanggalmasuk = String.valueOf(fm.format(jDateChooser1.getDate()));
       try{
            Connection c =koneksidb.getConnection();
            //Membaca perintah SQL static di JAVA :
            Statement st=c.createStatement();
            try{
            String  sql = "INSERT INTO anggota (nomor,tgl_masuk) "
                    + " VALUES ('"+stb.getSelectedItem()+"','"+tanggalmasuk+"')";
            
            int result = st.executeUpdate(sql);
                
                    if (result == 0){
                        JOptionPane.showMessageDialog(this, "Data Gagal ditambahkan");
                        }
                    else if (result == 1){
                        JOptionPane.showMessageDialog(this, "Data Berhasil ditambahkan");
                        }}
                    catch(Exception ex){
        JOptionPane.showMessageDialog(null,""+ex);
       }
           
            }
       catch(Exception ex){
        JOptionPane.showMessageDialog(null,"Data Tidak Dapat ditambahkan karena " +ex);
       }
    }
    
    
    private void stambuk(){
        try{
         //Memanggil koneksi :
            Connection c =koneksidb.getConnection();
            //Membaca perintah SQL static di JAVA :
            Statement st=c.createStatement();
            //Perintah QUERY :
        String  Sql = "SELECT * FROM mhs"; 
        ResultSet rs=st.executeQuery(Sql);
        while (rs.next()) {
            stb.addItem(rs.getString("stb"));
        }
        }catch (Exception e){
            System.out.println(""+e);
        }
    
    }
    private void tampil(){
    
    try{
    
            //Memanggil koneksi :
            Connection c =koneksidb.getConnection();
            //Membaca perintah SQL static di JAVA :
            Statement st=c.createStatement();
            //Perintah QUERY :
            String sql = "SELECT anggota.nomor, mhs.nama, anggota.tgl_masuk FROM "
                    + "anggota inner join mhs on(mhs.stb=anggota.nomor)";
            //Menjalankan perintah Query :
            ResultSet rs=st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel ();
            String[] data = {"Nomor","Nama","Tanggal Masuk"};
            model = new DefaultTableModel(data,0); 
            tabel.setModel(model);
            
            while(rs.next()){
            model.addRow(new Object[]{
           
            rs.getString("nomor"),
            rs.getString("nama"),
            rs.getString("tgl_masuk")
          
            
            }
        );
        tabel.setModel(model);
        
           
        }}
    
    catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"Terjadi Kesalahan" +ex);
    }
    
    }
    private void hapus(){
        try{
            
           //Memanggil koneksi :
            Connection c =koneksidb.getConnection();
            //Membaca perintah SQL static di JAVA :
            Statement st=c.createStatement();
            
            
            String sql = "DELETE FROM anggota WHERE nomor='" + stb.getSelectedItem() + "'";
            tampil();
        
           
                
                int result = st.executeUpdate(sql);
                    if (result == 0){
                        JOptionPane.showMessageDialog(this, "Data Gagal dihapus");
                    }
                    else if (result == 1){
                    JOptionPane.showMessageDialog(this, "Data Berhasil dihapus");
                    }
        
            
        }
        catch(Exception ex){
        JOptionPane.showMessageDialog(null,"Kesalahan Sistem " +ex);
        }
    
    
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        stb = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nomor Anggota");

        stb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--" }));
        stb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stbActionPerformed(evt);
            }
        });

        jLabel2.setText("Tanggal Masuk");

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nomor", "Nama", "Tanggal Masuk"
            }
        ));
        jScrollPane1.setViewportView(tabel);

        jButton2.setText("Hapus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(stb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(stb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(255, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stbActionPerformed
        try{
        //Memanggil koneksi :
            Connection c =koneksidb.getConnection();
            //Membaca perintah SQL static di JAVA :
            Statement st=c.createStatement();
        
        
        String  Sql = "SELECT * FROM mhs WHERE stb='"+stb.getSelectedItem().toString() + "'";
        ResultSet rs=st.executeQuery(Sql);
        while (rs.next()) {
            jTextField1.setText(rs.getString("nama"));
        }
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_stbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            simpan();
            tampil();
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        hapus();
        tampil();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> stb;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
