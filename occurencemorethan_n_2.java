package arrays;

public class occurencemorethann {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,5,5};
		System.out.println(moren(arr));

	}
	public static int moren(int arr[]) {
		int n=arr.length;
		for(int i=0;i<arr.length;i++) {
			int a=arr[i];
			int count=1;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count=count+1;
					}
			}
			if(count>n/2) {
				return arr[i];
			}
		}
		return -1;
	}

}
//this is brute force approach
