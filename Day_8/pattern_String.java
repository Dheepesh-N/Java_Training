import java.util.*;
public class pattern_String {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String  str=sc.nextLine();
        int l=str.length();
        char[] ch=str.toCharArray();
        char[][] mat=new char[l-2][l-1];
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length() - 1;j++){
                mat[i][0]=ch[i];
                mat[i][0];
            }
        }
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length() - 1;j++){
                System.out.print(mat[i][j]);
                
            }
        }
        sc.close();
    }
}
