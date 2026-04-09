import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Freqency {
     public static void main(String[] args){
        int[] arr={1,2,1,5,2,1,5,4,3,4,5,};
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i,map.getOrDefault(i,1)+1);
            
        }
        for(Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
            
        }}

}
