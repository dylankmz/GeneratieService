package be.ehb.generatieservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GeneratieserviceApplication {

    @GetMapping("/")
    public String home() {
        return "Hello";
    }
    public static void main(String[] args) {
        SpringApplication.run(GeneratieserviceApplication.class, args);
    }
}
