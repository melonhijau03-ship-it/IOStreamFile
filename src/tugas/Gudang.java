
package tugas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Gudang {

    // ----- Atribut -----
    private ArrayList<Barang> daftarBarang;

    // ----- Constructor -----
    public Gudang() {
        this.daftarBarang = new ArrayList<>();
    }


    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public void tampilkanSemua() {
        if (daftarBarang.isEmpty()) {
            System.out.println("(Belum ada data barang di gudang)");
            return;
        }
        for (Barang b : daftarBarang) {
            b.info();
        }
    }
    
    public void simpanKeBerkas(String namaBerkas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaBerkas))) {
            for (Barang b : daftarBarang) {
                writer.write(b.keBaris());
                writer.newLine();
            }
            System.out.println("Data berhasil disimpan ke berkas \"" + namaBerkas + "\"");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan berkas: " + e.getMessage());
        }
    }


    public void muatDariBerkas(String namaBerkas) {
        daftarBarang.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(namaBerkas))) {
            String baris;
            while ((baris = reader.readLine()) != null) {
                if (!baris.trim().isEmpty()) {
                    daftarBarang.add(Barang.dariBaris(baris));
                }
            }
            System.out.println("Data berhasil dimuat dari berkas \"" + namaBerkas + "\"");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat memuat berkas: " + e.getMessage());
        }
    }

    public double totalNilai() {
        double total = 0;
        for (Barang b : daftarBarang) {
            total += b.getHarga() * b.getStok();
        }
        return total;
    }

    public ArrayList<Barang> getDaftarBarang() {
        return daftarBarang;
    }
}