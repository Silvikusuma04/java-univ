package modul5;
public class stackLL {
    public static void main(String[] args) {
        Stack stack = new Stack(); // Membuat objek Stack.

        // Menambahkan elemen ke dalam tumpukan.
        stack.push("VCD");
        stack.push("TV");
        stack.display(); // Menampilkan elemen dalam tumpukan.

        stack.push("Kulkas");
        stack.push("PC");
        stack.push("Rice Cooker");
        stack.push("Dispenser");
        stack.display(); // Menampilkan elemen dalam tumpukan.

        // Menghapus dua elemen teratas dari tumpukan.
        stack.pop();
        stack.pop();
        stack.display(); // Menampilkan elemen dalam tumpukan setelah penghapusan.
    }
}
