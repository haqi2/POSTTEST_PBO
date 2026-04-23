package POSTTEST_1;

public class AkunPUBGM {
    String nickname;
    int level;
    String rank;
    double harga;

    public AkunPUBGM(String nickname, int level, String rank, double harga) {
        this.nickname = nickname;
        this.level = level;
        this.rank = rank;
        this.harga = harga;
    }

    void tampilkanInfo() {
        System.out.println("Nickname : " + this.nickname);
        System.out.println("Level    : " + this.level);
        System.out.println("Rank     : " + this.rank);
        System.out.println("Harga    : Rp" + this.harga);
        System.out.println("---------------------------");
    }
}