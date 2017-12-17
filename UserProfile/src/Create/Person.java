/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Create;
import javax.swing.*;
import java.awt.Button;

/**
 *
 * @author arihant
 */
public class Person extends javax.swing.JFrame {
    public String first, last, age, sex, contact;
    public String apt, street, city, state, zip;
    public Address address;
    
   
   public void getaddress(Address address){
       this.address = address;
       apt = address.apt;
       street = address.street;
       city = address.city;
       state = address.state;
       zip = address.zip;
       
   }
   
   public void setaddress(Address address, String apt, String street, String city, String state, String zip){
       this.address = address;
       
       address.setApt(apt);
       address.setStreet(street);
       address.setCity(city);
       address.setState(state);
       address.setZip(zip);
       
   }
   
    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

   
}
