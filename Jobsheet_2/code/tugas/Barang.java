package tugas;

public class Barang {
    private String kode;
    private String namaBarang;
    private int hargaDasar;
    private float diskon;

    public void setBarang(String kode, String barang, int harga, float diskon) {
        this.kode = kode;
        this.namaBarang = barang;
        this.hargaDasar = harga;
        this.diskon = diskon;
    }

    public int hitungHargaJual() {
        return (int) (hargaDasar - ((diskon / 100) * hargaDasar));
    }

    public void tampilData() {
        System.out.println("==============================");
        System.out.println("|Kode\t\t: " + kode);
        System.out.println("|Nama Barang\t: " + namaBarang);
        System.out.println("|Harga Dasatr\t: " + hargaDasar);
        System.out.println("|Diskon\t\t: " + diskon + "%");
        System.out.println("|Harga Jual\t: " + hitungHargaJual());
        System.out.println("==============================");
    }
}
