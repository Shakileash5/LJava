package OOPS;

class Animal{
    private String name;
    protected int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Animal(){
        this.name = "Animal";
        this.age = 1;
    }

    public String getName(){
        return name;
    }

    protected void eat(){
        System.out.println(this.age + " is eating now");
    }
}

class Dog extends Animal{
    
    
    public Dog(String name, int age){
        super(name, age);
    }

    /* Overriding the eat method of Animal class  
     * by using the keyword 'override'
     * 
     */
    @Override
    public void eat(){
        System.out.println(this.age + " is eating now");
    }

}

public class OverridePRac {
    
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Animal d = new Dog("Dog", 2);
        d.eat();
    }
}
