import java.util.*;
public class Po {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int c=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
                if(str.charAt(i+1)==' '){
                    c++;
                }
            }
        }
        char ch=str.charAt(str.length() - 1);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            c++;
        }
        System.out.print(c);
        sc.close();
   }
}
