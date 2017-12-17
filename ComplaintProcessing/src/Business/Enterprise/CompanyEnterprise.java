/*
 * To change this template, choose Tools | Templates
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
public class CompanyEnterprise extends Enterprise{
      private double salary;
    private String companyName;
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
// public CompanyEnterprise(String name) {
//        super(name, EnterpriseType.Company);
//    }

    public CompanyEnterprise(String name) throws IOException, CsvReader.FinalizedException, CsvReader.CatastrophicException{
        super(name, EnterpriseType.Company);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public ArrayList<Type> getSupportedOrganizationType() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    ArrayList<Type>types = new ArrayList<>();
    types.add(Type.HRManager);
    types.add(Type.ITDepartment);
    types.add(Type.MarketingDepartment);
    types.add(Type.DoctorAdmin);
    return types;
    }
    
    
    
}
