import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        if (pilihan == 1){
            int s = input.nextInt();
            System.out.println(persegi(s));
        }
        else if (pilihan == 2){
            double alas = input.nextDouble();
            double tinggi = input.nextDouble();
            System.out.println(segitiga(alas, tinggi));
        }
        else if (pilihan== 3){
            double jari = input.nextDouble();
            if (jari%7 == 0){
                System.out.println(lingkaran(jari));
            }
            else 
             System.out.println(lingkaran2(jari));
        }
        else System.out.println("Input yang anda masukan tidak sesuai");
    }
    public static int persegi(int sisi){
        int hasil = sisi*sisi;
        return hasil;
    }
    public static int segitiga(Double a, Double t){
        int hasil = (int) (a*t/2);
        return hasil;
    }
    public static double lingkaran(double r){
        double hasil = 22 / 7 * r * r;
        return hasil;
    }
    public static double lingkaran2(double r){
        double hasil = 3.14 * r* r;
        int result = (int)hasil; 
        return result;
    }
}