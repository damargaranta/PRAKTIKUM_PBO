import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Tabung tabung = new Tabung();
        Kubus kubus = new Kubus();
        Balok balok = new Balok();


        tabung.setName("Tabung");
        kubus.setName("Kubus");
        balok.setName("Balok");

        int choise = 0;
        while (choise != 3) {
            System.out.println("1.Tabung");
            System.out.println("2.Kubus");
            System.out.println("3.Balok");
            System.out.println("4.Exit");
            System.out.println("Masukan Pilihan Anda (1-4) : ");
            Scanner objInput = new Scanner(System.in);

            choise = objInput.nextInt();
            switch (choise){
                case 1:
                    balok.inputNilai();
                    balok.luasPermukaan();
                    balok.volume();
                    break;
                case 2:
                    kubus.inputNilai();
                    kubus.luasPermukaan();
                    kubus.volume();
                    break;
                case 3:
                    tabung.inputNilai();
                    tabung.luasPermukaan();
                    tabung.volume();
                    break;
                case 4:
                    System.out.println("Berhasil Keluar Dari Program");
                default:
                    System.out.println("Inpu Tidak Valid");
                    break;
            }
        }
    }
}
