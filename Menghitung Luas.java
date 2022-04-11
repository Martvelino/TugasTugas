import java.io.*;
import java.util.*;

class Persegi{
    
    private int sisi;
    
    Persegi(int sisi){
        this.sisi = sisi;
    }
    
    int luasPersegi(){
        int hasil = this.sisi*this.sisi;
        return hasil;
    }
}

class Segitiga {
    
    private int alas, tinggi;
    
    Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    int luasSegitiga(){
        int hasil = (this.alas*this.tinggi) / 2;
        return hasil;
    }
}

class Lingkaran{
    
    private double jariJari;
    
    Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    
    double luasLingkaran(){
        double hasil = 22/7*jariJari*jariJari;
        return hasil;
    }

    double luasLingkaran2(){
        double hasil = 3.14*jariJari*jariJari;
        int cast = (int) hasil;
        return cast;
    }
}

public class Solution {
    
    public static void main (String[] args){
        
        int a,b;
        double c;
        
        Scanner input = new Scanner(System.in);
        int pilih = input.nextInt();
        
        if (pilih == 1){
            a = input.nextInt();
            Persegi bangunPersegi = new Persegi(a);
            System.out.println(bangunPersegi.luasPersegi());
            
        }else if (pilih == 2){
            a = input.nextInt();
            b = input.nextInt();
            Segitiga bangunSegitiga = new Segitiga(a,b);
            System.out.println(bangunSegitiga.luasSegitiga());
            
        }else if (pilih == 3){
            c = input.nextDouble();
            Lingkaran bangunLingkaran = new Lingkaran (c);
            if (c%7 == 0){
                System.out.println(bangunLingkaran.luasLingkaran());
            }else{
                System.out.println(bangunLingkaran.luasLingkaran2());
            }
            
        }else{
            System.out.println("Input yang anda masukan tidak sesuai");
        }     
    }
}