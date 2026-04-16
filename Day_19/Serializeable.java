import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable{
    String name;
    int mark;
    Student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
}
class CustomerOutputStream extends ObjectOutputStream{
     CustomerOutputStream(ObjectOutputStream obj) throws IOException{
        super(obj);
     }
     @Override
     protected void writeStreamHeader(){
        
     }
}

public class Serializeable {
    public static void main(String[] args) throws IOException {
        Student s= new Student("xyz",50);
        FileOutputStream fo=new FileOutputStream("test.txt");
        ObjectOutputStream obj=new ObjectOutputStream(fo);
        obj.writeObject(s);
        fo.close();
        obj.close();
    }
}
