
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DC
 */
public class Supplier extends Item {
       private String Company;
       private List<Item> items;
       

    public Supplier(String ItemName, int ItemNumber, int ItemPrice) {
        super(ItemName, ItemNumber, ItemPrice);
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Supplier(String Company, List<Item> items, String ItemName, int ItemNumber, int ItemPrice) {
        super(ItemName, ItemNumber, ItemPrice);
        this.Company = Company;
        this.items = items;
    }

    @Override
    public String toString() {
        return "Supplier{" + "Company=" + Company + ", items=" + items + '}';
    }
    
       
}
