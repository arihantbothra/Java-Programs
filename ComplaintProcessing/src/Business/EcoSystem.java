package Business;


import Business.network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import com.csvreader.CsvReader;
import java.io.IOException;

import java.util.ArrayList;

/**
 *
 * @author arihant
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
   
    

    public static EcoSystem getInstance() throws IOException, CsvReader.FinalizedException, CsvReader.CatastrophicException{
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() throws IOException, CsvReader.FinalizedException, CsvReader.CatastrophicException{
        super(null);
        networkList = new ArrayList<>();
       
    }


    

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }


        
    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        for (Network network : networkList) {
        }

        return true;
    }
}