package ilkom.uniwara.algosd.pkg01array;
public class array1 {
    public static void main(String[]args){
        //mendeklarasikan array dengan tipe data integer
        int[] contohArray;
        //mengalokasikan memori untuk 6 integers

        contohArray = new int[6];

        //inisialisasi elemen array ke-1

        contohArray[0] = 10;

        //inisalisasi elemen array ke-2
        contohArray[1] = 20;

        //inisialisasi elemen array ke-n

        contohArray[2] = 30;
        contohArray[3] = 40;
        contohArray[4] = 50;
        contohArray[5] = 60;
        
        //menampilkan di layar

        System.out.println("Elemen array indeks ke-0: " +contohArray[0]);

        System.out.println("Elemen array indeks ke-1: " +contohArray[1]);

        System.out.println("Elemen array indeks ke-2: " +contohArray[2]);

        System.out.println("Elemen array indeks ke-3: " +contohArray[3]);

        System.out.println("Elemen array indeks ke-4: " +contohArray[4]);

        System.out.println("Elemen array indeks ke-5: "+contohArray[5]);

    }
    
}
