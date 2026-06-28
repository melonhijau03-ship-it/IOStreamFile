//Muhammad Adil Dermawan
//2410010508

package tugas;

public class MainTugas {

    public static void main(String[] args) {

        String[] kategori = { "Sembako", "Elektronik", "Alat Tulis", "Minuman" };

        System.out.println("=== Daftar Kategori Barang ===");
        for (String k : kategori) {
            System.out.println("- " + k);
        }

        Gudang gudang = new Gudang();

        gudang.tambahBarang(new Barang("Beras 5kg", 65000.0, 20));
        gudang.tambahBarang(new Barang("Minyak Goreng 1L", 18000.0, 35));
        gudang.tambahBarang(new Barang("Buku Tulis", 4500.0, 100));
        gudang.tambahBarang(new Barang("Pulpen", 2500.0, 150));
        gudang.tambahBarang(new Barang("Air Mineral 600ml", 3000.0, 200));

        System.out.println("\n=== Data Barang di Gudang (Sebelum Disimpan) ===");
        gudang.tampilkanSemua();

        System.out.printf("Total nilai persediaan: Rp%.2f%n", gudang.totalNilai());


        String namaBerkas = "barang.txt";
        System.out.println("\n=== Menyimpan Data ke Berkas ===");
        gudang.simpanKeBerkas(namaBerkas);

        System.out.println("\n=== Memuat Ulang Data dari Berkas (Gudang Baru) ===");
        Gudang gudangBaru = new Gudang();
        gudangBaru.muatDariBerkas(namaBerkas);

        System.out.println("\n=== Data Barang Hasil Muat dari Berkas ===");
        gudangBaru.tampilkanSemua();

        System.out.printf("Total nilai persediaan (dari berkas): Rp%.2f%n",
                gudangBaru.totalNilai());
    }
}
