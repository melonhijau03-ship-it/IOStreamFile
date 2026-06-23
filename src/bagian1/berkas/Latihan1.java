package bagian1.berkas;

import java.io.File;
import java.io.IOException;


public class Latihan1 {
    public static void main(String[]args) throws IOException{
        // objek file hanyalah penunjuk, belum tentu ada di disk
        File berkas = new File("catatan.txt");
        
        // membuat berkas baru bila belum ada
        if (berkas.createNewFile()){
            System.out.println("berkas dibuat   :" + berkas.getName() );
        }else {
            System.out.println("berkas sudah ada :" + berkas.getName());
        }
        
        //memeriksa informasi berkas
        System.out.println("apakah ada?     :" + berkas.exists());
        System.out.println("path absolut    :" + berkas.getAbsolutePath());
        System.out.println("ukuran (byte)   :" + berkas.length());
        System.out.println("dapat dibaca    :" + berkas.canRead());
    }
    
}