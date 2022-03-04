import java.util.LinkedList;

public class LList {
    public static void main(String[] args) {
        LinkedList<String> nama = new LinkedList<String>();
        LinkedList<String> no_BP = new LinkedList<String>();
        LinkedList<String> alamat = new LinkedList<String>();

        //nama : Alvino Albas
        nama.add("A");
        nama.add("L");
        nama.add("V");
        nama.add("I");
        nama.add("N");
        nama.add("O");
        nama.add(" ");
        nama.add("A");
        nama.add("L");
        nama.add("B");
        nama.add("A");
        nama.add("S");

        //nomorBP : 2111522016
        no_BP.add("2");
        no_BP.add("1");
        no_BP.add("1");
        no_BP.add("1");
        no_BP.add("5");
        no_BP.add("2");
        no_BP.add("2");
        no_BP.add("0");
        no_BP.add("1");
        no_BP.add("6");

        //alamat : Jl. M. Yunus Kp. Kalawi
        alamat.add("J");
        alamat.add("l");
        alamat.add(".");
        //alamat.add(" ");
        alamat.add("M");
        alamat.add(".");
        //alamat.add(" ");
        alamat.add("Y");
        alamat.add("U");
        alamat.add("N");
        alamat.add("U");
        alamat.add("S");
        alamat.add(" ");
        alamat.add("K");
        alamat.add("p");
        alamat.add(".");
        //alamat.add(" ");
        alamat.add("K");
        alamat.add("A");
        alamat.add("L");
        alamat.add("A");
        alamat.add("W");
        alamat.add("I");

        System.out.println("nama : " +nama);
        System.out.println("no BP : "+no_BP);
        System.out.println("alamat : " +alamat);
        

    }
}
