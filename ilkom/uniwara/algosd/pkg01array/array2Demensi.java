package ilkom.uniwara.algosd.pkg01array;
public class array2Demensi {
    public static void main(String[] args) {
        String[][] mahasiswa = {{"Ahmad", "M2020001"}, {"Umar", "M2020002"},
            {"Ibrahim", "M2020003"}};

        for (int x=0; x<mahasiswa.length; x++) {
            System.out.println("Nama : "+mahasiswa [x][0]);
            System.out.println("NIM : "+mahasiswa [x][1]);
            System.out.println("=========================");

    }
    }
    
}
