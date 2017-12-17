/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GlassdoorManagerRole;
import Business.Role.HRManagerRole;
import Business.Role.Role;
import com.csvreader.CsvReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author arihant
 */
public class GlassdoorManagerOrganization extends Organization{

    public GlassdoorManagerOrganization() throws CsvReader.FinalizedException, CsvReader.CatastrophicException, IOException {
        super(Organization.Type.GlassdoorManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Type>types = new ArrayList<>();
    
    //ArrayList<Type> types = new ArrayList<>();
       // types.add(Type.GlassdoorManagerOrganization);
 ArrayList<Role> roles = new ArrayList<>();
        roles.add(new GlassdoorManagerRole());
        return roles;//To change body of generated methods, choose Tools | Templates.
    }
    
}
