/* 
FILE HANDELING
    - To store data Permenantly for Later
    - To use the data bettween different Systems
    - Java.io. package

   open
   close
   read
   write
   create
I/O STREAMS
   BYTE STREAMS(USED IN AUDIO VIDEO IMAGES)

    ->INPUT STREAM
         ->FILE INPUT STREAM
         ->BUFFERED INPUT STREAM
   
    ->OUTPUT STREAM
         ->FILE OUTPUT
         ->BUFFERED OUTPUT

    CHARACTER STREAM(TEXT FILE CHARECTER INPUT)
        ->READER
           ->FILE READER
            ->BUFFERED READER
       ->WRITER
           ->FILE WRITER
           ->BUFFERED WRITER
*/
import java.io.File;
import java.io.IOException;
public class File_Handling {
    public static void main(String[] args) throws IOException{
       try{
            File newfile = new File("test.txt");
            if(newfile.createNewFile()){
                 System.out.print("File Created: " + newfile.getName());
            }
            else{
                 System.out.print("Not able to Create file");
            }    
        }
        catch(IOException e)
        {
            System.out.print(e.getMessage());
        }
    }
}
