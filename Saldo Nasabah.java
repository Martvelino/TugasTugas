import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
    double saldo = sc.nextInt();
    int setor = sc.nextInt();
    double total = saldo+setor;
    double sisa = potongan(total);
    System.out.println(sisa);
    }
    public static double potongan(double a){
        double b = a-7000.00;
        double bonus = b *0.0005;
        double c = b+bonus;
        return c;
    }
}