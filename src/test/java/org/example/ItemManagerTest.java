package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import org.example.ItemManager;
public class ItemManagerTest {
    @Test
    public void updateItemWithValidData() {
        ItemManager itemManager = new ItemManager();
        Item item = new Item(1, "Old Item Name");
        itemManager.addItem(item);
        itemManager.updateItem(1, "New Item Name");
        assertEquals("New Item Name", item.getName());
    }
    public boolean isValidate(Integer id, String newName) {
        if (id == null || newName == null || newName.length() < 50) {
            return true;
        }else {
            return false;
        }
    }
    @Test
    public void updateItemWithInvalidData() {
        ItemManager itemManager = new ItemManager();
        try {
            Integer idUpdate = 3; //integer mới chấp nhận giá trị null (để kiểm tra khi update với dữ liệu null)
            String newName = "New Item Name";
            if(isValidate(idUpdate, newName)) {
                itemManager.updateItem(idUpdate, newName);
            }else{
                itemManager.updateItem(idUpdate, newName); //nếu isValidate là false thì chạy dòng này để xuất hiện ngoại lệ
            }
            fail("Expected an exception to be thrown");
        } catch (Exception ex) {
            new RuntimeException(ex);
        }
    }

}