package ilkom.uniwara.algosd.pkg01array;
    import java.util.*;
  
    public class UrutArray {
    public static void main(String[] args) {
     //membuat array
     int nomer[]={70,20,35,10,25,60};

     //menampilkan elemen array sebelum diurutkan 
     System.out.println("\n Sebelum diurutkan **");
     for (int x: nomer) {
         System.out.println(x+"");
     }
     //melakukan pengurutan 
     Arrays.sort (nomer);
     //menampilkan elemen array setelah diurutkan 
     System.out.println("\n Setelah diurutkan ***");
     for (int x: nomer) {
         System.out.println(x +"");
     }
    }
}
    
