package IOByteStream;

import java.io.*;

public class FileHandling {
    
    public static void main(String[] args){

        String Data = "This is an empty file please use it for Testing purpose. This content is purley not relevant";

        try{
            // write to file
            FileOutputStream fOut = new FileOutputStream("C:/Users/MSI/LJava/IOByteStream/test.txt");
            BufferedOutputStream bOut = new BufferedOutputStream(fOut);

            byte[] data = Data.getBytes();
            System.out.println("Data is : " + data.length);

            int bytesWritten = 0;
            int toWrite = 10;
            while(bytesWritten < data.length){ // write 10 bytes at a time
                if(data.length - bytesWritten < 10){ // if there is less than 10 bytes left
                    toWrite = data.length - bytesWritten;
                }
                bOut.write(data, bytesWritten, toWrite);
                bytesWritten += toWrite;
            }

            bOut.close();
            fOut.close();

            // read from file
            FileInputStream fIn = new FileInputStream("C:/Users/MSI/LJava/IOByteStream/test.txt");
            BufferedInputStream bIn = new BufferedInputStream(fIn);

            byte[] dataRead = new byte[100];

            int bytesRead = 0;
            int idx = 0;
            while((bytesRead = bIn.read())!=-1){ // read 1 byte at a time
                System.out.print((char)bytesRead);
                dataRead[idx] = (byte)bytesRead;
                idx++;
            }

            String dataConverted = new String(dataRead);
            System.out.println("\nData read is : " + dataConverted);

        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }
    }

}
