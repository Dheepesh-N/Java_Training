import java.util.*;
public class non_repeting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        for(int i=0;i<s.length();i++){
            if(s.lastIndexOf(s.charAt(i))==i){
                System.out.print(s.charAt(i));
                break;
            }
            
        }
        sc.close();
    }
}
