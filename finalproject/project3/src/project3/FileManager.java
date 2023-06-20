package project3;

import java.io.File;

import java.io.PrintWriter;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;

public class FileManager {

  public void saveCartToDisk(File file, ObservableList<Todo> todos) 
  {
    try (PrintWriter printWriter = new PrintWriter(file)) {
      for (int i = 0; i < todos.size(); i++) {
        printWriter.println(todos.get(i).getTaskTitle() + "," + todos.get(i).getNotes()+ "," + todos.get(i).getDueDate() + "," + todos.get(i).getDifficulty() + "," + todos.get(i).getCheckBox());

      }
    } catch (Exception err) {
      System.out.println("ERROR - File not saved");
    }
  }
  
  public ObservableList <Todo> loadCartFromDisk (File file)
  {
    ObservableList <Todo> cart = FXCollections.observableArrayList();
    
    try(Scanner scan = new Scanner(file)){
      while (scan.hasNextLine()) {

        Object[] deflatedObjectParts = scan.nextLine().split(",");

      
        cart.add(new Todo(deflatedObjectParts[0], deflatedObjectParts[1], deflatedObjectParts[2], deflatedObjectParts[3], deflatedObjectParts[4]));


      }
    }
    catch (Exception err)
    {
      System.out.println("Sorry, couldn't read file");
    }
    return cart;
  }
  

}
