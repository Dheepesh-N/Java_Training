import java.util.*;
public class alist {
    public static void main(String[] args){
        // REMOVE EVEN
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,4,2,3,4,5,6));
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                list.remove(i);
                i--;
            }
        }

        //REMOVE DUPLICATES

        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,2,4,2,3,4,5,6));
        /*Collections.sort(list2);
        for(int i=0;i<list2.size()-2;i++){
                if(list2.get(i)==list2.get(i+1)){
                    list2.remove(i);
                    i--;
                }
        }
                */

        for(int i=0;i<list2.size();i++){
            for(int j=i+1;j<list2.size();j++){
                if(list.get(i)==list2.get(j)){
                    list.remove(list2.get(j));
                    j--;
                }
            }
        }
        System.out.println(list);
        System.out.print(list2);
    }
}
