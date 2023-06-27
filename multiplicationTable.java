import java.util.Scanner;
public class multiplicationTable {
    public static void main(String args[]){
        int mul;
        Scanner read = new Scanner(System.in);
        int n =read.nextInt();
        for(int i=1;i<=10;i++){
            mul = i*n;
            System.out.println(n + "x" + i + " " + "=" + " " + mul);
        }
    }
}
