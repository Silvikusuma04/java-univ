package modul2;
public class tugas3 {
public static void tampilkandata(String nama[][], int indeksTerakhir) {
for (int i=0;i<indeksTerakhir;i++){
for (int j=0;j<3;j++){
System.out.print (nama [i] [j]+" ");}
System.out.println("");
}
}
public static void urutkaninsertion (String nama[][], int indeksTerakhir) {
for (int i=0; i<indeksTerakhir; i++) {
String min=nama [i] [0];
int j=i; 
while ((j>0) && (min.compareTo(nama [j-1][0])<0)){ 
    nama [j][0]=nama [j-1][0];
    j--;}
nama [j][0]=min;
}
}
public static void main(String args []){
    String namaa[][]= {{"sita","17", "wanita"} , {"agus","18","Pria"},   
    {"wahyu","33", "Pria"}, {"indah","38","wanita"}, 
    {"novita", "23", "wanita"}, {"jamal" , "22" , "pria"},
    {"feri","98", "pria"}, {"tasya", "34", "wanita"},
    {"eko", "33", "pria"}, {"ikhwan", "12", "pria"}};
int indeksterakhir=namaa.length;
System.out.println("Data sebelum di urutkan: ");
tampilkandata (namaa, indeksterakhir);
urutkaninsertion (namaa, indeksterakhir);
System.out.println("");
System.out.println("Date setelah di urutkan: ");
    tampilkandata (namaa, indeksterakhir);
}
}

