import java.util.function.Supplier;

class Person{
    String name="Supplier";
}
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> a=()->(int)(Math.random()*100);
        System.out.println(a.get());
        Supplier<Person> p=()->new Person();
        System.out.println(p.get().name);

    }
}
