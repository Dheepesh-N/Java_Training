import java.util.*;
public class WaveForm
{
    public static void wave(String str){
         StringBuilder strn=new StringBuilder();
        for(int i=0;i<str.length();i+=2){
                strn.append(str.charAt(i));
        }
        for(int i=1;i<str.length();i+=2){
                strn.append(str.charAt(i));
        }
        System.out.print(strn);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        wave(str);
        sc.close();
    }
    
}
