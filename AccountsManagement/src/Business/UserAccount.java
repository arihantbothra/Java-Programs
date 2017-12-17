/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Hashing.Hashing;
import java.util.ArrayList;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author arihant
 */
public class UserAccount{
    
    String username, password, hashpassword, name, role;
    String first, last;
    String status;
    Hashing hashing = new Hashing();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getHashpassword() {
        return hashpassword;
    }

    public void setHashpassword(String password) throws NoSuchAlgorithmException {
        String pwd = hashing.hashpass(password);
        this.hashpassword = pwd;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return username;
    }

    public void setPerson(PersonList p2) {
        this.name = p2.getFirstname() + " " + p2.getLastname();
    }
    public String getPerson(){
        return name;
    }
    
}
