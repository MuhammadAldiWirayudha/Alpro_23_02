public class CocktailSort {
	public static void main(String[] args) {
		int[] arr={82,12,41,38,19,26,9,48,20,55,8,32,3};
		int left = 0;
		int right = arr.length ;
		while(right>left){
			for(int j=left;j<right-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			     }
			}
			right--;
			for(int j=right;j>left;j--){
				if(arr[j]<arr[j-1]){
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
			     }
			}
			left++;
		}
		for(int p:arr){
			System.out.println(p+"   ");
		}
	}

}
