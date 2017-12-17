/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author arihant
 */
public class UserAccountDirectory {
    ArrayList<UserAccount> useraccount;
    
    public UserAccountDirectory(){
        useraccount = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(ArrayList<UserAccount> useraccount) {
        this.useraccount = useraccount;
    }
    
    public UserAccount adduser(){
        UserAccount ua = new UserAccount();
        useraccount.add(ua);
        return ua;
    }
    
    public void deletedata(int row) {
        UserAccount ua = new UserAccount();
        useraccount.remove(row);
    }
    public void deleterecord(String uname) {
        int i = 0;
        for(UserAccount ua : getUseraccount()){
            if(ua.getUserName().equals(uname)){
                deletedata(i);
            }
            i++;
        }
        
        
        
    }
}
