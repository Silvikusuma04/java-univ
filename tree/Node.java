package tree;
// Deklarasi kelas Node
public class Node {
    // Atribut private value untuk menyimpan nilai dari node
    private int value;
    // Atribut public leftChild dan rightChild untuk menyimpan referensi ke node anak kiri dan kanan
    public Node leftChild;
    public Node rightChild;

    // Konstruktor Node, menerima parameter value untuk inisialisasi nilai node
    public Node(int value) {
        this.value = value;
    }

    // Metode getValue() untuk mendapatkan nilai dari node
    public int getValue() {
        return value;
    }
}
