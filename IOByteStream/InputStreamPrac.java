package IOByteStream;

import java.io.*;

public class InputStreamPrac {

    public static void main(String[]args){

        byte[] arr = new byte[100];
        try{
            InputStream in = new FileInputStream("C:/Users/MSI/LJava/IOByteStream/text.txt");     
            System.out.println("File size: " + in.available());
            //int count = in.read(arr);
            //System.out.println("Read " + count + " bytes");
            byte b;
            String dataVal = new String();
            while((b = (byte)in.read()) != -1){
                dataVal += (char)b;
            }
            System.out.println(dataVal);
            in.close();

            String data = new String(arr);
            System.out.println(data);

        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("IOException");
        }
        
        try{
            InputStream in = new FileInputStream("C:/Users/MSI/LJava/IOByteStream/text.txt");     
            System.out.println("File size: " + in.available());

            in.read(arr,10,5);
            String data = new String(arr);
            System.out.println(data);
            in.close();
            
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("IOException");
        }

    }
    
}
