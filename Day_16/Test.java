import java.util.*;

public class Test {
    public static List<Character> sort(String s){
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
            @Override
            public int compare(Map.Entry<Character,Integer> a, Map.Entry<Character,Integer> b){
                    if(!a.getValue().equals(b.getValue())){
                        return b.getKey() - a.getValue();   
                    }
                     return a.getKey() - b.getValue();
            }
        });
        List<Character> res=new ArrayList<>();
        for(Map.Entry<Character,Integer> i : list){
            res.add(i.getKey());
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "tree";
        System.out.print(sort(s));
       
    }
}