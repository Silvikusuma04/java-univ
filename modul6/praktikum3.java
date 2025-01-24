package modul6;
public class praktikum3 {
    public static void main(String[] args) {
        // Data yang akan diurutkan
        int[] n = {787, 7, 469, 3, 282, 63, 840, 78, 508, 495, 47, 812, 475, 840, 225, 719, 14};

        // Menampilkan data sebelum pengurutan
        System.out.println("Sebelum diurutkan = ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();

        // Memanggil metode Merge Sort untuk mengurutkan data
        initializeMergeSort(n, 0, n.length - 1);
        System.out.println();
        System.out.println("Setelah diurutkan = ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }

    // Metode Merge Sort
    public static void initializeMergeSort(int n[], int l, int h) {
        int low = l;
        int high = h;
        // Jika array sudah terurut, berhenti
        if (low >= high) {
            return;
        }
        int middle = (low + high) / 2;
        // Urutkan setengah pertama array
        initializeMergeSort(n, low, middle);
        // Urutkan setengah kedua array
        initializeMergeSort(n, middle + 1, high);

        int end_low = middle;
        int start_high = middle + 1;
        while (low <= end_low && start_high <= high) {
            if (n[low] < n[start_high]) {
                low++;
            } else {
                int temp = n[start_high];
                // Geser elemen-elemen di setengah pertama untuk membuat ruang
                for (int k = start_high - 1; k >= low; k--) {
                    n[k + 1] = n[k];
                }
                // Tempatkan nilai temp ke posisi yang benar di setengah pertama array
                n[low] = temp;
                low++;
                end_low++;
                start_high++;
            }
        }
    }
}
