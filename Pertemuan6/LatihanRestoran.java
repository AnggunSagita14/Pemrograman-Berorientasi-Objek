package Pertemuan6;

public class LatihanRestoran {
    public static void main(String[] args) {

        // Kode menu bisa diganti 1-5 sesuai pilihan
        int menuCode = 1;

        // Quantity bisa diganti sesuai jumlah pesanan
        int quantity = 2;

        String namaMenu = "";
        int harga = 0;
        int total;

        System.out.println("=== MENU RESTORAN ===");
        System.out.println("Kode Menu: " + menuCode);
        System.out.println("Jumlah: " + quantity);
        System.out.println();

        // Pakai switch karena pilihan menu sudah tetap (1-5)
        switch (menuCode) {

            case 1:
                namaMenu = "Nasi Goreng";
                harga = 15000;
                break;

            case 2:
                namaMenu = "Mie Ayam";
                harga = 12000;
                break;

            case 3:
                namaMenu = "Bakso";
                harga = 10000;
                break;

            case 4:
                namaMenu = "Soto Ayam";
                harga = 13000;
                break;

            case 5:
                namaMenu = "Es Teh";
                harga = 3000;
                break;

            default:
                System.out.println("Kode menu tidak valid! Pilih 1-5.");
                return; // langsung stop kalau salah input
        }

        // Hitung total harga
        total = harga * quantity;

        // Output detail pesanan
        System.out.println("Pesanan Anda:");
        System.out.println("Nama Menu   : " + namaMenu);
        System.out.println("Harga Satuan: Rp " + harga);
        System.out.println("Jumlah      : " + quantity);
        System.out.println("---");
        System.out.println("Total Bayar : Rp " + total);
    }
}

/*
NAMA: ANGGUN SAGITA
NIM: D1041241085
TANGGAL:  26/02/2026
 */