
package bagian3.kontak;


public class Kontak {
    // Atribut: data yang dimiliki setiap kontak
    private String nama;
    private String nomor;
    private String email; // Latihan Mandiri No. 2 - tambah atribut email

    // Constructor: dipanggil saat objek dibuat
    public Kontak(String nama, String nomor, String email) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email;
    }

    // Getter: cara membaca atribut dari luar class
    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    // Latihan Mandiri No. 2 - getter email
    public String getEmail() {
        return email;
    }

    // Mengubah objek menjadi satu baris teks untuk disimpan ke berkas
    // Latihan Mandiri No. 2 - disesuaikan jadi 3 bagian
    public String keBaris() {
        return nama + ";" + nomor + ";" + email;
    }

    // Mengembalikan keterangan kontak dalam bentuk teks
    // Latihan Mandiri No. 2 - disesuaikan tampilkan email juga
    public String info() {
        return nama + " - " + nomor + " - " + email;
    }
}
