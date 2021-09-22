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
public class YOHANES_ALBERT_172392_Nomor2 {
    public static void main(String[] args) throws IOException{
    
        DataInputStream a = new DataInputStream(System.in);

        Integer stb, umur, nt, nm, nf;
        Double na;
        String nama, alamat, jurusan, jawab;
        boolean running=true;
        
        try {
            while( running ){
            System.out.print("Masukkan STB             : ");
            stb = Integer.parseInt(a.readLine());
            System.out.print("Masukkan Nama            : ");
            nama = a.readLine();
            System.out.print("Masukkan Alamat          : ");
            alamat = a.readLine();
            System.out.print("Masukkan Jurusan         : ");
            jurusan = a.readLine();
            System.out.print("Masukkan Umur            : ");
            umur = Integer.parseInt(a.readLine());
            System.out.print("Masukkan Nilai Tugas     : ");
            nt = Integer.parseInt(a.readLine());
            System.out.print("Masukkan Nilai Mid       : ");
            nm = Integer.parseInt(a.readLine());
            System.out.print("Masukkan Nilai Final     : ");
            nf = Integer.parseInt(a.readLine());
            System.out.println("\n");

            na = (double)(0.3*nt+0.3*nm+0.4*nf);

            System.out.println("Nilai Akhir Anda         : "+na);
            if(na>=85){
            System.out.print("Nilai Huruf Anda         : A");
                }
            else if(na>=70 && na<85){
            System.out.print("Nilai Huruf Anda         : B");
                }
            else if (na>=65 && na<70){
            System.out.print("Nilai Huruf Anda         : C");
                }
            else if (na>=40 && na<65){
            System.out.print("Nilai Huruf Anda         : D");
                }
            else {
            System.out.print("Nilai Huruf Anda         : E");
                }
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("   Apakah anda ingin menginput lagi  ?  ");
            System.out.print("   Jawab [ya/tidak] : ");
            jawab = a.readLine();
            System.out.println("\n");

            // cek jawabnnya, kalau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase("tidak") ){
                running = false;
            }
          
        }

        System.out.println(">>>>>>Terima Kasih<<<<<<");
        System.out.println("Create By Yohanes Albert");
        System.out.println("00:56 Selasa 8 Oktober 2019");
        System.out.println("\n");
        System.exit(0);
        
        }
        

        catch (Exception e){
           System.out.print("Ada Kesalahan !!"+e.toString());
       }  }}
