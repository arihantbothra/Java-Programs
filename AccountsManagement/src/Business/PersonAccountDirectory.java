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
public class PersonAccountDirectory {
    ArrayList <PersonList> person;

    public PersonAccountDirectory() {
        person  = new ArrayList<PersonList>();
    }

    public ArrayList<PersonList> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<PersonList> person) {
        this.person = person;
    }
    public PersonList addperson(){
        PersonList pd = new PersonList();
        person.add(pd);
        return pd;
    }

    public PersonList findPersonbyLastName(String last) {
       PersonList p1 = new PersonList();
        for(PersonList p : getPerson()){
            if(p.getLastname().equalsIgnoreCase(last)){
                p1 = p;
            }
        }
        return p1;
    }
    public PersonList deletedata(int row) {
        PersonList pa = new PersonList();
        person.remove(row);
        return pa;
    }
    
}
