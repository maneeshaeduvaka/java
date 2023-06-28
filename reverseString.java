import java.util.Scanner;
public class reverseString {
    public static void main(String args[]){
        String reverse="";
        Scanner read=new Scanner(System.in);
        String s = read.nextLine();
        int l= s.length();
        for(int i=l-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        System.out.println(reverse);
    }
}
