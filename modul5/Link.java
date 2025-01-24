package modul5;
public class Link {
    private int id; // Menyimpan ID unik untuk setiap elemen.
    private String objek; // Menyimpan nilai objek dari elemen.
    public Link next; // Merupakan referensi ke elemen berikutnya dalam tumpukan.

    public Link(int id, String objek) {
        this.id = id;
        this.objek = objek;
    }
    
    public void displayLink() {
        // Menampilkan ID dan nilai objek dari elemen.
        System.out.println(id + ", " + objek);
    }
    
    public String getObjek() {
        // Mengembalikan nilai objek dari elemen.
        return objek;
    }
}
