/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.ArrayList;
import Business.Role.GenderInequalityDepartmentRole;
import com.csvreader.CsvReader;
import java.io.IOException;

/**
 *
 * @author arihant
 */
public class GenderInequalityDepartmentOrganization extends Organization{
     public GenderInequalityDepartmentOrganization() throws CsvReader.FinalizedException, CsvReader.CatastrophicException, IOException {
        super(Organization.Type.GenderInequalityDepartment.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new GenderInequalityDepartmentRole());
        return roles;
    }
    
}
