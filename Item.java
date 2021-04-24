/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DC
 */
public class Item {
    private String ItemName;
    private int ItemNumber;
    private int ItemPrice;
    

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public int getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(int ItemNumber) {
        this.ItemNumber = ItemNumber;
    }

    public int getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(int ItemPrice) {
        this.ItemPrice = ItemPrice;
    }

    public Item(String ItemName, int ItemNumber, int ItemPrice) {
        this.ItemName = ItemName;
        this.ItemNumber = ItemNumber;
        this.ItemPrice = ItemPrice;
    }

    @Override
    public String toString() {
        return "Item{" + "ItemName=" + ItemName + ", ItemNumber=" + ItemNumber + ", ItemPrice=" + ItemPrice + '}';
    }
    
    
}
