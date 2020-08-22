package sample;

import java.util.HashMap;

public class Data {

    private HashMap<String, String> users = new HashMap<>();

    public void setUsers(String userName, String password){
        users.put(userName, password);
    }

    public String getUserPassword(String userName){
        return users.getOrDefault(userName, null);
    }

}
