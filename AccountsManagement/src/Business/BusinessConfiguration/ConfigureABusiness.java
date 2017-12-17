/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BusinessConfiguration;

import Business.Business;
import Business.PersonAccountDirectory;
import Business.PersonList;
import Business.UserAccountDirectory;
import Business.UserAccount;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author arihant
 */
public class ConfigureABusiness {
    private static Business business;
    public static Business Initialize(String n) throws NoSuchAlgorithmException{
        business = new Business(n);
        PersonAccountDirectory pd = business.getPd();
        PersonList p1 = pd.addperson();
        p1.setFirstname("Chris");
        p1.setLastname("Jordan");
        p1.setUsername("a");
        p1.setStatus("Active");
        PersonList p2 = pd.findPersonbyLastName("Jordan");
        
        PersonList p3 = pd.addperson();
        p3.setFirstname("Alex");
        p3.setLastname("Brar");
        p3.setUsername("b");
        p3.setStatus("Active");
        PersonList p4 = pd.findPersonbyLastName("Brar");
        
        UserAccountDirectory uad = business.getUa();
        UserAccount ua = uad.adduser();
        ua.setPerson(p2);
        ua.setUserName("a");
        ua.setPassword("a");
        ua.setHashpassword("a");
        ua.setRole("System Admin");
        ua.setStatus("Active");
        
        UserAccount ua2 = uad.adduser();
        ua2.setPerson(p4);
        ua2.setUserName("b");
        ua2.setPassword("b");
        ua2.setHashpassword("b");
        ua2.setRole("HR Admin");
        ua2.setStatus("Active");
        
       
        return business;
    }
    
}
