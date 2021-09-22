/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2_YOHANES_ALBERT_172392;
import java.io.*;

/**
 *
 * @author RENDER12
 */
public class YOHANES_ALBERT_172392_Nomor1 {
    public static void main(String[] args) throws IOException{
        
        DataInputStream a = new DataInputStream(System.in);

        Integer harga = 0,na=1,jumlah,jmlbayar,total;
        String kdbarang,nmbarang = null,jnsbarang, jawab;
        boolean running = true;
        double diskon=0;
        
        try{
        while( running ) {       
            System.out.println("Data Ke "+na);
            System.out.print("Input Kode Barang             : ");
            kdbarang = a.readLine();
            System.out.print("Input Jenis Barang            : ");
            jnsbarang = a.readLine();
            System.out.print("Input Jumlah Beli             : ");
            jumlah = Integer.parseInt(a.readLine());
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
                
                System.out.print("\n");
                System.out.println("Masukkan Jenis Barang yang Benar !!!");
                System.exit(0); }
            
                jmlbayar = harga*jumlah;
                
                switch(jumlah){
                    case 1: case 2: case 3: case 4: diskon=0; break;
                    default: diskon= jmlbayar * 0.1;
                }
                
                total = jmlbayar - (int)diskon;
            
            System.out.print("\n");
            System.out.print("Data Pembelian Barang\n");
            
                System.out.println("Kode Barang                   : "+kdbarang);
                System.out.println("Nama Barang                   : "+nmbarang);
                System.out.println("Harga Barang                  : "+harga);
                System.out.println("Jumlah Beli                   : "+jumlah);
                System.out.println("Jumlah Bayar                  : "+jmlbayar);
                System.out.println("Diskon                        : "+diskon);
                System.out.println("Total Bayar                   : "+total);
           
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
    

