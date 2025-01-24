package modul2;
public class InsertionSort2 {
public static void insertionSort2 (int[] A) {
for (int i = 1; i < A.length; i++) {
int key =A[i];
int j=i-1;while ((j>= 0) && (A[j] > key)) {
A[j+1] = A[j];
j--;
}
A[j+1]=key;
}
}
public static void tampil (int data[]) { 
    for (int i = 0; i < data.length; i++) { 
        System.out.print (data[i]+" ");
        System.out.println();
    }
}
public static void main(String[] args) {
int A[]={10,6,8,3,1};
System.out.println("Data sebelum diurutkan: "); 
InsertionSort2.tampil (A);
InsertionSort2. insertionSort2 (A);
System.out.println("Data setelah diurutkan: "); 
InsertionSort2.tampil (A);
} 
}
