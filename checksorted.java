package arrays;

public class arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,1,2,5};
System.out.println(sort(arr));
	}
	public static boolean sort(int arr[]) {
		int k=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]>=arr[i]) {
				k=k+1;
			}
		}
		if(k==arr.length-1) {
			return true;
		}
		return false;
	}

}
