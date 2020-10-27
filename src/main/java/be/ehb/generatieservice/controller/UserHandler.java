package be.ehb.generatieservice.controller;

import be.ehb.generatieservice.model.User;
import be.ehb.generatieservice.model.UserXML;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class UserHandler extends DefaultHandler {

    private static final String USERS = "users";
    private static final String USER = "user";
    private static final String ID = "id";
    private static final String FIRSTNAME = "firstname";
    private static final String LASTNAME = "lastname";
    private static final String REGISTERNUMBER = "registernumber";
    private static final String MARITALSTATUS = "maritalstatus";
    private static final String STREET = "street";
    private static final String HOUSENUMBER = "housenumber";
    private static final String ZIP = "zip";
    private static final String LOCATION = "location";

    private User user;
    private String elementValue;

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        elementValue = new String(ch, start, length);
        System.out.println(elementValue);
    }

    @Override
    public void startDocument() throws SAXException {
        user = new User();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case USERS:
                user.setUserList(new ArrayList<>());
                break;
            case USER:
                user.getUserList().add(new UserXML());
        }
    }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            switch (qName) {
                case ID:
                    xml().setId(elementValue);
                    break;
                case FIRSTNAME:
                    xml().setFirstName(elementValue);
                    break;
                case LASTNAME:
                    xml().setLastName(elementValue);
                    break;
                case REGISTERNUMBER:
                    xml().setRegisterNumber(elementValue);
                    break;
                case MARITALSTATUS:
                    xml().setMaritalStatus(elementValue);
                    break;
                case STREET:
                    xml().setStreet(elementValue);
                    break;
                case HOUSENUMBER:
                    xml().setHouseNumber(elementValue);
                    break;
                case ZIP:
                    xml().setZip(elementValue);
                    break;
                case LOCATION:
                    xml().setLocation(elementValue);
                    break;
            }
        }

    private UserXML xml(){
        List<UserXML> userXMLList = user.getUserList();
        int lastUserIndex = userXMLList.size() - 1;
        return userXMLList.get(lastUserIndex);
    }

    public User getUser() {
        return user;
    }
}


