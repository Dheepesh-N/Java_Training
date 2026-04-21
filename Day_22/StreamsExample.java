import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> nums=List.of(2,3,4,5,6,7);
        List<Integer> mulBy2=nums.stream().map((i)->i*2).toList();
        System.out.print(mulBy2);
    }
}
