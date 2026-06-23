
package bagian3.kontak;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BukuKontak {
    //ArrayList yang menampung objek bertipe kontak
    private ArrayList<Kontak> daftar = new ArrayList<>();
    private String namaBerkas;
    
    public BukuKontak(String namaBerkas){
        this.namaBerkas = namaBerkas;
        
    }
    //menambah kontak kekoleksi
    public void tambahKontak(Kontak Kontak){
        daftar.add(Kontak);
    }
    
    //menampilkan seluruh koleksi beserta nomor urut
    public void tampilkanSemua(){
        System.out.println("== Daftar Kontak ==");
        for (int i = 0; 1<daftar.size(); i++){
            Kontak k = daftar.get(i);
            System.out.println((i + 1) + "." + k.info());
        }
    }
    
    //menyembunyikan seluruh kontak ke berkas, satu kontak per baris
    
    public void simpanKeBerkas(){
        try(PrintWriter penulis = new PrintWriter(new FileWriter(namaBerkas))){
            for (Kontak k : daftar){
                penulis.println(k.keBaris());
            }
            System.out.println("Kontak di simpan ke     :" + namaBerkas);
        } catch(IOException e){
            System.out.println("Gagal menyimpan     :" + e.getMessage());
        }
    }
    
    //menambah kembali kontak dari berkas ke dalam arraylist
    public void muatDariBerkas(){
        daftar.clear();
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaBerkas))){
            String baris;
            while((baris = pembaca.readLine()) != null){
                String[] bagian = baris.split(";");
                if (bagian.length == 2){
                    daftar.add(new Kontak(bagian[0], bagian[1]));
                }
            }
            System.out.println("Kontak dimuat dari " + namaBerkas);
        }catch (IOException e){
            System.out.println("Gagal Memuat        :" + e.getMessage());
        }
    }
    
    public int jumlahKontak(){
        return daftar.size();
    }
}
