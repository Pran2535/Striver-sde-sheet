package arrays;

public class largestinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {12,2,23,4,5};
print(arr);
	}

	public static void print(int arr[]) {
		int temp=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>temp) {
				temp=arr[i];
			}
		}
		System.out.println(temp);
	}
}
