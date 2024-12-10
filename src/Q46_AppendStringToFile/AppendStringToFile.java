package Q46_AppendStringToFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendStringToFile {
    public static void appendStringToFile(String fileName, String content) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter(fileName));

            bufferedWriter.write(content);
            bufferedWriter.close();

            System.out.println("Content successfully appended to the file.");
        } catch (IOException e) {
            System.err.println("error :"+ e.getMessage());
        }
    }

    public static void main(String[] args) {
        String fileName = "file.txt";
        String content = "appended";

        appendStringToFile(fileName, content);
    }
}

