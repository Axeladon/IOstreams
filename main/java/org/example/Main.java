package org.example;

import Task1.PhoneNumberValidator;
import Task2.JsonBuilder;
import Task3.WordFrequencyCounter;

public class Main {
    public static void main(String[] args) {
        //task1
        //PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
        //phoneNumberValidator.printValidPhoneNumbersFromFile("src/files/file.txt");

        //task2
        //JsonBuilder jsonBuilder = new JsonBuilder();
        //jsonBuilder.processUserFileAndGenerateJSON("src/files2/file.txt", "src/files2/user.json");

        //task3
        WordFrequencyCounter wordFrequencyCounter = new WordFrequencyCounter();
        wordFrequencyCounter.wordCounter("src/files/words.txt");
    }
}