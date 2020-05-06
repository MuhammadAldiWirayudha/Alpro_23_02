import java.util.Date;

public class ObjectObat{
	public static void main (String [] args){
		
		Obat ob1 = new Obat ();
		ob1.barcode = "12321515314";
		ob1.nama = "Pertamax";
		ob1.tanggalKadaluarsa = new Date (2020,11,6);
		ob1.harga = 6000;
		
		Obat ob2 = new Obat ();
		ob2.barcode = "123211252144";
		ob2.nama = "Bodrex";
		ob2.tanggalKadaluarsa = new Date (2020,10,23);
		ob2.harga = 7500;
		
		System.out.println (ob1.nama + "("+ob1.barcode + ")"); 
		System.out.println ("Harga : Rp"+ ob1.harga);
		System.out.println ("Exp :"+ob1.tanggalKadaluarsa.toString());
		
		System.out.println ("=======================================");
		
		System.out.println (ob2.nama + "("+ob2.barcode + ")"); 
		System.out.println ("Harga : Rp"+ ob2.harga);
		System.out.println ("Exp :"+ob2.tanggalKadaluarsa.toString());
	}
}