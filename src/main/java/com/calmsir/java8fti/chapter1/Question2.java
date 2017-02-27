package com.calmsir.java8fti.chapter1;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Collection;

public class Question2 {
    private static Collection<File> getSubdirectories(final File directory) {
        File[] subDirectories = directory.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });

        return Arrays.asList(subDirectories);
    }

    private static Collection<File> getSubdirectoriesUsingLambda(final File directory) {
        return Arrays.asList(directory.listFiles(pathname -> pathname.isDirectory()));
    }

    private static Collection<File> getSubdirectoriesUsingMethodRef(final File directory) {
        return Arrays.asList(directory.listFiles(File::isDirectory));
    }

    public static void main(String[] args) {
        final File root = new File("/");

        // Using method
        getSubdirectories(root).forEach(dir -> System.out.println("Method :: " + dir));

        // Using lambda
        getSubdirectoriesUsingLambda(root).forEach(dir -> System.out.println("Lambda :: " + dir));

        // Using method reference
        getSubdirectoriesUsingMethodRef(root).forEach(dir -> System.out.println("Method Ref :: " + dir));
    }
}
