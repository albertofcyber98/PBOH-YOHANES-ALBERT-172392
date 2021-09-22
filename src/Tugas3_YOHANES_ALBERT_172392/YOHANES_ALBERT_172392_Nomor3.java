/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3_YOHANES_ALBERT_172392;

import java.io.*;


/**
 *
 * @author RENDER12
 */
public class YOHANES_ALBERT_172392_Nomor3 {
public static void main(String[] args) throws IOException{
        
        DataInputStream a = new DataInputStream(System.in);
       int pilihan  ;
       System.out.print("Masukkan Bidang Yang ingin di input :");
       pilihan = Integer.parseInt(a.readLine());
        switch(pilihan){
            case 1:
                double j ;
                System.out.println("");
                System.out.println("Menghitung Luas dan Keliling Lingkaran");
                System.out.print("Masukkan Jari-Jari: ");
                j = Integer.parseInt(a.readLine());
                System.out.println("");
                
                rumus1 in = new rumus1();
                in.setrumus1(j);
                
                System.out.println("Luasnya adalah: "+in.luasLingkaran());
                System.out.println("Kelilingnya adalah: "+in.kllLingkaran());
                break;               
            
            case 2:
                double s;
                System.out.println("");
                System.out.println("Menghitung Luas dan Keliling Persegi");
                System.out.print("Masukkan Sisi: ");
                s = Double.parseDouble(a.readLine());
                System.out.println("");
                
                rumus2 g = new rumus2();
                g.setrumus2(s);
                
                System.out.println("Luasnya adalah: "+g.luasPersegi());
                System.out.println("Kelilingnya adalah: "+g.kllPersegi());
                break;
                
            default:
                System.out.println("Masukkan Nomor yang Benar !!!");
                
            
        }
                
       
    }
}
