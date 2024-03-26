import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //deklarasi objek
        Mahasiswa student = new Mahasiswa();
        Scanner input = new Scanner(System.in);

        //inisialisasi value
        int pilihan = 0;
        while (pilihan != 3) {
            System.out.println(" 1. tambah data mahasiswaa");
            System.out.println(" 2. tampilkan nama mahasiswa");
            System.out.println(" 3. keluar");
            System.out.print("masukkan pilihan anda (1-3) : ");
            Scanner objInput = new Scanner(System.in);

            pilihan = objInput.nextInt();
            switch (pilihan){
                case 1:
                    Mahasiswa.inputdata();
                    break;
                case 2:
                    System.out.print("data mahasiswa UMM\n");
                    System.out.println(Mahasiswa.universitas());
                    System.out.println(Mahasiswa.dataMahasiswa());
                    break;
                case 3:
                    System.out.println("Berhasil Keluar Dari Program Abangkuuu !!!!");
                default:
                    break;

            }
        }
    }
}