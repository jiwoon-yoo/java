package demo1;

import java.io.File;
import java.util.ArrayList;

public class Start {
    public static void main(String[] args) throws Exception {

        ArrayList<Item> cart = new ArrayList<Item>();
        cart.add(new Item("423", "Ice Cream", 8.99));
        cart.add(new Item("983", "Chips", 4.99));
        cart.add(new Item("173", "Pizza", 14.99));
        cart.add(new Item("123", "peanuts, cashews, and pretzels mix", 4.99));
        
        FileManager fileManager = new FileManager();
        fileManager.saveCartToDisk(new File("src/demo1/myshoppingCart.txt"), cart);
        
        ArrayList <Item> ourCartLoadedFromDisk = fileManager.loadCartFromDisk(new File("src/demo1/myshoppingCart.txt"));
        for (Item item : ourCartLoadedFromDisk) {
            System.out.println (item.getDescription());
        }

      
    }
}
