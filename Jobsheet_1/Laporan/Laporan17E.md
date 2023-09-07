# **Nama : Lukman Eka Septiawan**
# **Kelas : 2E**
# **Mata Kuliah : Object Oriented Programming**

# **Percobaan 1**
```java
class sepeda
public class Sepeda {
    private String merek;
    private int kecepatan;
    private int gear;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void gantiGear(int newValue) {
        gear = newValue;
    }

    public void tambahKecepatan(int increment) {
        kecepatan = kecepatan + increment;
    }

    public void rem(int decrement) {
        kecepatan = kecepatan - decrement;
    }

    public void cetakStatus() {
        System.out.println("Merek: " + merek);
        System.out.println("kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
    }
}
```
# **class sepedaDemo**
```java
public class SepedaDemo {
    public static void main(String[] args) {
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();

        spd1.setMerek("Polygon");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();

        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();
    }
}
```

# **hasil**
<img src="gambar\image-1.png">

# **Percobaan 2**
# **class sepedaGunung**
```java
public class SepedaGunung extends Sepeda {
    private String tipeSuspensi;

    public void setTipeSuspensi(String newValue) {
        tipeSuspensi = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tipe suspensi: " + tipeSuspensi);
    }
}
```
# **class sepedaDemo**
```java
public class SepedaDemo {
    public static void main(String[] args) {
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();

        spd1.setMerek("Polygon");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();

        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();

        spd3.setMerek("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Gas Suspension");
        spd3.cetakStatus();
    }
}
```
# **hasil**
<img src="gambar\image-2.png">

# **Pertanyaan**
1. Jelaskan perbedaan antara objek dengan class!
Jawaban : Objek adalah rangkaian dalam program yang terdiri dari state dan behaviour. Sedangkan class adalah blueprint atau prototype dari objek atau bisa diartikan sebagai kerangka dari objek.

2. Jelaskan alasan warna dan tipe mesin dapat menjadi atribut dari objek mobil!
Jawaban : Karena warna dan tipe mesin dapat membedakan mobil satu dengan mobil yang lain dan setiap warna dan tipe mesin mobil tidak hanya dipasang pada satu mobil saja.

3. Sebutkan salah satu kelebihan utama dari pemrograman berorientasi objek dibandingkan dengan pemrograman struktural!
Jawaban : Program akan lebih fleksibel jika ada perubahan fitur, berbeda dengan pemrograman struktural menggunakan fungsi.

4. Apakah diperbolehkan melakukan pendefinisian dua buah atribut dalam satu baris kode seperti “public String nama,alamat;”?
Jawaban : Pendefinisian dua buah atribut dalam satu baris kode diperbolehkan.

5. Pada class SepedaGunung, jelaskan alasan atribut merk, kecepatan, dan gear tidak lagi ditulis di dalam class tersebut! 
Jawaban : Karena merek, kecepatan, dan gear sudah terdapat pada class Sepeda dan pada fungsi cetakStatus yang ada pada class SepedaGunung juga dilakukan pemanggilan cetakStatus yang ada pada class Sepeda.


# **Tugas**

# **class Demo**
```java
```
# **class Mouse**
```java
```
# **class Laptop**
```java
```
# **class Microcontroll**
```java
```
# **class Arduino**
```java
```
# **class NodeMCU**
```java
```
# **hasil**

<img src="gambar/hp">

Tugas Tambahan

class PengunjungMain 
import java.util.Scanner;

public class PengunjungMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, pilih;
        BukuPengunjung pg = new BukuPengunjung();

        do {
            System.out.println();
            System.out.println("===========================================");
            System.out.println("|                  MENU                   |");
            System.out.println("===========================================");
            System.out.println("| 1. Masukkan data pengunjung             |");
            System.out.println("| 2. Lihat data pengunjung                |");
            System.out.println("| 3. Hentikan program                     |");
            System.out.println("===========================================");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            System.out.println();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Pengunjung");
                    System.out.print("Nama: ");
                    pg.nama[i] = sc.next();
                    System.out.print("Alamat: ");
                    pg.alamat[i] = sc.next();
                    System.out.print("No HP: ");
                    pg.noHP[i] = sc.next();
                    i++;
                    break;

                case 2:
                    System.out.println();
                    System.out.println("=======================");
                    System.out.println("|   List Pengunjung   |");
                    System.out.println("=======================");
                    pg.tampilPengunjung();
                    break;
                case 3:
                    System.exit(0);
            }
            if (pilih > 3) {
                System.out.println("MAAF MENU BELUM TERSEDIA");
            }
        } while (pilih > 0);
        sc.close();
    }
}

class BukuPengunjung
public class BukuPengunjung {
    public String[] nama = new String[5];
    public String[] alamat = new String[5];
    public String[] noHP = new String[5];

    public void tampilPengunjung() {
        for (int i = 0; i < 5; i++) {
            if (nama[i] == null) {
                break;
            }
            System.out.println("|Nama\t: " + nama[i]);
            System.out.println("|Alamat\t: " + alamat[i]);
            System.out.println("|No HP\t: " + noHP[i]);
            System.out.println("=======================");
        }
    }
}

hasil
![Alt text](image-3.png)