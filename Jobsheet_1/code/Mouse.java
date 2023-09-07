public class Mouse {
    private String merk;
    private String warna;
    private String koneksi;
    private String sensor;

    public void tambahMouse(String m, String w, String k, String s) {
        merk = m;
        warna = w;
        koneksi = k;
        sensor = s;
    }

    public void tampilM() {
        System.out.println("Merk\t: " + merk + "\nWarna\t: " + warna + "\nKoneksi\t: " + koneksi);
    }

    public String getSensor() {
        return sensor;
    }
}
