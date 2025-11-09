package Day4;

public class RemoveDuplicates {
        public static void main(String[] args) {
            int[] arr = {2,4,6,8,10,12,14,2,4,6};
            int length = arr.length;
            System.out.print("Original Array: ");
            for (int i = 0; i < length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.print("Duplicate Elements Removed: ");
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[j] + " ");
                        for (int k = j; k < length - 1; k++) {
                            arr[k] = arr[k + 1];
                        }
                        length--;
                        j--;
                    }
                }
            }
            System.out.println();
            System.out.print("Array After Removing Duplicates: ");
            for (int i = 0; i < length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
