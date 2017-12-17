/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author arihant
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList ;

    
    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setEmployeeName(name);
        employeeList.add(employee);
        return employee;
    }
    

    

//    public Employee addemployee()
//    {    
//        Employee emp = new Employee();
//        employee.add(emp);
//        return emp;
//    }
  
    public void array_airplane() throws FileNotFoundException, IOException, CsvReader.FinalizedException, CsvReader.CatastrophicException{
        CsvReader csv = new CsvReader("C:\\Users\\jacki\\assignment1\\finalproj\\final_project\\FinalProject\\src\\Business\\Employee\\CompanyInfo (1).csv");
        csv.readHeaders();
        while(csv.readRecord()){
            Object [] row = new Object[6];
            row[0] = csv.get("Company");
            row[1] = csv.get("Employee Id");
            row[2] = csv.get("Employee name");
            row[3] = csv.get("Issue");
            row[4] = csv.get("Complaint Against");
            row[5] = csv.get("Result");
           
            Employee employee = new Employee();
            employee.setCompany((row[0].toString()));
            employee.setEmployeeID(Integer.parseInt(row[1].toString()));
            employee.setEmployeeName(row[2].toString());
            employee.setIssue(row[3].toString());
            employee.setComplaintAgainst(row[4].toString());
            employee.setResult((row[5].toString()));
            
            
        }
    }
    
    public Object [] getcompanydetails(){
        String [] str = new String[100];
        int i = 0;
        for(Employee empl : getEmployeeList()){
            str[i] = empl.getCompany();
            i++;
            
        }
        Set<Object> temp = new LinkedHashSet<Object>( Arrays.asList(str));
        Object[] company_name = temp.toArray();
         
        return company_name;
    }
}