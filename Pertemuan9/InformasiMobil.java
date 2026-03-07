package Pertemuan9;

class Mobil {
    // atribut mobil sesuai dengan yang ada di UML
    private String merk;     
    private String warna;    
    private int tahun;       
    private int kecepatan;   

    // constructor digunakan untuk mengisi nilai awal atribut mobil
    public Mobil(String merk, String warna, int tahun) {
        this.merk = merk;     
        this.warna = warna;   
        this.tahun = tahun;   
        this.kecepatan = 0;   
    }

    // method untuk menampilkan spesifikasi mobil
    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);    
        System.out.println("Warna: " + warna);   
        System.out.println("Tahun: " + tahun);   
    }

    // method untuk menambah kecepatan mobil
    public void percepat() {
        kecepatan += 20; // setiap dipanggil kecepatan bertambah 20 km/jam
        System.out.println("Mobil dipercepat...");
    }

    // method untuk menampilkan kecepatan mobil saat ini
    public void tampilkanKecepatan() {
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
    }
}

// class utama untuk menjalankan program
public class InformasiMobil {

    public static void main(String[] args) {

        
        Mobil mobil1 = new Mobil("Toyota Avanza", "Silver", 2020);

        // memanggil method untuk menampilkan spesifikasi mobil
        mobil1.tampilkanSpesifikasi();

        // memanggil method percepat dua kali
        mobil1.percepat();
        mobil1.percepat();

        // menampilkan kecepatan mobil setelah dipercepat
        mobil1.tampilkanKecepatan();
    }
}

/*
NAMA: ANGGUN SAGITA
NIM: D1041241085
TANGGAL: 07/03/2025
 */