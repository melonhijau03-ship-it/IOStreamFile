
package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
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
    }
    
}
