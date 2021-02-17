package Collections.OptionalTasks.FourthTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FourthTask  {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("./src/main/java/Collections/OptionalTasks/FourthTask/Poem"));
        List<String> list = new ArrayList<String>();
        while (scanner.hasNextLine()){
            list.add((scanner.nextLine()));
        }
        list.sort((String1,String2) -> String1.length()-String2.length());
        for(String each:list){
            System.out.println(each);
        }
    }
}
