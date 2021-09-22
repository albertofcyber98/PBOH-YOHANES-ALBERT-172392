/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1_YOHANES_ALBERT_172392;
import java.io.*;
/**
 *
 * @author RENDER12
 */
public class YOHANES_ALBERT_172392_Nomor1 {
    
    public static void main(String[] args){
    
        DataInputStream a = new DataInputStream(System.in);

        Integer stb, umur, nt, nm, nf;
        Double na;
        String nama, alamat, jurusan;

        try {
            System.out.print("Masukkan STB: ");
            stb = Integer.parseInt(a.readLine());
            System.out.print("Masukkan Nama: ");
            nama = a.readLine();
            System.out.print("Masukkan Alamat: ");
            alamat = a.readLine();
            System.out.print("Masukkan Jurusan: ");
            jurusan = a.readLine();
            System.out.print("Masukkan Umur: ");
            umur = Integer.parseInt(a.readLine());
            System.out.print("Masukkan Nilai Tugas: ");
            nt = Integer.parseInt(a.readLine());
            System.out.print("Masukkan Nilai Mid: ");
            nm = Integer.parseInt(a.readLine());
            System.out.print("Masukkan Nilai Final: ");
            nf = Integer.parseInt(a.readLine());

            na = (double)(0.3*nt+0.3*nm+0.4*nf);

            System.out.println("Nilai Akhir Anda: "+na);
            }

        catch (Exception e){
            e.printStackTrace();            
        }
    }
}