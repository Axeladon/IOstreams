package Task3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public void wordCounter(String path) {
        Map<String, Integer> mapWordCounter = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    mapWordCounter.put(word, mapWordCounter.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<String, Integer> word : mapWordCounter.entrySet()) {
            System.out.println(word.getKey() + " " + word.getValue());
        }
    }
}
