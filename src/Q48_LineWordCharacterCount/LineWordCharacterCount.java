package Q48_LineWordCharacterCount;

import Q36_WordCountInAString.StringOperator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineWordCharacterCount {

        public static void countLineWordsCharacter(String filename) {

            int lineCount = 0;
            int wordCount = 0;
            int characterCount = 0;

            StringOperator operator=new StringOperator();

            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

                String line;

                while (true) {
                    line=reader.readLine();
                    if(line == null)
                        break;

                    lineCount++;
                    characterCount += line.length();

                    wordCount+=operator.getWordCount(line);
                }
            } catch (IOException e) {
                System.out.println("error reading...");
                e.printStackTrace();
            }

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + characterCount);
        }

        public static void main(String[] args) {
            String filename = "file.txt";

            countLineWordsCharacter(filename);
        }
    }

