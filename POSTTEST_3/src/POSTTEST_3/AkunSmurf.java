package POSTTEST_3;

public class AkunSmurf extends AkunPUBGM {
    private double winRate;

    public AkunSmurf(String nickname, int level, String rank, double harga, double winRate) {
        super(nickname, level, rank, harga);
        this.winRate = winRate;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.printf(" %-10s |\n", winRate + "% WR");
    }

    public double getWinRate() { return winRate; }
    public void setWinRate(double winRate) { this.winRate = winRate; }
}