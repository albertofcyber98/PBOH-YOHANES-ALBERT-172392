/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3_YOHANES_ALBERT_172392;


/**
 *
 * @author RENDER12
 */
class rumus1 {
    double j;
    
    public void setrumus1(double jari){
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
class rumus2{
    double s;
    
    public void setrumus2(double sisi){
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