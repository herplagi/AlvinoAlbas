import java.util.ArrayList;

public class Nomor6 {
    public static void main(String[] args) {
        //String[] nama = {"L","B","A","S"};
        
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("L");
        nama.add("B");
        nama.add("A");
        nama.add("S");
        
        //Soal no 6
        //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
        //add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), add(-3,j)

        nama.add(0,"E");
        System.out.println("Element setelah menambahkan string e " + nama);

        nama.add(2,"F");
        System.out.println("Element setelah menambahkan string f " + nama);

        nama.add(3,"G");
        System.out.println("Element setelah menambahkan string g " + nama);

        nama.add(4,"H");
        System.out.println("Element setelah menambahkan string h " + nama);

        nama.add(6,"H");
        System.out.println("Element setelah menambahkan string h " + nama);

        nama.add(-3,"J");
        System.out.println("Element setelah menambahkan string j " + nama);
}   }
