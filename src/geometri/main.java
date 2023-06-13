package geometri;

public class main {
   public static void main(String[] args) {
        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(2.3);
        double luasLingkaran = lingkaran.luas();
        double kelilingLingkaran = lingkaran.keliling();

        System.out.println("Lingkaran:");
        System.out.println("Luas: " + luasLingkaran);
        System.out.println("Keliling: " + kelilingLingkaran);

        System.out.println();

        // Membuat objek PersegiPanjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(2.3, 2.3);
        double luasPersegiPanjang = persegiPanjang.luas();
        double kelilingPersegiPanjang = persegiPanjang.keliling();

        System.out.println("Persegi Panjang:");
        System.out.println("Luas: " + luasPersegiPanjang);
        System.out.println("Keliling: " + kelilingPersegiPanjang);
    }    
}
