package org.lickingheights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Phase 1 and 2
        double pounds, inches;
        String Username, greetings;
        greetings= "Hello!";
        Scanner keyboard= new Scanner(System.in);
        System.out.println(greetings+ "What is your name?");
        Username= keyboard.nextLine();
        System.out.println("Hi!"+ Username+ "I would like to ask you some questions.");
        System.out.println("For starters, what is your height in inches?");
        inches= keyboard.nextDouble()*0.0254;
        System.out.println("What is your weight in pounds?");
        pounds= keyboard.nextDouble()*0.454;
        
    }
}
