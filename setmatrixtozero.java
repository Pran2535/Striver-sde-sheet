package arrays;

public class setmatrixtozero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
setmatrixzero(arr);
for(int )

	}
public static void setmatrixzero(int arr[][]) {
	int n=arr.length;
	int m=arr[0].length;
    boolean zerorows[]=new boolean[n];
    boolean zerocolumns[]=new boolean[m];
    for(int i=0;i<n;i++) {
    	for(int j=0;j<m;j++) {
    		if(arr[i][j]==0) {
    			zerorows[i]=true;
    			zerocolumns[j]=true;
    			
    		}
    	}
    }
    for(int i=0;i<n;i++) {
    	for(int j=0;j<m;j++) {
    		if(zerorows[i]||zerocolumns[j]){
    			arr[i][j]=0;
    		}
    	}
    }
}
	}


