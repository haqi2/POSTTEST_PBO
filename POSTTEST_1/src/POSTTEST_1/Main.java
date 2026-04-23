package POSTTEST_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String menuPilihRank(Scanner input) {
        String[] daftarRank = {"Bronze", "Silver", "Gold", "Platinum", "Diamond", "Crown", "Ace", "Conqueror"};

        System.out.println("--- PILIH RANK ---");
        for (int i = 0; i < daftarRank.length; i++) {
            System.out.println((i + 1) + ". " + daftarRank[i]);
        }

        int pilihanRank;
        while (true) {
            System.out.print("Pilih nomor rank (1-8): ");
            pilihanRank = input.nextInt();
            input.nextLine();

            if (pilihanRank >= 1 && pilihanRank <= 8) {
                return daftarRank[pilihanRank - 1];
            } else {
                System.out.println("[!] Pilihan tidak valid, silakan pilih 1-8.");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<AkunPUBGM> listAkun = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=========================================================");
            System.out.println("       WONBEE STORE - PUBGM STORE TERPERCAYA IZINNN !     ");
            System.out.println("=========================================================");
            System.out.println("1. [Create] Tambah Akun");
            System.out.println("2. [Read]   Lihat Daftar Akun");
            System.out.println("3. [Update] Edit Data Akun");
            System.out.println("4. [Delete] Hapus Akun");
            System.out.println("5. [Exit]   Keluar Program");
            System.out.print("Pilih Menu (1-5): ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- INPUT DATA AKUN BARU ---");
                    System.out.print("Nickname      : "); String nick = input.nextLine();
                    System.out.print("Level         : "); int lvl = input.nextInt();
                    input.nextLine();
                    String rnk = menuPilihRank(input);
                    System.out.print("Harga (Rp)    : "); double hrg = input.nextDouble();

                    listAkun.add(new AkunPUBGM(nick, lvl, rnk, hrg));
                    System.out.println("=> Berhasil disimpan!");
                    break;

                case 2:
                    if (listAkun.isEmpty()) {
                        System.out.println("\n[!] Belum ada data akun di database.");
                    } else {
                        System.out.println("\n--- DAFTAR AKUN WONBEE STORE ---");
                        for (int i = 0; i < listAkun.size(); i++) {
                            System.out.print("No. " + (i + 1) + " ");
                            listAkun.get(i).tampilkanInfo();
                        }
                    }
                    break;

                case 3:
                    if (listAkun.isEmpty()) {
                        System.out.println("\n[!] Tidak ada data untuk diubah.");
                    } else {
                        System.out.print("Masukkan nomor akun yang akan diubah: ");
                        int idxU = input.nextInt() - 1;
                        input.nextLine();
                        if (idxU >= 0 && idxU < listAkun.size()) {
                            System.out.println("--- MASUKKAN DATA BARU ---");
                            System.out.print("Nick Baru  : "); String nN = input.nextLine();
                            System.out.print("Level Baru : "); int nL = input.nextInt();
                            input.nextLine();
                            String nR = menuPilihRank(input);
                            System.out.print("Harga Baru : "); double nH = input.nextDouble();

                            listAkun.set(idxU, new AkunPUBGM(nN, nL, nR, nH));
                            System.out.println("=> Data berhasil diperbarui!");
                        } else {
                            System.out.println("=> Akun tidak ditemukan!");
                        }
                    }
                    break;

                case 4:
                    if (listAkun.isEmpty()) {
                        System.out.println("\n[!] Tidak ada data untuk dihapus.");
                    } else {
                        System.out.print("Masukkan nomor urut yang akan dihapus: ");
                        int idxH = input.nextInt() - 1;
                        if (idxH >= 0 && idxH < listAkun.size()) {
                            listAkun.remove(idxH);
                            System.out.println("=> Data berhasil dihapus!");
                        } else {
                            System.out.println("=> Nomor urut tidak valid!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Sampai jumpa di Wonbee Store, DI lain waktu!");
                    break;

                default:
                    System.out.println("Pilihan salah, coba lagi.");
            }
        } while (pilihan != 5);
    }
}