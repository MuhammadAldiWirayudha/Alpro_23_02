package ch04;

public class JumlahGenapArray {
    public static void main(String[] args){
    
        //input
        int angka[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		int x,total;
		
		//proses
		System.out.println("{82,12,41,38,19,26,9,48,20,55,8,32,3}");
		System.out.println("Penjumlahan Angka Yang Hasilnya Genap Dalam Array = ");
		for (x = 0;x < angka.length -1; x++){
			total = angka[x]+angka[x+1];
			
				if (total % 2 == 0){
					System.out.println(angka[x]+" + "+angka[x+1]+" = "+total);
				}
		}
    }
}
