
package bagian3.kontak;


public class MainKontak {
    public static void main(String[]args){
        //membuat objek penelola dan mengisinya
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("andi","0811111"));
        buku.tambahKontak(new Kontak("budi","0822222"));
        buku.tambahKontak(new Kontak("citra","08333333"));
        
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        
        System.out.println();
        
        //objek baru yang kosong,kaky nenyar dariu berkas
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("jumlah kontak   :" + bukuLain.jumlahKontak());
    }
    
}
