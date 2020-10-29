package be.ehb.generatieservice.validation;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.XMLConstants;
import javax.xml.transform.sax.SAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

//Deze klasse controleert onze xml file, hierin hebben we de juiste exception handlers meegegeven
public class JavaXMLSchemaValidation {

    public static void main(String[] args) {

        File xsdFile = new File("users.xsd");

        try {
            Path xmlPath = Paths.get("users.xml");
            Reader reader = Files.newBufferedReader(xmlPath);

            //We gebruiken XSD template om validatie te doen op onze xml file, indien alles juist is wordt er een berichtje geprint.
            String schemaLang = XMLConstants.W3C_XML_SCHEMA_NS_URI;
            SchemaFactory factory = SchemaFactory.newInstance(schemaLang);
            Schema schema = factory.newSchema(xsdFile);

            Validator validator = schema.newValidator();

            SAXSource source = new SAXSource(new InputSource(reader));
            validator.validate(source);

            System.out.println("Document is validated!");

        } catch(SAXException ex) {
            //Hier wordt er een level meegegeven, dus SEVERE is hoogste niveau, als er 1 element niet klopt in de xml laat het systeem
            //weten dat document niet in orde is.
            Logger lgr = Logger.getLogger(JavaXMLSchemaValidation.class.getName());
            lgr.log(Level.SEVERE, "The document failed to validate");
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } catch(IOException ex) {

            Logger lgr = Logger.getLogger(JavaXMLSchemaValidation.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }


}

