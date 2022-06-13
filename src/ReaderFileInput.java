import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReaderFileInput {


    public static String ReaderFileInput(String path) {
        String enterNumbers = "";
        File myObj = new File(path);
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                enterNumbers = myReader.nextLine();

            }
        } catch (FileNotFoundException e) {

            System.out.println("Soubor nenalezen");
        }


        return enterNumbers;

    }


}
