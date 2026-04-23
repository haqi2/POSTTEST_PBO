package POSTTEST_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static String menuPilihRank(Scanner input) {
    String[] daftarRank = {"Bronze", "Silver", "Gold", "Platinum", "Diamond", "Crown", "Ace", "Conqueror"};
    System.out.println("\n--- PILIH RANK ---");
    for (int i = 0; i < daftarRank.length; i++) {
      System.out.println((i + 1) + ". " + daftarRank[i]);
    }
    int pilihanRank;
    while (true) {
      System.out.print("Pilih nomor rank (1-8): ");
      pilihanRank = input.nextInt(); input.nextLine();
      if (pilihanRank >= 1 && pilihanRank <= 8) return daftarRank[pilihanRank - 1];
      else System.out.println("[!] Pilihan tidak valid.");
    }
  }

  public static void main(String[] args) {
    ArrayList<AkunPUBGM> listAkun = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int pilihan;

    do {
      System.out.println("\n================================================");
      System.out.println("                WONBEE STORE                     ");
      System.out.println("=================================================");
      System.out.println("1. Tambah Akun");
      System.out.println("2. Lihat Daftar Akun");
      System.out.println("3. Edit Data Akun");
      System.out.println("4. Hapus Akun");
      System.out.println("5. Keluar");
      System.out.print("Pilih Menu: ");
      pilihan = input.nextInt(); input.nextLine();

      switch (pilihan) {
        case 1:
          System.out.println("\n1. Akun Gacor | 2. Akun Smurf");
          int tipe = input.nextInt(); input.nextLine();
          System.out.print("Nickname: "); String nick = input.nextLine();
          System.out.print("Level: "); int lvl = input.nextInt(); input.nextLine();
          String rnk = menuPilihRank(input);
          System.out.print("Harga: "); double hrg = input.nextDouble();

          if (tipe == 1) {
            System.out.print("Jumlah Skin: ");
            listAkun.add(new AkunGacor(nick, lvl, rnk, hrg, input.nextInt()));
          } else {
            System.out.print("Winrate (%): ");
            listAkun.add(new AkunSmurf(nick, lvl, rnk, hrg, input.nextDouble()));
          }
          break;

        case 2:
          if (listAkun.isEmpty()) System.out.println("\n[!] Data kosong.");
          else {
            System.out.println("-".repeat(85));
            System.out.printf("| %-3s | %-15s | %-6s | %-12s | %-15s | %-10s |\n",
                    "No", "Nickname", "Level", "Rank", "Harga", "Spek");
            System.out.println("-".repeat(85));
            for (int i = 0; i < listAkun.size(); i++) {
              System.out.printf("| %-3d ", (i + 1));
              listAkun.get(i).tampilkanInfo();
            }
            System.out.println("-".repeat(85));
          }
          break;

        case 3:
          System.out.print("Nomor akun: ");
          int idxU = input.nextInt() - 1; input.nextLine();
          if (idxU >= 0 && idxU < listAkun.size()) {
            AkunPUBGM a = listAkun.get(idxU);
            System.out.print("Nick Baru: "); a.setNickname(input.nextLine());
            System.out.println("Update Harga: 1. Nominal | 2. Diskon (%)");
            if (input.nextInt() == 1) {
              System.out.print("Harga Baru: "); a.setHarga(input.nextDouble());
            } else {
              System.out.print("Diskon (%): "); a.setHarga(input.nextInt());
            }
            if (a instanceof AkunGacor) {
              System.out.print("Skin Baru: "); ((AkunGacor) a).setJumlahSkin(input.nextInt());
            } else if (a instanceof AkunSmurf) {
              System.out.print("WR Baru: "); ((AkunSmurf) a).setWinRate(input.nextDouble());
            }
          }
          break;

        case 4:
          System.out.print("Hapus nomor: ");
          int idxH = input.nextInt() - 1;
          if (idxH >= 0 && idxH < listAkun.size()) listAkun.remove(idxH);
          break;
      }
    } while (pilihan != 5);
  }
}