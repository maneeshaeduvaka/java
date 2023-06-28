import java.util.Scanner;
public class primenumber {
   public static void main(String args[]){
    int n,m,flag=0;
    Scanner read = new Scanner(System.in);
    n = read.nextInt();
    m = n/2;
    if(n == 0 || n == 1){
        System.out.println("Not a prime number");
    }
    else{
        for(int i=2;i<=m;i++){
            if(n%i == 0){
                flag = 1;
                System.out.println("Not a prime number");
            }
        }
        if(flag == 0){
            System.out.println("Is a prime number");
        }
    }
   } 
}
