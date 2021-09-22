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
class Lingkaran {
    double j;
    
    public void setLingkaran(double jari){
        this.j = jari;
    }
    
    public double luasLingkaran(){
        double luas;
        luas = 3.14 * this.j * this.j;
        return luas;
    }
    
    public double kllLingkaran(){
        double kll;
        kll = 2 * 3.14 * this.j;
        return kll;
    }
    
}
class Persegi{
    double s;
    
    public void setPersegi(double sisi){
        this.s = sisi;
    }
    
    public double luasPersegi(){
        double luas;
        luas = this.s * this.s;
        return luas;
    }
    
    public double kllPersegi(){
        double kll;
        kll = this.s * 4;
        return kll;
    }
}
class Persegi_Panjang {
    double p,l;
    
    public void setPersegi_Panjang(double panjang,double lebar){
        this.p = panjang;
        this.l = lebar;
    }
    
    public double luasPersegi_Panjang(){
        double luas;
        luas = this.p * this.l;
        return luas;
    }
    public double kllPersegi_Panjang(){
        double kll;
        kll = 2*(this.p+this.l);
        return kll;
    }
}
 


public class YOHANES_ALBERT_172392_Nomor2 {
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
                Lingkaran L = new Lingkaran();
                L.setLingkaran(j);
                
                System.out.println("Luasnya adalah: "+L.luasLingkaran());
                System.out.println("Kelilingnya adalah: "+L.kllLingkaran());
                break;               
            
            case 2:
                double s;
                System.out.println("");
                System.out.println("Menghitung Luas dan Keliling Persegi");
                System.out.print("Masukkan Sisi: ");
                s = Double.parseDouble(a.readLine());
                System.out.println("");
                
                Persegi P = new Persegi();
                P.setPersegi(s);
                
                System.out.println("Luasnya adalah: "+P.luasPersegi());
                System.out.println("Kelilingnya adalah: "+P.kllPersegi());
                break;
                
            case 3:
                double p,l;
                System.out.println("");
                System.out.println("Menghitung Luas dan Keliling Persegi Panjang");
                System.out.print("Masukkan Panjang: ");
                p = Double.parseDouble(a.readLine());
                System.out.print("Masukkan Lebar: ");
                l = Double.parseDouble(a.readLine());
                System.out.println("");
                
                Persegi_Panjang PP = new Persegi_Panjang();
                PP.setPersegi_Panjang(p, l);
                
                System.out.println("Luasnya adalah: "+PP.luasPersegi_Panjang());
                System.out.println("Kelilingnya adalah: "+PP.kllPersegi_Panjang());
                break;
                
            
        }
                
       
    }
}