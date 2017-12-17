/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ITDepartmentRole;
import Business.Role.Role;
import com.csvreader.CsvReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author arihant
 */
public class ITDepartmentOrganization extends Organization{

    public ITDepartmentOrganization() throws CsvReader.FinalizedException, CsvReader.CatastrophicException, IOException {
        super(Organization.Type.ITDepartment.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ITDepartmentRole());
        return roles;
    }
     
   
    
    
}
