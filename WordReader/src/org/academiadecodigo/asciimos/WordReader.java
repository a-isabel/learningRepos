package org.academiadecodigo.asciimos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordReader {

    private String source;
    private FileReader reader;
    private String line;
    private String result;

    public String readFileByLine(String source) throws IOException {

        FileReader reader = new FileReader(source);

        BufferedReader bReader = new BufferedReader(reader);

        try {
            while ((line = bReader.readLine()) != null) {
                result += line + "/n";
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } finally {
            bReader.close();
        }

        return result;

    }

}
