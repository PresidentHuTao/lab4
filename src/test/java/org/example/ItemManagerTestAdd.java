package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemManagerTestAdd {
    private ItemManager itemManager = new ItemManager();
    @Test
    public void addItem() {
        Item item = new Item(1,"Thanh");
        itemManager.addItem(item);
        assertTrue(isValidatename(item.getName()));
    }


    public boolean isValidatename(String name) {
        if (name==null|| name.isEmpty()||name.length()>=50){
            return false;
        }
        for (char c:name.toCharArray() ){
            if (!Character.isLetter(c)){
                return false;
            }
        }
        return true;
    }
}