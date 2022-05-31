package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

            public static void main(String[] args) {
                fileWriter();
                fileReader();
            }            public static void fileWriter() {
                try (FileWriter writer = new FileWriter("text.txt")) {
                    for (char i = 'A'; i <= 'Z'; i++) {
                        for (char j = 'a'; j <= 'z'; j++) {
                            if ((j - i) == 32)
                                writer.write(i + " " + j + "\n");
                        }
                    }

                    for (int i = 0; i < 10; i++) {
                        writer.write(i + "\n");
                    }


                } catch (IOException e) {
                    e.printStackTrace();

                }
            }

            public static void fileReader() {
                try (FileReader reader = new FileReader("text.txt")) {
                    Scanner scanner = new Scanner(reader);

                    int counter = 1;

                    while (scanner.hasNextLine()) {
                        System.out.println(counter + " " + scanner.nextLine());
                        counter++;
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
}
