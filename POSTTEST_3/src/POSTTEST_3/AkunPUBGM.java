package POSTTEST_3;

public class AkunPUBGM {
    private String nickname;
    protected int level;
    protected String rank;
    public double harga;

    public AkunPUBGM(String nickname, int level, String rank, double harga) {
        this.nickname = nickname;
        this.level = level;
        this.rank = rank;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.printf("| %-15s | %-6d | %-12s | Rp %-12.0f |",
                nickname, level, rank, harga);
    }

    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }
    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }
    public String getRank() { return rank; }
    public void setRank(String rank) { this.rank = rank; }
    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }
}