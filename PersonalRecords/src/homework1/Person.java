package homework1;

import java.io.File;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arihant
 */
public class Person {
       
    public String firstname, lastname, age, sex, contact, apartment, street, city, state, zip,
        accountnumber, accountcreation, status, accountbalance, accounttype, ccnumber, cctype, 
        ccexpiry, cclimit, cccvv,licensenumber, licenseissue, licenseexpiry, licenseissuelocation, vehiclenumber,
            sfirst, slast, scontact, sage;

    File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
        

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
    
    
    public Accounts accounts;
    public Address address;
    public CreditCard creditcard;
    public License license;
    public Spouse spouse;
    
    public void getaddress(Address address){
       this.address = address;
       apartment = address.apartment;
       street = address.street;
       city = address.city;
       state = address.state;
       zip = address.zip;
       
   }
    
    public void getaccounts(Accounts accounts){
       this.accounts = accounts;
       accounttype = accounts.type;
       accountnumber = accounts.number;
       accountcreation = accounts.creation;
       accountbalance = accounts.balance;
       status = accounts.status;
       
   }
    
    public void getcreditcard(CreditCard creditcard){
       this.creditcard = creditcard;
       ccnumber = creditcard.number;
       cctype = creditcard.type;
       ccexpiry = creditcard.expiry;
       cccvv = creditcard.cvv;
       cclimit = creditcard.limit;
       
   }
    
    public void getlicense(License license){
       this.license = license;
       licensenumber = license.number;
       licenseissue = license.issue;
       licenseexpiry = license.expire;
       licenseissuelocation = license.location;
       vehiclenumber = license.vehicle_number;
       
   }
    
    public void getspouse(Spouse spouse){
       this.spouse = spouse;
       sfirst = spouse.first;
       slast = spouse.last;
       scontact = spouse.contact;
       sage = spouse.age;
       
   }
    
    public void setaddress(Address address, String apt, String street, String city, String state, String zip){
       this.address = address;
       
       address.setApartment(apt);
       address.setStreet(street);
       address.setCity(city);
       address.setState(state);
       address.setZip(zip);
       
   }
    
    public void setaccounts(Accounts accounts, String type, String number, String creation, String balance, String status){
       this.accounts = accounts;
       
       accounts.setType(type);
       accounts.setNumber(number);
       accounts.setCreation(creation);
       accounts.setBalance(balance);
       accounts.setStatus(status);
    }
    
    public void setcredit(CreditCard credit, String number, String type, String expiry, String cvv, String limit){
       this.creditcard = credit;
       
       credit.setNumber(number);
       credit.setType(type);
       credit.setExpiry(expiry);
       credit.setCvv(cvv);
       credit.setLimit(limit);
    }
    
    public void setlicense(License license, String number, String issue, String expire, String location, String vehicle){
       this.license = license;
       
       license.setNumber(number);
       license.setIssue(issue);
       license.setExpire(expire);
       license.setLocation(location);
       license.setVehicle_number(vehicle);
    }
    
    public void setspouse(Spouse spouse, String first, String last, String age, String contact){
       this.spouse = spouse;       
       spouse.setFirst(first);
       spouse.setLast(last);
       spouse.setAge(age);
       spouse.setContact(contact);
    }
    
    
}


    