package POSTTEST_3;

public class AkunGacor extends AkunPUBGM {
    private int jumlahSkin;

    public AkunGacor(String nickname, int level, String rank, double harga, int jumlahSkin) {
        super(nickname, level, rank, harga); // Panggil constructor bapaknya
        this.jumlahSkin = jumlahSkin;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.printf(" %-10s |\n", jumlahSkin + " Skin");
    }

    public int getJumlahSkin() { return jumlahSkin; }
    public void setJumlahSkin(int jumlahSkin) { this.jumlahSkin = jumlahSkin; }
}