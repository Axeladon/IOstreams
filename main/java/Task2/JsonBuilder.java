package Task2;

import com.google.gson.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class JsonBuilder {
    private class User {
        String name;
        int age;
    }
    public void processUserFileAndGenerateJSON(String pathToReadFile, String pathToWriteFile) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToReadFile));
             FileWriter fileWriter = new FileWriter(pathToWriteFile, false)) {

            ArrayList<User> usersArrayList = new ArrayList<>();
            Gson gson = new Gson();

            String[] attributes = bufferedReader.readLine().split("\\s+");

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split("\\s+");
                String jsonString = "{" + attributes[0] + ": " + values[0] + ",\n" + attributes[1] + ":" + values[1] + "}";
                User user = gson.fromJson(jsonString, User.class);
                usersArrayList.add(user);
            }

            String jsonStr = gson.toJson(usersArrayList);
            JsonElement jsonElement = gson.fromJson(jsonStr, JsonElement.class);
            Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
            String prettyJson = prettyGson.toJson(jsonElement);
            fileWriter.write(prettyJson);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
