package modul6;
    import java.util.Scanner;
    public class praktikum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk input

        System.out.print("Masukkan jumlah data: ");
        int[] data = new int[input.nextInt()]; // Membuat array berdasarkan input jumlah data

        // Meminta input data dari pengguna
        for (int i = 0; i < data.length; i++) {
            System.out.printf("Masukkan data ke-%d: ", (i + 1));
            data[i] = input.nextInt();
        }

        System.out.println("Data sebelum diurutkan: ");
        // Menampilkan data sebelum diurutkan
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d ", data[i]);
        }

        int jarak = data.length; // Menentukan jarak awal
        boolean end;
        while (jarak > 1) {
            jarak /= 2; // Mengurangi jarak
            end = false;
            while (!end) {
                end = true;
                // Melakukan perulangan untuk penyortiran
                for (int j = 0; j < data.length - jarak; j++) {
                    if (data[j] > data[j + jarak]) { // Memeriksa dan menukar data jika perlu
                        int tukar = data[j];
                        data[j] = data[j + jarak];
                        data[j + jarak] = tukar;
                        end = false; // Mengubah end menjadi false jika ada pertukaran data
                    }
                }
            }
        }

        System.out.println("\nData setelah diurutkan: ");
        // Menampilkan data setelah proses pengurutan
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d ", data[i]);
        }
    }
}

