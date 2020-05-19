package ch04;
import java.util.Scanner;

public class GanjilArray {
    public static void main(String[] args){
        Scanner fox = new Scanner(System.in);
        //input
        int angka[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		int i;
		
		//proses
		System.out.println("{82,12,41,38,19,26,9,48,20,55,8,32,3}");
		System.out.println("Angka Ganjil = ");
		for (i = 0; i < angka.length; i++)
				if (angka[i] % 2 != 0){
				System.out.println(angka[i]);
			}
    }
}