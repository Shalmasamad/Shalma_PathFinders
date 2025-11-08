package Day3;

public class MaxMin {
        public static void main(String[] args) {
            int[] arr = {32,5,87,91,20,6};

            int max = arr[0];
            int min = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("Maximum element: " + max);
            System.out.println("Minimum element: " + min);
        }
    }



