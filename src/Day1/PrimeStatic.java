package Day1;

public class PrimeStatic {
    public static void main(String[] args){
        int num=11;
        int divi=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                divi ++;
            }
        }
        if(divi==2){
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }
    }
}
