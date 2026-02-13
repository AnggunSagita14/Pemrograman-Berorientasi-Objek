package Pertemuan3;

public class LatihPerhitungan {
    public static void main(String[] args) {
        int saldo = 1000000;
        int setoran = 500000;
        int penarikan = 250000;

        System.out.println("=== SIMULASI TRANSAKSI  BANK ===");
        System.out.println("Saldo awal             :" + saldo);
        saldo  += setoran; // menambahkan setoran ke saldo
        System.out.println("Setoran                :" + setoran);
        System.out.println("Saldo Setelah Setor    :" + saldo);

        saldo -= penarikan; // mengurangi saldo dengan penarikan
        System.out.println("Penarikan              :" + penarikan);
        System.out.println("Saldo Akhir            :" + saldo);


    }
}

/*
 NAMA    : ANGGUN SAGITA
 NIM     : D1041241085
 TANGGAL :  13/02/2026
 */