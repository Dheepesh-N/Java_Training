import java.util.*;
public class paterns {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=1;row<=n;row++){
            for(int col=row;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++) {

            // print spaces
            for(int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for(int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*(n-i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
