package be.ehb.generatieservice.model;

public class UserXML {

    private int id;
    private String firstName;
    private String lastName;
    private String registerNumber;
    private String maritalStatus;
    private String street;
    private String houseNumber;
    private String zip;
    private String location;

    public UserXML() {
    }

    public UserXML(int id, String firstName, String lastName, String registerNumber, String maritalStatus, String street, String houseNumber, String zip, String location) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.registerNumber = registerNumber;
        this.maritalStatus = maritalStatus;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zip = zip;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserXML {").append("id = ").append(id)
                .append(", FIRSTNAME = ").append(firstName)
                .append(", LASTNAME = ").append(lastName)
                .append(", REGISTERNUMBER = ").append(registerNumber)
                .append(", MARITALSTATUS = ").append(maritalStatus)
                .append(", STREET = ").append(street)
                .append(", HOUSENUMBER = ").append(houseNumber)
                .append(", ZIP = ").append(zip)
                .append(", LOCATION = ").append(location).append("}");

        return builder.toString();
    }
}
