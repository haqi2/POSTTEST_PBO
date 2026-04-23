package POSTTEST_5;

public abstract class AkunPUBGM {
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

    public abstract void tampilkanInfo();

    public void setHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }

    public void setHarga(int diskon) {
        this.harga = this.harga - (this.harga * diskon / 100);
    }

    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }
    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }
    public String getRank() { return rank; }
    public void setRank(String rank) { this.rank = rank; }
}