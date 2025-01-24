package hash;
public class myHashSet {
    int maksimal = 10;
    node[] listdata;
    // Default maksimal datanode adalah 10
    
    public myHashSet() {
        listdata = new node[maksimal];
    }

    public myHashSet(int n) {
        maksimal = n;
        listdata = new node[maksimal];
    }

    public node get(String pData) {
        int lokasi = total(pData) %maksimal;
        return listdata[lokasi];
    }

    public boolean put(String pData) {
        node baru = new node();
        baru.setData(pData);
        // Dimasukkan jika belum ada data yang sama
        if (listdata[baru.getKey()%maksimal] == null) {
            listdata[baru.getKey()%maksimal] = baru;
            return true;
        }
        return false;
    }

    // Fungsi yang digunakan untuk menghitung total ASCII dari string yang diinputkan
    private static int total(String pcari) {
        int p = pcari.length();
        int total = 0;
        for (int i = 0; i < p; i++) {
            total=total + (int) pcari.charAt(i);
        }
        return total;
    }
}


