package com.solid;

public class BackEndDeveloper implements Developer {

    @Override
    public void develop() {
        writeJava();
    }

    private void writeJava() {
    	System.out.println("writing java code");
    }

}
