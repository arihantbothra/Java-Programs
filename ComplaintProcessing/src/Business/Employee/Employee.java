/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author arihant
 */
public class Employee {
    
    public String Company;
    public int EmployeeID;
    public String EmployeeName;
    public String Issue;
    public String ComplaintAgainst;
    public String Result;
    private static int count = 1;
    private String rating;
    private String review;

    public Employee() {
        EmployeeID = count;
        count++;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

     public int getId() {
        return EmployeeID;
    }
    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

  

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getIssue() {
        return Issue;
    }

    public void setIssue(String Issue) {
        this.Issue = Issue;
    }

    public String getComplaintAgainst() {
        return ComplaintAgainst;
    }

    public void setComplaintAgainst(String ComplaintAgainst) {
        this.ComplaintAgainst = ComplaintAgainst;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String Result) {
        this.Result = Result;
    }
    
     @Override
    public String toString() {
        return EmployeeName;
    }
    
}
