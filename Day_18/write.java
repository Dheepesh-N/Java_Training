import java.io.BufferedWriter;
import java.io.FileWriter;

public class write {
    public static void main(String[] args){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
            writer.write("Hi How are You\n");
            writer.write("Hi How are You\n");
            writer.write("Hi How are You\n");
            writer.write("Hi How are You\n");
            writer.close();
            
        } catch (Exception e) {
            System.out.print(e);   
        }
    }
}
