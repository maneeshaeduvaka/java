import java.util.Scanner;
public class subString {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        String s = read.nextLine();
        int l=s.length();
        for(int i=0;i<=l;i++){
            for(int c=1;c<=l-i;c++){
                String sub = s.substring(i, c+i);
                System.out.println(sub);
            }
        }
    }
}
