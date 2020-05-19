package ch04;

public class DiapitGenapArray {
    public static void main(String[] args){
    
        //input
        int angka[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		int x;
		
		//proses
		System.out.println("{82,12,41,38,19,26,9,48,20,55,8,32,3}");
		System.out.println("Angka Ganjil Diapit Angka Genap Dalam Array = ");
		for (x = 0;x < angka.length; x++){
			if (angka[x] % 2 != 0){
				if (angka[x] > 3){
				System.out.println(angka[x]);
				}
			}
		}
    }
}