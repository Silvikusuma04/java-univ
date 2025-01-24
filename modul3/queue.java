package modul3;
import java.util.*;
public class queue {
    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<>();
        
        antrian.add("Ani");
        antrian.add("Budi");
        System.out.println("Antrian :"+antrian);
        
        antrian.add("Citra");
        antrian.add("Danang");
        System.out.println("Antrian : "+antrian);
        
        antrian.poll();
        System.out.println("Antrian : "+antrian);
        
        antrian.remove();
        System.out.println("Antrian : "+antrian);
        
        //untuk melihat antrian paling depan dengan peek
        /*
        antrian.poll ()://meremove Citra 
        antrian.poll()://meremove Danang
        antrian.poll();//antrian kosong
        System.out.println("Antrian: "+antrian);
        */
        System.out.println("Antrian paling depan: "+antrian.peek());
        //cara luntuk melihat antrian yang depan dengan element
        System.out.println("Antrian paling depan :"+antrian.element ());
        //untuk mengukur size queue
        System.out.println("Jumlah antrian: "+antrian.size());
        antrian.clear();
        System.out.println("Antrian :"+antrian);
        
        
    }
    }