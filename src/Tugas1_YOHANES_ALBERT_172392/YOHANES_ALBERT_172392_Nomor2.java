/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1_YOHANES_ALBERT_172392;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author RENDER12
 */
public class YOHANES_ALBERT_172392_Nomor2 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);

        Integer stb, umur, nt, nm, nf;
        Double na;
        String nama, alamat, jurusan;

        try {

            System.out.print("Masukkan STB: ");
            stb = a.nextInt();
            System.out.print("Masukkan Nama: ");
            nama = a.next();
            System.out.print("Masukkan Alamat: ");
            alamat = a.next();
            System.out.print("Masukkan Jurusan: ");
            jurusan = a.next();
            System.out.print("Masukkan Umur: ");
            umur = a.nextInt();
            System.out.print("Masukkan Nilai Tugas: ");
            nt = a.nextInt();
            System.out.print("Masukkan Nilai Mid: ");
            nm = a.nextInt();
            System.out.print("Masukkan Nilai Final: ");
            nf = a.nextInt();

            na = (double)(0.3*nt+0.3*nm+0.4*nf);

            System.out.println("Nilai Akhir Anda: "+na);
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
