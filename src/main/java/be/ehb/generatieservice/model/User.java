package be.ehb.generatieservice.model;

import java.util.List;

public class User {

    private List<UserXML> userList;

    public List<UserXML> getUserList() {
        return userList;
    }

    public void setUserList(List<UserXML> userList) {
        this.userList = userList;
    }
}
