package modul2;
public class BubbleSort3 {
private long [] larik; 
private int jumItem;

public BubbleSort3(int max) {
    larik = new long [max];
    jumItem = 0;
}
public void tambah (long nilai) {
    larik[jumItem] = nilai;
    jumItem++;
}
public void baca_larik() {
for (int j=0; j<jumItem; j++) 
System.out.print (larik[j]+" ");
System.out.println(" ");
}
//=====ascending=====
public void bubbleSort() {
    int i, j; 
    for (i=jumItem-1; i>0; i--){
    for (j=0; j<i; j++){
    if (larik[j]> larik[j+1])
        tukar (j, j+1);
    }
    System.out.println("Hasil langkah ke" +(-(i-jumItem)));
        baca_larik();
    }
}

//=====descending=====
/*
public void bubbleSort() {
int i,j;
for (i=jumItem-1; i>0; i--){
for (j=0; j<i; j++){
if (larik[j] < larik[j+1])
tukar (j, j+1);
}
System.out.println("Hasil langkah ke"+(-(i-jumItem)));
baca_larik();
}
}
*/
private void tukar (int a, int b) {
long temp = larik[a];
larik[a] = larik[b];
larik[b]= temp;
}
}

class SortingBubbleSort{
public static void main(String[] args) {
int ukuran = 100; 
BubbleSort3 deret;
deret = new BubbleSort3 (ukuran);
deret.tambah (23);
deret.tambah (105);
deret.tambah (45);
deret.tambah (87);
deret.tambah (54);
System.out.println("Larik awal "); 
deret.baca_larik();
deret.bubbleSort();
System.out.println("Larik akhir ");
deret.baca_larik();
}
}
