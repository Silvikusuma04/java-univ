package modul2;
public class InsertionSort1 {
public static void insertionSort (double[] list) {
    for (int i = 1; i < list.length; i++) {
    double currentElement=list [i];
    int k;
for (k=i-1; k>= 0 && list [k] > currentElement; k--) {
    list [k + 1] = list[k];
}
    list [k+1]= currentElement;
    }
}
public static void main(String[] args) { 
    double d[] = {50,20,45,82,25,63};
    int i;
    insertionSort (d);
    for (i=0; i<d.length; i++) 
    System.out.println (d [i]);
}
}