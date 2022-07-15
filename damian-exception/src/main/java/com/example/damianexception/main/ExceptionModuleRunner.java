package com.example.damianexception.main;

import com.example.damianexception.io.FileReader;
import com.example.damianexception.io.FileReaderException;
public final class ExceptionModuleRunner {

    public static void main(String[] args) {
       FileReader fileReader = new FileReader();

        try {
            fileReader.readFile("names.txt");
        } catch (FileReaderException e) {
            System.out.println("It's ok");
        } finally {
            System.out.println("Good!");
        }
    }

}
