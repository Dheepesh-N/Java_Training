public class Exception {
    public static void main(String[] args){
        try{
            /*int a=10;
            int b=0;
            int c=a/b;
            System.out.print(c);*/
            String s=null;
            System.out.print(s.length());
        }catch(ArithmeticException e){
            System.out.println("Number is divided by Zero");

        }
        catch(NullPointerException e){
            System.out.println("NUll");
        }
        finally{
            System.out.print("Finally block always Executed");
        }  
    }
}
