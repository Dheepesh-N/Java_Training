public class StringTest{
    public static void main(String[] args){
        String s="learning java programming";
        StringBuilder s3=new StringBuilder(s);
        
        char[] ch={'a','b','c'};
        System.out.println(new String(ch));
        for(char c:s.toCharArray()){
            System.out.println(c);
        }
        s=s.replace("java","python");
        System.out.println(s);
        System.out.print(s3);
    }
    
}
