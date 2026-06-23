
package bagian3.kontak;


public class Kontak {
    //atribut: data yang dimiliki setiap kontak
    private String nama;
    private String nomor;
    
    //construktor : dipanggil saat objek dibuat
    public Kontak(String nama, String nomor){
        this.nama = nama;
        this.nomor = nomor;
    }
    //getter: cara membaca atribut dari kluar class
    public String getNama(){
        return nama;
    }
    
    public String getNomor(){
        return nomor;
    }
    
    //mengubah objek menjadi satu baris teks untuk disimpan ke berkas
    public String keBaris(){
        return nama + ";" + nomor;
        
    }
    
    //mengembalikan keterangan kontak dalam bentuk teks
    public String info(){
        return nama + "-"+nomor;
    }
    
}
