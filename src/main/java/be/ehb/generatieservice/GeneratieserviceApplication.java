package be.ehb.generatieservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

@SpringBootApplication
@RestController
public class GeneratieserviceApplication {

    @GetMapping("/")
    public String sayHello() {
        return "Test";
    }

    public static void main(String[] args) {
        SpringApplication.run(GeneratieserviceApplication.class, args);
    }
}
