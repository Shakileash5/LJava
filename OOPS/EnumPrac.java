package OOPS;

enum storage{
    EMPTY, FULL, OVERFLOW, UNDERFLOW
}

enum Size {
    SMALL {
 
       // overriding toString() for SMALL
       public String toString() {
         return "The size is small.";
       }
    },
 
    MEDIUM {
 
      // overriding toString() for MEDIUM
       public String toString() {
         return "The size is medium.";
       }
    };
 }

public class EnumPrac {
    
    public static void main(String[] args) {
        storage s = storage.FULL;
        System.out.println(s);

        System.out.println(storage.valueOf("FULL"));
        //System.out.println(ordinal(storage.FULL));
        storage[] st = storage.values();
        System.out.println(st);
        System.out.println(storage.FULL.compareTo(storage.UNDERFLOW));
        // get ordinal value of enum
        System.out.println(storage.FULL.ordinal());
        System.out.println(Size.MEDIUM.toString());
    }   

}


