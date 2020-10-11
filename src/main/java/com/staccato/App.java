package com.staccato;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {

    public final static String CLEAN_SPACES = "clean-spaces";

    public final static Set<String> EXIT_COMMANDS = new HashSet<>(Arrays.asList("quit", "exit"));

    public static boolean cleanSpaces = false;

    public static void main( String[] args ) {
        for(String arg : args) {
            if(arg.equals(CLEAN_SPACES)) {
                cleanSpaces = true;
            }
        }
        String input = ""; //empty input
        System.out.println("Welcome! to quit type quit or exit");

        System.out.println("Type your operation an then type enter 🦾 ");

        while(true) {
            print("");
            Scanner in = new Scanner(System.in);
            input = in.nextLine();
            if(isQuitCommand(input)) {
                print("Thanks for using this calculator! 👾");
                System.exit(0);
            }
            Calculator calculator = new Calculator(input);
            print("Your input is: [" + input + "]" + "\n");
            Fraction result = calculator.calculate();
            print("Result: " + result  + "\n");
            print("Mixed Result: " + FractionReducer.reduceToMixed(result)  + "\n");
        }
    }

    private static boolean isQuitCommand(String input) {
        if(EXIT_COMMANDS.contains(input.trim().toLowerCase())) return true;
        return false;
    }

    private static void print(String s) {
        System.out.print("> " + s);
    }

}