
/*
FILE READER
   read() method
     returns ASCII values
     return -1 when it reads the end
*/
import java.io.FileReader;

public class Read {
    public static void main(String[] args) {
        try {
            FileReader newfile= new FileReader("test.txt");
            int ch;
            while((ch=newfile.read())!=-1){
                System.out.print((char)ch);
            }

        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
