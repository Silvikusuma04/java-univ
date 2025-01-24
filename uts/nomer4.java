package uts;
    import java.util.Scanner;
public class nomer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah data dari pengguna
        System.out.print("Masukkan jumlah data: ");
        int n = scanner.nextInt();

        // Input data dari pengguna
        int[] data = new int[n];
        System.out.println("Masukkan data:");
        for (int i = 0; i < n; i++) {
            System.out.print("Data[" + i + "]: ");
            data[i] = scanner.nextInt();
        }

        // Menampilkan data sebelum diurutkan
        System.out.println("Data sebelum diurutkan:");
        printArray(data);

        // Melakukan selection sort
        selectionSort(data);

        // Menampilkan data setelah diurutkan
        System.out.println("Data setelah diurutkan:");
        printArray(data);

        // Input data yang akan dicari
        System.out.print("Masukkan data yang akan dicari: ");
        int searchElement = scanner.nextInt();

        // Melakukan pencarian data
        int index = linearSearch(data, searchElement);

        // Menampilkan hasil pencarian
        if (index != -1) {
            System.out.println("Data ditemukan di indeks: " + index);
        } else {
            System.out.println("Data tidak ditemukan.");
        }

        // Menutup scanner
        scanner.close();
    }

    // Metode untuk selection sort
    private static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Menukar elemen terkecil dengan elemen pertama
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Metode untuk pencarian linear
    private static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Metode untuk menampilkan array
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

    

