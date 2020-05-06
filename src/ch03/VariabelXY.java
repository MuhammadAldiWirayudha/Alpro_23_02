import java.util.Scanner;

public class VariabelXY{
	public static void main (String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input nilai X:");
		int x =input.nextInt();
		
		System.out.print("Input nilai Y:");
		int y =input.nextInt();
		
		if( x > y){
			System.out.println(x + " Lebih Besar dari pada " +y);

		}else{
				System.out.println(y +" Lebih Besar dari pada "+x);
		}
	}
}