package arrays;

public class searchin2dmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
int target=3;
System.out.println(linear2d(arr,target));
	}
	public static boolean linear2d(int arr[][],int target) {
		int i=0;
		int j=arr[i].length-1;
		while(i<arr.length && j>=0) {
			int temp=arr[i][j];
			if(arr[i][j]==target) {
				return true;
			}
			else if(temp>target) {
				j--;
			}
			else {
				i++;
			}
		}
	return false;	
	}

}
