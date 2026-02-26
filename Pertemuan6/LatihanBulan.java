package Pertemuan6;

public class LatihanBulan {
    public static void main(String[] args) {

        // Variabel month ini bisa diganti-ganti nilainya (1 - 12)
        int month = 5;

        System.out.println("=== KONVERSI BULAN ===");
        System.out.println("Angka Bulan: " + month);

        // pakai switch buat ngecek angka bulan
        switch (month) {
            case 1:
                System.out.println("Nama Bulan: Januari");
                break;
            case 2:
                System.out.println("Nama Bulan: Februari");
                break;
            case 3:
                System.out.println("Nama Bulan: Maret");
                break;
            case 4:
                System.out.println("Nama Bulan: April");
                break;
            case 5:
                System.out.println("Nama Bulan: Mei");
                break;
            case 6:
                System.out.println("Nama Bulan: Juni");
                break;
            case 7:
                System.out.println("Nama Bulan: Juli");
                break;
            case 8:
                System.out.println("Nama Bulan: Agustus");
                break;
            case 9:
                System.out.println("Nama Bulan: September");
                break;
            case 10:
                System.out.println("Nama Bulan: Oktober");
                break;
            case 11:
                System.out.println("Nama Bulan: November");
                break;
            case 12:
                System.out.println("Nama Bulan: Desember");
                break;

            // Default ini penting buat validasi
            // Kalau angka di luar 1-12, langsung dikasih pesan error
            default:
                System.out.println("Error: Angka bulan tidak valid (1-12)");
        }
    }
}

/*
NAMA: ANGGUN SAGITA
NIM: D1041241085
TANGGAL:  26/02/2026
 */