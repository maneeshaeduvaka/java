import java.util.Scanner;
public class floydsTriangle {
    public static void main(String args[]){
        int i,j,num=1;
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
