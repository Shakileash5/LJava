package IOByteStream;

import java.io.*;

public class OutputStreamPrac {
    
    public static void main(String[] args){

        final String dataVal = "This is an demo text, pls ignore.";
        try{
            OutputStream out = new FileOutputStream("C:/Users/MSI/LJava/IOByteStream/Write.txt");
            byte[] data = dataVal.getBytes();

            out.write(data);
            out.flush();
            out.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("IOException");
        }

    }

}
