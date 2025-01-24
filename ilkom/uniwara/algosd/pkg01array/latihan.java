package ilkom.uniwara.algosd.pkg01array;
    import java.util.Arrays;
public class latihan {
    public static void main(String[] args) {
        int[] data = {21, 6, 18, 29, 7, 10, 14, 11};

        // Mengurutkan data dalam array
        Arrays.sort(data);

        // Menampilkan data yang telah diurutkan
        System.out.println("Data yang telah diurutkan:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Menghitung rata-rata data
        double total = 0;
        for (int num : data) {
            total += num;
        }
        double rataRata = total / data.length;
        System.out.println("Rata-rata : " + rataRata);

        // nilai minimum dan maksimum
        int nilaiMinimum = data[0];
        int nilaiMaksimum = data[data.length - 1];

        System.out.println("Nilai minimum: " + nilaiMinimum);
        System.out.println("Nilai maksimum: " + nilaiMaksimum);

        // bilangan ganjil dan genap
        System.out.println("Bilangan ganjil:");
        for (int num : data) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.println("Bilangan genap:");
        for (int num : data) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
    

