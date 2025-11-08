package Day3;

public class LargestArray {
        public static void main(String[] args) {
            int[] arr = {20,46,21,0,221};
            int lar = Integer.MIN_VALUE;
            int secondLar = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > lar) {
                    secondLar = lar;
                    lar = arr[i];
                } else if (arr[i] > secondLar && arr[i] != lar) {
                    secondLar = arr[i];
                }
            }

            System.out.println("Second largest element: " + secondLar);
        }
    }


