public class Arduino extends Microcontroll {
    private String tipe;

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void printA() {
        super.cetakMC();
        System.out.println("Tipe\t: " + tipe);
    }
}
