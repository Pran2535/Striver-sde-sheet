package arrays;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,17,18};
int item=5;
System.out.println(search(arr,item));
	}
	public static int search(int arr[], int item) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
	}

}
