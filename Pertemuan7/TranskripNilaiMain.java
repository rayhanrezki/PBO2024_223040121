package Pertemuan7;

public class TranskripNilaiMain {
	
	  public static void main(String[] args) {
		    //    OBJEK MATAKULIAH
		        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemograman 1","A",3);
		        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemograman 2","B",3);
		        MataKuliah mk3 = new MataKuliah("003", "Pemograman Berorientasi Objek","AB",3);
		        
		    //     OBJEK KHS
		        KartuHasilStudi khs = new KartuHasilStudi("2022");
		        khs.addMataKuliah(mk1);
		        khs.addMataKuliah(mk2);
		        khs.addMataKuliah(mk3);

		    //     OBJEK MAHASISWA
		        Mahasiswa mhs = new Mahasiswa("223040121", "Rayhan Alfa Rezki");

		    //     OBJEK TRANSKRIPT
		        TranskripNilai transkrip = new TranskripNilai(mhs);
		        transkrip.addKHS(khs);
		        transkrip.hitungIPK();
		        transkrip.display();
		    
		    }
	  
}
