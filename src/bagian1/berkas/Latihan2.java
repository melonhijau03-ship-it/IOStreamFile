
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
        
    }
    
}