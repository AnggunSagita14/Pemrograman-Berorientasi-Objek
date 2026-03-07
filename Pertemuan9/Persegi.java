package Pertemuan9;

public class Persegi {
    // atribut untuk menyimpan nilai sisi, luas, dan keliling
    int sisi;
    int luas;
    int keliling;

    // method untuk menghitung luas persegi (sisi × sisi)
    public void hitungLuas() {
        luas = sisi * sisi;
    }

    // method untuk menghitung keliling persegi (4 × sisi)
    public void hitungKeliling() {
        keliling = 4 * sisi;
    }

    // method untuk menampilkan hasil perhitungan ke layar
    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi    : " + sisi + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
    }

    // method utama untuk menjalankan program
    public static void main(String[] args) {

        
        Persegi p1 = new Persegi();

        
        p1.sisi = 5;

        // memanggil method untuk menghitung luas dan keliling
        p1.hitungLuas();
        p1.hitungKeliling();

        // menampilkan hasil perhitungan
        p1.tampilkanHasil();
    }
}

/*
NAMA: ANGGUN SAGITA
NIM: D1041241085
TANGGAL: 07/03/2025
 */