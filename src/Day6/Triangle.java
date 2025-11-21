package Day6;

public class Triangle {
        public static void main(String[] args) {
            int n = 5;
            for (int i = 1; i <= n; i++) {
                int value = (i % 2 == 1) ? 1 : 0;

                for (int j = 1; j <= i; j++) {
                    System.out.print(value);
                    value = 1 - value;
                }
                System.out.println();
            }
        }
    }


