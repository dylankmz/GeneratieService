package be.ehb.generatieservice.controller;

import be.ehb.generatieservice.model.User;
import be.ehb.generatieservice.model.UserXML;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class UserHandler extends DefaultHandler {

    private List<UserXML> users = new ArrayList<>();
    private UserXML user;

    private boolean bfn = false;
    private boolean bln = false;
    private boolean brg = false;
    private boolean bms = false;
    private boolean bst = false;
    private boolean bhs = false;
    private boolean bzp = false;
    private boolean blc = false;



    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if ("user".equals(qName)) {
            user = new UserXML();

            int id = Integer.valueOf(attributes.getValue("id"));
            user.setId(id);
        }

        switch (qName) {

            case "firstname":
                bfn = true;
                break;
            case "lastname":
                bln = true;
                break;
            case "registernumber":
                brg = true;
                break;
            case "maritalstatus":
                bms = true;
                break;
            case "street":
                bst = true;
                break;
            case "housenumber":
                bhs = true;
                break;
            case "zip":
                bzp = true;
                break;
            case "location":
                blc = true;
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (bfn) {
            user.setFirstName(new String(ch, start, length));
            bfn = false;
        }
        if (bln) {
            user.setLastName(new String(ch, start, length));
            bln = false;
        }
        if (brg) {
            user.setRegisterNumber(new String(ch, start, length));
            brg = false;
        }
        if (bms) {
            user.setMaritalStatus(new String(ch, start, length));
            bms = false;
        }
        if (bst) {
            user.setStreet(new String(ch, start, length));
            bst = false;
        }
        if (bhs) {
            user.setHouseNumber(new String(ch, start, length));
            bhs = false;
        }
        if (bzp) {
            user.setZip(new String(ch, start, length));
            bzp = false;
        }
        if (blc) {
            user.setLocation(new String(ch, start, length));
            blc = false;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ("user".equals(qName)) {
            users.add(user);
        }
    }

    public List<UserXML> getUsers() {
        return users;
    }

}


