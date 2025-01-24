package modul2;
public class BubbleSort {
public static void tampilkanData (String nama [], int indeksTerakhir) {
for (int i=0;i<= indeksTerakhir; i++)
System.out.println(nama [i]);
}
public static void urutkanBubble(String nama[], int indeksTerakhir)
{
String sementara =" "; 
for (int j=0; j<= indeksTerakhir - 1; j++)
{
    for (int i=0; i<=indeksTerakhir-1-j; i++)
    {
if (nama[i].compareTo(nama[i+1])>0)
{
    sementara = nama [i];
    nama[i]= nama [i+1];
    nama[i+1]= sementara;
}
    }
}
}
public static void main(String args[]) {
String nama[] = {"sita", "agus", "wahyu","indah", "novita", "jamal", "feri","tasya", "eko","ikhwan" }; 
int indeksTerakhir = nama.length-1;

System.out.println("Data sebelum diurutkan: ");
tampilkanData (nama, indeksTerakhir);

urutkanBubble (nama, indeksTerakhir); 
System.out.println("");

System.out.println("Data setelah diurutkan :"); 
tampilkanData(nama, indeksTerakhir);
}  
}
