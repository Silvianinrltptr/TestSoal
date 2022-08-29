package Test2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
        String nama;
        int premium = 6450;
        int pertalite = 7650;
        int pertamax = 9000;
        int total;
        int bayar;


        System.out.print("\nMasukkan jenis BBM yang ingin dibeli :");
        nama = input.next();
        if (nama.equalsIgnoreCase("premium")) {
            System.out.println("\nPremium");
            System.out.print("\nMasukkan jumlah liter:");
            total = input.nextInt();
            if (total <= 10) {
                bayar = total * premium;
                System.out.println("Jumlah yang harus dibayar : Rp."+bayar);
            }
            else {
                System.out.println("\nMaaf jumlah pembelian maksimal BBM Premium adalah 10 liter");
                bayar = total * premium;
                System.out.println("\nJumlah yang harus dibayar Rp."+bayar);
            }
        }
        if (nama.equalsIgnoreCase("pertalite")) {
            System.out.println("\nPertalite");
            System.out.print("\nMasukkan jumlah liter:");
            total = input.nextInt();
            bayar = total * pertalite;
            System.out.println("Jumlah yang harus dibayar : Rp."+bayar);
        }
        else if (nama.equalsIgnoreCase("pertamax")) {
            System.out.println("\nPertamax");
            System.out.print("\nMasukkan jumlah liter:");
            total = input.nextInt();
            bayar = total * pertamax;
            System.out.println("Jumlah yang harus dibayar : Rp."+bayar);
        }
	}
}
