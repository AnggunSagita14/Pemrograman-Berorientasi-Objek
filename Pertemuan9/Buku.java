package Pertemuan9;

class Buku {
     // atribut / variabel untuk menyimpan data buku
    private String judul;      
    private String pengarang;  
    private int harga;         

    // method untuk menampilkan informasi buku ke layar
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul     : " + judul);          
        System.out.println("Pengarang : " + pengarang);  
        System.out.println("Harga     : Rp " + harga);       
        System.out.println(); 
    }

    public static void main(String[] args) {

        // membuat object buku pertama
        Buku buku1 = new Buku();

        // mengisi nilai atribut untuk buku pertama
        buku1.judul = "Pemrograman Java";
        buku1.pengarang = "Budi Raharjo";
        buku1.harga = 125000;

        // membuat object buku kedua
        Buku buku2 = new Buku();

        // mengisi nilai atribut untuk buku kedua
        buku2.judul = "Algoritma dan Struktur Data";
        buku2.pengarang = "Rinaldi Munir";
        buku2.harga = 150000;

        // memanggil method tampilkanInfo() untuk menampilkan data buku
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
    }
}

/*
NAMA: ANGGUN SAGITA
NIM: D1041241085
TANGGAL: 07/03/2025
 */