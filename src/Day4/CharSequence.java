package Day4;
import java.util.Scanner;
public class CharSequence {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            char[] chars = str.toCharArray();
            boolean[] counted = new boolean[chars.length];
            for (int i = 0; i < chars.length; i++) {
                if (counted[i]) continue;

                int count = 1;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println(chars[i] + " → " + count);
            }
            sc.close();
        }
    }


