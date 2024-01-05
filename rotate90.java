package arrays;

public class rotate90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]= {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
rotate90(arr);
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		System.out.print(arr[i][j]+",");
	}
	System.out.println();
}
	}
public static void rotate90(int arr[][]) {
	for(int i=0;i<arr.length;i++) {
		int temp=0;
		for(int j=i+1;j<arr[0].length;j++) {
			
				 temp =arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			
		}
	}
	int n= arr.length;
	  for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n / 2; j++) {
	            int temp = arr[i][j];
	            arr[i][j] = arr[i][n - 1 - j];
	            arr[i][n - 1 - j] = temp;
	        }
	}
}
}
