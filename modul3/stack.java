package modul3;
import java.util.Stack;
public class stack {
public static void main(String[] args) {
    Stack<Integer> namastack1 = new Stack<>();
    boolean isi = namastack1.empty();
    System.out.println("Apakah stack tersebut kosong?"+isi);
    
    namastack1.push(8); //memasukkan elemen 8 ke dalam stack
    System.out.println("Elemen dalam stack adalah: "+namastack1);
    
    namastack1.push(6);
    namastack1.push(4);
    namastack1.push(2);
     System.out.println("Elemen dalam stack adalah: "+namastack1);
     
    namastack1.pop();
    System.out.println("Elemon dalam stack setelah POP: "+namastack1);
    
    System.out.println("Item paling atas dari stack "+namastack1.peek());
    
          System.out.println("=================");
            Stack<String> namastack2= new Stack<>();
            boolean isi2=namastack2.empty(); 
            System.out.println("Apakah stack tersebut kosong? "+isi2);
            namastack2.push("Apple");
            namastack2.push("Blueberry");
            namastack2.push("Pineapple"); 
            System.out.println("Elemen dalam stack adalah: "+namastack2);
            System.out.println("Elemen teratas dari stack: "+namastack2.peek());
            System.out.println("Dimana lokasinya? "+namastack2.search("Blueberry"));
}
}