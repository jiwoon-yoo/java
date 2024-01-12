package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class Start {
    public static void main (String [] args)
    {
        ArrayList<String> myArrayList = new ArrayList<>();

        InventoryItem item1 = new InventoryItem("Skates", 15);

        HashMap<Integer, InventoryItem> myHashMap = new HashMap<>();
        myHashMap.put(345, item1);
        myHashMap.put(216, new InventoryItem("Cotton Candy", 50));
        System.out.println (myHashMap.put(216, new InventoryItem("Cotton ", 530)));

        System.out.println (myHashMap.get(345).getDescription());
        System.out.println (myHashMap.get(216).getInventoryCount());
    }
}
