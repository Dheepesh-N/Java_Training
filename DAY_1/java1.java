import java.util.*;
public class java1 {
    public static int mul(int a,int b){
        return a*b;
    }
    public static int sq(int n){
        return mul(n,n);
    }
    public static void print(int n){
        System.out.println(n);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        print(sq(a));
        sc.close();
    }
}
