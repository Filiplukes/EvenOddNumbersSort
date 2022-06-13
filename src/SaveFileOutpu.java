import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFileOutpu {

    private static boolean createOutput(String path) {

        boolean createFile = false;

        try {
            File myOutput = new File(path);
            myOutput.createNewFile();
            createFile = true;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            return createFile;
        }

    }

    public static boolean saveOutputNumbers(String outputNumbers, String path) {

        if (!createOutput(path)) {
            return false;
        }

        boolean completeSave = false;

        try {
            FileWriter myWriter = new FileWriter(path);
            myWriter.write(outputNumbers);
            myWriter.close();
            completeSave = true;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return completeSave;
    }


}
