package modul5per2;

public class IlkomUniwaraAlgosdQueueLL {
    public static void main(String[] args) {
        Queue queue = new Queue(); // Membuat objek antrian.

        // Menambahkan elemen ke dalam antrian.
        queue.insert(1665100, "Dee");
        queue.insert(1665200, "Deaja");
        queue.display(); // Menampilkan elemen dalam antrian.

        queue.insert(1665300, "Ami");
        queue.insert(1665400, "Haya");
        queue.insert(1665500, "Yati");
        queue.display(); // Menampilkan elemen dalam antrian.

        // Menghapus dua elemen pertama dari antrian.
        queue.remove();
        queue.remove();
        queue.display(); // Menampilkan elemen dalam antrian setelah penghapusan.
    }
}
