package be.ehb.generatieservice.main;

import be.ehb.generatieservice.controller.MyRunner;
import be.ehb.generatieservice.model.UserXML;

import java.util.List;

public class JavaReadXMLSAX {

    //Een simpele main methode die we hebben gebruikt om users te printen in de console.
    public static void main(String[] args) {
        MyRunner runner = new MyRunner();
        List<UserXML> lines = runner.parseUsers();

        lines.forEach(System.out::println);
    }
}
