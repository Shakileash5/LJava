package IOByteStream;

import java.io.*;

class Dog implements Serializable{
    // dummy variables
    private int a;
    private int b;

    /*
    *   constructor to initialize dymmy variables
    */
    public Dog(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA(){
        return this.a;
    }

    public int getB(){
        return this.b;
    }
}

public class ObjectStream {

    public static void main(String[] args){

        Dog obj = new Dog(8,9);
        System.out.println("Object variables before ::: a - "+obj.getA()+" b - "+obj.getB());
        try{
            // write the object into the file
            FileOutputStream fOut = new FileOutputStream("C:/Users/MSI/LJava/IOByteStream/ObjectStore.txt");
            ObjectOutputStream out = new ObjectOutputStream(fOut);        
            out.writeObject(obj);
            
            //fOut.close();

            // Read the Object from the file
            FileInputStream fIn = new FileInputStream("C:/Users/MSI/LJava/IOByteStream/ObjectStore.txt");
            ObjectInputStream in = new ObjectInputStream(fIn);
            Dog data = (Dog) in.readObject();
            System.out.println("Object variables after ::: a - "+data.getA()+" b - "+data.getB());
            out.close();
            in.close();
            

        }
        catch(Exception e){
            System.out.println(e);
            
        }

    }

}   
