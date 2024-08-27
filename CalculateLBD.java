package Application;

import java.util.Scanner;

public class CalculateLBD {

    
    public void hitungLuasPersegi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi: ");
        double sisi = scanner.nextDouble();
        double luas = sisi * sisi;
        System.out.println("Luas persegi adalah: " + luas + " cm²");
    }

    
    public void hitungLuasPersegiPanjang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = scanner.nextDouble();
        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: " + luas + " cm²");
    }

    
    public void hitungLuasLingkaran() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();
        double luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas lingkaran adalah: " + luas + " cm²");
    }

    
    public void hitungLuasSegitiga() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan alas segitiga: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = scanner.nextDouble();
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga adalah: " + luas + " cm²");
    }

    
    public void hitungLuasJajarGenjang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan alas jajaran genjang: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi jajaran genjang: ");
        double tinggi = scanner.nextDouble();
        double luas = alas * tinggi;
        System.out.println("Luas jajaran genjang adalah: " + luas + " cm²");
    }

    
    public void tampilkanMenu() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("----Menghitung luas Menu Bangun Datar----");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.println("5. Jajar Genjang");
            System.out.println("6. Keluar");
            System.out.print("Pilih : ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    hitungLuasPersegi();
                    break;
                case 2:
                    hitungLuasPersegiPanjang();
                    break;
                case 3:
                    hitungLuasLingkaran();
                    break;
                case 4:
                    hitungLuasSegitiga();
                    break;
                case 5:
                    hitungLuasJajarGenjang();
                    break;
                case 6:
                    System.out.println("Terimakasih...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
            System.out.println();
        } while (pilihan != 6);
    }

    
    public static void main(String[] args) {
        CalculateLBD calculator = new CalculateLBD();
        calculator.tampilkanMenu();
    }
}
