/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import com.csvreader.CsvReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author arihant
 */
public class EmployeeHelpAgencyEnterprise extends Enterprise {
      public EmployeeHelpAgencyEnterprise(String name) throws IOException, CsvReader.FinalizedException, CsvReader.CatastrophicException{
        super(name, Enterprise.EnterpriseType.EmployeeHelpAgency);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public ArrayList<Type> getSupportedOrganizationType() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    ArrayList<Type>types = new ArrayList<>();
    types.add(Type.Headoffice);
    types.add(Type.RacismDepartment);
    types.add(Type.GenderInequalityDepartment);
    types.add(Type.SexualOffenceDepartment);
    return types;
    }
}
