import java.util.Scanner;

public class Mahasiswa {
    //Disini kita mendeklarasikan variable
    public static String nama, nim, jurusan;

    public static String universitas() {
        return "Universitas Muhammadiyah Malang";
    }

    public static void inputdata() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        nama = input.nextLine();

        System.out.print("Masukkan Nim Anda : ");
        nim = input.nextLine();

        System.out.print("Masukkan Jurusan Anda : ");
        jurusan = input.nextLine();

        if (nim.length() >= 15) {
            System.out.print("Selamat, data berhasil ditambahkan");

        } else {
            System.out.println("NIMNYA HARUS 15 ABANGKUUUU !!!!");
        }
        // System.out.println("Masukkan Jurusan");
        // jurusan = input.nextLine();
    }

    public static String dataMahasiswa() {
        return "Nama : " + nama + "\n NIM : " + nim + "\njurusan : " + jurusan;

    }
}











