package designpattern;

interface KnifeFactory {
    Knife createKnife();
}

public class BudgetKnifeFactory implements KnifeFactory {
    @Override
    public Knife createKnife(String type) {

        if(type.equals("SmallKnife")) {
            return new BudgetKnife();
        }
        else if(type.equals("BigKnife")) {
            return new BigKnife();
        }
        else {
            return null;
        }

    }
}

public class LuxuryKnifeFactory implements KnifeFactory {
    @Override
    public Knife createKnife(String type) {

        if(type.equals("SmallKnife")) {
            return new SmallKnife();
        }
        else if(type.equals("BigKnife")) {
            return new BigKnife();
        }
        else {
            return null;
        }

    }
}

interface Knife {
    void cut();
}

public class SmallKnife implements Knife {
    @Override
    public void cut() {
        System.out.println("Small knife cut");
    }
}

public class BigKnife implements Knife {
    @Override
    public void cut() {
        System.out.println("Big knife cut");
    }
}


public class AbstractFactory {
    
    public static void main(String[] args) {
        KnifeFactory knifeFactory = new BudgetKnifeFactory();
        Knife knife = knifeFactory.createKnife("SmallKnife");
        knife.cut();
    }

}
