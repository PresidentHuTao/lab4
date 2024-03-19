package org.example;
import java.util.ArrayList;
import java.util.List;
public class ItemManager {
    private List<Item> items = new ArrayList<>();
    public void addItem(Item item){
        item = new Item(1, "2");
        items.add(item);
    }
    public void updateItem(int id, String newName){
        for(Item item : items){
            if(item.getId() == id){
                item.setName(newName);
                break;
            }
        }
    }
    public void deleteItem(int id){
        items.removeIf(item -> item.getId() == id);
    }
}
