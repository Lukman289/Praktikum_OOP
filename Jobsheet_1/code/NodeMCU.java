public class NodeMCU extends Microcontroll {
    private String versi;

    public void setVersi(String versi) {
        this.versi = versi;
    }

    public void printN() {
        super.cetakMC();
        System.out.println("Versi\t: V." + versi);
    }
}
