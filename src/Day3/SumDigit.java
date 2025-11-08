package Day3;

public class SumDigit {

        public static void main(String[] args) {
            int num = 3710;
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }

            System.out.println("Sum of digits: " + sum);
        }
    }


