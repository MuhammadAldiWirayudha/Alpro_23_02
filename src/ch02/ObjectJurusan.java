public class ObjectJurusan{
	public static void main (String[]args){
		
		Jurusan jrs1 = new Jurusan();
		Jurusan jrs2 = new Jurusan();
		Jurusan jrs3 = new Jurusan();
		
		jrs1.nama = "Teknik Informatika";
		jrs1.akreditasi = "A";
		jrs1.jumlahMahasiswa= 1200;
		
		jrs2.nama="Sistek Informasi";
		jrs2.akreditasi="A";
		jrs2.jumlahMahasiswa= 1090;
		
		jrs3.nama = "Teknik Elektro";
		jrs3.akreditasi="A";
		jrs3.jumlahMahasiswa= 750;
		
		System.out.println ("Jurusan 1");
		System.out.println ("Nama :" +jrs1.getNama());
		System.out.println("Akreditasi :"+jrs1.getAkreditasi());
		System.out.println("Jumlah :"+jrs1.getJumlahMahasiswa());
		System.out.println("=====================================");
		
		
		System.out.println ("Jurusan 2");
		System.out.println ("Nama :" +jrs2.getNama());
		System.out.println("Akreditasi :"+jrs2.getAkreditasi());
		System.out.println("Jumlah :"+jrs2.getJumlahMahasiswa());
		System.out.println("=====================================");
		
		System.out.println ("Jurusan 3");
		System.out.println ("Nama :" +jrs3.getNama());
		System.out.println("Akreditasi :"+jrs3.getAkreditasi());
		System.out.println("Jumlah :"+jrs3.getJumlahMahasiswa());
	}
}