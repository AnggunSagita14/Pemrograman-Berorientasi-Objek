package Pertemuan9;

// Membuat class bernama ObjectAndClass
class ObjectAndClass {

    String merk;
    String warna;
    int tahun;
    int kecepatan;

    // Method untuk menambah kecepatan mobil
    public void percepat() {
        kecepatan += 10; // Setiap dipanggil, kecepatan bertambah 10 km/jam
        System.out.println("Kecepatan sekarang: " + kecepatan + " km/jam");
    }

    // Method untuk menampilkan informasi mobil
    public void tampilkanInfo() {
        System.out.println("Merk         : " + merk);
        System.out.println("Warna        : " + warna);
        System.out.println("Tahun        : " + tahun);
        System.out.println("Kecepatan    : " + kecepatan + " km/jam");
    }

    public static void main(String[] args) { // Method utama (program mulai dijalankan dari sini)

    // Membuat objek dari class ObjectAndClass
    ObjectAndClass mobil1 = new ObjectAndClass(); 

    // Mengisi nilai atribut pada objek mobil1
    mobil1.merk ="Jeep Rubicon";
    mobil1.warna = "Hitam";
    mobil1.tahun = 2023;
    mobil1.kecepatan = 0; // Kecepatan awal

    mobil1.tampilkanInfo(); // Menampilkan informasi awal mobil

    mobil1.percepat(); // Kecepatan bertambah 10

}

}

/* Nama: Anggun Sagita
Nim: D1041241085
Tanggal: 20/02/2026
 */