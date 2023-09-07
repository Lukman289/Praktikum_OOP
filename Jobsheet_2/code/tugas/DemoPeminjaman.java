public class DemoPeminjaman {
    public static void main(String[] args) {
        Peminjaman pj = new Peminjaman();

        pj.setData(101, "Lukman", "GTA 5", 25000, 4);
        pj.cetakData();
        pj.setData(102, "Sandy", "PES 2022", 30000, 2);
        pj.cetakData();
    }
}
