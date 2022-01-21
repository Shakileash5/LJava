package designpattern;

import javax.xml.crypto.Data;

public class Knife {
    public void cut() {
        System.out.println("Cutting...");
    }
}

public class KnifeFactory {
    public static Knife createKnife(String knifeType) {
        Knife knife = null;
        if (knifeType.equals("Stiletto")) {
            knife = new StilettoKnife();
        } else if (knifeType.equals("Butterfly")) {
            knife = new ButterflyKnife();
        } else if (knifeType.equals("Falchion")) {
            knife = new FalchionKnife();
        }
        return knife;
    }
}

public class StilettoKnife extends Knife {
    public void cut() {
        System.out.println("Stiletto Knife Cutting...");
    }
}

public class ButterflyKnife extends Knife {
    public void cut() {
        System.out.println("Butterfly Knife Cutting...");
    }
}

public class FalchionKnife extends Knife {
    public void cut() {
        System.out.println("Falchion Knife Cutting...");
    }
}


public class FactoryMethodPattern {
    
    public static void main(String[] args) {
        Knife knife = KnifeFactory.createKnife("Stiletto");
        knife.cut();
    }
}

