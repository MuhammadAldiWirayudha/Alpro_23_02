package ch04;

public class JumlahSelisihArray {
    public static void main(String[] args){
    
        //input
        int angka[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		int x,selisih;
		
		//proses
		System.out.println("{82,12,41,38,19,26,9,48,20,55,8,32,3}");
		selisih = 0;

		for (x = 0;x < angka.length -1; x++){
				selisih += angka[x]-angka[x+1];
		}
			System.out.println("Jumlah Selisih Dalam Array = "+selisih);
    }
}
