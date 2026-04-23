package POSTTEST_5;

public class AkunGacor extends AkunPUBGM {
    private int jumlahSkin;

    public AkunGacor(String nickname, int level, String rank, double harga, int jumlahSkin) {
        super(nickname, level, rank, harga);
        this.jumlahSkin = jumlahSkin;
    }

    @Override
    public void tampilkanInfo() {
        System.out.printf("| %-15s | %-6d | %-12s | Rp %-12.0f | %-10s |\n",
                getNickname(), level, rank, harga, jumlahSkin + " Skin");
    }

    public void setJumlahSkin(int jumlahSkin) { this.jumlahSkin = jumlahSkin; }
}