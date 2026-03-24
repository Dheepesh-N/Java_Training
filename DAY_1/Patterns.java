import java.util.Scanner;

public class Patterns {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for(int row=1;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if((row==1)||(row==n)||(col==1)||col==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if((row==1)||(row==n)||(col==1)||col==n || (row==col) ||(row+col==n+1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int row=1;row<=n;row++){
            for(int space=1;space<row;space++){
                System.out.print("  ");
            }
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for(int row=1;row<=n;row++){
            for(int space=n - 1;space>=row;space--){
                System.out.print("  ");
            }
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        sc.close();

}
}