import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mobil m1 = new Mobil();

        System.out.println("=== Input Data Mobil 1 ===");
        System.out.print("Masukkan Manufaktur: ");
        m1.setManufaktur(input.nextLine());

        System.out.print("Masukkan No Plat: ");
        m1.setNoPlat(input.nextLine());

        System.out.print("Masukkan Warna: ");
        m1.setWarna(input.nextLine());

        System.out.print("Masukkan Kecepatan (km/h): ");
        m1.setKecepatan(input.nextDouble());

        System.out.print("Masukkan Waktu tempuh (jam): ");
        m1.setWaktu(input.nextDouble());
        input.nextLine(); 

        System.out.println("\nData Mobil 1");
        m1.displayMessage();

        System.out.println("================");

        Mobil m2 = new Mobil();

        System.out.println("=== Input Data Mobil 2 ===");
        System.out.print("Masukkan Manufaktur: ");
        m2.setManufaktur(input.nextLine());

        System.out.print("Masukkan No Plat: ");
        m2.setNoPlat(input.nextLine());

        System.out.print("Masukkan Warna: ");
        m2.setWarna(input.nextLine());

        System.out.print("Masukkan Kecepatan (km/h): ");
        m2.setKecepatan(input.nextDouble());

        System.out.print("Masukkan Waktu tempuh (jam): ");
        m2.setWaktu(input.nextDouble());
        input.nextLine();

        System.out.println("\nData Mobil 2");
        m2.displayMessage();

        System.out.println("================");

        System.out.print("Ubah warna mobil 1 menjadi: ");
        String warnaBaru = input.nextLine();
        m1.setWarna(warnaBaru);

        System.out.println("\nData Mobil 1 Setelah Diubah");
        m1.displayMessage();

        input.close();
    }
}