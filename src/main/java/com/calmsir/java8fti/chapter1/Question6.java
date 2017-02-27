package com.calmsir.java8fti.chapter1;

public class Question6 {
    @FunctionalInterface
    public interface RunnableEx {
        void run() throws Exception;
    }

    private static Runnable uncheck(RunnableEx runnableEx) {
        return () -> {
            try {
                runnableEx.run();
            } catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        };
    }

    public static void main(String[] args) {
        new Thread(uncheck(
                () -> {
                    System.out.println("Zzz");
                    Thread.sleep(1000);
                }
        )).start();
    }

}
