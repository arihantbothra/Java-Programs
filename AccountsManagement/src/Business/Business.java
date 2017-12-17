/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


/**
 *
 * @author arihant
 */
public class Business {
    private PersonAccountDirectory pd;
    private UserAccountDirectory ua;
    String company;
    public Business(String n){
        pd = new PersonAccountDirectory();
        ua = new UserAccountDirectory();
        this.company = n;
    }

    public String getCompany(){
        return company;
    }
    public PersonAccountDirectory getPd() {
        return pd;
    }

    public void setPd(PersonAccountDirectory pd) {
        this.pd = pd;
    }

    public UserAccountDirectory getUa() {
        return ua;
    }

    public void setUa(UserAccountDirectory ua) {
        this.ua = ua;
    }
    
    
}
