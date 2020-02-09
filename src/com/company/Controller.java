package com.company;

import java.util.Random;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

//    Work method
    public void processUser(){
        model.setMaxRange(100);
        model.setMinRange(0);

        Random rand = new Random();
        model.setValue(rand.nextInt((model.getMaxRange() - model.getMinRange()) + 1));
        Scanner sc = new Scanner(System.in);

        do {
            model.setInput(inputIntValueWithDiapason(sc));

            if (model.getInput() > model.getValue()){
                model.setMaxRange(model.getInput());
            }
            else{
                model.setMinRange(model.getInput());
            }
        }
        while (model.getInput() != model.getValue());

        view.printMessage(View.WIN + model.getValue());
    }


    public int inputIntValueWithDiapason(Scanner sc){
        int res = 0;
        view.printMessage(view.INPUT_INT_DATA +
                model.getMinRange() + view.SEP + model.getMaxRange());

        while( true ) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(view.WRONG_INPUT_DATA
                        + view.INPUT_INT_DATA + model.getMinRange()
                        + view.SEP + model.getMaxRange());
                sc.next();
            }
            // check value in diapason
            if ((res = sc.nextInt()) <= model.getMinRange() ||
                    res >= model.getMaxRange()) {
                view.printMessage(view.WRONG_RANGE_DATA
                        + View.INPUT_INT_DATA);
                continue ;
            }
            break;
        }
        return res;
    }
}
