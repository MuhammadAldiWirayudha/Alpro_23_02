import java.util.Date;

public class ObjectProduk{
	public static void main (String[]args){
		
		Produk pd1 = new Produk ();
		pd1.barcode = "12345678789";
		pd1.nama = "Pepsoden";
		pd1.tanggalKadaluarsa = new Date (2020,9,11);
		pd1.harga = 8900;
		
		Produk pd2 = new Produk ();
		pd2.barcode = "123211252144";
		pd2.nama = "KatKit";
		pd2.tanggalKadaluarsa = new Date (2020,2,2);
		pd2.harga = 14.000;
		
		System.out.println (pd1.nama + "("+pd1.barcode + ")"); 
		System.out.println ("Harga : Rp"+ pd1.harga);
		System.out.println ("Exp :"+pd1.tanggalKadaluarsa.toString());
		
		System.out.println ("=======================================");
		
		System.out.println (pd2.nama + "("+pd2.barcode + ")"); 
		System.out.println ("Harga : Rp"+ pd2.harga);
		System.out.println ("Exp :"+pd2.tanggalKadaluarsa.toString());
	}
}