/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119003.latihan19.saldotabungan;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author User
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menghitung lama saldo tabungan
 */

public class SaldoTabungan {    
    static Scanner scan = new Scanner(System.in);    
    Locale locale = Locale.forLanguageTag("id");
    double saldo, bunga;
    int lama;
    /**
     * @param args the command line arguments
     */
    private void masukkanSaldo(){
        System.out.print("Saldo Awal\t: Rp. ");
        saldo = Double.parseDouble(scan.next().replaceAll("[$,.]", ""));        
        System.out.print("Bunga/Bulan(%)\t: ");
        bunga = scan.nextInt();        
        System.out.print("Lama(bulan)\t: ");
        lama = scan.nextInt();
    }
    
    private void hitungSaldo(){
        double bunga = this.bunga / 100 + 1;
        this.bunga = bunga;
    }
    
    private void tampilSaldo(){
        for(int i = 1; i <= lama; i++){ 
            saldo *= bunga;
            System.out.print("Saldo di bulan ke-"+i+" Rp.  ");
            System.out.printf(locale, "%,.0f%n", saldo);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here                
        SaldoTabungan data = new SaldoTabungan();
        data.masukkanSaldo();
        data.hitungSaldo();
        data.tampilSaldo();
        System.out.println("Developed by : Ivan Faathirza");
    }
    
}
