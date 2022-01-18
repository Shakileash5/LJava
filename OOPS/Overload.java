package OOPS;

public class Overload {

    int a;
    int b;
    
    public Overload(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void add(int a, int b) {
        System.out.println("Addition of two numbers is " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Addition of three numbers is " + (a + b + c));
    }

    public void add(Double a, double b) {
        System.out.println("Addition of two double numbers is " + (a + b ));
    }

    public static void main(String[] args) {
        Overload obj = new Overload(10, 20);
        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10.0, 20.0);
    }

    
}
