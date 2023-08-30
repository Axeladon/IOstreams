package Task1;

import java.io.*;

public class PhoneNumberValidator {
    public void printValidPhoneNumbersFromFile(String path) {
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String phoneNum;
            while ((phoneNum = bufferedReader.readLine()) != null) {
                if (phoneNum.matches("\\(\\d{3}\\) \\d{3}-\\d{4}") ||
                        phoneNum.matches("\\d{3}-\\d{3}-\\d{4}")) {
                    System.out.println(phoneNum);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}