package ch04;

public class Kelipatan5Array {
    public static void main(String[] args){
    
        //input
        int angka[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		int x;
		
		//proses
		System.out.println("{82,12,41,38,19,26,9,48,20,55,8,32,3}");
		System.out.println("Kelipatan 5 Dalam Array = ");
		for (x = 0;x < angka.length; x++){
			if (angka[x] % 5 == 0){
				System.out.println(angka[x]);
			}
		}
    }
}