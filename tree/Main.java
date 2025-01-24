package tree;
public class Main {
    // Metode utama main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek BinaryTree baru
        BinaryTree bt = new BinaryTree();

        // Menambahkan beberapa node ke dalam pohon
        bt.addNode(new Node(5));
        bt.addNode(new Node(4));
        bt.addNode(new Node(6));
        bt.addNode(new Node(7));
        bt.addNode(new Node(3));

        // Menampilkan hasil pencarian nilai 3 dalam pohon
        System.out.print("Hasil Pencarian: ");
        System.out.println(BinaryTree.searchValue(bt.root, 3));

        // Menampilkan hasil pencarian nilai 2 dalam pohon
        System.out.print("Hasil Pencarian: ");
        System.out.println(BinaryTree.searchValue(bt.root, 2));
    }
}

