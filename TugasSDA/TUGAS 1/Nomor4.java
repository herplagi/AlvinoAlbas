import java.util.ArrayList;

public class Nomor4 {
    public static void main(String[] args) {
        //String[] nama = {"L","B","A","S"};
        
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("L");
        nama.add("B");
        nama.add("A");
        nama.add("S");
    
        //Soal no 4
        //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
        //indexOf(a), indexOf(c), indexOf(q)

        System.out.println(nama.indexOf("a"));
        System.out.println(nama.indexOf("c"));
        System.out.println(nama.indexOf("q"));

    }
}