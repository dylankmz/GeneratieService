package be.ehb.generatieservice.controller;

import be.ehb.generatieservice.model.User;
import be.ehb.generatieservice.model.UserXML;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class UserController extends DefaultHandler {

    private static final String USERS = "users";
    private static final String USER = "user";
    private static final String ID = "id";
    private static final String FIRSTNAME = "firstName";
    private static final String LASTNAME = "lastName";
    private static final String REGISTERNUMBER = "registerNumber";
    private static final String MARITALSTATUS = "maritalStatus";
    private static final String STREET = "maritalStatus";
    private static final String HOUSENUMBER = "houseNumber";
    private static final String ZIP = "zip";
    private static final String LOCATION = "location";

    private User user;
    private String elementValue;

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        elementValue = new String(ch, start, length);
    }

    @Override
    public void startDocument() throws SAXException {
        user = new User();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case USERS:
                user.
    }

//    private UserXML xml(){
//        List<UserXML> userXMLList = user.getUserList();
//        int lastUserIndex = userXMLList.size() - 1;
//        return userXMLList.get(lastUserIndex);
//    }

    public User getUser() {
        return user;
    }
}
