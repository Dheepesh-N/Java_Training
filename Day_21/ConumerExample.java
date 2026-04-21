import java.util.List;
import java.util.function.Consumer;

public class ConumerExample {
    class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}

    public static void main(String[] args) {
        Consumer<String> p=(s)->System.out.println(s);
        Consumer<String> pn=(s)->System.out.println(s.name);
        pn.accept(new Student("Test"));
        p.accept("test2");
        List<String> names=List.of("abc","fgfd","bhj");
        names.forEach(name->System.out.println(name));
        names.forEach(System.out::println);
        }
}
