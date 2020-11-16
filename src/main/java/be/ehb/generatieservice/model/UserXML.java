package be.ehb.generatieservice.model;

//Onze USERXML klasse met getters en setters
public class UserXML {

    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String registerNumber;
    private String nationality;
    private String maritalStatus;
    private String street;
    private String houseNumber;
    private String zip;
    private String location;
    private String phoneNumber;
    private String email;
    private String date;
    private String bankTransfer;
    private String iban;
    private String bic;

    public UserXML() {
    }

    public UserXML(int id, String firstName, String lastName, String gender, String registerNumber, String nationality, String maritalStatus, String street, String houseNumber, String zip, String location, String phoneNumber, String email, String date, String bankTransfer, String iban, String bic) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.registerNumber = registerNumber;
        this.nationality = nationality;
        this.maritalStatus = maritalStatus;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zip = zip;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.date = date;
        this.bankTransfer = bankTransfer;
        this.iban = iban;
        this.bic = bic;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBankTransfer() {
        return bankTransfer;
    }

    public void setBankTransfer(String bankTransfer) {
        this.bankTransfer = bankTransfer;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    //ToString methode
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserXML {").append("id = ").append(id)
                .append(", FIRSTNAME = ").append(firstName)
                .append(", LASTNAME = ").append(lastName)
                .append(", GENDER = ").append(gender)
                .append(", REGISTERNUMBER = ").append(registerNumber)
                .append(", NATIONALITY = ").append(nationality)
                .append(", MARITALSTATUS = ").append(maritalStatus)
                .append(", STREET = ").append(street)
                .append(", HOUSENUMBER = ").append(houseNumber)
                .append(", ZIP = ").append(zip)
                .append(", LOCATION = ").append(location)
                .append(", PHONENUMBER = ").append(phoneNumber)
                .append(", EMAIL = ").append(email)
                .append(", DATE = ").append(date)
                .append(", BANKTRANSFER = ").append(bankTransfer)
                .append(", IBAN = ").append(iban)
                .append(", BIC = ").append(bic)
                .append("}");

        return builder.toString();
    }
}
