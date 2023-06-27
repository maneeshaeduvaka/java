import java.util.Scanner;
public class oddandEven{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        if(a%2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }

    }
}