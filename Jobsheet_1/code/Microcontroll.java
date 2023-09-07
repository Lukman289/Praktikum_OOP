public class Microcontroll {
    private String merk;
    private String warna;
    private int harga;

    public void tambahMC(String merk, String warna, int harga) {
        this.merk = merk;
        this.warna = warna;
        this.harga = harga;
    }

    public void cetakMC() {
        System.out.println("Merk\t: " + merk + "\nWarna\t: " + warna);
    }

    public int getHarga() {
        return harga;
    }
}
