package com.mycompany.factory;

public class AbstractFactory {
    
    public static void main(String[] args) {
        KnifeFactory knifeFactory = new BudgetKnifeFactory();
        Knife knife = knifeFactory.createKnife("SmallKnife");
        knife.cut();
    }

}
