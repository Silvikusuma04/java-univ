package tree;
public class BinaryTree {
    // Atribut public root untuk menyimpan referensi ke akar pohon
    public Node root;

    // Metode addNode digunakan untuk menambahkan node baru ke dalam pohon
    public void addNode(Node node) {
        // Jika pohon kosong, maka node baru menjadi akar
        if (root == null) {
            root = node;
        } else {
            // Jika pohon tidak kosong, panggil metode insertNode untuk menambahkan node secara rekursif
            insertNode(root, node);
        }
    }
    // Metode insertNode digunakan untuk menyisipkan node ke dalam pohon secara rekursif
    private void insertNode(Node parent, Node node) {
        // Jika nilai parent lebih besar dari nilai node, sisipkan ke anak kiri
        if (parent.getValue() > node.getValue()) {
            // Jika anak kiri kosong, masukkan node sebagai anak kiri
            if (parent.leftChild == null) {
                parent.leftChild = node;
            } else 
            {
                // Jika anak kiri sudah terisi, panggil insertNode rekursif pada anak kiri
                insertNode(parent.leftChild, node);
            }
        } else {
            // Jika nilai parent lebih kecil atau sama dengan nilai node, sisipkan ke anak kanan
            if (parent.rightChild == null) {
                parent.rightChild = node;
            } else {
                // Jika anak kanan sudah terisi, panggil insertNode rekursif pada anak kanan
                insertNode(parent.rightChild, node);
            }
        }
    }
    // Metode searchValue digunakan untuk mencari nilai tertentu dalam pohon secara rekursif
    public static boolean searchValue(Node root, int value) {
        // Jika pohon kosong, nilai tidak ditemukan
        if (root == null) {
            return false;
        }

        // Jika nilai root sama dengan nilai yang dicari, nilai ditemukan
        if (root.getValue() == value) {
            return true;
        } else if (root.getValue() > value) {
            // Jika nilai root lebih besar dari nilai yang dicari, cari pada anak kiri
            return searchValue(root.leftChild, value);
        } else {
            // Jika nilai root lebih kecil dari nilai yang dicari, cari pada anak kanan
            return searchValue(root.rightChild, value);
        }
    }
}
