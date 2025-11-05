package Day1;
import java.util.Scanner;
public class Prime {
public static void main(String[] args)
{
    int divi =0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a number");
  int num=sc.nextInt();
  for(int i=1;i<=num;i++){
      if(num%i==0){
          divi ++;

      }
  }
  if(divi==2){
      System.out.println(num+ "is a prime number");
  }
  else{
      System.out.println(num+ "is not a prime number");
  }
}
}
