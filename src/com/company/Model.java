package com.company;

public class Model {
    private int Input;
    private int MinRange;
    private int MaxRange;
    private int Value;

    public void setInput(int input){
        this.Input = input;
    }

    public int getInput() {
        return Input;
    }

    public void setMinRange(int minRange) {
        MinRange = minRange;
    }

    public int getMinRange() {
        return MinRange;
    }

    public void setMaxRange(int maxRange) {
        MaxRange = maxRange;
    }

    public int getMaxRange() {
        return MaxRange;
    }

    public void setValue(int value) {
        Value = value;
    }

    public int getValue() {
        return Value;
    }
}
