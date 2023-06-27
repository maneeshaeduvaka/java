import java.util.Scanner;
public class reverse {
    public static void main(String args[]){
        int rev=0;
        Scanner read=new Scanner(System.in);
        int i = read.nextInt();
        while(i != 0){
            rev = rev*10;
            rev = rev+i%10;
            i = i/10;
        }
        System.out.println(rev);
    }
}
