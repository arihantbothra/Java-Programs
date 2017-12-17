/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

/**
 *
 * @author arihant
 */
import Business.Organization.Organization.Type;
import Business.Role.CompanyAdminRole;
import Business.Role.EmployeeHelpAgencyAdminRole;
import Business.Role.GlassDoorAdminRole;
import Business.Role.Role;
import com.csvreader.CsvReader;
import java.io.IOException;
import java.util.ArrayList;

public class GlassDoorAdminOrganization extends Organization{
     
     public GlassDoorAdminOrganization() throws CsvReader.FinalizedException, CsvReader.CatastrophicException, IOException {
        super(Type.GlassDoorAdmin.getValue());
    }
     
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new GlassDoorAdminRole());
        return roles;
    }
}
