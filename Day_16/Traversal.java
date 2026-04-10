/*
Iterator:
     Travers+ing collection element by element through cursor
  1. .hasnext()
  2. .next()
  3. .remove()
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;


public class Traversal {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,3,4,5));
        ListIterator<Integer> it=list.listIterator();
        while(it.hasNext()){
            int cur=it.next();
            if(cur==4){
                it.remove();
            }
        }
        while(it.hasPrevious()){
            int pre = it.previous();
            System.out.print(pre+" ");

        }
        System.out.println();

    }
}
