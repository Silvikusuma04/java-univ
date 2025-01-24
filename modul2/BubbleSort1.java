package modul2;
  import java.util.Scanner;

public class BubbleSort1 {
    public static void main(String[] args) {
        int jumlah, i, j, swap;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan yang mau diinputkan: ");
        jumlah = scan.nextInt();

        int array[] = new int[jumlah];
        System.out.println("\nMasukkan " + jumlah + " buah bilangan Integer");
        System.out.println("======================================");
        for (i = 0; i < jumlah; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + " = ");
            array[i] = scan.nextInt();
        }

        System.out.println("\nBilangan belum terurutnya");
        for (int a = 0; a < jumlah; a++) {
            System.out.print(array[a] + "  ");
        }

        for (i = 0; i < (jumlah - 1); i++) {
            for (j = 0; j < (jumlah - i - 1); j++) {
                //=======ASCENDING=======//
                /*
                if (array[j] > array[j + 1]) {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
                */
                //========DESCENDING======//
                
                   if (array[j] < array[j + 1]) {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
               
            }
        }
        
        System.out.println("\n\nBilangan Terurutnya adalah:");
        for (i = 0; i < jumlah; i++) {
            System.out.print(array[i] + " ");
        }
    }
}  

