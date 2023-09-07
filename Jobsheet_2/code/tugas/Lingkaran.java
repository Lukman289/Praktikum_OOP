package tugas;

public class Lingkaran {
    private double phi = 3.14;
    private double r;

    public void setR(double r) {
        this.r = r;
    }

    public double hitungLuas() {
        return phi * Math.pow(r, 2);
    }

    public double hitungKeliling() {
        return 2 * phi * r;
    }
}
