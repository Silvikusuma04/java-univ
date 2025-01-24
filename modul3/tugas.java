package modul3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class tugas {

    // Inisialisasi stack
    private static Stack<Integer> stack;

    // Ukuran stack
    private static int ukuran;

    public static void main(String[] args) {
        System.out.println("Berapa elemen STACK yang ingin ditampilkan? ");
        ukuran = inputData();

        buatStack();
        bacaData();
        tulisData();
    }

    // Method untuk membuat stack
    private static void buatStack() {
        stack = new Stack<>();
    }

    // Method untuk membaca data dari pengguna dan memasukkan ke dalam stack
    private static void bacaData() {
        System.out.println("Masukkan nilai-nilai STACK: ");

        for (int i = 0; i < ukuran; i++) {
            System.out.print("Data ke-" + (i + 1) + " : ");
            int data = inputData();
            stack.push(data);
        }
    }

    // Method untuk menulis data dari stack menggunakan prosedur POP
    private static void tulisData() {
        System.out.println("Isi Stack adalah (menggunakan prosedur POP): ");

        // Menggunakan loop while untuk menampilkan semua elemen dalam stack
        while (!stack.isEmpty()) {
            int dataStack = stack.pop();
            System.out.println("Nilainya " + dataStack);
        }
    }

    // Method untuk input data dari pengguna
    private static int inputData() {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String angkaInput = null;

        try {
            angkaInput = bfr.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Integer.parseInt(angkaInput);
    }
}
