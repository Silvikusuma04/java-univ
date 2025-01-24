package uts;
public class duademensi {
    public static void main(String[] args) {
        // Mendefinisikan matriks 2x3
        int[][] matriks = {
                {1, 7, 9},{3, 5, 2}
        };

        // Menampilkan elemen matriks
        System.out.println("Matriks dua dimensi 2x3:");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}

    

