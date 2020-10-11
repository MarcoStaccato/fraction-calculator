package com.staccato;

public class App {

    public final static String CLEAN_SPACES = "clean-spaces";

    public static boolean cleanSpaces = false;

    public static void main( String[] args ) {
        System.out.println("Work in progress!");
        for(String arg : args) {
            if(arg.equals(CLEAN_SPACES)) {
                cleanSpaces = true;
            }
        }
    }

}