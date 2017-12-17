/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AnalysisDepartmentRole;
import Business.Role.Role;
import com.csvreader.CsvReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author arihant
 */
public class AnalysisDepartmnetOrganization extends Organization {

    public AnalysisDepartmnetOrganization() throws CsvReader.FinalizedException, CsvReader.CatastrophicException, IOException {
        super(Organization.Type.AnalysisDepartment.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
 ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AnalysisDepartmentRole());
        return roles;   
    }
    
}
