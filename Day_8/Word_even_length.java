import java.util.*;

public class Word_even_length {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i <= str.length(); i++){
            if(i == str.length() || str.charAt(i) == ' '){
                
                if(word.length() % 2 == 0 && word.length() > 0){
                    result.append(word).append(" ");
                }
                word.setLength(0);
            } 
            else {
                word.append(str.charAt(i));
            }
        }

        System.out.print(result.toString().trim());
        sc.close();
    }
}