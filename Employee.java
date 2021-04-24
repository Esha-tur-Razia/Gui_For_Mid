/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
 /**
 *
 * @author DC
 */
public class Employee extends Item {
    private String EmployeeName;
    private String Contact;
    private String Email;
    private List<Item> items;

    public Employee(String ItemName, int ItemNumber, int ItemPrice) {
        super(ItemName, ItemNumber, ItemPrice);
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Employee(String EmployeeName, String Contact, String Email, List<Item> items, String ItemName, int ItemNumber, int ItemPrice) {
        super(ItemName, ItemNumber, ItemPrice);
        this.EmployeeName = EmployeeName;
        this.Contact = Contact;
        this.Email = Email;
        this.items = items;
    }

    @Override
    public String toString() {
        return "Employee{" + "EmployeeName=" + EmployeeName + ", Contact=" + Contact + ", Email=" + Email + ", items=" + items + '}';
    }
    
    public void addItem (Item i)
    {
        items.add(i);
    }
    private int searchItem (String number)
    {
        int index = -1;
        for ( int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemName().equals(number))
            {
                index = i;
                break;
            }
            
        }
        return index;
        
    }
    public Item getItem(String number)
    {
        int index = searchItem(number);
        return items.get(index);
    }
    
    
}
