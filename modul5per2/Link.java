package modul5per2;
public class Link {
    private int nim; // Menyimpan NIM (Nomor Induk Mahasiswa) dari elemen.
    private String nama; // Menyimpan nama dari elemen.
    public Link next; // Merupakan referensi ke elemen berikutnya dalam antrian.

    public Link(int nim, String nama) {
        this.nim = nim;
        this.nama = nama; // Membuat elemen baru dengan NIM dan nama yang diberikan.
    }

    public void displayLink() {
        System.out.println(nim + " " + nama); // Menampilkan NIM dan nama dari elemen.
    }

    public String getNama() {
        return nama; // Mengembalikan nama dari elemen.
    }
}
