package Pertemuan7;

public class Mahasiswa {

	 private String NRP;
	    private String nama;
	    
	    public Mahasiswa(String nrp, String nama){
	        this.NRP = nrp;
	        this.nama = nama;
	    }
	    
	    public String display(){
	     return "NRP: " + NRP + " Nama : " + nama; 
	    }
	    
	    
//	    SETTER DAN GETTER

	    public String getNRP() {
	        return NRP;
	    }

	    public void setNRP(String NRP) {
	        this.NRP = NRP;
	    }

	    public String getNama() {
	        return nama;
	    }

	    public void setNama(String nama) {
	        this.nama = nama;
	    }

}
