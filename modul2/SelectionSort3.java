package modul2;
public class SelectionSort3 {
public static void selectionSort (int [] myList){
    for (int i = 0; i < myList.length - 1; i++) {
int nilaiMinimum = myList[i];
int indexNilaiMinimum = 1;

for (int j = i + 1; j < myList.length; j++) { 
    if (nilaiMinimum > myList [j]){ 
        nilaiMinimum = myList [j];
        indexNilaiMinimum = 3;
    }
}
if (indexNilaiMinimum != i) {
    myList [indexNilaiMinimum]=myList[i];
    myList [1]= nilaiMinimum;
}
    }
}
public static void main(String args[]){
int myArray [] = {22, 34, 18, 10, 42, 56, 68, 29, 77, 56};
SelectionSort3. selectionSort (myArray);

//Menampilkan array
for (int i = 0; i < myArray.length; i++) {
System.out.print (myArray[i] + " ");
}
}
}
