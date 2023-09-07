public class Demo {
    public static void main(String[] args) {
        Laptop lp = new Laptop();
        Mouse d = new Mouse();
        Microcontroll mc = new Microcontroll();
        Arduino a = new Arduino();
        NodeMCU n = new NodeMCU();

        System.out.println("========MICROCONTROLLER==========");
        mc.tambahMC("Arduino", "Biru", 70000);
        mc.cetakMC();
        System.out.println("Harga\t: " + mc.getHarga());
        System.out.println("=================================");
        a.tambahMC("Arduino", "Biru", 70000);
        a.setTipe("UNO R3");
        a.printA();
        System.out.println("Harga\t: " + mc.getHarga());
        System.out.println("=================================");
        n.tambahMC("NodeMCU", "Hitam", 50000);
        n.setVersi("1.0");
        n.printN();
        System.out.println("Harga\t: " + n.getHarga());

        System.out.println();
        System.out.println("=============LAPTOP==============");
        lp.tambahLaptop("ACER", "SWIFT", "SILVER", "Ryzen 7 5800U", 16, 512);
        lp.tampilL();
        lp.tambahStorage(512);
        lp.tampilL();

        System.out.println();
        System.out.println("=============MOUSE===============");
        d.tambahMouse("razer", "putih", "wired", "PAW3328");
        d.tampilM();
        System.out.println("Sensor\t: " + d.getSensor());
    }
}
