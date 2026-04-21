interface Math{
    int add(int a,int b);
}
public class LambdaExample {
    public static void main(String[] args) {
        Math addfun= new Math(){
            @Override
              public int add(int a,int b){
                  return a+b;
                 }
            };
            System.out.print(addfun.add(11,32));
    }
}
