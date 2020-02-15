package com.company;

import java.util.Random;
import java.util.Scanner;

import static com.company.View.YOUR_VALUE;

public class Controller {
    private Model model;
    private View view;

    private static final int MAX_RANGE = 100;
    private static final int MIN_RANGE = 0;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        model.setMaxRange(MAX_RANGE);
        model.setMinRange(MIN_RANGE);
    }

    //    Work method
    public void processUser(){
//        model.setMaxRange(MAX_RANGE);
//        model.setMinRange(MIN_RANGE);MIN_RANGE

        Random rand = new Random();
        model.setValue(getRandValue(rand));
        Scanner sc = new Scanner(System.in);
//        System.out.println(model.getValue());
        do {
            model.setInput(inputIntValueWithDiapason(sc));
            model.saveAnswers(model.getInput());

            if (model.getInput() > model.getValue()){
                model.setMaxRange(model.getInput());
            }
            else{
                model.setMinRange(model.getInput());
            }
        }
        while (model.getInput() != model.getValue());

        view.printMessage(View.WIN + model.getValue());
        view.printMessage(View.YOUR_VALUE + model.getStat());
    }

    public int getRandValue(Random rand) {
        return rand.nextInt((model.getMaxRange() - (model.getMinRange() + 1)));
    }


    public int inputIntValueWithDiapason(Scanner sc){
        int res = 0;
        view.printMessage(View.INPUT_INT_DATA +
                model.getMinRange() + View.SEP + model.getMaxRange());

        while( true ) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_DATA
                        + View.INPUT_INT_DATA + model.getMinRange()
                        + View.SEP + model.getMaxRange());
                sc.next();
            }
            // check value in diapason
            if ((res = sc.nextInt()) <= model.getMinRange() ||
                    res >= model.getMaxRange()) {
                view.printMessage(View.WRONG_RANGE_DATA
                        + View.INPUT_INT_DATA);
                continue ;
            }
            break;
        }
        return res;
    }
}
