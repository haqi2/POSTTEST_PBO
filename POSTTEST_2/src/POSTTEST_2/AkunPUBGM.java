package POSTTEST_2;

public class AkunPUBGM {
    private String nickname;
    protected int level;
    String rank;
    public double harga;

    public AkunPUBGM(String nickname, int level, String rank, double harga) {
        this.nickname = nickname;
        this.level = level;
        this.rank = rank;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Nickname : " + this.getNickname());
        System.out.println("Level    : " + this.level);
        System.out.println("Rank     : " + this.rank);
        System.out.println("Harga    : Rp" + this.harga);
        System.out.println("---------------------------");
    }

    public String getNickname() {
        return nickname;
    }

    public int getLevel() {
        return level;
    }

    public String getRank() {
        return rank;
    }

    public double getHarga() {
        return harga;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}