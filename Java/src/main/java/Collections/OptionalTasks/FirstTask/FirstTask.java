package Collections.OptionalTasks.FirstTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {

        List<String> listLinesFromFile = new ArrayList<String>();
        try{
            Scanner scanner = new Scanner(new File("./src/main/java/Collections/OptionalTasks/FirstTask/FileForReadingLines"));
            while (scanner.hasNextLine()) {
                listLinesFromFile.add((scanner.nextLine()));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("./src/main/java/Collections/OptionalTasks/FirstTask/FileForWritingLines.txt");
            for(int i = listLinesFromFile.size()-1; i>=0;i--){
                fileWriter.write(listLinesFromFile.get(i)+"\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
