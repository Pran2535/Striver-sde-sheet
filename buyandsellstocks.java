package arrays;

public class buyandsellstocks {
public static void main(String[]args) {
	int arr[]= {7,1,5,3,6,4,7};
	System.out.print(buy(arr));
	
}
public static int buy(int arr[]) {
	int result=0;
	int count=0;
	for(int i=0;i<arr.length;i++) {
		int temp=arr[i];
		for(int j=i+1;j<arr.length;j++) {
			 count=arr[j]-temp;
			 result=Math.max(result,count);
		}
	}
	return result;
}
}
