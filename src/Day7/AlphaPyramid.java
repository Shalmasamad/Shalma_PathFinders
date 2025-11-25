package Day7;

public class AlphaPyramid {
        public static void main(String[] args) {
            int n = 5;
            for (int i = 1; i <= n; i++) {
                for (int s = 1; s <= n - i; s++) {
                    System.out.print(" ");
                }
                char ch = 'A';
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch);
                    ch++;
                }
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print(ch);
                    ch--;
                }

                System.out.println();
            }
        }
    }


