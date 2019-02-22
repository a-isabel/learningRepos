package org.academiadecodigo.asciimos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManager {

    public static void copyFile() throws IOException {

        FileInputStream inputStream = new FileInputStream("/Users/anaisabel/IdeaProjects/Projects/Input_Output/resources/xanadu");
        FileOutputStream outputStream = new FileOutputStream("/Users/anaisabel/IdeaProjects/Projects/Input_Output/resources/output_Xanadu");


        try {

            int data = 0;

            while (data != -1) {
                data = inputStream.read();
                if (data == -1){
                    return;
                }
                outputStream.write(data);
                System.out.println(data);

            }
        }
            catch (IOException e) {
                e.printStackTrace();

        } finally {

            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

}
