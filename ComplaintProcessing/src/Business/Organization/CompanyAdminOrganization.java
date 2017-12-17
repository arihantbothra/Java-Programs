/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CompanyAdminRole;
import Business.Role.Role;
import com.csvreader.CsvReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author arihant
 */
public class CompanyAdminOrganization extends Organization{

    public CompanyAdminOrganization() throws CsvReader.FinalizedException, CsvReader.CatastrophicException, IOException {
        super(Type.CompanyAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CompanyAdminRole());
        return roles;
    }
     
}
