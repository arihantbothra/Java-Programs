/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RacismDepartmentRole;
import Business.Role.Role;
import Business.Role.SexualOffenceDepartmentRole;
import com.csvreader.CsvReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author arihant
 */
public class SexualOffenceDepartmentOrganization extends Organization{

    public SexualOffenceDepartmentOrganization() throws CsvReader.FinalizedException, CsvReader.CatastrophicException, IOException
    {
    super(Organization.Type.SexualOffenceDepartment.getValue());

    }
  
    @Override
    public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList<>();
    roles.add(new SexualOffenceDepartmentRole());
    return roles;
    }
    
}
