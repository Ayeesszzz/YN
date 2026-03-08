public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double waktu;    

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(double kmh) {
        kecepatan = rubahKecepatan(kmh);
    }

    private double rubahKecepatan(double kmh) {
        return kmh / 3.6;
    }

    public void setWaktu(double jam) {
        waktu = rubahSekon(jam);
    }

    private double rubahSekon(double jam) {
        return jam * 3600;
    }

    public double hitungJarak() {
        return kecepatan * waktu;
    }

    public void displayMessage() {
        double jarakKM = hitungJarak() / 1000;

        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("Mempunyai nomor plat " + noPlat);
        System.out.println("Serta memiliki warna " + warna);
        System.out.println("Kecepatan (m/s): " + kecepatan);
        System.out.println("Waktu tempuh (sekon): " + waktu);
        System.out.println("Jarak yang dapat ditempuh: " + jarakKM + " km");
    }
}