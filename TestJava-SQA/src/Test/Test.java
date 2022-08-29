package Test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
        
        int jam, menit, detik, konversi;
        
        System.out.print("Masukan jumlah detik : ");
        konversi = input.nextInt();
        
        jam     = konversi/3600;
        menit   = (konversi%3600)/60;
        detik   = (konversi%3600)%60;
        
        System.out.println(konversi+" detik sama dengan "+menit+" menit "+detik+" detik");
	}
}
