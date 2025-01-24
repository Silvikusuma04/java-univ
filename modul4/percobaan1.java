package modul4;
    import java.util.LinkedList;
public class percobaan1 {
    public static void main(String[] args) {
        LinkedList<String> kota = new LinkedList<>();
        
        kota.add("Jakarta");
        kota.add("Surabaya");
        kota.add("Malang");
        kota.add("Yogyakarta");
        kota.add("Semarang");
        kota.add("Bandung"); 
        
        kota.addFirst("Bogor"); //menambahkan data pada index teratas
        kota.addLast("Solo"); //menambahkan data pada index terbawah
        kota.set(1,"Pasuruan"); //mengubah data pada index pertama
        kota.set(3,"Banyuwangi"); //mengubah data pada index ketiga
        kota.removeFirst(); //menghapus data teratas
        kota.removeLast(); //menghapus data terbawah
        kota.remove(2); //menghapus data pada index ke 2
        System.out.println("Nama kota : " +kota);
        System.out.println("Jumlah kota : " +kota.size());
        System.out.println("Data teratas : " +kota.getFirst()); //menampilkan data teratas
        System.out.println("Data terbawah : " +kota.getLast()); //menampilkan data terbawah
        System.out.println("Data pada index No 1 : " +kota.get(1)); //mengambil data pada index 1
        System.out.println("Data pada index No 3 : " +kota.get(3)); //mengambil data pada index 3
    }
}
