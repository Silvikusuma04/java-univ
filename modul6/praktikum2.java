package modul6;
public class praktikum2 {

    public static void main(String[] args) {
        // Mendeklarasikan array yang belum terurut
        int i;
        int[] array = {12, 9, 4, 99, 120, 1, 3, 10};

        // Menampilkan data sebelum pengurutan
        System.out.println("Values before the sort:");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Memanggil metode quicksort untuk mengurutkan array
        quicksort(array, 0, array.length - 1);
        // Menampilkan data setelah pengurutan
        System.out.println("Values after the sort:");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Metode quicksort untuk mengurutkan array
    public static void quicksort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            quicksort(arr, left, index - 1);
        }
        if (index < right) {
            quicksort(arr, index, right);
        }
    }

    // Metode untuk membagi array menjadi dua bagian
    public static int partition(int arr[], int left, int right) {
        int i = left, j = right;
        int tmp;
        
    // Menentukan pivot
        int pivot = arr[(left + right) / 2]; 
        
    // Melakukan penyortiran dengan prinsip dua pointer
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }
}
    

