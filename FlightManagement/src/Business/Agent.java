/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author arihant
 */
public class Agent extends Airline_Access{
    private Airline_Access access;
    private ArrayList<Customer> customer;
    public Agent() throws IOException{
        access = new Airline_Access();
        customer = new ArrayList<Customer>();
    }
    
    public ArrayList<Customer> getCustomer() {
        return customer;
    }
    public void setCustomer(ArrayList<Customer> customer) {
        this.customer = customer;
    }
    
    public Customer addcustomer()
    {
        Customer cust = new Customer();
        customer.add(cust);
        return cust;
    }

    public void deleteairline(ArrayList<String> sample) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
