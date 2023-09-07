package tugas;

public class Peminjaman {
    private int id;
    private String namaMember;
    private String namaGame;
    private int harga;
    private int hargaBayar;

    public void setData(int id, String member, String game, int harga, int lamaSewa) {
        this.id = id;
        this.namaMember = member;
        this.namaGame = game;
        this.harga = harga;
        this.hargaBayar = hitungHarga(harga, lamaSewa);
    }

    public int hitungHarga(int harga, int lamaSewa) {
        return lamaSewa * harga;
    }

    public void cetakData() {
        System.out.println("==============================");
        System.out.println("|Id\t\t: " + id);
        System.out.println("|Nama\t\t: " + namaMember);
        System.out.println("|Game\t\t: " + namaGame);
        System.out.println("|Harga\t\t: " + harga);
        System.out.println("==============================");
        System.out.println("|Harga Bayar\t: " + hargaBayar);
        System.out.println("==============================");
    }
}
