/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GenderInequalityDepartmentRole;
import Business.Role.RacismDepartmentRole;
import Business.Role.Role;
import com.csvreader.CsvReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author arihant
 */
public class RacismDepartmentOrganization extends Organization{
    
    public RacismDepartmentOrganization() throws CsvReader.FinalizedException, IOException, CsvReader.CatastrophicException
    {
         super(Organization.Type.RacismDepartment.getValue());
    }

    @Override
     public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RacismDepartmentRole());
        return roles;

    }
    
   
}
