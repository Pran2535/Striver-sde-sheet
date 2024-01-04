package arrays;

public class maximumconsecutiveones {
public static void main(String[]args) {
	int arr[]= {1,1,0,1,1,1};
	System.out.println(print(arr));
}
public static int print(int arr[]) {
	int maxi=0;
	
		int count =0;
		
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==1) {
			count++;
			maxi=Math.max(maxi, count);
			
		}
		else {
			count=0;
		}
	}
	return maxi;

	
}}
