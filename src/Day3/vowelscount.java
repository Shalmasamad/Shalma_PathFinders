package Day3;

public class vowelscount {
        public static void main(String[] args) {
            String str = "Pathfinders";
            int count = 0;

            // Loop through each character
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                // Check for vowels manually (both lowercase and uppercase)
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                        ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }

            System.out.println("Number of vowels: " + count);
        }
    }


