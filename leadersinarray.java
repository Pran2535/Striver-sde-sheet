package arrays;
import java.util.*;

public class leaderinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {4,7,1,0};
ArrayList<Integer> m= new ArrayList<>();
int count=0;
int i=0;
int max= arr[arr.length-1];

for(int j=0;j<arr.length-1;j++) {
	int temp=arr[i];
	
	if(temp>arr[j+1]) {
		m.add(temp);
		count =count+1;
	}
	i++;
}

m.add(max);
count=count+1;
int arr1[]=new int[count];
for(int n=0;n<count;n++) {
arr1[n]=	m.get(n);
}
for(int k=0;k<count;k++) {
	System.out.print(arr1[k]);
}
	}

}
