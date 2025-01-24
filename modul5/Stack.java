package modul5;

public class Stack {
    public Link top; // Merupakan referensi ke elemen teratas tumpukan.
    private int id = 0; // Menyimpan ID elemen teratas (digunakan untuk memberikan ID unik pada setiap elemen).

    public Stack() {
        top = null; // Konstruktor inisialisasi tumpukan sebagai kosong.
    }

    public void push(String objek) {
        // Menambahkan elemen baru ke tumpukan.
        Link temp = new Link(++id, objek); // Membuat objek Link baru dengan ID yang bertambah dan nilai objek yang diberikan.
        temp.next = top; // Mengaitkan elemen baru ke elemen teratas yang sebelumnya.
        top = temp; // Menjadikan elemen baru sebagai elemen teratas tumpukan.
    }

    public boolean isEmpty() {
        // Memeriksa apakah tumpukan kosong.
        return (top == null);
    }

    public void pop() {
        // Menghapus elemen teratas dari tumpukan.
        if (top == null) {
            System.out.println("Tumpukan sudah kosong");
        } else {
            System.out.println(top.getObjek() + " dikeluarkan\n");
            this.top = top.next; // Menggeser elemen teratas ke elemen berikutnya.
            id--;
        }
    }

    public void display() {
        // Menampilkan isi tumpukan dari atas ke bawah.
        System.out.println("STACK (Top --> Bottom):");
        if (top == null) {
            System.out.println("Tidak ada data");
        } else {
            Link temp = top;
            while (temp != null) {
                temp.displayLink(); // Menampilkan data elemen tumpukan.
                temp = temp.next; // Pindah ke elemen berikutnya dalam tumpukan.
            }
            System.out.println("");
        }
    }
}
