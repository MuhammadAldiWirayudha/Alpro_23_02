package ch04;

public class MenampilkanArray {
    public static void main(String[] args){
        //input
        int angka[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		int i;

        System.out.print("Angka = ");
            for (i = 0; i < angka.length; i++){
				if (i < 12){
					System.out.print(angka[i] + ",");
				} else {
					System.out.print(angka[i]);
				}
            }
    }
}