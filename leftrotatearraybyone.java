package arrays;

public class leftrotateanarraybyoneplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {5,6,7,8};
rotate(arr);

	}
	public static void rotate(int arr[]) {
		int temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
