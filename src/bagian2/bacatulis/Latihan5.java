        
package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Latihan5 {
    public static void main(String[]args){
        //parameter true berarti menambah(append) bukan menimpa
        try (PrintWriter penulis = new PrintWriter(new FileWriter("mahasiswa.txt"))){
            penulis.println("dewi");
            penulis.println("eka");
            System.out.println("dua nama baru ditambahkan tanpa menghapus data lama");
        } catch (IOException e){
            System.out.println("gagal menambah data     :" +e.getMessage());
        }
        
        System.out.println("Ini Latihan Mandiri 1 :");
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {
            for (String h : hari) {
                penulis.println(h);
            }
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
        System.out.println("");

        // Latihan Mandiri No. 2 (Append/menambahkan 2 nama hari, lalu menamampilkan semua hari)
        System.out.println("Ini Latihan Mandiri 2 :");
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");
        } catch (IOException e) {
            System.out.println("Gagal menambah: " + e.getMessage());
        }

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
        System.out.println("");

        // Latihan Mandiri No. 3 (Hitung jumlah baris)
        System.out.println("Ini Latihan Mandiri 3 :");
        int jumlah = 0;
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            while (pembaca.readLine() != null) {
                jumlah++;
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
        System.out.println("Jumlah baris: " + jumlah);
    
    }
    
}
