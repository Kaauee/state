package com.mycompany.unisul_state;



public class StopState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in Stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }



}
