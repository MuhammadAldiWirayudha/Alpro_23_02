public class BubbleShort {
	public static void main(String[] args) {
		int[] a = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		
		System.out.println("Array Sebelum Di Sort : ");
		for(int x = 0; x<a.length; x++) {
			System.out.print(" "+a[x]);
		}
		System.out.println();
		System.out.println("Array Sesudah Di Sort : ");
		for(int i = (a.length-1); i>0; i--) {
			for(int j = 0; j<i; j++) {
				if(a[j]>a[(j+1)]) {
					int temp = a[(j+1)];
					a[(j+1)] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int x = 0; x<a.length; x++) {
			System.out.print(" "+a[x]);
		}
	}
}
