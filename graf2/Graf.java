package graf2;
    import java.util.LinkedList;
public class Graf {
    LinkedList G [];
    public Graf (int s) {
    G=new LinkedList[s];

for (int i=0; i<G.length; i++) {
       G[i] = new LinkedList<Busur>();
    }  
}
    void tambahBusur (int s, int a, int b) {
G[s].add(new Busur(a,b));
}

@Override
public String toString() {
String output="";
    for (int i=0; i<G.length; i++) {
    output += 1 +"==>" + G[i] + "\n";
}
    return output;

}
}
