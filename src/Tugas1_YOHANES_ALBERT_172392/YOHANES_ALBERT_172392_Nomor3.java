/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1_YOHANES_ALBERT_172392;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author RENDER12
 */
public class YOHANES_ALBERT_172392_Nomor3 {
    public static void main(String[] args) {
    String nama, alamat, jurusan;
        Integer stb, nt, nm, nf, umur;
        Double na;
        try{
        nama = JOptionPane.showInputDialog("Masukkan Nama");
        stb = Integer.parseInt(JOptionPane.showInputDialog("Masukkan STB"));
        alamat = JOptionPane.showInputDialog("Masukkan Alamat");
        jurusan = JOptionPane.showInputDialog("Masukkan Jurusan");
        umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Umur"));
        nt = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Tugas"));
        nm = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Mid"));
        nf = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Final"));

        na = (double)(0.3*nt+0.3*nm+0.4*nf);


        JOptionPane.showMessageDialog(null,"Nama Anda: "+nama+"\nSTB Anda: "+stb+""
                + "\nAlamat Anda: "+alamat+"\nJurusan Anda: "+jurusan+""
                        + "\nUmur Anda: "+umur+"\nNilai Tugas Anda: "+nt+""
                                + "\nNilai Mid Anda: "+nm+"\nNilai Final Anda: "+nf+""
                                        + "\nNilai Final Anda: "+nf+"\nNilai Akhir Anda: "+na);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
