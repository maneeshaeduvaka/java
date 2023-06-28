import java.util.Scanner;
import java.lang.Math;
public class armstrong {
    public static void main(String args[]){
        int n,temp,digit=0,rem,sum=0;
        Scanner read = new Scanner(System.in);
        n = read.nextInt();
        temp = n;
        while(temp != 0){
            digit++;
            temp = temp/10;
        }
        temp = n;
        while(temp != 0){
            rem = temp%10;
            sum = sum + (int)Math.pow(rem, digit);
            temp = temp/10;
        }
        if(n==sum){
            System.out.println("Is an Armstrong number");
        }
        else{
            System.out.println("Is not an Armstrong number");
        }
    }
}
