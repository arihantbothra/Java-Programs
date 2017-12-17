/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HRManagerRole;
import Business.Role.Role;
import com.csvreader.CsvReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author arihant
 */
public class HRManagerOrganization extends Organization{

    public HRManagerOrganization() throws CsvReader.FinalizedException, CsvReader.CatastrophicException, IOException {
        super(Organization.Type.HRManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HRManagerRole());
        return roles;
    }
     
}