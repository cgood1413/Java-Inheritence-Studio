package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question{

    public Checkbox(String prompt, ArrayList<String> correctAnswers, ArrayList<String> possibleAnswers) {
        super(prompt, correctAnswers, possibleAnswers);
    }

    @Override
    public void addResponse(){
        Scanner input = new Scanner(System.in);
        boolean isContinuing = true;
        System.out.println("Press enter once to submit a response or twice to finalize responses");
        while(isContinuing){
            String response = input.nextLine();
            if(response.equals("")){
                isContinuing = false;
            } else {
                this.getResponses().add(response);
            }
        }
    }

}
