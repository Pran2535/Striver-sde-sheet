package arrays;

public class movezeroestoend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,0,0,3};
setzerotoend(arr);

	}
	public static void setzerotoend(int arr[]) {
		int a=arr.length;
		int ne[]=new int [a];
		int count=0;
			int j=0;
		for(int i=0;i<a;i++) {
			if(arr[i]==0) {
				count++;
			}
		else if(arr[i]!=0) {
				ne[j]=arr[i];
				j++;
				
			}
		}
		int n=0;
		while(count>0) {
			arr[j]=0;
			j++;
			count--;
		}
		for(int i=0;i<a;i++) {
			arr[i]=ne[i];
		}
		for(int i=0;i<a;i++) {
			
			System.out.print(arr[i]+",");
			
		}
	}

}
