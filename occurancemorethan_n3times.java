package arrays;
import java.util.*;
public class majorityelement_n3times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,2,3,2};
int n=arr.length;
List<Integer> arr1=print(arr);
for(int i=0;i<n/3;i++) {
	System.out.print(arr1.get(i));
}



	}
	
		 public  static List<Integer> print(int[] arr) {
		        ArrayList<Integer> m= new ArrayList<>();
				int n=arr.length;
				for(int i=0;i<n;i++) {
					int count=1;
					for(int j=i+1;j<n;j++) {
						if(arr[i]==arr[j]) {
							count++;
							
						}
					}
		          if (count > n / 3 && !m.contains(arr[i])) {
		                m.add(arr[i]);
		            }
				}
		        return m;
		    }

}
