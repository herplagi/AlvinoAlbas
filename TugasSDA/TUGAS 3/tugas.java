import java.util.LinkedList;

public class tugas {
    public static void main(String[] args) {
        LinkedList<String> nama_mahasiswa = new LinkedList<String>();
        LinkedList<String> nim = new LinkedList<String>();
        LinkedList<String> alamat = new LinkedList<String>();

        nama_mahasiswa.add("Alvino Albas");
        nim.add("2111522016");
        alamat.add("Jalan M yunus no 7");
        System.out.println("Nama Mahasiswa : " + nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " + nim);
        System.out.println("Alamat Mahasiswa : " + alamat);
        System.out.println("");

        System.out.println("Menambahkan Data Mahasiswa : ");
        // menambahkan nama mahasiswa
        nama_mahasiswa.addFirst("M satria");
        nama_mahasiswa.add("arif wahyudi");
        nama_mahasiswa.add("revi putra");
        nama_mahasiswa.addLast("faiz yunus");
        System.out.println("Nama Mahasiswa : " + nama_mahasiswa);

        // menambahkan nomor induk mahasiswa
        nim.addFirst("2111522018");
        nim.add("2111523008");
        nim.add("2111523022");
        nim.addLast("2111522008");
        System.out.println("Nomor Induk Mahasiswa : " + nim);

        // menambahkan alamat mahasiswa
        alamat.addFirst("Jln. M yunus");
        alamat.add("Jln. bung hatta");
        alamat.add("Jln. pegangsaan");
        alamat.addLast("Jln. M yamin");
        System.out.println("Alamat Mahasiswa : " + alamat);
        System.out.println("");

        System.out.println("Menghapus Data Mahasiswa : ");
        // menghapus nama mahasiswa
        nama_mahasiswa.removeFirst();
        nama_mahasiswa.remove();
        nama_mahasiswa.removeLast();
        System.out.println("Nama Mahasiswa : " + nama_mahasiswa);

        // menghapus nomor induk mahasiswa
        nim.removeFirst();
        nim.remove();
        nim.removeLast();
        System.out.println("Nomor Induk Mahasiswa : " + nim);

        // menghapus alamat mahsiswa
        alamat.removeFirst();
        alamat.remove();
        alamat.removeLast();
        System.out.println("Alamat Mahasiswa : " + alamat);
        System.out.println("");

        System.out.println("Menyisipkan Data Mahasiswa : ");
        // menyisipkan nama mahasiswa
        nama_mahasiswa.set(0, "Lutfi maulana");
        System.out.println("Nama Mahasiswa : " + nama_mahasiswa);

        // menyisipkan nomor induk mahasiswa
        nim.set(0, "2111523001");
        System.out.println("Nomor Induk Mahasiswa : " + nim);

        // menyisipkan alamat mahasiswa
        alamat.set(0, "Jalan Limau manih");
        System.out.println("Alamat Mahasiswa : " + alamat);
        System.out.println("");

        System.out.println("Mencari Data Mahasiswa : ");
        // mencari nama mahasiswa
        System.out.println("Nama Mahasiswa : " + nama_mahasiswa.getFirst());
        System.out.println("Nama Mahasiswa : " + nama_mahasiswa.getLast());
        System.out.println("");

        // mencari nomor induk mahasiswa
        System.out.println("Nomor Induk Mahasiswa : " + nim.getFirst());
        System.out.println("Nomor Induk Mahasiswa : " + nim.getLast());
        System.out.println("");

        // mencari alamat mahasiswa
        System.out.println("Alamat Mahasiswa : " + alamat.getFirst());
        System.out.println("Alamat Mahasiswa : " + alamat.getLast());
        System.out.println("");
    }
}