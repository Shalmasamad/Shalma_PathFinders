package Day3;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {20,46,21,0,221};
        int sum=0 ;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
