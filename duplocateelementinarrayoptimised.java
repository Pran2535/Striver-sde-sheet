package arrays;
import java.util.*;
public class duplicateelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,3,4,2,2};
System.out.println(duplicate(arr));
	}
public static int duplicate(int arr[]) {
	Arrays.sort(arr);
		for(int j=1;j<arr.length;j++) {
			if(arr[j]==arr[j-1]) {
				return arr[j];
			}
		}

	
	return -1;
}
}
