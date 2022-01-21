package com.mycompany.factory;

public class BigKnife implements Knife {
    @Override
    public void cut() {
        System.out.println("Big knife cut");
    }
}