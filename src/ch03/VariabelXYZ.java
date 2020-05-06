import java.util.Scanner;

public class VariabelXYZ{
	public static void main (String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input nilai X:");
		int x =input.nextInt();
		
		System.out.print("Input nilai Y:");
		int y =input.nextInt();
		
		System.out.print ("Input nilai Z:");
		int z =input.nextInt();
		
		if(x>y && x>z){
			System.out.println(x+ " Lebih besar dari pada "  +y+ " dan "+z);
		}else{
			if(y>x && y>z){
				System.out.println(y+ " Lebih besar dari pada "  +x+ " dan "+z);
			}else{
				System.out.println(z+ " Lebih besar dari pada "  +x+ " dan "+y);
		}
	}
}
} 