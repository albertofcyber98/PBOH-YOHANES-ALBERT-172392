/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3_YOHANES_ALBERT_172392;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author RENDER12
 */

  class TUGAS{
     Integer jumlah,jmlbayar,total,harga = 0;
     Integer kdbarang;
     String nmbarang = null;
     String jnsbarang ;
     String nama;
     
     double diskon=0;
     public void pemilihan(){
                
         switch (jnsbarang){
             case "A" : case "a":
                    nmbarang="Baju Kemeja";
                    harga=50000;
                    break;
                case "B" :case "b" :
                    nmbarang="Celana Panjang";
                    harga=70000;
                    break;
                case "C" :case "c" :
                    nmbarang="Topi";
                    harga=80000;
                    break;
                case "D" :case "d" :
                    nmbarang="Sepatu";
                    harga=100000;
                    break;
                default:
                
                System.out.println("Masukkan Jenis Barang yang Benar !!!");
                System.exit(0); 
 }
     }
                int menghitung(){
                return(jmlbayar = harga*jumlah);
                }
                double diskon(){
                    switch(jumlah){
                    case 1: case 2: case 3: case 4: diskon=0; break;
                    default: diskon= jmlbayar * 0.1;
                }
                
                total = jmlbayar - (int)diskon;
                return total;
                }
       
  }

        public class YOHANES_ALBERT_172392_Nomor1 {
    
        public static void main(String[]args) throws IOException{
        
        DataInputStream a = new DataInputStream(System.in);
          
        Integer na=1;
        String jawab;
        boolean running = true;
        
        
       
       try{
            TUGAS in = new TUGAS();  
        while( running ) 
       
        {
            System.out.println("Data Ke "+na);
            System.out.print("nama ");
            in.nama = a.readLine();
            System.out.print("Input Kode Barang             : ");
            in.kdbarang = Integer.parseInt(a.readLine());
            System.out.print("Input Jenis Barang            : ");
            in.jnsbarang = a.readLine();
            System.out.print("Input Jumlah Beli             : ");
            in.jumlah=Integer.parseInt(a.readLine());
            
            in.pemilihan();
            
            in.menghitung();
            in.diskon();
                
            
                
            
                System.out.print("\n");
                System.out.print("Data Pembelian Barang\n");
                System.out.println("nama : "+in.nama);
                System.out.println("Kode Barang                   : "+in.kdbarang);
            
                System.out.println("Nama Barang                   : "+in.nmbarang);
            
                System.out.println("Harga Barang                  : "+in.harga);
            
                System.out.println("Jumlah Beli                   : "+in.jumlah);
            
                System.out.println("Jumlah Bayar                  : "+in.jmlbayar);
            
                System.out.println("Diskon                        : "+in.diskon);
            
                System.out.println("Total Bayar                   : "+in.total);
           
            System.out.println("\n");
            System.out.println("   Apakah anda ingin menginput lagi  ?  ");
            System.out.print("   Jawab [ya/tidak] : ");
            jawab = a.readLine();
            System.out.println("\n");

            // cek jawabnnya, kalau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase("tidak") ){
                running = false;
            }
           na++;
        }
 System.out.println(">>>>>>Terima Kasih<<<<<<");
        System.out.println("Create By Yohanes Albert");
        System.out.println("00:56 Selasa 8 Oktober 2019");
        System.out.println("\n");
        System.exit(0);
        
       }
        catch (Exception e){
           System.out.print("Ada Kesalahan !!"+e.toString());
       } 
       }      
}
    

