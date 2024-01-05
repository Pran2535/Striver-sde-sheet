package arrays;

public class printspiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
print(arr);
	}
	public static void print(int arr[][]) {
		int minr=0;
		int minc=0;
		int maxr=arr.length-1;
		int maxc=arr[0].length-1;
		for(int i=minc;i<=maxc;i++) {
			System.out.print(arr[minr][i]+",");
				
		}
		minr++;
		for(int j=minr;j<=maxr;j++) {
			System.out.print(arr[j][maxc]+",");
		}
		maxc--;
		for(int k=maxc;k>=0;k--) {
			System.out.print(arr[maxr][k]+",");
		}
		maxr--;
		for(int l=maxr;l>=minr;l--) {
			System.out.print(arr[l][minc]+",");
		}
		minc++;
		for(int m=minc;m<=maxc;m++) {
			System.out.print(arr[minr][m]+",");
		}
	minr++;
	for(int j=minr;j<=maxr;j++) {
		System.out.print(arr[j][maxc]+",");
	}
	maxc--;
	for(int k=maxc;k>0;k--) {
		System.out.print(arr[maxr][k]+",");
	}
	maxr--;
	}
	

}
