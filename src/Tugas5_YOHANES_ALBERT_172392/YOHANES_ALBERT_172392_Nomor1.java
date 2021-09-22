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
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;



/**
 *
 * @author ASUS TUF
 */
public class YOHANES_ALBERT_172392_Nomor1 extends javax.swing.JFrame {

    private Connection con;
    private Statement st;
    private ResultSet rs;
    private DefaultTableModel model;
    
   
        
    public YOHANES_ALBERT_172392_Nomor1() {
        initComponents();
         // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
        datajurusan();
        
        jcombo.addItem("stb");
        jcombo.addItem("nama");
        jcombo.addItem("alamat");
        
        
        setTitle("Form Data");
        DefaultTableModel model = new DefaultTableModel ();
        String[] data = {"Stambuk","Nama","Alamat","Jurusan","Umur","Nilai Tugas",
            ""+"Nilai MID","Nilai Final","Nilai Huruf","Keterangan"};
        model = new DefaultTableModel(data,0); 
        tabel.setModel(model);
        ambildata();   
        simpan.setEnabled(true);
        hapus.setEnabled(false);
        ubah.setEnabled(false);
        }
    private void datajurusan(){
        try{
         //Memanggil koneksi :
            Connection c =koneksidb.getConnection();
            //Membaca perintah SQL static di JAVA :
            Statement st=c.createStatement();
            //Perintah QUERY :
        String  Sql = "SELECT * FROM jurusan"; 
        ResultSet rs=st.executeQuery(Sql);
        while (rs.next()) {
            jurusan.addItem(rs.getString("kode"));
        }
        }catch (Exception e){
            System.out.println(""+e);
        }
    
    }
    public void ambildata(){
            
        try {
            
            //Memanggil koneksi :
            Connection c =koneksidb.getConnection();
            //Membaca perintah SQL static di JAVA :
            Statement st=c.createStatement();
            //Perintah QUERY :
            String sql = "SELECT * FROM mhs";
            //Menjalankan perintah Query :
            ResultSet rs=st.executeQuery(sql);
            
            DefaultTableModel model = new DefaultTableModel ();
            String[] data = {"Stambuk","Nama","Alamat","Jurusan","Umur","Nilai Tugas","Nilai MID","Nilai Final","Nilai Huruf","Keterangan"};
            model = new DefaultTableModel(data,0); 
            tabel.setModel(model);
            
            while(rs.next()){
            model.addRow(new Object[]{
           
            rs.getString("stb"),
            rs.getString("nama"),
            rs.getString("alamat"),
            rs.getString("jurusan"),
            rs.getString("umur"),
            rs.getString("nilai_tugas"),
            rs.getString("nilai_mid"),
            rs.getString("nilai_final"),
            rs.getString("nilai_huruf"),
            rs.getString("keterangan")
            
            
        }
        );
        tabel.setModel(model);
        
           
        }
        }
    catch (SQLException e) {
            System.out.println("Terjadi Error dalam pengambilan data"+e);
        }
    }
    
    public void simpan() {
        try {
            //Memanggil koneksi :
            Connection c =koneksidb.getConnection();
            //Membaca perintah SQL static di JAVA :
            Statement st=c.createStatement();
            
            String nhuruf="",ket="";
            
            
            
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
       
       huruf.setText(nhuruf);
       keterangan.setText(ket);
       String nf = "'" + nhuruf+ "'";
       String nk = "'" +ket+ "'";
       
            
            try {
                
                String sql = "INSERT INTO mhs VALUES"+"('" + stb.getText() + "',"+ 
                        "'" + nama.getText() + "',"+ "'" + alamat.getText() + "', " + 
                        " '" + jurusan1.getText()+ "',"+ "'" + umur.getValue()+ "',"+ 
                        "'" + tugas.getText() + "',"+ "'" + mid.getText() + "',"+ 
                        "'" + nfinal.getText() + "',"+ "'" +nhuruf + "',"+ "'" + ket + "')";
                
                int result = st.executeUpdate(sql);
                
                    if (result == 0){
                        JOptionPane.showMessageDialog(this, "Data Gagal ditambahkan");
                        }
                    else if (result == 1){
                        JOptionPane.showMessageDialog(this, "Data Berhasil ditambahkan");
                        }
                    kosongkan();
            } catch (SQLException ex) {
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, "Stambuk yang anda input sudah ada !");
        }
    }
   public void hapus() {
        model = new DefaultTableModel(); 
        tabel.setModel(model);
        try {
             //Memanggil koneksi :
            Connection c =koneksidb.getConnection();
            //Membaca perintah SQL static di JAVA :
            Statement st=c.createStatement();
            int j = tabel.getSelectedRow();
            String i = stb.getText();
            String sql = "DELETE FROM `mhs` WHERE `stb`='" + i + "';";
              ambildata();
        
            try {
                
                int result = st.executeUpdate(sql);
                    if (result == 0){
                        JOptionPane.showMessageDialog(this, "Data Gagal dihapus");
                    }
                    else if (result == 1){
                    JOptionPane.showMessageDialog(this, "Data Berhasil dihapus");
                    }
               
    
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
   
   public void update() {
       
        try {
            //Memanggil koneksi :
            Connection c =koneksidb.getConnection();
            //Membaca perintah SQL static di JAVA :
            Statement st=c.createStatement();
            
            String nhuruf="",ket="";
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
            huruf.setText(nhuruf);
            keterangan.setText(ket);
            String update = "UPDATE mhs SET nama = '" + nama.getText() + "',alamat = '" + alamat.getText() + "',jurusan = '" + jurusan1.getText()+ "',umur = '" + umur.getValue()+ "',nilai_tugas = '" + tugas.getText() + "',nilai_mid = '" + mid.getText() + "',nilai_final = '" + nfinal.getText() + "',nilai_huruf = '" + huruf.getText() + "',keterangan = '" + keterangan.getText() + "' WHERE stb = '" + stb.getText() + "'" ;
            ambildata();
            try {
                
                int result = st.executeUpdate(update);
                if (result == 0){
                    JOptionPane.showMessageDialog(this, "Data Gagal diedit");
                }
                else if (result == 1){
                    JOptionPane.showMessageDialog(this, "Data Berhasil diedit");
                }
                 kosongkan();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException ex) {
            
        }
    }
   
   public void cari(){
       
       
   try {    
       //Memanggil koneksi :
            Connection c =koneksidb.getConnection();
            //Membaca perintah SQL static di JAVA :
            Statement st=c.createStatement();
            
            
            DefaultTableModel model =new DefaultTableModel();
            model.addColumn("Stambuk");
            model.addColumn("Nama");
            model.addColumn("Alamat");
            
            model.addColumn("Jurusan");
            model.addColumn("Umur");
            model.addColumn("Nilai Tugas");
            model.addColumn("Nilai MID");
            model.addColumn("Nilai Final");
            
            model.addColumn("Nilai Huruf");
            model.addColumn("Keterangan");
            //jTable1.setModel(model);
           String sql = "SELECT * FROM mhs WHERE "+jcombo.getSelectedItem().toString()+" like '%" + cari1.getText() + "%'";
            
           ResultSet rs=st.executeQuery(sql);
            while (rs.next()) {
                 model.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getString(7),
                rs.getString(8),
                rs.getString(9),
                rs.getString(10),
                
                });
             
            }
           tabel.setModel(model);
        } catch (Exception e) {
          
        }
            
   }
   public void cari1(){
       
       
   try {    
       //Memanggil koneksi :
            Connection c =koneksidb.getConnection();
            //Membaca perintah SQL static di JAVA :
            Statement st=c.createStatement();
            
            
            DefaultTableModel model =new DefaultTableModel();
            model.addColumn("Stambuk");
            model.addColumn("Nama");
            model.addColumn("Alamat");
            
            model.addColumn("Jurusan");
            model.addColumn("Umur");
            model.addColumn("Nilai Tugas");
            model.addColumn("Nilai MID");
            model.addColumn("Nilai Final");
            
            model.addColumn("Nilai Huruf");
            model.addColumn("Keterangan");
            //jTable1.setModel(model);
           String sql = "SELECT * FROM mhs WHERE stb like '%" + stb.getText() + "%'";
            
           ResultSet rs=st.executeQuery(sql);
            while (rs.next()) {
                 model.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getString(7),
                rs.getString(8),
                rs.getString(9),
                rs.getString(10),
                
                });
             
            }
           tabel.setModel(model);
        } catch (Exception e) {
          
        }
            
   }

   public void kosongkan(){
        stb.setText("");
        nama.setText("");
        alamat.setText("");
        umur.setValue(0);
        jurusan1.setText("");
        tugas.setText("");
        mid.setText("");
        nfinal.setText("");
        huruf.setText("");
        keterangan.setText("");
        jurusan.setSelectedIndex(0);
        jcombo.setSelectedIndex(0);
        cari1.setText("");
    }
   
    
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        stb = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        umur = new javax.swing.JSpinner();
        tugas = new javax.swing.JTextField();
        mid = new javax.swing.JTextField();
        nfinal = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jurusan = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        refresh = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        huruf = new javax.swing.JTextField();
        Keterangan = new javax.swing.JLabel();
        keterangan = new javax.swing.JTextField();
        cari1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jcombo = new javax.swing.JComboBox<>();
        jurusan1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Stambuk");

        jLabel2.setText("Nama");

        jLabel3.setText("Alamat");

        jLabel4.setText("Jurusan");

        jLabel5.setText("Umur");

        jLabel6.setText("Nilai Tugas");

        jLabel7.setText("Nilai MID");

        jLabel8.setText("Nilai Final");

        stb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stbActionPerformed(evt);
            }
        });

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        umur.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        exit.setText("Keluar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilih" }));
        jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jurusanActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Stambuk", "Nama", "Alamat", "Jurusan", "Umur", "Nilai Tugas", "Nilai MID", "Nilai Final", "Nilai Huruf", "Keterangan"
            }
        ));
        tabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(tabel);

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        jLabel9.setText("Nilai Huruf");

        huruf.setEnabled(false);

        Keterangan.setText("Keterangan");

        keterangan.setEnabled(false);

        cari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cari");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Cari Berdasarkan");

        jcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--pilih--" }));

        jurusan1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jurusan1.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1072, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(simpan)
                        .addGap(18, 18, 18)
                        .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hapus)
                        .addGap(18, 18, 18)
                        .addComponent(refresh)
                        .addGap(18, 18, 18)
                        .addComponent(exit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cari1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(mid, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(Keterangan)
                                    .addComponent(jLabel8))
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(39, 39, 39)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(nama)
                                                .addComponent(jScrollPane1)
                                                .addComponent(umur, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                                    .addComponent(jurusan1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(24, 24, 24))
                                                .addComponent(stb))))
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(73, 73, 73)
                                    .addComponent(tugas, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nfinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(huruf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(keterangan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(hapus)
                    .addComponent(exit)
                    .addComponent(refresh)
                    .addComponent(ubah))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(stb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(mid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(nfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(huruf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Keterangan)
                            .addComponent(keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jurusan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(umur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cari1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        
            
        simpan();
           
        ambildata();
           
     
    }//GEN-LAST:event_simpanActionPerformed

    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
       hapus();
       kosongkan();
       ambildata();
       stb.setEditable(true);
       
    }//GEN-LAST:event_hapusActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        
        kosongkan();
        ambildata();
        simpan.setEnabled(true);
        ubah.setEnabled(false);
        hapus.setEnabled(false);
        stb.setEditable(true);
        
      
    }//GEN-LAST:event_refreshActionPerformed

    private void tabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelAncestorAdded
      
    }//GEN-LAST:event_tabelAncestorAdded

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
      
        update();
      
      ambildata();
      stb.setEditable(true);
    }//GEN-LAST:event_ubahActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       cari();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void stbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stbActionPerformed
    
            
          try{  
        
        //Memanggil koneksi :
            Connection c =koneksidb.getConnection();
            //Membaca perintah SQL static di JAVA :
            Statement st=c.createStatement();
        ResultSet rs;
        String  Sql = "Select * from mhs where stb='"+stb.getText() + "'"; 
        rs=st.executeQuery(Sql);
        if (rs.next()) {
            ubah.setEnabled(true);
            hapus.setEnabled(true);
            simpan.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Data Sudah Ada!!");
            simpan.setEnabled(false);
            stb.setEditable(false);
             nama.setText(rs.getString("nama"));
             alamat.setText(rs.getString("alamat"));
             
             jurusan1.setText(rs.getString("jurusan"));
             
             //umur.setValue(rs.getString("umur"));
             tugas.setText(rs.getString("nilai_tugas"));
             umur.setValue(rs.getInt("umur"));
             mid.setText(rs.getString("nilai_mid"));
             nfinal.setText(rs.getString("nilai_final"));
             huruf.setText(rs.getString("nilai_huruf"));
             keterangan.setText(rs.getString("keterangan"));
              
             
        }else { 
            ubah.setEnabled(false);
            hapus.setEnabled(false);
            simpan.setEnabled(true);
            kosongkan();
            JOptionPane.showMessageDialog(null, "Data Belum Ada!!");
             stb.setEditable(true);
            simpan.setEnabled(true);
           hapus.setEnabled(false);
            ubah.setEnabled(false);
            nama.setText("");
             nama.requestFocus();
        tugas.setText("");
        mid.setText("");
        nfinal.setText("");
        huruf.setText("");
        keterangan.setText("");
       
        jurusan.setSelectedIndex(0);
        
        }
        }catch (Exception e){
            System.out.println(" "+e);
        }
          cari1();
    }//GEN-LAST:event_stbActionPerformed

    private void jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jurusanActionPerformed
      try{
        //Memanggil koneksi :
            Connection c =koneksidb.getConnection();
            //Membaca perintah SQL static di JAVA :
            Statement st=c.createStatement();
        
        
        String  Sql = "SELECT * FROM jurusan WHERE kode='"+jurusan.getSelectedItem().toString() + "'";
        ResultSet rs=st.executeQuery(Sql);
        while (rs.next()) {
            jurusan1.setText(rs.getString("nama"));
        }
        }catch (Exception e){
            System.out.println(""+e);
        }
    
    }//GEN-LAST:event_jurusanActionPerformed

    private void cari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cari1ActionPerformed

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
            java.util.logging.Logger.getLogger(YOHANES_ALBERT_172392_Nomor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YOHANES_ALBERT_172392_Nomor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YOHANES_ALBERT_172392_Nomor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YOHANES_ALBERT_172392_Nomor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YOHANES_ALBERT_172392_Nomor1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Keterangan;
    private javax.swing.JTextArea alamat;
    private javax.swing.JTextField cari1;
    private javax.swing.JButton exit;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField huruf;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcombo;
    private javax.swing.JComboBox<String> jurusan;
    private javax.swing.JTextField jurusan1;
    private javax.swing.JTextField keterangan;
    private javax.swing.JTextField mid;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nfinal;
    private javax.swing.JButton refresh;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField stb;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField tugas;
    private javax.swing.JButton ubah;
    private javax.swing.JSpinner umur;
    // End of variables declaration//GEN-END:variables

    
}
