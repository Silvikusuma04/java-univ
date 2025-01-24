package graf2;
public class Main {
    public static void main(String[] args) { 
        Graf g=new Graf (4);
    g.tambahBusur(0, 1, 2);
    g.tambahBusur(1, 2, 3);
    g.tambahBusur(2, 1, 3);
    g.tambahBusur (3, 4, 0);
    
System.out.println(g);

}
}
