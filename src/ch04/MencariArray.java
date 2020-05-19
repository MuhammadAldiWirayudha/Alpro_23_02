package ch04;
import java.util.Scanner;

public class MencariArray {
    public static void main(String[] args){
        Scanner fox = new Scanner(System.in);
        //input
        int angka[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		int x,urutan;
		
		//proses
		System.out.println("{82,12,41,38,19,26,9,48,20,55,8,32,3}");
        System.out.print("MasukkanAngka Yang Dicari = ");
		x = fox.nextInt();
		boolean benar = false;
		
            for (urutan = 1; urutan < angka.length; urutan++){
					if (angka[urutan]== x){
					System.out.print("Angka Yang Dicari = "+x+ " Pada urutan "+urutan);
					benar = true;
					}
			}
    }
}