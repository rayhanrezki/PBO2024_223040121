package Pertemuan4;

public class Latihan5 {

	public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        Lingkaran l3 = new Lingkaran(7);

        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());

        l1 = null;
        l2 = null;
        l3 = null;

        /*
         * l1, l2 dan l3 sudah tidak mereferensi lagi ke objek
         * lingkaran dan objek lingkaran akan dihapus oleh Garbage Collection
         */
    }
	
}
