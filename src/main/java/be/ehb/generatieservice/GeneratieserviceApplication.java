package be.ehb.generatieservice;
import be.ehb.generatieservice.controller.MyRunner;
import be.ehb.generatieservice.model.UserXML;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@SpringBootApplication
@RestController
public class GeneratieserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeneratieserviceApplication.class, args);
    }
}
