package demo2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileManager implements Fileable {

    @Override
    public String readFile(String filename) throws Exception {
        File file = new File(filename);
        String returnValue = "";
        try (Scanner scan = new Scanner(file))
        {
            while (scan.hasNextLine()) {
                returnValue += scan.nextLine() + "\n";
            }
        } catch (Exception e) {
            System.out.println("Sorry, file not found");  
        }
        return returnValue;
    }

    @Override
    public boolean writeFile(String filename, String textToSave) throws Exception {
        File file = new File(filename);
        try (PrintWriter printWriter = new PrintWriter(file)){
            printWriter.println(textToSave);
            return true;
        }
        catch (Exception err)
        {
            return false;
        }
    }

}
