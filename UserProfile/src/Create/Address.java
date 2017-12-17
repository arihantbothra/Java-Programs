/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Create;

import javax.swing.JOptionPane;

/**
 *
 * @author arihant
 */
public class Address{
    public String apt, street, city, state, zip;

    public String getApt() {
        return apt;
    }

    public void setApt(String apt) {
        this.apt = apt;
        getApt();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
//
//    public String getState() {
//        return state;
//    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
