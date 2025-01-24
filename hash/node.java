package hash;
public class node {
    // Ini adalah data sekaligus key
    private String Data;

    public node() {
    }

    public String getData() {
        return Data;
    }

    // Ini digunakan untuk mengisi key dalam node
    public void setData(String Data) {
        this.Data = Data;
    }

    public int getKey() {
        int total = 0;
        for (int i = 0; i < Data.length(); i++) {
            total += (int) Data.charAt(i);
        }
        return total % 10; // Menggunakan mod 10 untuk menyederhanakan
    }
}

