package Pertemuan4;

public class Latihan2 {

	 public static void main(String[] args) {
	        
	        Lingkaran l1 = new Lingkaran(5);
	        Lingkaran l2 = l1;
	        Lingkaran l3 = new Lingkaran(7);

	        System.out.println(l1.getJari2());
	        System.out.println(l2.getJari2());
	        System.out.println(l3.getJari2());

	        l2 = l3; //l2 tidak lagi merefrensi ke l1 tapi di overwrite menjadi l3

	        System.out.println(l1.getJari2());
	        System.out.println(l2.getJari2());
	        System.out.println(l3.getJari2());

	    }
	
}
