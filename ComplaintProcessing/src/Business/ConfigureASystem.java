package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import com.csvreader.CsvReader;
import java.io.IOException;

/**
 *
 * @author arihant
 */
public class ConfigureASystem {
    
    public static EcoSystem configure() throws IOException, CsvReader.FinalizedException, CsvReader.CatastrophicException{
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
