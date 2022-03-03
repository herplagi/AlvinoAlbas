import java.util.ArrayList;

public class nomor5ver2 {
    public static void main(String[] args) {
        ArrayList<String> nama= new ArrayList<String>();
        nama.add("L");
        nama.add("B");
        nama.add("A");
        nama.add("S");

        System.out.println("nama sebelum dihapus : " +nama);
        System.out.println("huruf yang di hapus : ");
        System.out.println(nama.remove(0));
        //System.out.println(nama.remove(3));
        System.out.println(nama.remove(2));
        System.out.println("nama setelah dihapus : ");
        for(String var: nama){
            System.out.println(var);;
        }
        
    }
}
