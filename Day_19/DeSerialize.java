import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialize {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("test.txt");
            ObjectInputStream obj= new ObjectInputStream(fi);
            while(true){
                try {
                    Student s= (Student)obj.readObject();
                    System.out.print(s.name+" "+s.mark);
                } catch (Exception e) {
                    break;
                }
            }
            fi.close();
            obj.close();
        } catch (Exception e) {
            System.out.print(e);
        }
        
    }
}
