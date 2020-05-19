package ch04;

public class SetelahnyaBesarArray {
    public static void main(String[] args){
    
        //input
        int angka[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		int i,selisih;
		
		//proses
		System.out.println("{82,12,41,38,19,26,9,48,20,55,8,32,3}");
		System.out.println("Angka Setelahnya Lebih Besar Dalam Array = ");
		for (i = 0;i < angka.length -1; i++){
				if (angka[i] > angka[+1]){
					System.out.println(angka[i]);
				}
		}
    }
}
