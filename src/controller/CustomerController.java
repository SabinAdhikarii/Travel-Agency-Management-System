/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.LinkedList;
import model.Customer;


/**
 *
 * @author Sabin Adhikari
 */
public class CustomerController {
    private final LinkedList<Customer> customers= new LinkedList<>();
    private int currentCustomerId= 1;
    
//    Method to add customer
    public void addCustomer(String name, String email, String phone, String location){
        Customer customer=new Customer(currentCustomerId++,name,email,phone,location);
        customers.add(customer);
    }
    
//    Method to view customers
    public LinkedList<Customer>getAllCustomer(){
        return customers;
    }
    
//    Method to update a customer
    public boolean updateCustomer(int customerId, String name, String email, String phone, String location){
        for (Customer c : customers){
            if(c.getCustomerId()==customerId){
                c.setName(name);
                c.setEmail(email);
                c.setPhone(phone);
                c.setLocation(location);
                return true;
            }
        }
        return false;
    }
    
//    Method to delete a customer
    public boolean deleteCustomer(int customerId){
        for(int i=0; i< customers.size(); i++){
            if(customers.get(i).getCustomerId()==customerId){
                customers.remove(i);
                return true;
            }
        }
        return false;
    }
    
}
