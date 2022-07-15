package com.example.damianexception.io;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileReader {

    public void readFile(final String fileName) throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());



        try  (Stream<String> fileLines = Files.lines(Path.of(classLoader.getResource(fileName).toURI()))) {
            fileLines.forEach(System.out::println);

        } catch (Exception e) {
            throw new FileReaderException();
        } finally {
            System.out.println("I'm gona be here .... always!");
        }
    }

}
