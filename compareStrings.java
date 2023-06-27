import java.util.Scanner;
public class compareStrings {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        if(s1.compareTo(s2) > 0){
            System.out.println("s1 is greater than s2");
        }
        else if(s1.compareTo(s2) < 0){
            System.out.println("s2 is greater than s1");
        }
        else{
            System.out.println("s1 is equal to s2");
        }
    }
}
