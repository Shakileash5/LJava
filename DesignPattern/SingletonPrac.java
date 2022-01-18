package DesignPattern;

import javax.xml.crypto.Data;

class Database{

    private static Database obj;

    private Database(){
        // private constructor as it is singleton class

        System.out.println("An instance is created");
    }

    public static Database get_instance(){

        if(obj == null){
            obj = new Database();
        }
        return obj;
    }

    public void display(){
        System.out.println("Im an class");
    }

}


public class SingletonPrac {

    public static void main(String[] args){

        Database obj1 = Database.get_instance();
        obj1.display();

        Database obj2 = Database.get_instance();
        obj2.display();

    }
}
