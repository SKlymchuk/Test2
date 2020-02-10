package com.company;

import java.util.*;

public class Model {
    private int Input;
    private int MinRange;
    private int MaxRange;
    private int Value;
    private LinkedList<Integer> answers = new LinkedList<Integer>();

    public void saveAnswers(int num){
        this.answers.add(num);
    }
    public LinkedList getStat(){
        return answers;
    }

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
