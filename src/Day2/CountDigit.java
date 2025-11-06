package Day2;

public class CountDigit {
        public static void main(String[] args) {
            int num = 746287;
            int count = 0;
            int n = num;
            while (n != 0) {
                n /= 10;
                count++;
            }
            System.out.println("Number of digits in " + num + " = " + count);
        }
    }


