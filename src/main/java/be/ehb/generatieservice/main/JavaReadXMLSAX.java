package be.ehb.generatieservice.main;

import be.ehb.generatieservice.controller.MyRunner;
import be.ehb.generatieservice.model.UserXML;

import java.util.List;

public class JavaReadXMLSAX {

    public static void main(String[] args) {
        MyRunner runner = new MyRunner();
        List<UserXML> lines = runner.parseUsers();

        lines.forEach(System.out::println);
    }
}
