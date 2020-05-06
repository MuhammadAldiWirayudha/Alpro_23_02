import java.util.Date;

public class Obat {
	
	String nama;
	String barcode;
	Date tanggalKadaluarsa;
	double harga;
	
	public String getNama(){
		return nama;
	}
	
	public String getBarcode(){
		return barcode;
	}
	
	public Date getTanggalKadaluarsa (){
		return tanggalKadaluarsa;
	}
	
	public double getHarga (){
		return harga;
	}
}