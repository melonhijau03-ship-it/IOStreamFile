
package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Latihan3 {
    public static void main(String[]args){
        //try with recources : stream otomatis tutup setelah blok selesai
        try (PrintWriter penulis = new PrintWriter(new FileWriter("mahasiswa.txt"))){
            penulis.println("andi");
            penulis.println("budi");
            penulis.println("citra");
            System.out.println("data berhasil di tulis ke mahasiswa.txt");
        } catch (IOException e){
            System.out.println("Gagal menulis   :" + e.getMessage());
        }
    }
    
}
