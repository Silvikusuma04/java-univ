package modul2;
class SortingSelectionSort{
public static void main(String[] args) {
int ukuran = 100;
SelectionSort1 DeretAngka;
DeretAngka= new SelectionSort1 (ukuran); 
DeretAngka.tambah (32);
DeretAngka.tambah (75);
DeretAngka.tambah (69); 
DeretAngka. tambah (58);
DeretAngka.tambah (21);
DeretAngka.tambah (40);
System.out.print ("Data awal : "); 
DeretAngka.cetak();
System.out.println();
DeretAngka.selection_sort();
System.out.print ("Data akhir: ");
DeretAngka.cetak();
System.out.println();
}
}
public class SelectionSort1{
private long [] data; private int jumItem;

public SelectionSort1 (int max) { 
    data=new long [max];
    jumItem =0;
}
public void tambah (long nilai) {
data[jumItem] = nilai; 
jumItem++;
}
public void cetak () {
for (int j=0; j<jumItem; j++)
System.out.print(data [j]+" ");
System.out.println(" ");
}
public void selection_sort(){
int i,j,pos;
for (i=0;i<jumItem-1;i++) {
pos=i;

for(j=i+1;j<jumItem;j++) { 
    if (data[j] < data[pos])
    pos = j;
}
if (pos != i)
tukar (pos, i);

System.out.print("Hasil langkah ke " + (i+1)+" : ");
cetak();
System.out.println();
}
}
private void tukar(int a,int b){
long temp = data[a];
data[a] = data[b];
data[b]= temp;
}
}
