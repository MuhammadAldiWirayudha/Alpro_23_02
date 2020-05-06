import java.util.Scanner;

public class MenentukanBilanganTerkecil{
	public static void main (String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bilangan :");
		int bil =input.nextInt();
		
		if (bil>0 && bil<=4){
			System.out.println("Pembagi Terkecil:"+bil);
		}else{
			for(int i=3; i<= bil; i++){
				if( bil%i ==0){
					System.out.println("Pembagi Terkecil:"+i);
					break;
				}
			}
		}
	}
}