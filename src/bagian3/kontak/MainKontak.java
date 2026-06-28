
package bagian3.kontak;


public class MainKontak {
    public static void main(String[] args) {
        // Membuat objek pengelola dan mengisinya
        // Latihan Mandiri No. 2 constructor sekarang 3 parameter (nama, nomor, email)
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@email.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@email.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@email.com"));

        buku.tampilkanSemua();
        buku.simpanKeBerkas();

        System.out.println();

        // Objek baru yang kosong, lalu memuat dari berkas
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());

        System.out.println();

        // Latihan Mandiri No. 1 - uji cariKontak
        System.out.println("=== Uji Cari Kontak ===");
        bukuLain.cariKontak("Budi");
        bukuLain.cariKontak("Agus"); // tidak ada data nya

        System.out.println();

        // Latihan Mandiri No. 3 - uji hapusKontak
        System.out.println("=== Uji Hapus Kontak ===");
        bukuLain.hapusKontak("Andi");
        bukuLain.tampilkanSemua();
    }
}