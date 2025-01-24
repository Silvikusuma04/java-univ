package graf;
public class Graph {
private final int MAX_VERTS = 20;
private Vartex vartexList[];
private int adjMat [] [];
private int nVerts;

public Graph () {
    vartexList = new Vartex[MAX_VERTS];
    adjMat= new int[MAX_VERTS] [MAX_VERTS];
    nVerts=0;

    for(int i=0; i<MAX_VERTS; i++) {
    for(int j=0; j<MAX_VERTS; j++) {
    adjMat[i][j] = 0;
}
    }
}
public void addVartex (char label) {
    vartexList[nVerts++] = new Vartex (label);
}
public void addEdge (int start, int end) {
    adjMat [start] [end] =1;
    adjMat [end] [start] =1;
}
   public void display() {
System.out.println("Adjecency");
for (int row=0; row<nVerts; row++) {
for (int col=0; col<row; col++) {
    if(adjMat[row][col] ==1) {
 System.out.println(vartexList[row].label+ "--" +vartexList[col].label); 
}

System.out.println("");
}
}
   }
}
