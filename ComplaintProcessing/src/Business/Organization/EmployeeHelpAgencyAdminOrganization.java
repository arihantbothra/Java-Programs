/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import Business.Role.CompanyAdminRole;
import Business.Role.EmployeeHelpAgencyAdminRole;
import Business.Role.Role;
import com.csvreader.CsvReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author arihant
 */
public class EmployeeHelpAgencyAdminOrganization extends Organization{
    
    public EmployeeHelpAgencyAdminOrganization() throws CsvReader.FinalizedException, CsvReader.CatastrophicException, IOException {
        super(Type.EmployeeHelpAgencyAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EmployeeHelpAgencyAdminRole());
        return roles;
    }
}
