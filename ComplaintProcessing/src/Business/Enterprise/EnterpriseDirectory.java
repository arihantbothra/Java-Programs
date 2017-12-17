/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import com.csvreader.CsvReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author arihant
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public void createAndAddEnterprise(String name, Enterprise.EnterpriseType type) throws IOException, CsvReader.FinalizedException, CsvReader.CatastrophicException{
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Company){
             System.out.println("create comp");
            enterprise = new CompanyEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else
              if (type == Enterprise.EnterpriseType.EmployeeHelpAgency){
                   System.out.println("create eha");
            enterprise = new EmployeeHelpAgencyEnterprise(name);
            enterpriseList.add(enterprise);
        }
              else   if (type == Enterprise.EnterpriseType.glassdoor){
                   System.out.println("create gd");
            enterprise = new GlassdoorEnterprise(name);
            enterpriseList.add(enterprise);
        }
             
//        return enterprise;
    }
    
}
