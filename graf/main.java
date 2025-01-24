package graf;
public class main {
    public static void main(String[] args) {

    Graph theGraph = new Graph();
        theGraph.addVartex('A');//0
        theGraph.addVartex('B');//1
        theGraph.addVartex('C');//2
        theGraph.addVartex('D');//3
        theGraph.addVartex ('E');//4
            
    theGraph.addEdge(0, 1); //AB 
    theGraph.addEdge (1, 2); //BC
    theGraph.addEdge(0, 3); //AD
    theGraph.addEdge (3, 4); //DE
    
theGraph.display();
}
}
