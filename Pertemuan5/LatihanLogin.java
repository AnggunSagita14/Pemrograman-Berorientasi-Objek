package Pertemuan5;

public class LatihanLogin {
    public static void main(String[] args) {

        // Data login yang dianggap benar
        String usernameBenar = "admin";
        String passwordBenar = "12345";

        // Input yang akan divalidasi 
        String inputUsername = "admin";
        String inputPassword = "12345";

        System.out.println("=== VALIDASI LOGIN ===");
        System.out.println("Username: " + inputUsername);
        System.out.println("Password: ****");
        System.out.println("----------------------");

        // Cek username dulu
        if (inputUsername.equals(usernameBenar)) {
            System.out.println("Username valid");

            // Kalau username benar, lanjut cek password
            if (inputPassword.equals(passwordBenar)) {
                System.out.println("Password benar");
                System.out.println("LOGIN BERHASIL!");
                System.out.println("Selamat datang, " + inputUsername);
            } else {
                System.out.println("Password salah");
                System.out.println("LOGIN GAGAL!");
            }

        } else {
            System.out.println("Username tidak ditemukan");
            System.out.println("LOGIN GAGAL!");
        }
    }
}

/*
NAMA: ANGGUN SAGITA
NIM: D1041241085
TANGGAL:  26/02/2026
 */