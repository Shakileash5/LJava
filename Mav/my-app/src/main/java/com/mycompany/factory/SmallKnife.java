package com.mycompany.factory;

public class SmallKnife implements Knife {
    @Override
    public void cut() {
        System.out.println("Small knife cut");
    }
}
