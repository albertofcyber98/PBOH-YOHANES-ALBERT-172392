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
public class YOHANES_ALBERT_172392_Nomor4 {
    public static void main(String[] args)
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
         try{
             System.out.print("Masukkan Stambuk Anda = ");
             String stambuk=input.readLine();
             System.out.print("Masukkan Nama Anda = ");
             String nama=input.readLine();
             System.out.print("Masukkan Alamat Anda = ");
             String alamat=input.readLine();
             System.out.print("Masukkan Jurusan Anda = ");
             String jurusan=input.readLine();
             System.out.print("Masukkan Umur Anda = ");
             String umur=input.readLine();
             System.out.print("Masukkan Tugas Anda = ");
             int tugas=Integer.parseInt(input.readLine());
             System.out.print("Masukkan MID Anda = ");
             int mid=Integer.parseInt(input.readLine());
             System.out.print("Masukkan Final Anda = ");
             int nal=Integer.parseInt(input.readLine());
             
             double nilai_akhir=0.3*tugas+0.3*mid+0.4*nal;
             System.out.println("Stambuk = "+stambuk);
             System.out.println("Nama = "+nama);
             System.out.println("Alamat = "+alamat);
             System.out.println("Umur = "+umur);
             System.out.println("Tugas = "+tugas);
             System.out.println("MID = "+mid);
             System.out.println("Final = "+nal);
             System.out.println("Akhir = "+nilai_akhir);
         }
         catch (Exception e){
         System.out.println("error");
         }            
         }}