
package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class Latihan2 {
    public static void main(String[]args){
        File berkas = new File("data.txt");
        try {
            if (berkas.createNewFile()){
                System.out.println("berkas baru dibuat.");
            } else {
                System.out.println("berkas sudah ada sebelumnya.");
            }
        } catch (IOException e){
            System.out.println("terjadi kesalahan   : " + e.getMessage());
        }
             System.out.println("");

        // Latihan 2
        File arsip = new File("arsip");
        boolean berhasil = arsip.mkdir();
        if (berhasil) {
            System.out.println("Folder 'arsip' berhasil dibuat.");
        } else {
            if (arsip.exists()) {
                System.out.println("Folder 'arsip' sudah ada sebelumnya."); // lebih jelas
            } else {
                System.out.println("Folder 'arsip' gagal dibuat.");
            }
        }
        System.out.println("");
        
        // Latihan 3
        File sementara = new File("sementara.txt");
        try {
            sementara.createNewFile();
            System.out.println("Sebelum dihapus, ada? " + sementara.exists());
            sementara.delete();
            System.out.println("Sesudah dihapus, ada? " + sementara.exists());
        } catch (IOException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
    
}
