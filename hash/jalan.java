package hash;
public class jalan {
    public static void main(String[] args) {
        // Pembuatan object dari class myHashSet
        myHashSet abc = new myHashSet(10);

        // Menambahkan data string
        abc.put("wildan");
        abc.put("Askur");
        abc.put("Rosiana");
        abc.put("Arif");

        // Menyisipkan data string
        node datanode = abc.get("Askur");

        // Jika ada, tampilkan perananode [name]
        // Jika tidak ada, datanode berisi null
        if (datanode != null)
            System.out.println("ada "+datanode.getData());
    }
}

