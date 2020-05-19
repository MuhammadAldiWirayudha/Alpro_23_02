package ch04;

public class JumlahAngkaArray {
    public static void main(String[] args){
    
        //input
        int angka[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		int x,total;
		
		//proses
		System.out.println("{82,12,41,38,19,26,9,48,20,55,8,32,3}");

		total = 0;
		for (x = 0;x < angka.length; x++){
			total += angka[x];
		}
			System.out.print("Jumlah Angka Dalam Array = "+total);
    }
}