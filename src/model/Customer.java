/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author Sabin Adhikari
 */
public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String phone;
    private String location;

    public Customer(int customerId, String name, String email, String phone, String location) {
        this.customerId=customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.location=location;
    }

    // Getters and Setters
    
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return customerId + " - " + name + " - " + email + " - " + phone;
    }
}