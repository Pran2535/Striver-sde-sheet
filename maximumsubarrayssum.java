package arrays;

public class maximumsubarraysum{
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Added comma after 1
        System.out.println(maximum(arr));
    }

    public static int maximum(int arr[]) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                temp = Math.max(arr[j], temp + arr[j]); // Update temp directly
                if (temp > sum) {
                    sum = temp;
                }
            }
        }
        return sum;
    }
}
