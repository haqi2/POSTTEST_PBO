package POSTTEST_5;

public class AkunSmurf extends AkunPUBGM {
    private double winRate;

    public AkunSmurf(String nickname, int level, String rank, double harga, double winRate) {
        super(nickname, level, rank, harga);
        this.winRate = winRate;
    }

    @Override
    public void tampilkanInfo() {
        System.out.printf("| %-15s | %-6d | %-12s | Rp %-12.0f | %-10s |\n",
                getNickname(), level, rank, harga, winRate + "% WR");
    }

    public void setWinRate(double winRate) { this.winRate = winRate; }
}