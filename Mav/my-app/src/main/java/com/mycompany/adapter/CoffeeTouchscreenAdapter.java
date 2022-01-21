package com.mycompany.adapter;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface{
    OldCoffeeMachine oldMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine oldMachine) {
        this.oldMachine = oldMachine;
    }

    @Override
    public void chooseFirstSelection() {
        oldMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        oldMachine.selectB();
    }

}
