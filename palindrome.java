import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        String reverse="";
        Scanner read=new Scanner(System.in);
        String s = read.nextLine();
        int l= s.length();
        for(int i=l-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        if(s.equals(reverse)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
