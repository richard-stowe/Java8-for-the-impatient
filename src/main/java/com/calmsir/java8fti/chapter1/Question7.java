package com.calmsir.java8fti.chapter1;

public class Question7 {
    private static Runnable andThen(Runnable stepOne, Runnable stepTwo) {
        return () -> {
            stepOne.run();
            stepTwo.run();
        };
    }

    public static void main(String[] args) {
        Runnable runnable = andThen(() -> System.out.println("Hello"), () ->  System.out.println("World"));
        runnable.run();
    }
}
