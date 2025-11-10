package Day4;
import java.util.Scanner;
public class SumSingle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            while (num >= 10) {
                int sum = 0;
                int temp = num;

                while (temp > 0) {
                    sum += temp % 10;
                    temp /= 10;
                }

                num = sum;
            }

            System.out.println("Single digit sum: " + num);
        }
    }


