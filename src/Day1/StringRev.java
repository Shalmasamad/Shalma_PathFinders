package Day1;
import java.util.Scanner;
public class StringRev {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String og=sc.nextLine();
        StringBuilder sb = new StringBuilder(og);
        System.out.println("the reversed string is " +sb.reverse());

    }
}
