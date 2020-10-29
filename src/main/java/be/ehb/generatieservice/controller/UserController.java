package be.ehb.generatieservice.controller;

import be.ehb.generatieservice.model.UserXML;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//Onze userController die dat de URI verbindt met onze webpagina (HTML).
@Controller
public class UserController {

    @GetMapping({"/", "/index"})
    public String printUsers(ModelMap map) {
        //MyRunner wordt gebruikt om testen op klasses uit te voeren.
        MyRunner runner = new MyRunner();
        List<UserXML> lines = runner.parseUsers();
        map.addAttribute("users", lines);
        //Index in onze HTML bestand die dat gevonden kan worden in de resources package
        return "index";
    }
}
