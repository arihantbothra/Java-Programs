/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
public class CompanyList {
    private ArrayList<CompanyEnterprise>companyList=new ArrayList<>();
    public ArrayList<CompanyEnterprise> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(ArrayList<CompanyEnterprise> companyList) {
        this.companyList = companyList;
    }
    
    public CompanyEnterprise addCompany(String name) throws IOException, CsvReader.FinalizedException, CsvReader.CatastrophicException{
        CompanyEnterprise c= new CompanyEnterprise(name);
        companyList.add(c);
        return c;
    }
}
