package com.mycompany.factory;

public class BudgetKnifeFactory implements KnifeFactory {
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