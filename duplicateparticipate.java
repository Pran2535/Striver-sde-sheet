package arrays;
import java.util.*;
public class duplicateelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,3,3,4,2,2};
System.out.println(duplicate(arr));
	}
public static int duplicate(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		int temp=arr[i];
		for(int j=i+1;j<arr.length;j++) {
			if(temp==arr[j]) {
				return temp;
			}
		}

	}
	return -1;
}
}
