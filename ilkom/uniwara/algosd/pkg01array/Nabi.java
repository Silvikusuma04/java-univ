package ilkom.uniwara.algosd.pkg01array;
import java.util.Scanner;
public class Nabi {
    public static void main(String[] args){
    //membuat array nama-nama nabi 
    String [] Nabi=new String[5];
    //membuat scanner
    Scanner scan = new Scanner(System.in);
    //mengisi data di dalam array
    for (int i=0; i<Nabi.length; i++) {
     System.out.println("Masukkan nama nabi yang anda ketahui: "+i +" : ");
     Nabi[i]= scan.nextLine();
        }
        System.out.println("==========================================");

        //menampilkan isi dari array

        for (String n: Nabi) 
        { System.out.println(n);

        }
    }
}