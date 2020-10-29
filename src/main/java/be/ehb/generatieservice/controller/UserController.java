package be.ehb.generatieservice.controller;

import be.ehb.generatieservice.model.UserXML;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @GetMapping({"/", "/index"})
    public String printUsers(ModelMap map) {
        MyRunner runner = new MyRunner();
        List<UserXML> lines = runner.parseUsers();
        map.addAttribute("users", lines);
        return "index";
    }
}
