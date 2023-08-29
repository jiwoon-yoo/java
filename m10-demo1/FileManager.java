package demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Contains all functionality use to persist Item objects to disk for demo1
 */

public class FileManager {
  
  
  /** 
   * Used to persist Items in cart to disk file
   * @param file File object containing path to desired file on disk
   * @param cart ArrayList of Items to be persistied to disk
   */
  public void saveCartToDisk(File file, ArrayList<Item> cart) {
    try (PrintWriter printWriter = new PrintWriter(file)) {
      for (Item item : cart) {
        printWriter.println(item.getSku() + "," + item.getDescription() + "," + item.getPrice());
      }
    }
    catch (FileNotFoundException err) {
      System.out.println("ERROR - File not saved");
    }
  }

  
  /** 
   * Used to read CSV file from disk and use that data to reinflate Item objects and add to ArrayList <&Item>
   * @param file File object containing path to desired file on disk
   * @return ArrayList<&Item> List of Item objects in ArrayList <&Item>
   */
  public ArrayList<Item> loadCartFromDisk(File file) {
    ArrayList<Item> cart = new ArrayList<Item>();
    
    try (Scanner scan = new Scanner(file)) {
      while (scan.hasNextLine()) {
        String[] deflatedObjectParts = scan.nextLine().split(",");
    
        if (deflatedObjectParts.length != 3) {
          throw new CorruptedFileException("The file is corrupted");
        }
        
        
        cart.add(new Item(deflatedObjectParts[0], deflatedObjectParts[1],
            Double.parseDouble(deflatedObjectParts[2])));
      }
    }
    catch (FileNotFoundException e) {
      System.out.println("The file wasn't found");
      System.out.println(e.getClass());
      System.exit(1);
    }
    catch (CorruptedFileException e)
    {
      System.out.println (e.getMessage());
      System.exit(1);
    }
    return cart;
  }

}
