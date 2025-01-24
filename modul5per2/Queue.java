package modul5per2;
public class Queue {
    public Link front, rear;

    public Queue() {
        front = rear = null; // Inisialisasi antrian kosong.
    }

    public void insert(int nim, String nama) {
        Link temp = new Link(nim, nama); // Membuat elemen baru.
        if (rear == null) {
            front = rear = temp; // Jika antrian kosong, elemen baru menjadi elemen pertama dan terakhir.
        }
        rear = rear.next = temp; // Mengaitkan elemen baru sebagai elemen terakhir.
    }

    public void remove() {
        Link temp = front;
        System.out.println(front.getNama() + " telah keluar dari antrian\n");
        front = front.next;

        if (front == null) {
            rear = null; // Jika elemen pertama dihapus, dan tidak ada elemen lain, maka antrian kosong.
        }
    }

    public void display() {
        System.out.println("List (Front --> Rear)");
        Link current = front;
        while (current != null) {
            current.displayLink(); // Menampilkan data elemen dalam antrian.
            current = current.next;
        }
        System.out.println("");
    }
}
