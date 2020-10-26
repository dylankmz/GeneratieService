package be.ehb.generatieservice.controller;

import be.ehb.generatieservice.dao.UserDAO;
import be.ehb.generatieservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserDAO dao;

    @RequestMapping(value = "all", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<User> getAllUsers() {
        return dao.findAll();
    }

    @RequestMapping(value = "createUser", method = RequestMethod.GET)
    @ResponseBody
    public void savePatient(@RequestParam(value = "firstName") String firstName,
                            @RequestParam(value = "lastName") String lastName,
                            @RequestParam(value = "registerNumber") int registerNumber,
                            @RequestParam(value = "maritalStatus") String maritalStatus,
                            @RequestParam(value = "street") String street,
                            @RequestParam(value = "houseNumber") int houseNumber,
                            @RequestParam(value = "zip") int zip,
                            @RequestParam(value = "location") String location) {
        User user = new User(firstName, lastName, registerNumber, maritalStatus, street, houseNumber, zip, location);
        dao.save(user);
    }

}
