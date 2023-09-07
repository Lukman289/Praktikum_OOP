public class Laptop {
    private String merk;
    private String tipe;
    private String warna;
    private String cpu;
    private int ram;
    private int storage;

    public void tambahLaptop(String m, String t, String w, String pc, int r, int s) {
        merk = m;
        tipe = t;
        warna = w;
        cpu = pc;
        ram = r;
        storage = s;
    }

    public void tampilL() {
        System.out.println(
                "Merk: " + merk + "\nTipe: " + tipe + "\nWarna: " + warna + "\nCPU: " + cpu + "\nRAM: " + ram +
                        " GB\nStorage: " + storage + "GB");
    }

    public void tambahStorage(int tambah) {
        storage += tambah;
        System.out.println("Storage ditambah " + tambah + "GB");
        System.out.println("=================================");
    }

}
